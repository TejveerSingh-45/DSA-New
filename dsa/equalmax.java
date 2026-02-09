/*given an integer a size n in 1 second you can increase the value of one element by one.
find the minimum time in second to make  all the element of the array equal.[2,4,1,3]
1.To minimise time make all element equal to the maximum element in array.
find maximum element in array.
for every element cal how much time its need to reach the maximum.
sum all that minimum.*/
package dsa;

public class equalmax {
    public static int minTimeToEqual(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int num :arr){
            if(num>max){
                max=num;
            }
        }
        int time=0;
        for(int num:arr){
            time+=max-num;
        }
        return time;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,4};
        System.out.println("minimum time " +minTimeToEqual(arr));
    }
}