package miniporject_bank_oop;

class Bank_v7 {
	// 멤버변수
	private String id;
	private String pass;
	private double balance;
	static String Company = "(주)회사";
	
	public Bank_v7() { super(); }

	public Bank_v7(String id, String pass, double balance) { super(); this.id = id; this.pass = pass; this.balance = balance; }

	@Override public String toString() { return "Bank_v7 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]"; }

	public String getId() { return id; }  public void setId(String id) { this.id = id; }
	public String getPass() { return pass; }  public void setPass(String pass) { this.pass = pass; }
	public double getBalance() { return balance; }  public void setBalance(double balance) { this.balance = balance; }
	public static String getCompany() { return Company; }  public static void setCompany(String company) { Company = company; }
}
