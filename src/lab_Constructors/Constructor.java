package lab_Constructors;

public class Constructor {
	
	public Constructor() {
		System.out.println("The class Constructor has a default constructor()");
		
	}

	public Constructor(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		Constructor construct = new Constructor(5431);
		
		Constructor error = new Constructor();
		
	}
}
