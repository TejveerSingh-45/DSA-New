package dsa;

public class equilibrium {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,8,7,5,6,7,8};
        int n=arr.length;
        int[]pf=new int[n];
        pf[0]=arr[0];
        for(int i=1;i<n;i++){
            pf[i]=arr[i]+pf[i-1];
        }
        int count=0;
        for(int i=0;i<n;i++){
            int leftsum=(i==0)?0:pf[i-1];
            int rightsum=pf[n-1]-pf[i];
            if(leftsum==rightsum){
                count++;
                System.out.println(+i);
            }
        }
        System.out.println(+count);

    }
}
