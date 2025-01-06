package academy.tochkavhoda.figures.v1;

public class Rectangle {
    private Point pointLT;
    private Point pointRB;
    public Rectangle(Point leftTop, Point rightBottom) {
        this.pointLT = leftTop;
        this.pointRB = rightBottom;
    }
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        this.pointLT = new Point(xLeft, yTop);
        this.pointRB = new Point(xRight, yBottom);
    }
    
}
