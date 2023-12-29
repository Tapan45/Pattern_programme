package Pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5 ;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print(j);
			
				if (j!=i) {
					System.out.print("*");
					
				}
			 if(j==i) {
				System.out.print("*");
				}
//				else {
//					System.out.print(j+"*");
//				}
			}
			System.out.println();
		}

	}
}

