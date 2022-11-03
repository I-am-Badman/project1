public class Main
{
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c =a+b;
		int sum=0;
		int q=0;
		for(; sum < 4000001;){
		    c = a + b;
		    if(c % 2 == 0 ){
		        sum += c;
		    }
		    a=b;
		    b=c;
		    if(sum >= 100 && q==0){
		        sum -= c;
		        System.out.println(sum);
		        q++;
		        }
		}
        if(sum >= 4000000){
            sum-=c;
            System.out.println(sum);
        }
		else{
		        System.out.println(sum);
        }
	}
}