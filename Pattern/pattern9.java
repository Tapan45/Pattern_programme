package Pattern;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   for (int i=1;i<=5;i++) {
                	   if (i%2!=0) {
               		   int x=((i-1)*5)+1;
                		//   System.out.print(i);
               		   for (int j=1;j<=5;j++) {
               			   System.out.print(x++);
               			  System.out.print("\t");
               		   }
               		 System.out.println();
                	   }else {
                		   int x= i*5;
                		   for (int j=1;j<=5;j++) {
                			   System.out.print(x--);
                			   System.out.print('\t');
                		   }
                		   System.out.println();
                	   }
                   }
	}

}
