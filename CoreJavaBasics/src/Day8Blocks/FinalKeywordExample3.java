package Day8Blocks;

public class FinalKeywordExample3 {
	final int id;

	FinalKeywordExample3(int i) {
		id = i;
	}

	public static void main(String[] args) {
		FinalKeywordExample3 f1 = new FinalKeywordExample3(25);
		System.out.println("id: " + f1.id);

	}

}
