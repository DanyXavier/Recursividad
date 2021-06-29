import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //EJEMPLO 1
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Usuario ingresa un número para el cáculo del factorial");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("El numero " + n + " su factorial es: " + Factorial(n));*/

        //EjEMPLO 2
        int[] array = {2,4,6,1,2,8,54};//7 != index? hacer recursividad : no hagas nada
        readArray(array, 0);

    }
    // EJEMPLO 1
    /*
    3! = 3*2*1 = 6
    */
    public static int Factorial(int n){
        if (n == 1){
            return 1;
        }else return Factorial(n-1) * n;
    }
    /**
     * f(3)
     * 3==1? 1 false f(3-1) * 3
     * f(2)
     * 2==1? 1 false f(2-1) * 2
     * f(1)
     * 1==1? 1 
     * 1 * 2 * 3 =  return 6;
     */
    //EJEMPLO 2
    public static void readArray(int[] arr, int index){
        if(arr.length !=index){
            System.out.println("el elemento de mi array es: " + arr[index]+ 
            " y su index es: " + index);
            readArray(arr, index+1);
        }
    }
}
