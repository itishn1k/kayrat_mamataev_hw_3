import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        double fifteens []={12, 23.5, -12.01, -3.53, 9.5, 0.5, -7.4, -3.4, -1.1, 4.5, -5.7, 2.0, 12.25, 8.25, -90.0};
        double sum = 0.0;
        boolean negative = false;
        for (double f : fifteens){
            sum+=f;
            if (f<0){
                negative = true;
               continue;

            }
                System.out.print(f+"  ");//положительные после первого отрицательного
        }
        if (negative)
            System.out.println("\n"+sum/ fifteens.length);


        System.out.println("доп дз"+"\n"+"_______________________");

        int arr[] = {8,-2,-4,2,3,6};
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nОтсортировано: \n");
        Arrays.sort(arr);

        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}