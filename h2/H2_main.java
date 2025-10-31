public class H2_main {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        int k = 7;
        int max , min;
        
        min = i;
        if (min > j){
            min = j;
        }
        if (min > k){
            min = k;
        }

        max = i;
        if (max < j){
            max = j;
        }
        if (max < k){
            max = k;
        }

        System.out.println("min nimber is" + " " + min);
        System.out.println("max nimber is" + " " + max);
    }
    
}
