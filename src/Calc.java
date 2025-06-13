
public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		printAdd(2,2);
		
		printSub(5,1);

	}
		public static void printAdd(int arg1,int arg2) {
			int sum =arg1+arg2;
			String result=arg1+"+"+arg2+"="+sum;
			System.out.println(result);
		
	}
		
		public static void printSub(int arg1,int arg2) {
			int sub = arg1-arg2;
			String result2 = arg1 + "-" + arg2 + "=" + sub;
			System.out.println(result2);
			
		}

}
