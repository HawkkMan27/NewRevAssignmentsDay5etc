package lab_CompositeRelationships;

public class ClassB {
	
	ClassA classA = new ClassA();

	public static void main(String[] args) {
		ClassB b = new ClassB();
		
		b.classA.setName("Hisham");
		
		System.out.println(b.classA.getName());
		
		}
}

