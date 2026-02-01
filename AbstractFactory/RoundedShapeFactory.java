public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("ROUNDED_RECTANGLE")){
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("ROUNDED_SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}