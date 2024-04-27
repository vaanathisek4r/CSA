public class Poem {
    private int lines;
     
    public Poem() {
        lines = 0;
    }

    public Poem(int num) {
        this.lines = num;
    }

    public int getNumlines() {
        return lines;
    }

    public void printRhythm() {
        System.out.println("Free Verse!");
    }
    
    public void funRhythm(int num) {
        for(int i = 1; i<=num; i++) {
            if (i==num) System.out.println("ta");
            else System.out.print("ta-");
        }
    }
}
