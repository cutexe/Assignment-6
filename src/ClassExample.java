import java.util.Scanner;
public class ClassExample {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = kb.nextInt();

        int[] nums = new int[size];

        //can also initialize array like this which makes it more customized:

        // int[] nums = {1, 2, 3, 4, 5};
        //for (int i = 0; i < 5; i ++){
        // System.out.println(nums[i]);
        // }

        System.out.println(nums[0]);
        for (int i = 0; i < size; i ++) {
            nums[i] = 10;
            //can be put in the same for loop
            System.out.println(nums[i]);
        }
        //this will print out memory location of the array integer
        //System.out.println(nums);

        //this position won't exist in Java (unlike C++)
        //System.out.println(nums[10]);
        System.out.println(nums.length);
    }
}