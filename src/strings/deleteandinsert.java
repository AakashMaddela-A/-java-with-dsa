package strings;

public class deleteandinsert {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcd");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(2,'g');
        System.out.println(sb);
        sb.insert(2,54);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
