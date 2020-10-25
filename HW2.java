import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {

             int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
             for (int i = 0; i < arr1.length; i++) {
                 arr1[i] = arr1[i] == 1 ? 0 : 1;
                 System.out.print(arr1[i] + " ");
             }

             int[] arr8 = new int[8];
             arr8[0] = 1;
             arr8[1] = 4;
             arr8[2] = 7;
             arr8[3] = 10;
             arr8[4] = 13;
             arr8[5] = 16;
             arr8[6] = 19;
             arr8[7] = 22;
             for (int i = 0; i < arr8.length; i++) {
                 System.out.println(arr8[i] + " ");
             }

             int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
             for (int i = 0; i < arr12.length; i++) {
                 if (arr12[i] < 6) arr12[i] *= 2;
                 System.out.print(arr12[i] + " ");
             }
         }
        public static void aaaa ( int height, int width){
            height = 10;
            width = 10;
            for (int y = 1; y < height; y++) {
                for (int x = 1; x < width; x++) {
                    System.out.print(x * y + "\t");
                }
                System.out.println();
            }
        }

    }
5654656546