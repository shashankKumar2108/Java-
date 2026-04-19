package QA_Circle;

public class Armstrong {
	  public static void main(String[] args) {
		    int n =153;
		    int temp;
		    int amb = 0;
		    int original = n;
		    while(n>0){
		        temp = n%10;
		        temp = (int) Math.pow(temp,3);
		        amb = amb+temp;
		        n = n/10;
		    }
		    if(original==amb){
		        System.out.println("amb");
		    }else{
		       System.out.println("not amb"); 
		    }
		    }
}
