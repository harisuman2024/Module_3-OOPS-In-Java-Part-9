class Outer{
int a=10;
static int b=20;
void m1(){
System.out.println("Outer - m1()");
}
static void m2(){
System.out.println("Outer - m2()");
}
class Inner{
int x=99;
final static int y=88;
void showIn(){
System.out.println("Inner - showIn()");
System.out.println(x);
System.out.println(y);
System.out.println(a);
System.out.println(b);
m1();
m2();
}
}
}
class Lab500{
public static void main(String as[]){
Outer.Inner myinner = new Outer().new Inner();
myinner.showIn();
}
}