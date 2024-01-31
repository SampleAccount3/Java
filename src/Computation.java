public class Computation {
    private int x;
    private int y ;
    ICalculateable calculateable;

    public Computation(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int GetCalculation(){
        return calculateable.Computation(x,y);
    }

    public void setCalculateable(ICalculateable calculateable){
        this.calculateable = calculateable;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
