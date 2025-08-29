public class largestElement {
    public static void main(String[] args) {
        int[] a = {-10,-1,-5,-20};
        int large = Integer.MIN_VALUE;
        if(a.length == 0){
            System.out.println("No Elements");
            return;
        }

        for(int i = 0; i < a.length; i++){
            if(a[i] == large){
                large =a[i];
            }
        }
        System.out.println(large);
    }
}
