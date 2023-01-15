package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] inputNum = {10, 77, 10, 54, -11, 10};
        int num = 10;
        int sum= 30;
        System.out.println("SUm of all 10's is matched : "+result(inputNum,num,sum));
    }

    private static boolean result(int[] inputNum, int num, int sum) {
        int count = 0;
        for (int input: inputNum
             ) {
            if (input == num) {
                count += input;
            }
            if(count>sum) break;
        }

        if (count == sum)
            return true;
        else return false;
    }
}
