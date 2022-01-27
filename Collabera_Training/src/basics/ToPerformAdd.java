package basics;

public class ToPerformAdd {

	public static void main(String[] args) {
		Calculator cal = new RemoteCalculator();
		System.out.println(cal.add(10, 20, 30));
		System.out.println(cal.add(23,43));
		System.out.println(cal.add(7,6,7,8,9,10));
	}

}
