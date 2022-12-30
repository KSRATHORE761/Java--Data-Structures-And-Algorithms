public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {2,11,121,6221,42345,8};
        checkEvenDigit(arr);
    }
    static void checkEvenDigit(int[] arr){
        if(arr.length==0){
            System.out.println("Array is empty");
        }
        int count = 0;
        for(int a : arr){
            String s =String.valueOf(a);
            if((s.length())%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
