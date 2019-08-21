package homework04_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		String result = "";
		int sum = 0;
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		 grade.setSum(kor+eng+math);
		 sum =grade.getSum();
		result = String.format("%d+%d+%d = %d", kor,eng,math,sum);
		return result;
	}
	public String getAve(Grade grade) {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
        grade.setAve((kor+eng+math)/3);
		double ave = grade.getAve();
		
		String result = "";
		result =String.format("%d 점 , %d 점, %d 점, 평균 %.0f",kor,eng,math,ave );
		return result;
	}
	

}
