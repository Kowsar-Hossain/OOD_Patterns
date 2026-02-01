public class Square implements Shape {
   private double side;

   public Square(){
      this.side = 1.0;
   }

   @Override
   public double getArea() {
      return side * side;
   }
}