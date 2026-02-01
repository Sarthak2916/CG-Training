package feature_1_2_26;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    void push(int x) {

        // Step 1: Push element into q2
        q2.offer(x);

        // Step 2: Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    int pop() {
        if (q1.isEmpty())
            throw new RuntimeException("Stack is empty");
        return q1.poll();
    }

    // Top operation
    int top() {
        if (q1.isEmpty())
            throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
    }
}

