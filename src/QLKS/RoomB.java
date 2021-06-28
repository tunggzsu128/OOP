package src.QLKS;

public class RoomB extends Room {

    public RoomB() {
        super("B", 300000);
    }

    @Override
    public String toString() {
        return "RoomB{" +
                "Loại phòng='" + category + '\'' +
                ", Giá tiền/ngày=" + price + " vnd" +
                '}';
    }

}
