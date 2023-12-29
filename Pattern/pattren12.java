package Pattern;

public class pattren12 {

	public static void main(String[] args) {
		
           int i,j;
              for (i=1;i<=9;i++) {
            	  for (j=1;j<=9;j++) {
            		  if(i<=5) {
            		  if (i==j || i+j==10) {
            			  System.out.print(i);
            		  }else {
            			  System.out.print(" ");
            		  }
            		  }
            		  else {
            			  if ( i+j==10) {
                			  System.out.print(j);
                		  }else if(i==j){
                			  System.out.print(9-i+1);
                		  }
            			  else {
                			  System.out.print(" ");
                		  } 
            		  }

              } System.out.println();
              }}}

	
