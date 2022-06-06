package Overridingpoly;

class Employee{
float salary = 30000;
void Salary()
{
System.out.println("Employee incremented salary:" +(salary + (salary * 0.1)) );
}
}

class PermanentEmployees extends Employee{
double hike = 0.9;
void Salary()
{
System.out.println("Permanent Employee incremented salary :" +(salary + (salary * hike)) );
}
}


class TemporaryEmployees extends Employee{
double hike = 0.20;
void Salary()
{
System.out.println("Temporary Employee incremented salary:" +(salary + (salary * hike)) );
}
}


public class Overridingpoly
{
public static void main(String args[]){
Employee emp =new Employee( );
PermanentEmployees per = new PermanentEmployees();
TemporaryEmployees temp = new TemporaryEmployees();

emp.Salary();
per.Salary();
temp.Salary();
}
}