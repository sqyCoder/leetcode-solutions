import java.util.Stack;

class leetcode155 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public void MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        // 如果辅助栈为空或新值小于等于当前最小值，则压入辅助栈
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        // 如果弹出的元素是当前最小值，辅助栈也要弹出
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}