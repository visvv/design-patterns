package vv.dp.adapter;

public class Captain {
    RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        this.rowingBoat.row();
    }
}
