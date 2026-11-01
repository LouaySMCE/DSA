import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> counter = new LinkedList<>();

    public RecentCounter() {
        counter = new LinkedList<>();
    }

    public int ping(int t) {
        counter.offer(t);
        while(!counter.isEmpty() && counter.peek()< t-3000){
            counter.poll();
        }
        return counter.size();
    }
}
