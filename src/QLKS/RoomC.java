package src.QLKS;

public class RoomC extends Room {

    public RoomC() {
        super("C", 100000);
    }
    @Override
    public String toString() {
        return "RoomC{" +
                "Loại phòng='" + category + '\'' +
                ", Giá tiền/ngày=" + price + " vnd" +
                '}';
    }

}
