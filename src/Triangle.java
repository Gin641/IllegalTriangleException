public class Triangle {
    private double size1;
    private double size2;
    private double size3;
    public Triangle(){
    }
    public Triangle(double size1,double size2,double size3) throws IllegalTriangleException{
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        checkTriangle();
    }
    public boolean isTriangle(){
        if ((size1 + size2 > size3) && (size2 + size3 > size1) && (size1 + size3 > size2)){
           if (Math.pow(size1,2) == Math.pow(size2,2) + Math.pow(size3,2) ||
                   Math.pow(size2,2) == Math.pow(size1,2) + Math.pow(size3,2) ||
                   Math.pow(size3,2) == Math.pow(size1,2) + Math.pow(size2,2)){
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
            throw new IllegalTriangleException(size1, size2, size3);
        }
    }
}
