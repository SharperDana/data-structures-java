package Ex2;
import java.util.ArrayList; import java.util.LinkedList;
import java.util.Queue; import java.util.Stack;
import java.util.Random; import java.util.concurrent.ArrayBlockingQueue;

public class Ex2 {
	/** 1.a **/
	public static ArrayList<Character> spreadCardsOnTable(char[] cards) {
		ArrayList<Character> table = new ArrayList<>(cards.length);
		Queue<Character> q = new LinkedList<>();
		for(int i = 0; i < cards.length; i++) q.add(cards[i]);
		while(!q.isEmpty()) {
			table.add(q.poll());
			if(q.peek() != null) q.add(q.poll());
		}
		return table;
	}
	/** 1.b **/
	public static char[] createOriginalLayot(int n) {
		Queue<Character> q = new ArrayBlockingQueue<>(n);
		Stack<Character> st = new Stack<>();
		int count = 0;
		for(int i = 0; i < n; i++) { char in = i % 2 == 0 ? 'W' : 'B'; st.push(in); }
		while(q.size() != n) {
			if(count % 2 == 0) q.add(st.pop());
			else q.add(q.poll());
			count++;
		}
		char[] cards = new char[q.size()];
		for(int i = cards.length - 1; i >= 0; i--) cards[i] = q.poll();
		return cards;
	}
	/** 2.a **/
	public static int maxStack(Stack<Integer> st) {
		Stack<Integer> ts = new Stack<Integer>();
		int max = Integer.MIN_VALUE;
		while(st.size() > 0) {
			int elem = st.pop();
			max = Math.max(max, elem);
			ts.push(elem);
		}
		while(ts.size() > 0) { st.push(ts.pop()); }
		return max;
	}
	/** 2.b **/
	public static int maxSumAdj(ArrayBlockingQueue<Integer> q) {
		int sum = 0;
		if(q.size() < 2) return Integer.MIN_VALUE;
		for(int i = 0; i < q.size() - 1; i++) {
			int elem = q.poll();
			sum = ((q.peek() + elem > sum) ? (q.peek() + elem) : sum);
			q.add(elem);
		}
		q.add(q.poll());
		return sum;
	}
	/** 3 **/
	public static Point[] maximaOfPoints(Point[] S) {
		Point[] temp = new Point[S.length];
		int count = 0;
		for(int i = 0; i < S.length; i++) {
			boolean isMax = true;
			for(int j = 0; j < S.length; j++) {
				if(i != j) {
					if(S[j].getX() >= S[i].getX() && S[j].getY() >= S[i].getY()) isMax = false;
				}
			}
			if(isMax) { temp[count] = S[i]; count++; }
		}
		Point[] P = new Point[count];
		for(int i = 0; i < count; i++) P[i] = temp[i];
		return P;
	}
	/** 4 **/
	public static void ifExists(int[] a, int[] b, int x) {
		int i = 0, j = b.length - 1, sum = 0, count = 0;
		while(i < a.length && j >= 0) {
			sum = a[i] + b[j];
			if(sum == x) { System.out.println("a[" + i + "] = " + a[i] + ", b[" + j + "] = " + b[j]); i++; j--; count++; }
			else if(sum < x) { i++; sum = 0; }
			else if(sum > x) { j--; sum = 0; }
		}
		if(count == 0) System.out.println("false");
	}
}