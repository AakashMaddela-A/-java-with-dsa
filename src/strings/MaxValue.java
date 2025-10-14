package strings;

public class MaxValue {
    public static void main(String[] args) {
//        String s="1076";
//        int n=Integer.parseInt(s);
//        System.out.println(n);


        String arr[]={"345","999","-678","456"};
        int max=Integer.parseInt(arr[0]);
        for(int i=0;i<arr.length;i++){
            int n=Integer.parseInt(arr[i]);
            max=Math.max(max,n);
        }
        System.out.println(max);
    }
}
