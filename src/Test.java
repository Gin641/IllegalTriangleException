public class Test {
    public static void main(String[] args) {
        Triangle triangle, triangle1;
        try{
            triangle = new Triangle(2, 2, 3);
            triangle1 = new Triangle(-5, 2, 3);
        } catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }
}
