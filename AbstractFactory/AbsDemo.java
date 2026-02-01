public class AbsDemo{
    public static void main(String [] args){
    AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
    shape1.draw();
    Shape shape2 = shapeFactory.getShape("SQUARE");
    shape2.draw();
    
    AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
    Shape shape3 = roundedShapeFactory.getShape("ROUNDED_RECTANGLE");
    shape3.draw();
    Shape shape4 = roundedShapeFactory.getShape("ROUNDED_SQUARE");
    shape4.draw();
}
}