package strings;

public class stringbuilderfunctions {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Aakash");
        StringBuilder tb=new StringBuilder("Rakash");
        System.out.println(sb.compareTo(tb));

        sb.setCharAt(1,'b');
        System.out.println(sb);
    }
}
