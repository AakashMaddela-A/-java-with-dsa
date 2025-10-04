package Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[]={12,34,56,78};
        int b[]={32,43,54,65};
        int c[]=new int[a.length+b.length];
        int i=0, j=0, k=0;
        //merging
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){   //when length is going to equal
            while(j<b.length){
                c[k]=b[j];
                j++; k++;
            }
        }
        if(j==b.length){   //when length is going to equal
            while(i<a.length){
                c[k]=a[i];
                i++; k++;
            }
        }
        for(int ele:c){
            System.out.print (ele+" ");
        }
    }
}
