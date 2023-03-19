package Iterator.impl;

public class Item {
    private final String name;    // 이름

    private final int cost;   // 가격

    public Item( String name , int cost ) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "(" + name + ", " + cost + ")";
    }
}
