import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static int countStudents(int[] students, int[] sandwiches){
        int current_sandwich =0;
        int remaining_students = students.length;
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            queue.offer(student);
        }
        int refused = 0;
        while(!queue.isEmpty() && refused < queue.size()){
            if(queue.peek()!=sandwiches[current_sandwich]){
                int st = queue.poll();
                queue.offer(st);
                refused++;
            }
            else{
                queue.poll();
                current_sandwich++;
                remaining_students--;
                refused=0;
            }
        }
        return remaining_students;
    }
}
