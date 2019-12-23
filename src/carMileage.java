public class carMileage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isInteresting(98, new int[]{1337, 256}));

	}
	

	  public static int isInteresting(int number, int[] awesomePhrases) {
		    //Go to town
		    for(int i = 0; i < awesomePhrases.length; i++){
		      if(number == awesomePhrases[i]){
		        return 2;
		      }
		    }//for
		    
		    String temp = Integer.toString(number);
		    if(number < 98) return 0;
		    else if(number > 99 &&(zeros(temp) || same(temp) || sorted(temp) || palindrome(temp))) {
		    	return 2;
		    }else {
		    	String temp1 = Integer.toString(number+1); 
		    	if(zeros(temp1) || same(temp1) || sorted(temp1) || palindrome(temp1) || awesome(number+1, awesomePhrases)) return 1;
		    	else {
		    	String temp2 = Integer.toString(number+2); 
		    	if(zeros(temp2) || same(temp2) || sorted(temp2) || palindrome(temp2) || awesome(number+2, awesomePhrases)) return 1;
		    	else return 0;
		    	}
		    }
		  }//isInteresting
		  
	  public static boolean zeros(String number){
		 int len = number.length();
		 int count = 0;
	    for(int i = 1 ; i < len; i++) {
	    	if(number.charAt(i) == '0') {
	    		count++;
	    	}else {
	    		return false;
	    	}
	    }
	    if(count == len-1) return true;
	    else return false;
	  }
	  
	  public static boolean same(String number) {
		int len = number.length();
		int count = 0;
	    for(int i = 0 ; i < len; i++) {
	    	if(number.charAt(i) == number.charAt(1)) {
	    		count++;
	    	}else {
	    		return false;
	    	}
	    }
	    if(count == len) return true;
	    else return false;
	  }
	  
	  public static boolean sorted(String number) {
		  if(number.charAt(0) == '0') return false;
		  boolean dir;
		  if(number.charAt(0) > number.charAt(1)) dir = false;
		  else dir = true;
		  int[] num = new int[number.length()];
		  for(int i = 0; i < number.length(); i++) {
			  num[i] = Character.getNumericValue(number.charAt(i));
		  }
		  for (int i = 0; i < num.length-1; i++) {
			  //System.out.println("i: "+i+" num: "+num[i]);
			  if(dir == false) {
				  if(num[i] > num[i+1] && num[i] - num[i+1] == 1) continue;
				  else return false;
			  }else {
				  if(num[i] < num[i+1] && num[i+1] - num[i] == 1) {
					  continue;
				  } 
				  else {
					  //System.out.println("i: "+i+" num: "+num[i]);
					  if(i == num.length-2 && num[num.length-2] == 9 &&  num[num.length-1] == 0) break;
					  else return false;
				  }			  
			  }
		  }
		  return true;
	  }
	  
	  public static boolean palindrome(String number) {
		  int len = number.length();
		    for(int i = 0 ; i < len/2; i++) {
		    	if(number.charAt(i) == number.charAt(len-1-i)) {
		    		continue;
		    	}else {
		    		return false;
		    	}
		    }
		    return true;
	  }
	  
	  public static boolean awesome(int number, int[] awesomePhrases) {
		    for(int i = 0; i < awesomePhrases.length; i++){
			      if(number == awesomePhrases[i]){
			        return true;
			      }
			    }//for
		    return false;
	  }

  
}