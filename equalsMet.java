public class equalsMet {
    String str;

    public equalsMet(String s) {
        str = s;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "arman";
        String s1 = "arman";
        String s3 = "ar"; // added semicolon here
        System.out.println(s.equals(s1));// checking content
        System.out.println(s.equals(s3));
        equalsMet t = new equalsMet("hi");
        equalsMet t1 = new equalsMet("hi");
        String s4 = new String("hlw");
        String s5 = new String("hlw");
        System.out.println(t.equals(t1));// checking reference
        System.out.println(s4.equals(s5));// checking content
    }
}
