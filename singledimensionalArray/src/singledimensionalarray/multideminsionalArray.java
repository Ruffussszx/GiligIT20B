
package singledimensionalarray;


public class multideminsionalArray {
    public static void main(String []args){
        int mas[][] ={
            {55, 65, 75},
            {85, 95, 105},
            {115, 125, 135}
          
        };
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }                
    }                  
}
