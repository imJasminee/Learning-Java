package java102; 

public class RightTriangle implements Shape{
    private double side1; 
    private double side2;

    public RightTriangle(side1, side2, side3){
        this.side1 = side1;
        this.side2 = side2; 
    }

    @Override 
    public double area(){
        return 0.5 * side1 * side2;
    }

    @Override
    public double perimeter(){
        double hypotenuse = Math.sqrt((side1*side1)+(side2*side2))
        return hypotenuse + side1 + side2 
    }

    @Override 
    public String toString() {
        return "RightTriangle[side1=" + side1 + ", side2=" + side2 + "]"
    }
}
