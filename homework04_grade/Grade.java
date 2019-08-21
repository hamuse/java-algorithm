package homework04_grade;

public class Grade {
	private int kor, eng, math,sum ;
   private double ave;

	public int getKor() {
		return this.kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSum() {
		return this.sum;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
	public double getAve() {
		return this.ave;
	}

	@Override
	public String toString() {
		return "Grade [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

//	public void setKor(int parseInt) {
//		// TODO Auto-generated method stub
//		
//	}


}
