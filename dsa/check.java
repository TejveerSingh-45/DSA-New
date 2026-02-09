package dsa;

public class check {
    public static void main(String[] args) {
        int []arr={3,-2,1,4,3,6,8};
        boolean pairexits=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    pairexits=true;
                    break;
                }
            }
            if(pairexits){
                break;
            }
        }
        if(pairexits){
            System.out.println("duplicate array exits");
        }else{
            System.out.println("no duplicate exists");
        }
    }
}

