
public class EstimateCost {
	public double cost(int materialStandard, int area, boolean automated) {
		if(materialStandard == 0) {
			return area*1200;
		}
		if(materialStandard == 1) {
			return area*1500;
		}
		if(materialStandard == 2 && automated) {
			return area*2500;
		}
		return 1800*area;
	}
}
