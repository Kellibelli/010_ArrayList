package arraylist;

public class MainInside {

	public static void main(String[] args) {
		
		gradingRequirements();
		
		StudentFirstNames a2 = new StudentFirstNames();
		a2.showSize();
		a2.showContents();
		a2.addName();
		a2.showContents();
		a2.showSize();
		a2.removeName();
		a2.showContents();
		a2.getName();
		a2.replaceName();
		a2.showContents();
	}

	private static void gradingRequirements() {
		System.out.println("1. All JOP and jar'd\n 2. First is a menu asking for desired option -- looped\n 3. Menu: Show Names, Add Name, Remove Name, Replace Name, exit ");
	}

}

/*
 * 1. add this functionality -- Ask for a name, add that name to ArrayList
 * 1a. test -- after each name, show size and contents
 * 
 * 
 */