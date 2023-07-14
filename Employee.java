import javax.sql.rowset.spi.SyncResolver;

public class Employee {
    private String name;
    private int hireyear, workhours;
    private double salary;

    Employee(String name, int workhours, int hireyear, double salary){
        this.name=name;
        this.hireyear=hireyear;
        this.salary=salary;
        this.workhours=workhours;
    }
    public double tax(double salary, int workhours){
        if(this.salary>1000)return salary*0.03;
        return 0.0;
    }
    public double bonus(int workhours){
        int extrahours=workhours-40;
        return extrahours*30;
    }
    public double raisesalary(double salary, int hireyear){
        int workyears = 2020-hireyear;
        if(workyears<10)return salary*0.5;
        else if(workyears>=10 && workyears<20)return salary*0.10;
        else if(workyears>=20)return salary*0.15;
        else return 0; 
    }
    public void printInfo(String name, int hireyear, int workhours, double salary){
        System.out.println("Name: "+name+"\nSalary: "+salary+"\nHire year: "+hireyear+"\nWork hours: "+workhours+"\nTax: "+tax(this.salary, this.workhours)+"\nBonus: "+bonus(this.workhours)+"\nRaise of salary: "+raisesalary(this.salary, this.hireyear));
    }

}
