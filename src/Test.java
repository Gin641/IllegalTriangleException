public class Test {
    public static void main(String[] args) {
        Triangle triangle;
        try{
            triangle = new Triangle(3, 4, 5);
        } catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }
}
