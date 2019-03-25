 import java.util.*;
 
public class HelpOutIndianArmy {
	static class pair implements Comparable<pair> {
	    
		Long firstEle, secondEle;
		
		pair(long firstEle,long secondEle){
			this.firstEle = firstEle;
			this.secondEle = secondEle;
		}
		
		public int compareTo(pair ob) {
			return firstEle.compareTo(ob.firstEle);
		}  
	}
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long S = sc.nextLong();
		long E = sc.nextLong();
		
		pair[] areaDefended = new pair[N];
		for(int i = 0; i < N; i++) {
			long s = sc.nextLong();
			long e = sc.nextLong();
			areaDefended[i] = new pair(s - e, s + e);
		}
		
		Arrays.sort(areaDefended);
		ArrayList<pair> list = new ArrayList<pair>();
		
		long s = areaDefended[0].firstEle;
		long e = areaDefended[0].secondEle;
		
		//merging the defended segments if any
		for(int i = 1; i < N; i++) {
			if(areaDefended[i].firstEle <= e)
				e = Math.max(e, areaDefended[i].secondEle);
			else {
				list.add(new pair(s,e));
				s = areaDefended[i].firstEle;
				e = areaDefended[i].secondEle;
			}
		}
		
		list.add(new pair(s,e));
		
		long ans = 0;
		for(int i = 0; i < list.size(); i++) {
		    
			if(S >= E) {
				S = E;
				break;
			}
			//if starting position is in between current segment
			if(list.get(i).firstEle <= S && S <= list.get(i).secondEle) {
				S = list.get(i).secondEle;
			}
			//if current segment is in between starting position & ending position
			else if(S <= list.get(i).firstEle && E >= list.get(i).secondEle) {
				ans += list.get(i).firstEle - S;
				S = list.get(i).secondEle;
			}	
			//if ending position lies between current segment
			else if(S <= list.get(i).firstEle && E >= list.get(i).firstEle &&  E <= list.get(i).secondEle) {
				ans += list.get(i).firstEle - S;
				S = E;
			}
			//if starting position & ending position are before the current segment
			else if(S <= list.get(i).firstEle && E <= list.get(i).firstEle) {
				ans += E - S;
				S = E;
			}
		}
		//add the distance which is not covered in above segments
		if(S < E)
			ans += (E - S);
		System.out.println(ans);
	}
}