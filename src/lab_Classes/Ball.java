package lab_Classes;

public class Ball {
	String size;
	String color;
	
	public void bounce() {
		System.out.println("The " + size + " " + color + " ball is bouncing.");
	}
	public static void main(String[] args) {
		
		Ball bOne = new Ball();
		Ball bTwo = new Ball();
		
		bOne.size = "Large";
		bOne.color = "Red";
		bTwo.size = "Small";
		bTwo.color = "Blue";
		
		bOne.bounce();
		bTwo.bounce();
		
		
		
		
	}
}
