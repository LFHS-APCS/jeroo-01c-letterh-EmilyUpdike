/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put any methods here
public void turnRight(){
  turn(LEFT);
  turn(LEFT);
  turn(LEFT);
 }

public void turnLeftTwice(){
  turn(LEFT);
  turn(LEFT);
}

public void hopX3(){
  hop();
  hop();
  hop();
}

public void plantHopX2(){
  plant();
  hop();
  plant();
  hop();
  
}

public void plantHopX4(){
  plantHopX2();
  plantHopX2();
}
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
