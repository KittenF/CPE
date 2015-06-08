import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int line = Integer.parseInt(sc.nextLine().trim());
		LinkedList <test> pline = new LinkedList<test>();
		for(int i = 0; i < line; i++) {
			String tag = sc.nextLine().toUpperCase();
			for(int j = 0; j < tag.length();j++){
				boolean bol = false;
				for(test o:pline){
					if(tag.charAt(j)==o.getString().charAt(0)){
						o.addint();
						bol = true;
						break;
					}
				}
				if(bol == false && String.valueOf(tag.charAt(j)).matches("[A-Z]") == true){
					pline.add(new test(String.valueOf(tag.charAt(j)),1));
				}
			}
		}
		/*Collections.sort(pline,
		new Comparator<test>(){
			public int compare(test e1,test e2) {
				if(e1.getInt() < e2.getInt()){
					return 1;
				} else {
					return -1;
				}
			}
		});*/
Collections.sort(pline,new sortint());
//Collections.sort(pline,new sortstr());
		for(test o:pline){
			System.out.println(o);
		}
		sc.close();
	}
}
class sortint implements Comparator<test>{
	public int compare(test e1,test e2) {
		if(e1.getInt() < e2.getInt()){
			return 1;
		}
		if(e1.getInt() == e2.getInt()){
			return e1.getString().compareTo(e2.getString());
		}
		return -1;
	}
}
class test{
	public String i;
	public int j;
	public test(String i,int j){
		this.i = i;
		this.j = j;
	}
	public String getString(){
		return i;
	}
	public int getInt(){
		return j;
	}
	public void addint(){
		this.j++;
	}
	public String toString(){
		return i + " " +j;
	}
}