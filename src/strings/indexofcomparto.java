package strings;

public class indexofcomparto {
    public static void main(String[] args) {
        String s="aakash";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('r'));

        System.out.println();

        String a="abc";
        String b="dbc";
        System.out.println(a.compareTo(b));

        System.out.println();

        String x="Physics Wallah";
        System.out.println(x.contains("cs"));
        System.out.println(x.startsWith("Phys"));
    }
}
