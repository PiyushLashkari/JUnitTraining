import java.util.LinkedList;
import java.util.List;


public class MyClass {

	public int multiply(int x, int y){
		if(x > 100){
			throw new IllegalArgumentException("x cannot be greater than 100");
		}
		
		return x * y;
	}
	
	public int getUniqueId(){
		
		// Database call to get the uniqueID
		int id = 33;
		
		return id;
	}
	
	@SuppressWarnings("rawtypes")
	public List findAll(){
		
		List all = new LinkedList();
		// Database call to get the list;
		
		return all;
	}
}
