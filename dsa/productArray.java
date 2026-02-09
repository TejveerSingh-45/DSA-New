/*Q1.given an integer array a find and return the product  array of the same size where the ith element of 
the product array will be equal to the product of all element
divided by the ith element of the array.*/
package dsa;

public class productArray {
    public static int[] productArray(int[] a){
        int n=a.length;
        int[] result=new int[n];
        int product=1;
        for(int num: a){
            product*=num;
        }
        for(int i=0;i<n;i++){
            result[i]=product/a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        int [] result=productArray(a);
        for(int val: result){
            System.out.println(val+ " ");
        }
    }
}
