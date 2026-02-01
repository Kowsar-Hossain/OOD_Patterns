public class Rectangle implements Shape {
   private double length;
   private double width;

   public Rectangle(){
      this.length = 2.0;
      this.width = 1.0;
   }

   @Override
   public double getArea() {
      return length * width;
   }
}