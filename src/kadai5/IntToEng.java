package kadai5;

	import java.util.Scanner;
	
	public class IntToEng {
		
		private static Scanner sc;

		public static void main(String[] args){
			
			sc = new Scanner(System.in);
			
			
			for(;;){
				int input = sc.nextInt();
			
			
			System.out.println(translateEng(input));
			}
		}
		
		static String translateEng(int n){
			String num[] = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourtenn","fifteen","sixteen","seventeen","eighteen","nineteen"};
			String bignum[] = new String[]{"zero","one","twenty","thirty","fourty","fitty","sixty","seventy","eighty","ninety","one-handred"};
			String input = null;
			
			
			if(n < 20){
				input = num[n];
				
			}else if(n >= 20 && n % 10 == 0 && n < 99){
				n = n / 10;
				input = bignum[n];
			
			}else if(n >= 20 && n / 10 != 0 && n <99){
				int a = n % 10;
				n = n / 10;
				input = bignum[n] +  "-" + num[a];
				
			
			}else if(n >= 100 && n % 10 == 0 && n <1000){
				int a = n / 100;
				n = n - a * 100;
				n = n / 10;
				input = num[a] + "　handred　and " + bignum[n];
			}else if((n >= 100 && n / 10 != 0 && n <1000)){
				int  a = n / 100;
				n = n - a * 100;
				int b = n % 10;
				n = n / 10;
				
				input = num[a] + "　handred　and " + bignum[n] + "-" + num[b];
			}else{
				input = "範囲外です";
			}
			
			
			return input;
			
		
		}
}
