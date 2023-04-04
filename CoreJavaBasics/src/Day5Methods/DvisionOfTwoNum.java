package Day5Methods;

public class DvisionOfTwoNum {

	public static void main(String[] args) {
		QuotientAndRem(454,10);

	}
static void QuotientAndRem(int num1, int num2)
{
	int q,r;
	q=num1/num2;
	r=num1%num2;
	System.out.println("Division is " +q);
	System.out.println("Remainder is " +r);
}
}
