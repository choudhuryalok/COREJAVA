package InterviewProgram;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
	public static void main(String... args){
		CopyOnWriteArrayList<String> ob= new CopyOnWriteArrayList<>();
		
		ob.add("A");
		ob.add("B");
		ob.add("C");
		ob.add("D");
		ob.add("E");
		ob.add("A");
		ob.addIfAbsent("A");
		
		ob.remove("B");
		Iterator itr= ob.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			//itr.remove();
		}
	}
}