package Package1;

public class NumberManipulation {
    int i;
    int arr[] = new int[9];

    public void extractDigits(int num){

        for(i = 8; i >= 0; i--){
            arr[i] = num%10;
            num = num/10;
        }
    }

    public int findLastDigit(){
        int n = 1, sum = 0;

        for(i = 0; i < 9; i++) {
            sum += arr[i]*n;
            n++;
        }

        return sum;
    }
}
