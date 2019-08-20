package study05;

public class Member { //정보 정리해서 넘기는역할
	private String name, id, pw, ssn, blood; // private 이 다른 클래스에서 접근불가 
	private double height, weight;  //은닉화 캡슐화 . 프로퍼티선언 한후 셋터 겟터 하면 은닉화 했다고함 .
	private int kor, eng , math, salary;

	public void setName(String name) {
		this.name = name; // 셋터 =>라이터한다. 쓴다는 뜻이다.
	}
	public String getName() { //겟터 => read only 읽기만 가능하다 . 그래서 자바가 보안이 좋다.
		return this.name;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}

	public void setPw(String pw) {
		this.pw = pw;
			}
    public String getPw() {
    	return this.pw;
    }
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	public void setSalary(int salary) {
		this.salary =salary;
	}
	public int getSalary() {
		return this.salary;
	}
	@Override
	public String toString() {
		         //한 문장으로 보여주는것 
		return String.format("회원정보: \n" 
				+ "이름 : %s \n"
				+ "아이디: %s \n"
				+ "비번: %s \n"
				+ "주민번호: %s \n"
				+ "혈액형 %s \n"
				+ "키: %.1f \n"
				+ "몸무게: %.1f \n",
				 name, id, pw, ssn, blood, height, weight);
	}
	
}
