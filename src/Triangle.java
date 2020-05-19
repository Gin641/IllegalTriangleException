public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){
    }
    public Triangle(double side1,double side2,double side3) throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        checkTriangle();
    }
    public boolean isTriangle(){
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)){
           if (Math.pow(side1,2) == Math.pow(side2,2) + Math.pow(side3,2) ||
                   Math.pow(side2,2) == Math.pow(side1,2) + Math.pow(side3,2) ||
                   Math.pow(side3,2) == Math.pow(side1,2) + Math.pow(side2,2)){
               System.out.println("Hình này là tam giác vuông");
               return true;
           }else {
               System.out.println("Hình này là tam giác");
               return true;
           }
        }else {
            return false;
        }
    }
    private void checkTriangle() throws IllegalTriangleException{
        if (isTriangle() == false){
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }
}
