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
}
}
}
class Lab499{
public static void main(String as[]){
Outer myouter = new Outer();
myouter.m1();
myouter.m2();
//Inner in = new Inner();
Outer.Inner myinner1 = myouter.new Inner();
myinner1.showIn();
Outer.Inner myinner2 = new Outer().new
Inner();
myinner2.showIn();
}
}