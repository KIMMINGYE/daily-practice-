package algo;

class Intstack {
	int max; // stack length
	int ptr; // stack pointer
	int[] stk; // control

	public class EmptyIntStackException extends RuntimeException {

		public EmptyIntStackException() {
		}

	}

	public class OverflowIntStackException extends RuntimeException {

		public OverflowIntStackException() {
		}

	}

	public Intstack(int capacity) {
		ptr = 0;
		max = capacity;

		try {

			stk = new int[max];

		} catch (OutOfMemoryError e) {

			max = 0;
		}

	}

	public int push(int x) throws OverflowIntStackException {

		if (ptr >= max)
			throw new OverflowIntStackException();

		return stk[ptr++] = x;

	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();

		return stk[--ptr];

	}

	public int peek() throws EmptyIntStackException {

		if (ptr <= 0)
			throw new EmptyIntStackException();

		return stk[ptr - 1];
	}
}