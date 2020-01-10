public class NumController{
    private int value;

    public Num(int value) {
        this.value = value
    }
    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ""+value;
    }

    public boolean equals(int otherNum){
        return this.value == otherNum.value;
    }
}
