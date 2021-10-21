package leetCode.easy.recursion;

public class AddDigits258 {
	public int addDigits(int num) {
        int sum = 0;
        if (num<10)return num;
        while(num >=10){
           sum += num%10;
            num = num/10;
        }
        sum+=num;
        return addDigits(sum);
    }
	
	public static void main(String[] args) {
		AddDigits258 a =new AddDigits258();
System.out.println(a.addDigits(38));
	}

}
