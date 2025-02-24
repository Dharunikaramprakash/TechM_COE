package pack2;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int years;

    public  void setEmployeeDetails(int empId,String empName,double sal,int years){
        this.empId=empId;
        this.empName=empName;
        this.sal=sal;
        this.years=years;

    }
    public  void getEmployeeDetails(){
        System.out.println(" employee id:"+empId);
        System.out.println(" employee name: "+empName);
        System.out.println(" salary: "+sal);
        System.out.println(" year of experience: "+years);
        System.out.println("loan eligibility: "+getLoanEligibility()+"lakhs");

    }
    public  double getLoanEligibility(){

        while(years>5){
            double salary=sal*12;
            if(salary==600000){
                return 200000;
            }
            else if(salary>=1000000){
                return 500000;
            } else if (salary>=1500000) {
                return 700000;

            }
            else{
                return 0;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee id: ");
        int empId=sc.nextInt();
        sc.nextLine();

        System.out.println("enter employee name: ");
        String empName=sc.nextLine();

        System.out.println("enter salary: ");
        double sal=sc.nextInt();

        System.out.println("enter the years of experience: ");
        int years= sc.nextInt();
        Employee em=new Employee();
        em.setEmployeeDetails(empId,empName,sal,years);
        em.getEmployeeDetails();
    }

}
