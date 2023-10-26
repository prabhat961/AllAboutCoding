package DSA.heap;

import java.util.PriorityQueue;

public class kthLargestElement {
    public static int kthMax(int[] arr, int k){
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++){
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length;i++){
            if (pq.peek() <arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr ={11, 9, 35, 87,95, 21};
        int k = 3;
        System.out.println("kth Largest element in this is:"+kthMax(arr, k));
    }
}
