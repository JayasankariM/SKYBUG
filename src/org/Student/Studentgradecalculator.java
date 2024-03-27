package org.Student;

import java.util.Scanner;

public class Studentgradecalculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of Subjects:");
		int numsubjects=s.nextInt();
		
		int[] marks=new int[numsubjects];
		int totalmarks=0;
		
		for(int i=0;i<numsubjects;i++)
		{
		
			System.out.println("Enter marks obtained in each object" +(i+1)+";");
			marks[i]=s.nextInt();
			totalmarks+=marks[i];
			
		}
		double averagePercentage=(double) totalmarks / (numsubjects*100)*100;
		System.out.println("Your Result is Here:");
		System.out.println("Your Total Marks:"+totalmarks);
		System.out.println("Average Percentage:"+averagePercentage+"%");
		
		String grade=calculatorGrade1(averagePercentage);
		System.out.println("Grade:"+grade);
		s.close();
	}
	public static String calculatorGrade1(double percentage)
	{
		if(percentage>=90)
		{
			return "A+";
			
		}
		else if(percentage >=80) {
			return "A";
					
		}
		else if(percentage >=70) {
			return "B";
		}
		else if(percentage >=60) {
			return "c";
		}
		else if(percentage >=50) {
			return "D";
		}
		else
		{
			
		
		return "F";
		
		
	}

	
	}
}
