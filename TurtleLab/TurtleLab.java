import java.awt.Color;

public class TurtleLab
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.setShellColor(Color.white);
        turtle1.setPenWidth(1);
        turtle1.penDown();
        turtle1.setPenColor(Color.red);
        turtle1.forward(200);
        
        int x = 200;
        while (x > 0)
        {
          turtle1.turn(180);
          turtle1.forward(x);
          turtle1.turn(180);
          turtle1.turn(5);
          turtle1.forward(x);
          x -= 1;
        }
        ////////////////////////////////////////////////
        
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setShellColor(Color.white);
        turtle2.setPenWidth(1);
        turtle2.penDown();
        turtle2.setPenColor(Color.orange);
        turtle2.turn(60);
        turtle2.forward(200);
        
        int x2 = 200;
        while (x2 > 0)
        {
          turtle2.turn(180);
          turtle2.forward(x2);
          turtle2.turn(180);
          turtle2.turn(5);
          turtle2.forward(x2);
          x2 -= 1;
        }
        ////////////////////////////////////////////////
        
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.setShellColor(Color.white);
        turtle3.setPenWidth(1);
        turtle3.penDown();
        turtle3.setPenColor(Color.yellow);
        turtle3.turn(120);
        turtle3.forward(200);
        
        int x3 = 200;
        while (x3 > 0)
        {
          turtle3.turn(180);
          turtle3.forward(x3);
          turtle3.turn(180);
          turtle3.turn(5);
          turtle3.forward(x3);
          x3 -= 1;
        }
        //////////////////////////////////////////////
        
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle4.setShellColor(Color.white);
        turtle4.setPenWidth(1);
        turtle4.penDown();
        turtle4.setPenColor(Color.green);
        turtle4.turn(180);
        turtle4.forward(200);
        
        int x4 = 200;
        while (x4 > 0)
        {
          turtle4.turn(180);
          turtle4.forward(x4);
          turtle4.turn(180);
          turtle4.turn(5);
          turtle4.forward(x4);
          x4 -= 1;
        }
        //////////////////////////////////////////////
        
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle5.setShellColor(Color.white);
        turtle5.setPenWidth(1);
        turtle5.penDown();
        turtle5.setPenColor(Color.blue);
        turtle5.turn(240);
        turtle5.forward(200);
        
        int x5 = 200;
        while (x5 > 0)
        {
          turtle5.turn(180);
          turtle5.forward(x5);
          turtle5.turn(180);
          turtle5.turn(5);
          turtle5.forward(x5);
          x5 -= 1;
        }
        ////////////////////////////////////////////////
        
        Turtle turtle6 = new Turtle(turtleWorld);
        turtle6.setShellColor(Color.white);
        turtle6.setPenWidth(1);
        turtle6.penDown();
        turtle6.setPenColor(Color.magenta);
        turtle6.turn(300);
        turtle6.forward(200);
        
        int x6 = 200;
        while (x6 > 0)
        {
          turtle6.turn(180);
          turtle6.forward(x6);
          turtle6.turn(180);
          turtle6.turn(5);
          turtle6.forward(x6);
          x6 -= 1;
        }
    }
}
