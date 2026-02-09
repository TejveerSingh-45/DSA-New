/*Q1. wap to count element and find greater than itself.
1.start
2.input an element count,n,max.
3.count max element.
4.for(int i=0;i<n;i++).
5.if(arr[i]>max).
6.count++.
7.print and display result.
8.end.*/
package dsa;
class countElement {
    public static void main(String[] args) {
        int arr[]={1,23,3,45,67,6,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]>arr[i]){
                    count++;
                }
            }
            System.out.println(+arr[i]+" " +count+" ");
        }
    }
}

