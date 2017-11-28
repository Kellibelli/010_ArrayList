package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StudentFirstNames {

	private ArrayList<String> a2Students = new ArrayList<String>();
	Scanner kbd = new Scanner(System.in);
	String n = "";
	

	public StudentFirstNames() {
		// constructor

		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");

	}

	public void showContents() {
		// method

		for (int i = 0; i < a2Students.size(); i++) {
			System.out.println("Contains: " + a2Students.get(i));
		}

	}

	public void addName() {

		System.out.println("What is your name student?");
		String entry = (kbd.nextLine());
		if (a2Students.indexOf(entry) < 0) {
			a2Students.add(entry);
		} else {
			JOptionPane.showConfirmDialog(null, "Name already exists");
		}
	

	}

	public void getName() {
		String n = JOptionPane.showInputDialog("What name would you like to search for?");
		if (a2Students.indexOf(n) < 0) {
			JOptionPane.showMessageDialog(null, "Sorry, name not found.");
		} else {
			JOptionPane.showConfirmDialog(null, "Name Found!");
		}
	}

	public void removeName() {
		System.out.println("Which name would you like to remove?");
		String name = (kbd.nextLine());
		if (a2Students.indexOf(name) < 0) {
			System.out.println("Name doesn't exist");

		} else {
			a2Students.remove(name);

		}
		

	}

	public void replaceName() {
		System.out.println("Enter a name to replace");
		String  name = (kbd.nextLine());
		int index = a2Students.indexOf(name);
		if (index== -1 ) {
			System.out.println("You did't put in a name from the list");
			return;
		}
		System.out.println("Please enter a name");
		name = kbd.nextLine();
		a2Students.set(index, name);
		

	}

	public void showSize() {
		System.out.println("Number of student names is: " + a2Students.size());

	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}

}
