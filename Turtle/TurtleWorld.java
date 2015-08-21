import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setShellColor(Color.yellow);
        turtle.setPenWidth(10);
        turtle.penDown();
        turtle.setPenColor(Color.black);
        turtle.forward(45);
        turtle.setPenColor(Color.darkGray);
        turtle.forward(30);
        turtle.setPenColor(Color.gray);
        turtle.forward(25);
        turtle.setPenColor(Color.lightGray);
        turtle.forward(10);
        turtle.setPenColor(Color.white);
        turtle.forward(5);
        turtle.turnRight();
        turtle.forward(5);  
        turtle.setPenColor(Color.lightGray);
        turtle.forward(10);
        turtle.setPenColor(Color.gray);
        turtle.forward(25);
        turtle.setPenColor(Color.darkGray);
        turtle.forward(30);
        turtle.setPenColor(Color.black);
        turtle.forward(45);
        turtle.setPenColor(Color.black);
        turtle.turnRight();
        turtle.forward(45);
        turtle.setPenColor(Color.darkGray);
        turtle.forward(30);
        turtle.setPenColor(Color.gray);
        turtle.forward(25);
        turtle.setPenColor(Color.lightGray);
        turtle.forward(10);
        turtle.setPenColor(Color.white);
        turtle.forward(5);
        turtle.turnRight();
        turtle.setPenColor(Color.white);
        turtle.forward(5);  
        turtle.setPenColor(Color.lightGray);
        turtle.forward(10);
        turtle.setPenColor(Color.gray);
        turtle.forward(25);
        turtle.setPenColor(Color.darkGray);
        turtle.forward(30);
        turtle.setPenColor(Color.black);
        turtle.forward(45);
    }
}
