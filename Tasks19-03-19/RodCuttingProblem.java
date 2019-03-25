import java.util.*;

class RodCuttingProblem {
	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int specialRod = 0;
            int n = sc.nextInt();
            int rods = 3;
            while(rods <= n){
                rods = rods*2 + 1;
                specialRod += 1;
            }
            System.out.println(specialRod);
        }

    }
}
