public class MinValue {
    public static void main(String[] args) {
        int[] arr = {5,6,4,2,1,9,0};
        int index = value(arr);
        System.out.print(arr[index]);

    }

    public static int value(int[] array) {
        int index = 0;
        for (int i = 1;i<array.length;i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
}
