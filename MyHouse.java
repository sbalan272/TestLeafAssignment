package week3.day1;

public class MyHouse {

	public static void main(String[] args) {
		
		// Interface do not have any implementation it has only Design
		// Cannot create Object for Interface or Abstract Class
		// Object can be created for Concrete Class / Normal Class
		
		FullHouse obj = new FullHouse(); // Creating reference variable for Concrete Class "FullHouse"
		obj.designBasement();
		obj.carParking(); // Own Method created in Concrete Class which is not belong to Interface
		
		/*
		 * Access all 4 methods --> 3 methods based on Interface + 1 Own method
		 */
		
		HouseDesign myHouse1 = new FullHouse(); // 
		myHouse1.chooseColor();

	}

}
