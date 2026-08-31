package Lamda;

public class HrManagementSystem {
public static void main(String[] args) {
	Employe e1 = new Employe(1, "Rohit", 50000, 6);
	
	SalaryCalculator calculator = (employe)-> {
		
		double bonus = 0;
	
		if(employe.experience < 2) {
			bonus = 0;
		}
		
		else if(employe.experience <= 5) {
			bonus = employe.basicSalary * 0.10;
		}
		else {
			bonus = employe.basicSalary *0.20;
		}
		return employe.basicSalary + bonus;
	};
	
	double finalSalary = calculator.calcualateSalary(e1);
	
	double bonus = finalSalary - e1.basicSalary;
	
	System.out.println("Employe: "+e1.name);
	System.out.println("Basic Salary: "+e1.basicSalary);
	System.out.println("Bonus: "+bonus);
	System.out.println("Final Salary.: "+finalSalary);
}
}
