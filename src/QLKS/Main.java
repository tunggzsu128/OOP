package src.QLKS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ManagerHotel managerHotel = new ManagerHotel();

        while (true) {
            System.out.println("Nhập 1: Thêm mới khách hàng:");
            System.out.println("Nhập 2: Xóa khách hàng:");
            System.out.println("Nhập 3: Tính tiền phòng khách hàng:");
            System.out.println("Nhập 4: Hiển thị danh sách khách hàng");
            System.out.println("Nhập 6: Thoát");
            String line = scanner.nextLine();
            switch (line) {

                case "1": {
                    System.out.println("Nhập tên khách hàng:");
                    String name = scanner.nextLine();

                    System.out.println("Nhập tuổi khách hàng:");
                    int age = scanner.nextInt();

                    System.out.println("Nhập số Passport khách hàng:");
                    scanner.nextLine();
                    String passport = scanner.nextLine();

                    System.out.println("Nhập a để chọn phòng loại A");
                    System.out.println("Nhập b để chọn phòng loại B");
                    System.out.println("Nhập c để chọn phòng loại C");
                    String choise = scanner.nextLine();
                    Room room;
                    if (choise.equals("a")) {
                        room = new RoomA();
                    } else if (choise.equals("b")) {
                        room = new RoomB();
                    } else if (choise.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }

                    System.out.println("Nhập số ngày thuê phòng:");
                    int numberRent = scanner.nextInt();

                    Person person = new Person(name, age, passport, room, numberRent);
                    managerHotel.add(person);
                    scanner.nextLine();
                    break;
                }

                case "2":{
                    System.out.println("Nhập mã Passport để xóa khách hàng: ");
                    String passport = scanner.nextLine();
                    System.out.println(managerHotel.delete(passport) ? "Xóa thành công !" : "Xóa thất bại !");
                    break;
                }
                case "3":{
                    System.out.println("Nhập mã Passport để kiểm tra tiền phòng khách hàng: ");
                    String passport = scanner.nextLine();
                    managerHotel.calculator(passport);
                    System.out.println("Giá tiền: " + managerHotel.calculator(passport) + "vnd");
                    break;
                }
                case "4":{
                    System.out.println("Danh sách khách hàng đang thuê: ");
                    managerHotel.show();
                    break;
                }
                case "5":{
                    return;
                }

                default:
                System.out.println("Invalid !");
                    break;
            }
        }
    }
}
