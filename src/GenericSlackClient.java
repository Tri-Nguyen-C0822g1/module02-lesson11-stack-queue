import java.util.Scanner;
public class GenericSlackClient {

    private static void stackOfString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element:");
        String e = scanner.nextLine();
        stack.push(e);
//        stack.push("Five");
//        stack.push("Four");
//        stack.push("Three");
//        stack.push("Two");
//        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf(" %s",stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations : " + stack.size());
    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter elements:");
        int e = scanner.nextInt();
        stack.push(e);
//        stack.push(5);
//        stack.push(4);
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
        System.out.println("2.1 Size of stack after push operations : " + stack.size());
        System.out.println("2.2 Pop elements from stack : ");
        while (!stack.isEmpty()){
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Stack of  integers");
//        stackOfInteger();
        System.out.println("2. Stack of strings");
//        stackOfString();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                stackOfInteger();
            case 2:
                stackOfString();
        }

    }
}
