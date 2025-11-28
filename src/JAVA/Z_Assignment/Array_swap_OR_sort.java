package JAVA.Z_Assignment;

public class Array_swap_OR_sort {
    public static void main(String[] args) {
        int a[]={5,6,4,8,3,9,2,0,1,7};
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}