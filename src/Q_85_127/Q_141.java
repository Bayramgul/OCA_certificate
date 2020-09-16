package Q_85_127;

public class Q_141 {
public static void main(String[] args) {
//	String [] names= {"Thomas", "Peter","Joseph"};
//	String pwd []= new String[3];
//	int idx=0;
	String s="hello world";
	String [] str=s.split("");
	for(int i=0;i<str.length;i++) {
		str[i]+=s.substring(0,1).toUpperCase()+s.substring(1, s.length());
	}
	
	for(String s1:str) {
		s1+=s1;
	}
System.out.println(str);
	

//	try {
//		for (String n : names) {
//			pwd[idx]=n.substring(2, 6);
//			System.out.println(pwd[idx]);
//		}
//		
//	} catch (Exception e) {
//		System.out.println("Invalid name");
//	}
}
}
