//array, for cycle, Objects
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String[] var_arrayComplex = new String[] {"one", "two", "three"};
        int[] var_arrayShort = {1, 2, 3};
        System.out.println("Should I count Latin or Arabic?");
        Scanner var_scanner = new Scanner(System.in);
        String var_answer = var_scanner.nextLine();
        if(Objects.equals(var_answer.toLowerCase(), "arabic"))
            for(int a: var_arrayShort) {
            System.out.println(a + " Mississippi");
        }
        if(Objects.equals(var_answer.toLowerCase(), "latin"))
            for(String var_val : var_arrayComplex){
                System.out.println(var_val + " Mississippi");
            }
        if((!Objects.equals(var_answer.toLowerCase(), "latin") & !Objects.equals(var_answer.toLowerCase(), "arabic")) )
            System.out.println("Don't understand you, bye!");
    }
}
