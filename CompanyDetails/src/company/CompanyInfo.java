package company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("RRD");
	}
	public void companyId() {
		System.out.println("15486");
	}
	public void companyAddress() {
		System.out.println("Chennai 43A, I Main Rd, RA Puram Chennai 600 028");
	}
	public static void main(String[] args) {
		CompanyInfo b = new CompanyInfo();
		b.companyName();
		b.companyId();
		b.companyAddress();
	}

}
