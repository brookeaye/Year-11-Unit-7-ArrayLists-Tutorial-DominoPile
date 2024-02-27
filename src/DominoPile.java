import java.util.ArrayList;

public class DominoPile {
    ArrayList<Domino> pile;
    public DominoPile(){
        pile = new ArrayList<>();
    }
    public void newStack6(){
        for (int i = 0; i <= 6; i++){
            for (int j = i; j <= 6; j++){
                pile.add(new Domino(i, j));
            }
        }
    }
    public void shuffle(){
        for (int i = 0; i < 50; i++){
            int n = (int) (Math.random() * (pile.size()));
            int g = (int) (Math.random() * (pile.size()));
            Domino otherDomino = pile.get(n);
            pile.set(n, pile.get(g));
            pile.set(g, otherDomino);
        }
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }


}
