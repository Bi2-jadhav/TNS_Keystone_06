package TNS_Traning_code.Basic;

public class Variables {


		 // Instance variable (separate copy for each object)
	    String instanceVar = "I am Instance Variable";

	    // Class/Global variable (shared across all objects)
	    static String globalVar = "I am Global (Static) Variable";

	    public void methodExample() {
	        // Local variable (only inside this method)
	        int localVar = 100;
	        System.out.println("Local Variable: " + localVar);
	    }

	    public void display() {
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Global Variable: " + globalVar);
	    }

	    public static void main(String[] args) {
	        Variables obj1 = new Variables();
	        Variables obj2 = new Variables();

	        // Changing instance variable for obj1 only
	        obj1.instanceVar = "Changed for obj1";

	        // Changing static/global variable affects all objects
	        Variables.globalVar = "Updated Global Variable";

	        obj1.methodExample();
	        obj1.display();

	        obj2.display();

	}

}
