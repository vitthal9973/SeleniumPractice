package encapsulation;

public class Account {

	public static void main(String[] args) {
		//Private data members
		private long acc_no;
		private float amount;
		public long getAcc_no() {
			return acc_no;
		}
		public void setAcc_no(long acc_no) {
			this.acc_no=acc_no;
		}
		public getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount=amount;
		}

	}

}
