public class GradeAverage {

	private int [] scores;
	
	public GradeAverage(int [] s)
	{
		scores = s;
    }

	private double mean(int first, int last) {
        double sum = 0.0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
		return sum / (last - first + 1);
	}
	
	private boolean showsImprovement() {
		boolean improv = true;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] >= scores[i-1]){
				improv = true;
			} 
			else return false;
		}
		return improv;
	}
	
	public double finalGrade() {
		if (showsImprovement() == true) {
			return mean(scores.length/2, scores.length-1);
		}
		return mean(0, scores.length-1);
	}

	public static void main(String[] args) {
		int [] s1 = {50,50,20,80,53};   // not improved, finalGrade is 50.6
		int [] s2 = {20,50,50,53,80};   // improved, final grade is 61.0
		int [] s3 = {20,50,50,85};      // improved, final grade is 67.5
		int [] s4 = {35, 50, 45, 60,62};  // not improved, finalGrade is 50.4
		int [] s5 = {47, 58, 58, 66, 87, 90,90,90};  // improved, final grade is 89.25
		
		GradeAverage sr1 = new GradeAverage(s1);
		System.out.println(sr1.mean(1,3)); // 50.0
		System.out.println(sr1.showsImprovement()); // false
		System.out.println(sr1.finalGrade());
		GradeAverage sr2 = new GradeAverage(s2);
		System.out.println(sr2.mean(2,4)); // 61.0
		System.out.println(sr2.showsImprovement()); // true
		System.out.println(sr2.finalGrade());
		GradeAverage sr3 = new GradeAverage(s3);
		System.out.println(sr3.mean(0,2)); // 40.0
		System.out.println(sr3.showsImprovement()); // true
		System.out.println(sr3.finalGrade());
		GradeAverage sr4 = new GradeAverage(s4);
		System.out.println(sr4.showsImprovement()); // false
		System.out.println(sr4.finalGrade());
		GradeAverage sr5 = new GradeAverage(s5);
		System.out.println(sr5.showsImprovement()); // true
		System.out.println(sr5.finalGrade());		
	}
}