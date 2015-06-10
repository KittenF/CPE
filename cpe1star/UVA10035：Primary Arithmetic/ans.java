import java.util.Scanner;
class main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do{
			a = sc.nextInt();
			b = sc.nextInt();
			int sum = a + b;
			int tag = 0;
			if (a > b){
				tag = a;
			} else {
				tag = b;
			}
			int sumlen = Integer.toString(sum).length();
			int taglen = Integer.toString(tag).length();
			if (sum == 0){
				System.exit(0);
			}
			int carry = 0;			
			while(taglen != 0) {
				int matha = Character.getNumericValue(Integer.toString(sum).charAt(sumlen---1));
				int mathb = Integer.toString(tag).charAt(taglen---1) - '0';
				if(matha < mathb){
					carry++;
				}
			}		
			switch(carry){
				case 0:
					System.out.println("No carry operation.");
					break;
				case 1:
					System.out.println("1 carry operation.");
					break;
				default:
					System.out.println(carry+" carry operations.");
			}
			
		}while(a!=0&&b!=0);
		sc.close();
	}
}