public class Main
{
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<1001; i++){
		    if(i % 3==0 || i % 5==0){
		        sum += i;
		    }
		}
	    System.out.println("для делителей 3 и 5 = " + sum);
	    int sum1=0;
		for(int i1=0; i1<1001; i1++){
		    if(i1 % 4==0 || i1 % 7==0){
		        sum1 += i1;
		    }
		}
	    System.out.println("для делителей 4 и 7 = " + sum1);
	}
}