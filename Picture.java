/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
=======
 /**
  * This is my picture by Ari Kaminski 1/26/2021
  * The picture is 2 people fighting over the last slice of pizza on the table
  * I wish brown was a useable color.
  * I will be attempting the challenges, just submitting the requirements for now.
 


 * @version 2016.02.29
 */
public class Picture
{
    private Square box;
    private Square table;
    private Triangle slice;
    private Circle sun;


    private Circle pep;
    private Person person;
    private Person person2;

    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        box = new Square();
        table = new Square();
        slice = new Triangle();  
        sun = new Circle();

        pep = new Circle();
        person = new Person();
        person2 = new Person();
        

        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
           
            table.changeColor("blue");
            table.moveHorizontal(-300);
            table.moveVertical(-200);
            table.changeSize(500);
            table.makeVisible();
            
            box.changeColor("magenta");
            box.moveHorizontal(-150);
            box.moveVertical(-100);
            box.changeSize(250);
            box.makeVisible();
            
            slice.changeColor("yellow");
            slice.changeSize(140, 100);
            slice.moveHorizontal(20);
            slice.moveVertical(-40);
            slice.makeVisible();

            sun.changeColor("red");
            sun.moveHorizontal(-15);
            sun.moveVertical(70);
            sun.changeSize(20);
            sun.makeVisible();
            
            pep.changeColor("red");
            pep.moveHorizontal(15);
            pep.moveVertical(100);
            pep.changeSize(20);
            pep.makeVisible();
            
            person.changeColor("black");
            person.moveHorizontal(-200);
            person.moveVertical(-60);
            person.changeSize(350,200);
            person.makeVisible();
            
            person2.changeColor("black");
            person2.moveHorizontal(100);
            person2.moveVertical(-60);
            person2.changeSize(350,200);
            person2.makeVisible();
            
            

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        box.changeColor("black");
        table.changeColor("black");
        slice.changeColor("white");
        sun.changeColor("black");
        pep.changeColor("black");
        person.changeColor("white");
        person2.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        table.changeColor("blue");
        box.changeColor("magenta");
        slice.changeColor("yellow");
        sun.changeColor("red");
        pep.changeColor("red");
        person.changeColor("black");
        person2.changeColor("black");
    }

       
    
  


}