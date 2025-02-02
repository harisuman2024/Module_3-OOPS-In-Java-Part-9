interface Shape{
void draw();
}
class Lab509{
public static void main(String as[]){
Shape shape1 = new Shape(){
public void draw(){
System.out.println("Annonymous1 Shape - draw");
}
};
shape1.draw();
Shape shape2 = new Shape(){
public void draw(){
System.out.println("Annonymous2 Shape - draw");
}
};
shape2.draw();
}
} 
