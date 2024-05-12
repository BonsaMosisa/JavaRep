class Circ{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylin extends Circ{
    public double height;
    public double volume(){
        return area()*height;
    }
}

public class MyCircle {
    public static void main(String[] args){
       Cylin cy= new Cylin();
       cy.radius=7;
       cy.height=10;
       System.out.println("Volume : "+cy.volume());
       System.out.println("Area : "+ cy.area());

    }
}
