import java.util.*;
class ComputeArea
{
void area(double r)
{
double area;
area=3.142*r*r;
System.out.println("Area of Circle for radius:"+r+":"+area+" SQ units");
}
void area(float side)
{
double res;
res=Math.pow(side,2);
System.out.println("Area of Square="+res+" Sq units");
}
void area(float len,float wid)
{
double res=len*wid;
System.out.println("Area of Rectangle (Len X Wid):"+res+" Sq units’");
}
}
public class OverloadingPoly
{
public static void main(String[] args)
{
Scanner scr=new Scanner(System.in);
ComputeArea obj=new ComputeArea();
System.out.println("Please Enter radius value to calculate area of circle");
double r=scr.nextDouble();
obj.area(r);
System.out.println("Please Enter side value to calculate area of square");
float x=scr.nextFloat();
obj.area(x);
System.out.println("Enter Length and width of rectangle:");
float l=scr.nextFloat();
float w=scr.nextFloat();
obj.area(l, w);
}
}