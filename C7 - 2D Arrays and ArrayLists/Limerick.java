public class Limerick extends Poem {
    public Limerick() {
        super(5);
    }

    public int getSyllables(int k) {
        if((k == 3) || (k == 4)) return 6;
        else return 9;
    }

    public void printRhythm() {
        for (int i = 1; i <= getNumlines(); i++) {
            funRhythm(getSyllables(i));
        }
    }
}
