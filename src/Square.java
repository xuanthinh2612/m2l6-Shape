public class Square extends Rectangle {
    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
        setLength(side);
        setWidth(side);
    }
    Square() {
        setWidth(1.0);
        setLength(1.0);
    }
    Square(double side){
        setLength(side);
        setWidth(side);
    }


    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
    public String toString() {
        return "A Square with side= "+getSide()+", which is a subclass of "+super.toString();
    }

}
