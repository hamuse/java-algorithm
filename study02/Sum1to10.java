package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + 4 + 5 =
		String eval = "";
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				eval += i + "= ";
				//sum += i; 
			}else{
				eval += i + "+";
				//sum += i;
			}
			sum += i;
//		result += (i == 5) ? i + "= " :  i + "+" ;  // 3항 연산자 
		}
		System.out.println(eval+sum);
	}
}

