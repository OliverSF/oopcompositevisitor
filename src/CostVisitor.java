
public class CostVisitor implements Visitor {
	
	//possibly should have a method to reset the cost variable after it visits one assembly to get individual totals
	
	private double cost;
	
	@Override
	public void visit(Component comp) {
		
		if(comp instanceof Part){
			cost += ((Part)comp).getCost();
		}
		else if(comp instanceof Service){
			cost += ((Service)comp).getCost();
		}
		
	}
	
	public double getCost(){
		
		return cost;
	}
	
	

}
