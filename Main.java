import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {   
        World world = new World(1200, 800);

        Turtle turtle1 = new Turtle(200, 200, world);
        turtle1.setShellColor(Color.green);
        turtle1.setPenWidth(2);
        turtle1.cross(30);    

        Turtle turtle2 = new Turtle(500, 200, world);
        turtle2.setShellColor(Color.blue);
        turtle2.setPenWidth(3);
        turtle2.diamond(100);
        
        Turtle turtle3 = new Turtle(800, 200, world);
        turtle3.setShellColor(Color.magenta);
        turtle3.setPenWidth(4);
        turtle3.arrow(120);

        Turtle turtle4 = new Turtle(400, 500, world);
        turtle4.setShellColor(Color.red);
        turtle4.setPenWidth(5);
        turtle4.star(100);

        turtle1.setName("Michaelangelo");
        turtle2.setName("Donatello");
        turtle3.setName("Raphael");
        turtle4.setName("Leonardo");

        System.out.println("Name: " + turtle1.getName());
        System.out.println("Color (RGB): " + turtle1.getPenColor());
        System.out.println("Shape Drawn: Cross");
        System.out.println("Distance from (0,0): " + turtle1.getDistance(0, 0));
        System.out.println();

        System.out.println("Name: " + turtle2.getName());
        System.out.println("Color (RGB): " + turtle2.getPenColor());
        System.out.println("Shape Drawn: Diamond");
        System.out.println("Distance from (0,0): " + turtle2.getDistance(0, 0));
        System.out.println();

        System.out.println("Name: " + turtle3.getName());
        System.out.println("Color (RGB): " + turtle3.getPenColor());
        System.out.println("Shape Drawn: Arrow");
        System.out.println("Distance from (0,0): " + turtle3.getDistance(0, 0));
        System.out.println();

        System.out.println("Name: " + turtle4.getName());
        System.out.println("Color (RGB): " + turtle4.getPenColor());
        System.out.println("Shape Drawn: Star");
        System.out.println("Distance from (0,0): " + turtle4.getDistance(0, 0));
        System.out.println();
    }
}

  


    //System.out.println(turtle3.getShellColor());
    //System.out.println(turtle3.getDistance(0, 0));

    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  

