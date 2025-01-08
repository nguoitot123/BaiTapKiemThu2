import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmsTest {

    // Kiểm thử Binary Search
    @Test
    public void testBinarySearch() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, BinarySearch.binarySearch(arr, 7));
        assertEquals(-1, BinarySearch.binarySearch(arr, 8));
    }

    // Kiểm thử QuickSort
    @Test
    public void testQuickSort() {
        int[] arr = {9, 7, 5, 11, 3, 13};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{3, 5, 7, 9, 11, 13}, arr);
    }

    // Kiểm thử Dijkstra
    @Test
    public void testDijkstra() {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0},
                {1, 0, 2, 0, 0, 0},
                {0, 2, 0, 3, 0, 0},
                {0, 0, 3, 0, 4, 0},
                {0, 0, 0, 4, 0, 5},
                {0, 0, 0, 0, 5, 0}
        };
        int[] result = Dijkstra.dijkstra(graph, 0);
        assertArrayEquals(new int[]{0, 1, 3, 6, 10, 15}, result);
    }

    // Kiểm thử Stack
    @Test
    public void testStack() {
        Stack stack = new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.peek());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.peek());
    }

    // Kiểm thử Queue
    @Test
    public void testQueue() {
        Queue queue = new Queue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals(10, queue.peek());
        assertEquals(10, queue.dequeue());
        assertEquals(20, queue.peek());
    }
}
