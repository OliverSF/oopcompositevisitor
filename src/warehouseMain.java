
public class warehouseMain {

	public static void main(String[] args) {

		CatalogueEntry cat1 = new CatalogueEntry("bolt", 1, 0.50);
		CatalogueEntry cat2 = new CatalogueEntry("screw", 2, 0.70);
		CatalogueEntry cat3 = new CatalogueEntry("knut", 3, 0.20);
		CatalogueEntry afterservice = new CatalogueEntry("afterservice", 4, 2.00);
		
		
		Assembly assembly1 = new Assembly();
		assembly1.addPart(new Part(cat1));
		assembly1.addPart(new Part(cat3));
		assembly1.addPart(new Service(afterservice));
		
		Assembly assembly2 = new Assembly();
		assembly2.addPart(new Part(cat1));
		assembly2.addPart(new Part(cat2));
		assembly2.addPart(new Service(afterservice));
		assembly2.addPart(assembly1);
		
		CostVisitor visitor = new CostVisitor();
		NumPartsVisitor partsvisitor = new NumPartsVisitor();
		

		
		assembly2.accept(visitor);
		assembly2.accept(partsvisitor);
		double totalCost2 = visitor.getCost();
		System.out.println("Cost of Assemblies2: " + totalCost2);
		System.out.println(partsvisitor.getTotalParts());
	}

}
