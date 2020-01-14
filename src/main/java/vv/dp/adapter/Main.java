package vv.dp.adapter;

public class Main {
    public static void main(String[] args) {
        RowingBoat rowingBoat = new FishingBoatAdapter(new FishingBoat());
        Captain captain = new Captain(rowingBoat);
        captain.row();
    }
}
