import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String Sa = sc.next();
			String Sb = sc.next();
			if(Sa.length() < Sb.length() || (Sa.length() == Sb.length() && Sa.compareTo(Sb) < 0)){
				String Sc = Sa;
				Sa = Sb;
				Sb = Sc;
			}
			char[] Ca = Sa.toCharArray();
			char[] Cb = Sb.toCharArray();
			int Iablen = Ca.length - Cb.length;
			for(int i = Cb.length-1; i >= 0; i--){
				int tag =  Character.getNumericValue(Ca[i+Iablen]) - Character.getNumericValue(Cb[i]);
				if(tag < 0) {
					tag += 10;
					Ca[i+Iablen-1]--;
				}
				Ca[i+Iablen] = String.valueOf(tag).charAt(0);
			}
			System.out.println(String.copyValueOf(Ca).replaceFirst("^0+",""));
		}
		sc.close();
	}
}