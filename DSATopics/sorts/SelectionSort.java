package DSATopics.sorts;
//Complexity is O2
public class SelectionSort {

    public static void main(String[] args) {

        int[] a={4,5,6,2,1,7,10,3,8,9};

        for(int i=0;i<=a.length-2;i++){
            for(int j=i+1;j<=a.length-1;j++){
                if(a[i] > a[j]){
                    int tmp;
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }

        for(int i:a){
            System.out.print(i+" ");
        }

    }

}
