class Rectangle{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        length=l;
    }
    public void setBreadth(double b){
        breadth=b;
    }
    public double area(){
        return getBreadth()*getLength();
    }
    public double perimeter(){
        return getLength()+getBreadth();
    }
}
public class Rect1 {
    public static void main(String[] args){
        Rectangle R=new Rectangle();
        R.setBreadth(10);
        R.setLength(5);
        System.out.println("AREA : "+R.area());
        System.out.println("PERIMETER : "+ R.perimeter());
    }
}
