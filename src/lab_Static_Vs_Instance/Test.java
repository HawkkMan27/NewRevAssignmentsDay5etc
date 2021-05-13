package lab_Static_Vs_Instance;

public class Test {

 public static void main(String[] args) {
	 
	 A.staticCount = 2494;
	 A a = new A();
	 System.out.println(A.staticCount);
	 System.out.println(a.instanceCount);
	 
	 A a2 = new A();
	 
	 System.out.println(A.staticCount);
	 System.out.println(a2.instanceCount);
	  
	 a.instanceCount = 15;
	 
	 System.out.println("The variable for a object: " + a.instanceCount);
	 System.out.println("The variable static variable is: " + A.staticCount);
	 System.out.println("The variable for the \"a2\" object: " + a2.instanceCount);
 }
}
