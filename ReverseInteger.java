package seventeen_nine;

public class ReverseInteger {
	public static int reverse(int x) {
		int rs = 0;
		while(Math.abs(x) != 0){
			int temp = x % 10;
			x /= 10;
			
            if(rs * 10 / 10 != rs){
                return 0;
            }
            rs = rs * 10 + temp;
		}
		
		return rs;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
}
