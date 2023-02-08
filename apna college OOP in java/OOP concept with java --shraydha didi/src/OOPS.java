import java.util.*;
import bank.*;
import my_practice.*;

class Shape{
    
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*h*l);
    }
class EqulateralTriangle extends Triangle {
    public void area(int l, int h){
        System.out.println(1/2*h*l);

}
class Circle extends Shape {
    public void area(int r){
        System.out.println((3.1415)*r*r);
}
public class OOPS{
    public static void main(String args[]){
        bank.Account account1 = new bank.Account()
        account1.name = "customer1";
        

    }
}