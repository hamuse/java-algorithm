package study06;

public class Member { // 정보 정리해서 넘기는역할
	private String id, name, birthday, pw, ssn, blood; // private 이 다른 클래스에서 접근불가
	private double height, weight; // 은닉화 캡슐화 . 프로퍼티선언 한후 셋터 겟터 하면 은닉화 했다고함 .
	private int kor, eng, math, salary;
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return String.format("아이디 : %s \n" + "이름: %s \n" + "생일: %s \n" + "비번: %s \n" + "성인여부: (성인true,미성년false)%s \n"
				+ "혈액형 %s \n" + "키: %.0f \n" + "몸무게: %.0f \n", id, name, birthday, pw, ssn, blood, height, weight);

	}

}