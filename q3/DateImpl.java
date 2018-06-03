package q3;



public class DateImpl extends Q2{

    public DateImpl() {
        super();
    }

    public static void main(String[] args) {
        Q2 d = new DateImpl();
        Q2 e = new DateImpl();
        for (int i = 0; i < 380; i ++) e.advance();
        System.out.println(e);
    }
}