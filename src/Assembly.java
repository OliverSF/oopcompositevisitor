import java.util.*;

public class Assembly extends Component {
	
	private List<Component> assemblies;
	
	public Assembly(){
		assemblies = new ArrayList<Component>();
	}
	
	public void addPart(Component comp){
		
		assemblies.add(comp);
	}
	
	public void getPart(){
		//unsure how to do this??
	}
	
	

	@Override
	public void accept(Visitor visitor) {
		//asks the visitor to perform it's method
		visitor.visit(this);
		
		for(Component comp : assemblies){
			comp.accept(visitor);
		}
	}
	

}
