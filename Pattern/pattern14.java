package Pattern;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=1;i<=5;i++) {
     	   for (j=1;j<=5;j++) {
     		   if (i==1 || i==5 || i==3 ) {
     			   System.out.print("*");
     		   }else if ( i<3 && j==1) {
     			   System.out.print("*");
     		   }else if(i>3 && j==5) {
     			  System.out.print("*");
     		   }else if( i<=4 && j==1 || i<=2 && j==5) {
     			   
     		   
     			  System.out.print("*");}
     		   else {
     			  System.out.print(" ");
     		   }

	}
           System.out.println();
}
}
}