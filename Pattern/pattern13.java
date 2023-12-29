package Pattern;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int i,j;
           for (i=1;i<=5;i++) {
        	   for (j=1;j<=5;j++) {
        		   if (i==1 || j==(5/2)+1) {
        			   System.out.print("T"+ "  ");
        		   }
        		   else {
        			   System.out.print("   ");
        		   }
        	   }
        	   System.out.println();
           }
	}

}
