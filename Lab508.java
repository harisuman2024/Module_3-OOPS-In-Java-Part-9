interface Shape{
void draw();
}
class Circle implements Shape{
public void draw(){
System.out.println("Circle - draw");
}
}
class Lab508{
public static void main(String as[]){
Shape shape1 = new Circle();
shape1.draw();
}
}