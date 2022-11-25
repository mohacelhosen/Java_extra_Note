package FileHandling;

public class DateTime {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        
        java.sql.Date d = new java.sql.Date(date.getTime());
        System.out.println(d);
    }
}
