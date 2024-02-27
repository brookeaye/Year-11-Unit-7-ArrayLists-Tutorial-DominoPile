public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip(){
        int oldTop = top;
        top = bottom;
        bottom = oldTop;
    }
    public void settle(){
        if (bottom < top){
            flip();
        }
    }
    public int compareTo(Domino other){
        int mine = Math.min(top, bottom);
        int otherOne = Math.min(other.getTop(), other.getBottom());
        if (mine < otherOne){
            return -1;
        }
        if (mine > otherOne){
            return 1;
        }
        else{
            int myBig = Math.max(top, bottom);
            int theirBig = Math.max(other.getTop(), other.getBottom());
            if (myBig < theirBig){
                return -1;
            }
            if (myBig > theirBig){
                return 1;
            }
            return 0;
        }
    }
    public int compareToWeight(Domino other){
        int otherTotal = other.getTop() + other.getBottom();
        if (top < otherTotal || bottom < otherTotal){
            return -1;
        }
        else if (top > otherTotal || bottom > otherTotal){
            return 1;
        }
        else{
            return 0;
        }

    }

    public boolean canConnect(Domino other){
        return (top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom);
    }

}
