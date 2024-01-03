import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Несбалансированная скобка
            }
        }

        return stack.isEmpty(); // Стек должен быть пустым для сбалансированной строки
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("()")); // Output: true
        System.out.println(isBalanced("[()]")); // Output: true
        System.out.println(isBalanced("{[()]}")); // Output: true
        System.out.println(isBalanced("([{{[(())]}}])")); // Output: true
        System.out.println(isBalanced("{{[]()}}}}")); // Output: false
        System.out.println(isBalanced("{[(])}")); // Output: false
    }
}
