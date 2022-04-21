package tic;
import java.util.*;

public class TicTacToe {
	  public static Evaluation evaluateBoard(String input) {
		  input=input.toUpperCase();
		  int xcount=0;
	          int ocount=0;
		  int correct=1;
		   char[] ch = input.toCharArray();
		  if(input.length()!=9)
		  {
			  return Evaluation.INVALIDINPUT;
		  }
		  for(int i=0;i<input.length();i++)
		  {  
		     if(ch[i]=='X')
		     {
		         xcount++;
		     }
		     else if(ch[i]=='O')
		     {
		         ocount++;
		     }
		   }
		   int temp=Math.abs(xcount-ocount);
		   if(!temp<=1)
		   {
	               return Evaluation.UNREACHABLESTATE;
		   }
		 
		   if(correct==1)
		   {
		      return result(ch);
		   }
		   else
		   {
		      logger.log("ENTER CORRECT INPUT");
		   }
	    return Evaluation.UNREACHABLESTATE;
	  }
	  public static Evaluation result(char[] data)
	  {
		  boolean XWINS = false;
		  boolean OWINS = false;
	    if(data[0]=='X' && data[1]=='X' && data[2]=='X')
	     XWINS=true;
	    else if(data[3]=='X' && data[4]=='X' && data[5]=='X')
	    	XWINS=true;
	     else if(data[6]=='X' && data[7]=='X' && data[8]=='X')
	    	 XWINS=true;
	     else if(data[0]=='X' && data[3]=='X' && data[6]=='X')
	    	 XWINS=true;
	     else if(data[1]=='X' && data[4]=='X' && data[7]=='X')
	    	 XWINS=true;
	     else if(data[2]=='X' && data[5]=='X' && data[8]=='X')
	    	 XWINS=true;
	     else if(data[0]=='X' && data[4]=='X' && data[8]=='X')
	    	 XWINS=true;
	     else if(data[6]=='X' && data[4]=='X' && data[2]=='X')
	    	 XWINS=true;
	     if(data[0]=='O' && data[1]=='O' && data[2]=='O')
	    	 OWINS=true;
	     else if(data[3]=='O' && data[4]=='O' && data[5]=='O')
	    	 OWINS=true;
	     else if(data[6]=='O' && data[7]=='O' && data[8]=='O')
	    	 OWINS=true;
	     else if(data[0]=='O' && data[3]=='O' && data[6]=='O')
	    	 OWINS=true;
	     else if(data[1]=='O' && data[4]=='O' && data[7]=='O')
	    	 OWINS=true;
	     else if(data[2]=='O' && data[5]=='O' && data[8]=='O')
	    	 OWINS=true;
	     else if(data[0]=='O' && data[4]=='O' && data[8]=='O')
	    	 OWINS=true;
	     else if(data[6]=='O' && data[4]=='O' && data[2]=='O')
	    	 OWINS=true;
	     if(XWINS && OWINS)
	    	 return Evaluation.UNREACHABLESTATE;
	     else if(xwins)
	    	 return Evaluation.XWINS;
	     else if(owins)
	    	 return Evaluation.OWINS;
	     else
	    	 return Evaluation.NOWINNER;
	  }
	  public static void main(String[] args)
	  {

		  
		  logger.log(evaluateBoard("Oooxxx..."));
	  }
}
