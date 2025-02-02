class Hello{
int a=10;
class Hai{
int a=20;
void show(){
System.out.println("Hai - show()");
int a=30;
System.out.println(a);
System.out.println(this.a);
System.out.println(Hai.this.a);//Special
//System.out.println(super.a);
System.out.println(Hello.this.a);//Special
}
}
}
class Lab502{
public static void main(String as[]){
Hello.Hai in = new Hello().new Hai();
in.show();
}
}