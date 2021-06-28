package src.QLKS;

public class RoomA extends Room{

    public RoomA() {
        super("A", 500000);
    }

    @Override
    public String toString() {
        return "RoomA{" +
                "Loại phòng='" + category + '\'' +
                ", Giá tiền/ngày=" + price + " vnd" +
                '}';
    }

}
