package src.QLHS;

public class CandidateA extends Candidate {
    public static final String MON_TOAN = "Toán";
    public static final String MON_LY = "Lý";
    public static final String MON_HOA = "Hóa";

    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public static String getMonToan() {
        return MON_TOAN;
    }

    public static String getMonLy() {
        return MON_LY;
    }

    public static String getMonHoa() {
        return MON_HOA;
    }

    @Override
    public String toString() {
        return "CandidateA {" + "id='" + id + '\'' + "name='" + name + '\'' + "address='" + address + '\''
                + "priority='" + priority + ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA + '}';
    }

}
