package Phase1;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private int id;
	private double fee;
	
	public Student(String name, int id, double fee) {
		this.name=name;
		this.id=id;
		this.fee=fee;
	}
	public String grtName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getFee() {
		return fee;
	}
	public String toString() {
		return "ID: "+id+" | NAME: "+name+" | FEE: "+fee;
	}
}

public class FeeManagement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Student> studentsList =new ArrayList<Student>();
		while(true) {
			System.out.println();
			System.out.println("Fee Management System");
			System.out.println(("1. To Add new Student"));
			System.out.println("2. To Remove Student");
			System.out.println("3. To Display All Students");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice: ");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.println();
				System.out.println("Enter the name of the Student: ");
				String name=sc.next();
				System.out.println("Enter the ID of the Student: ");
				int id=sc.nextInt();
				System.out.println("Enter the Student Fee: ");
				double fee=sc.nextDouble();
				Student student= new Student(name,id,fee);
				studentsList.add(student);
				System.out.println("Student Id= "+id+" added");
				break;
			case 2:
				System.out.println();
				System.out.println("Enter the ID of the Student you want to remove: ");
				int removeID=sc.nextInt();
				studentsList.remove(removeID);
				System.out.println("Student "+removeID+" Removed Successfully!");
				break;
			case 3:
				System.out.println();
				System.out.println("Students List: ");
				for(Student s : studentsList) {
					System.out.println(s);
					
				}
				break;
			case 4:
				System.out.println("Existing from Fee Management System. Come Again Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}
}
