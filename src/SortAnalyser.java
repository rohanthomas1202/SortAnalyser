import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortAnalyser {
    public static void main(String[] args) {

        // fill arrays and lists with values between 'min_val' and max_val'
        int min_val = 1;
        int max_val = 5;

        // const int
        final int MAX_VAL = 5;
        int difference = max_val - min_val;

        // arrays
        int[] arr_bubble_sort = new int[MAX_VAL];
        int[] arr_selection_sort = new int[MAX_VAL];
        int[] arr_insertion_sort = new int[MAX_VAL];
        // lists
        List<Integer> list_quick_sort = new ArrayList<Integer>();
        List<Integer> list_insertion_sort = new ArrayList<Integer>();
        List<Integer> list_merge_sort = new ArrayList<Integer>();

        System.out.println("The arrays and lists contains:");
        for (int index = 0; index < MAX_VAL; index++) {
            int num = give_random_number(min_val, difference);
            arr_bubble_sort[index] = num;
            arr_selection_sort[index] = num;
            arr_insertion_sort[index] = num;
            list_quick_sort.add(num);
            list_insertion_sort.add(num);
            list_merge_sort.add(num);
            System.out.print("[" + num + "]");
        }





    }

    // get a random number in a range
    public static int give_random_number(int min, int difference) {
        Random rand = new Random();
        return rand.nextInt(difference) + min;
    }
}
