import java.util.Scanner;

public class BAI_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int cnt1=0,cnt2=0;
		int res=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				cnt1++;
			}
			else if(cnt1>0&&s.charAt(i)==')') {
				cnt1--;
			}
			else if(s.charAt(i)==')') {
				cnt2++;
			}
			
		}
		res=cnt1+cnt2;
		System.out.println(res);
		
	}
}
