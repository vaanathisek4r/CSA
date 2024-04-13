public class Haiku extends Poem{
    public Haiku() {
        super(3);
    }

    public int getSyllables(int k) {
        if (k==2) return 7;
        else return 5;
    }

    public void printRhythm() {
        for(int i = 1; i <= getNumlines(); i++) {
            funRhythm(getSyllables(i));
        }
    }
}
