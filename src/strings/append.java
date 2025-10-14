package strings;

public class append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Abc");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append('q');
        System.out.println(sb);
        sb.append("abcd");
        System.out.println(sb);
        char ch[]={'e','t'};
        sb.append(ch);
        System.out.println(sb);
    }
}
