import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Name of employee: ");
        String name = in.nextLine();

        System.out.println("Work hours of week "+ name+":");
        int workhours = in.nextInt();

        System.out.println("Hire year of "+ name+":");
        int hireyear = in.nextInt();

        System.out.println("Salary of "+ name+":");
        double salary = in.nextDouble();

        Employee E1 = new Employee(name, workhours, hireyear, salary);

        E1.printInfo(name, hireyear, workhours, salary);
        System.out.println("Salary with tax and bonus: " + ((salary-E1.tax(salary, workhours))+E1.bonus(workhours)));
        System.out.println("Raised salary: "+ (salary+E1.raisesalary(salary, hireyear)));
    }
}
