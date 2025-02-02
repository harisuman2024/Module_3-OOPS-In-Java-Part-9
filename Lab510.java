interface Shape{
void draw();
}
class Hello{
int a=99;
Shape myshape = new Shape(){
public void draw(){
System.out.println("Annonymous - draw");
}
};
}
class Lab510{
public static void main(String as[]){
Hello h= new Hello();
System.out.println(h.a);
System.out.println(h.myshape);
h.myshape.draw();
}
}