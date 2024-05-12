import org.w3c.dom.css.Rect;

class MyRectangle {
    private double length;
    private double width;
    public MyRectangle(){
        length=1;
        width=1;
    }
    public MyRectangle(double l,double w){
        length=l;
        width=w;
    }
    public MyRectangle(double S){
        length=width=S;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return width;
    }
    public void setLength(double l){
        if(l>=0)
            length=l;
        else
            length=0;
    }
    public void setBreadth(double w){
        if(w>=0)
            width=w;
        else
            width=0;
    }

}
public class Constructor {
    public static void main(String[] args){
        MyRectangle rec=new MyRectangle(2,4);
        System.out.println(rec.getLength());

    }
}
