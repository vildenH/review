package alg;

public class Numberof1 {
    int NumberOf1(int n) {
        int flag = 1;
        int ans = 0;
        while (flag != 0) {
            if ((n & flag) != 0) {
                ans++;
            }
            flag = flag << 1;
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new Numberof1().NumberOf1(-2147483648));


    }
}