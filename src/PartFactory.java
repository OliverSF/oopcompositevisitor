import java.util.*;
public class PartFactory {
	
	//lazy instantiation assumed that single threaded application
	
	private Map<CatalogueEntry, Part> partPool = new HashMap<CatalogueEntry, Part>();
	
	private static PartFactory instance;
	
	private PartFactory(){
		
	}
	
	public static PartFactory getInstance(){
		
		if(instance == null){
			instance = new PartFactory();
		}
		
		return instance;
	}
	
	public Part getPart(CatalogueEntry catEntry){
		Part part = partPool.get(catEntry);
		
		if(part == null){
			part = new Part(catEntry);
			partPool.put(catEntry, part);
		}
		
		return part;
	}

}
