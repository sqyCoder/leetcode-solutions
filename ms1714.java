import java.util.Comparator;
import java.util.PriorityQueue;

public class ms1714{
    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public int[] smallestK(int[] arr, int k) {
        if(k <= 0){
            return new int[]{};
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((Comparator) new MyComparator());
        for(int i = 0; i < k; i++){
            queue.offer(arr[i]);
        }
        for(int i = k; i < arr.length; i++){
            if(queue.isEmpty()) break;
            int top = queue.peek();
            if(arr[i] < top){
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = queue.poll();
        }
        return res;
    }
}