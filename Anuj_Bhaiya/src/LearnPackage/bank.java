package LearnPackage;

class Account {
//	public void area() {
		public String name;
		protected String email;
		private String password;
		
		public String getPassword() {
			//setPassword(randomPass);
			return this.password;
		}
		
		public void setPassword(String pass) {
			this.password = pass;
		}
//	}
}

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 =  new Account();
		account1.name = "Apna College";
		account1.email =  "apnacollege@gmail.com";
		//account1.password = "abcd";
		account1.setPassword("abcd");
		System.out.println(account1.getPassword());
	}

}
