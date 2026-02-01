public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      Shape shape1 = shapeFactory.getShape("CIRCLE");
      System.out.println("Area of Circle: " + shape1.getArea());

      Shape shape2 = shapeFactory.getShape("RECTANGLE");
      System.out.println("Area of Rectangle: " + shape2.getArea());

      Shape shape3 = shapeFactory.getShape("SQUARE");
      System.out.println("Area of Square: " + shape3.getArea());
   }
}
