package Practice;

public class armstrongNumber {

    int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    int power(int num, int count) {
        int pow = 1;
        for (int i = 1; i <= count; i++) {
            pow = pow * num;
        }
        return pow;
    }

    void armstrongNo(int num, int count) {
        int temp = num;   
        int sum = 0;

        while (temp != 0) {
            sum = sum + power(temp % 10, count);
            temp /= 10;
        }


        System.out.println(
            (sum == num) ? "Armstrong number" : "Not an Armstrong number"
        );
    }

    public static void main(String[] args) {

        armstrongNumber a = new armstrongNumber();

        int num = 153;  
        int digits = a.count(num);
        a.armstrongNo(num, digits);
    }
}
