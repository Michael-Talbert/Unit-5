public class Slogan {
  private static int count = 0;
    private String phrase;
    public Slogan(String phrase){
        count++;
        this.phrase = phrase;
    }

    @Override
    public String toString() {

    }

    public static int getCount() {
        return count;
    }
}
