import java.util.Scanner;

class Stack {
    int[] stack = new int[10];
    int top = -1;

    void push(int val) {
        if (top == 9) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class Q4_StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int choice;

        do {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: s.push(sc.nextInt()); break;
                case 2: s.pop(); break;
                case 3: s.display(); break;
            }
        } while (choice != 4);
    }
}
