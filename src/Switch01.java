
public class Switch01 {

	// �񋓌^
	enum Vals {
		EXCELLENT,
		GOOD,
		POOR,
	};

	public static void main(String[] args) {
		Vals val = Vals.EXCELLENT;
		switch (val) {
		case EXCELLENT:
			System.out.println("�悭�ł��܂����I");
			break;
		case GOOD:
			System.out.println("�ӂ��ł����I");
			break;
		default:
			System.out.println("����΂낤�I");
		}
	}

}
