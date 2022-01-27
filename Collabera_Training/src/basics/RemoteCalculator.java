package basics;

public class RemoteCalculator implements Calculator {

	@Override
	public int add(int...arr) {
		int sum=0;
		for(int a : arr) {
			sum = sum + a;
		}
		/*for(int i=0; i< arr.length;i++) {
			sum = sum + arr[i];
		}*/
		return sum;
	}
	

	@Override
	public int sub(int a, int b) {		
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	

}
