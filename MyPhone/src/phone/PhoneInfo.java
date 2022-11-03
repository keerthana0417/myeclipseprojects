package phone;

public class PhoneInfo {
	public void phoneName() {
		System.out.println("Redmi 6A");
	}
	public void phoneMieiNum() {
		System.out.println("Mediatek MT6761 Helio A22 (12 nm)");
	}
	public void camera() {
		System.out.println("Front camera 5MP Rear camera 13MP");
	}
	public void storage() {
		System.out.println("16GB Internal Storage");
	}
	public void osName() {
		System.out.println("Android 8.1 (Oreo)");
	}
	public static void main(String[] args) {
		PhoneInfo a = new PhoneInfo();
		a.phoneName();
		a.phoneMieiNum();
		a.camera();
		a.storage();
		a.osName();
	}
}
