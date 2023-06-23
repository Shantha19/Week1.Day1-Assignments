package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel = "ONEPLUS";
		float mobileWeight = 100.15f;
		System.out.println("Mobile Model:" + mobileModel);
		System.out.println("Mobile weight:" + mobileWeight);
	}

	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 39999;
		System.out.println("Mobile charged:" + isFullCharged);
		System.out.println("Mobile cost:" + mobileCost);
	}

	public static void main(String[] args) {
		System.out.println("This is my Mobile");
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();

	}
}