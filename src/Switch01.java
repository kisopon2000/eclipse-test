
public class Switch01 {

	// —ñ‹“Œ^
	enum Vals {
		EXCELLENT,
		GOOD,
		POOR,
	};

	public static void main(String[] args) {
		Vals val = Vals.EXCELLENT;
		switch (val) {
		case EXCELLENT:
			System.out.println("‚æ‚­‚Å‚«‚Ü‚µ‚½I");
			break;
		case GOOD:
			System.out.println("‚Ó‚Â‚¤‚Å‚µ‚½I");
			break;
		default:
			System.out.println("‚ª‚ñ‚Î‚ë‚¤I");
		}
	}

}
