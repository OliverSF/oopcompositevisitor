
public class NumPartsVisitor implements Visitor {
	
	private int totalParts;
	
	@Override
	public void visit(Component comp) {
		
		if(comp instanceof Part){
			totalParts++;
		}
		
		else if(comp instanceof Service){
			totalParts++;
		}
		
	}
	
	public int getTotalParts(){
		
		return totalParts;
	}

}
