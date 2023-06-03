public class Rectangle {
    // write the code of rectangle class here
    public Point topLeft;
    public Point bottomRight;
    public int height;
    public int width;

    public int getArea(){
        return (int) (height*width);
    }
    public int getParameter(){
        return (int)(2*(height+width));
    }

    public Point getBottomRight(){
        return bottomRight;
    }
}
