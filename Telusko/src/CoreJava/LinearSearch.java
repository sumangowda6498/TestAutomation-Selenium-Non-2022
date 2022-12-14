package CoreJava;

public class LinearSearch {
    public static void main(String[] args) {
        int flag=0;
        int a[]={10,11,12,33,44,55};
        int search_key=50;
        for (int i=0;i<a.length;i++){
          //  System.out.print(a[i]+" ");
            if (a[i]==search_key){
                System.out.println("Element found in the postion "+i+1);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }
}
