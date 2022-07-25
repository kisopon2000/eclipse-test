package practice;

public class Chapter20_2 {
	public void methodA() {
		synchronized (this) {
			// ˆ—
		}
	}

	public synchronized void methodB() {
		// ˆ—
	}
}
