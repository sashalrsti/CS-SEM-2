import java.util.Stack;

class reverseSentence {
    static void pushStack(Stack<String> stack, String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            stack.push(word);
        }
    }

    static void popStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String sentence = "My name is Anastasia Larasati and im in compsci.";

        System.out.println("Original Sentence: " + sentence);
        pushStack(stack, sentence);

        System.out.print("Reversed Sentence: ");
        popStack(stack);
    }
}

