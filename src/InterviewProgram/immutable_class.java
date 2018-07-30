package InterviewProgram;
// An immutable class
public final class immutable_class
{

    private final String[] array;

    public immutable_class(String[] arr){
       // this.array = arr.clone(); 
        this.array = arr; // wrong
    } 

    public String toString() {
        StringBuffer sb = new StringBuffer("Characters in array are: ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] array = {"a","b"};
        immutable_class immutableClass = new immutable_class(array) ;
        System.out.println("Before constructing " + immutableClass);
        array[1] = "c"; // change (i.e. mutate) the element
        System.out.println("After constructing " + immutableClass);
    }
    
    
   
    
}

