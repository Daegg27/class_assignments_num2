import java.text.DecimalFormat;
import java.lang.Math;

public class circle {


    public int radius;
    DecimalFormat finalFormat = new DecimalFormat("#.##");

    public circle(){
        radius = 4;
    }

    public circle(int numOne){
        radius = numOne;
    }

    public void setRadius(int x){
        radius = x;
    }

    public int getRadius(){
        return radius;
    }

    public int getDiameter(){
        return radius * 2;
    }

    public double getArea(){
        double area = (radius * radius) * Math.PI;
        return Double.parseDouble(finalFormat.format(area)); // I'm not completely sure why I have to do this, when I haven't in the past lol.
        
        
    }
    
    public String toString(){
        return "The radius of this circle is " + radius + " with a diameter of " + getDiameter() + " and an area of " + getArea();
    }
}
