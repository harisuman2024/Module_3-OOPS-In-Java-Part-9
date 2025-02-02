class Outer{
int a=10;
static int b=20;
void m1(){
System.out.println("Outer - m1()");
Inner in=new Inner();
System.out.println(in.x);
System.out.println(in.y);
}
static void m2(){
System.out.println("Outer - m2()");
}
class Inner{
int x=99;
final static int y=88;
void showIn(){
System.out.println("Inner - showIn()");
m1();
m2();
}
}
}
class Lab501{
public static void main(String as[]){
Outer.Inner myinner = new Outer().new Inner();
myinner.showIn();
}
} 
