
public class Service extends Component {
	
	private CatalogueEntry entry;
	
	
	public Service(CatalogueEntry e){
		
		this.entry = e;
	}
	
	public String getName(){
		
		return this.entry.getName();
	}
	
	public long getNumber(){
		
		return this.entry.getNumber();
	}
	
	
	public double getCost(){
		
		return this.entry.getCost();
	}
	
	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);
		
	}

}
