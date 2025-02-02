class Outer{
int a=10;
static int b=20;
void m1(){
System.out.println("Outer - m1()");
}
static void m2(){
System.out.println("Outer - m2()");
}
static class Inner{
int x=99;
static int y=88;
void show(){
System.out.println("Inner - showIn()");
}
}
}
class Lab503{
public static void main(String as[]){
Outer.Inner myinner = new Outer.Inner();
myinner.show();
}
}