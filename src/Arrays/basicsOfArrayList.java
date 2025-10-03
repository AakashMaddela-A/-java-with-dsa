package Arrays;
import java.util.ArrayList;
public class basicsOfArrayList {
    public static void main(String[] args) {

        //arr.add
        //arr.set
        //arr.get
        //arr.remove

        ArrayList<Integer> arr=new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        System.out.println(arr.size());
        System.out.println(arr);
        arr.set(2,300);   //modify
        System.out.println(arr);
        arr.add(90);   //push back
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove(1);
        System.out.println(arr);

//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i)+" ");
//        }
    }
}
