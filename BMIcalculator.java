package Phase1;
import java.util.*;

public class BMIcalculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//user input for weight
		System.out.println("enter your weight in kilograms: ");
		double weight=sc.nextDouble();
		//user input for height
		System.out.println("enter your height in meters: ");
		double height=sc.nextDouble();
		//calculate bmi
		double bmi=weight/(height*height);
		//display bmi
		System.out.println("BMI is "+bmi);
		//check bmi is normal or not
		if(bmi<18.5) {
			System.out.println("you are underweight");
		}
		else if(bmi<=25) {
			System.out.println("you are normal");
		}
		else if(bmi>25) {
			System.out.println("you are overweight");
		}else {
			System.out.println("you are obesity");
		}
	}
}
