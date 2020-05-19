public class IllegalTriangleException extends Exception {
    private double size1;
    private double size2;
    private double size3;
    public IllegalTriangleException(double size1, double size2, double size3){
        super("Không phải tam giác");
            this.size1 = size1;
            this.size2 = size2;
            this.size3 = size3;
    }
}
