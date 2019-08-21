package homework04_grade;
import javax.swing.JOptionPane;
public class GradeController {

	public static void main(String[] args) {
      Grade grade = null;
      GradeService gradeService = new GradeService();
      
      while(true) {
    	  switch(JOptionPane.showInputDialog("0.종료 1.점수입력 2. 총점 3. 평균")) {
    	  case "0" : 
    		   JOptionPane.showMessageDialog(null, "종료");
    		  return;
    	  case "1" :
    		  grade = new Grade();
    		  String kor = JOptionPane.showInputDialog("국어점수");
    		  grade.setKor(Integer.parseInt(kor));
    		  String eng = JOptionPane.showInputDialog("영어점수");
    		  grade.setEng(Integer.parseInt(eng));
    		  String math = JOptionPane.showInputDialog("수학점수");
    		  grade.setMath(Integer.parseInt(math));
    		  
    		  break;
    	  case "2" :
    		  String result = gradeService.getTotal(grade);
    		   JOptionPane.showMessageDialog(null, result);
    		  break;
    	  case "3" :
    		  result = gradeService.getAve(grade);
    		  JOptionPane.showMessageDialog(null, result);
    		  break;
    	  }
    	  
      }
	}

}
