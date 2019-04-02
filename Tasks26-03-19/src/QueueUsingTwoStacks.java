import java.util.*;

/*  
Three types:
1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
*/


public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Stack<Integer> firstStack = new Stack<Integer>();
        Stack<Integer> secondStack = new Stack<Integer>();
        
        for (int i = 0; i < n; i++) {
            
            int type = sc.nextInt();
            if (type == 1)
                firstStack.push(sc.nextInt());

            else if(type == 2) {
                if(secondStack.isEmpty()) {
                    while(!firstStack.isEmpty()) {
                        secondStack.push(firstStack.pop());
                    }                    
                }
                
                if (!secondStack.isEmpty()) {                                
                    secondStack.pop(); 
                }

            }
            
            else if (type == 3) {       
                if(secondStack.isEmpty()) {
                    while(!firstStack.isEmpty()) {
                        secondStack.push(firstStack.pop());
                    }
                    System.out.println(secondStack.peek());
                } 
                else {
                    System.out.println(secondStack.peek());
                }
            }
        }
    }
}

