import java.util.ArrayList;

public class arraylistprac {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.addFirst(0);
        numbers.addLast(3);
        numbers.add(2, 10);
  
        
        System.out.println(numbers.get(2));
        
        System.out.println(numbers);
        
        numbers.set(2, 4);
        System.out.println("Number of elements:" + numbers.size());
        System.out.println(numbers.contains(5));
        numbers.remove(0);
        System.out.println(numbers.isEmpty());
        
        for (int i = 0; i < numbers.size(); i++) {
            
            System.out.println("$" + numbers.get(i) + ".00 ");
        }
            
        }
        
    }
    

