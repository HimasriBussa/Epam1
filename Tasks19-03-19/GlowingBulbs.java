import java.util.*;
 
public class GlowingBulbs {
    static List<Integer> switches = new ArrayList<>( 12 );
    
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        
        long ans = 0;
 
        while (t > 0) {
            switches.clear();
            result.clear();
            sc.nextLine();
            String S = sc.nextLine();
            long k = sc.nextLong();
 
            for(int i = 0; i < S.length(); i++) {
                if(S.charAt(i) == '1') 
                    switches.add(i + 1);
            }
 
            long low = 1;
            long high = 1000000000000000L;
            long mid = 0;
            while (low <= high) {
                mid = (low + high) >> 1;
                if(answer(mid) >= k){
                    ans = mid;
                    high = mid - 1;
 
                }
                else  low = mid + 1;
            }
 
            System.out.println(ans);
            t -= 1;
        }
    }
 
    private static long answer(long mid) {
        int primes = switches.size();
        long res = 0;
        for(int i = 1; i < (1 << primes); i++) {
            long pr = 1;
            int sign = -1 ;
            for(int j = 0; j < primes; j++) {
                if(((i>>j) & 1) == 1){
                    pr = pr * switches.get(j);
                    sign *= -1;
                }
            }
            res += sign*(mid/pr);
        }
        return res;
    }
}

