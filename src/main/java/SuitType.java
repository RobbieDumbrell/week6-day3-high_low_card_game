public enum SuitType {

    SPADES(3),
    HEARTS(2),
    DIAMONDS(1),
    CLUBS(0);

    private final int rank;

    SuitType(int rank){
        this.rank = rank;
    }
}
