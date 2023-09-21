class Bug {
  
    private int position;
    private boolean toRight; 
    
    public Bug(int initialPosition) {
        position = initialPosition;

        toRight = true;
    }

    public void turn() {
        toRight = !toRight;
    }

    public void move() {
        if (toRight == true) {
            position += 1;
        } else {
            position -= 1; 
        }
    }

    public int getPosition() {
        return position;
    }
}
public class extraCredit{
    public static void main(String[] args) {
        Bug bugsy = new Bug(10);

        bugsy.move(); 
        bugsy.turn(); 
        bugsy.move();
        bugsy.move();
        System.out.println("Position: " + bugsy.getPosition());
    }
}