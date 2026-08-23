public class ArrayIndexAndValueExchange {
    public static int[] exchange(int arr[],int n){
        int newArr[] = new int[n];
        for(int i=0;i<n;i++){
            
            newArr[i] = arr[arr[i]];
        }

        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,4,3};
        int n = arr.length;
        int newArr[] = exchange(arr, n);
        for(int elem : newArr){
            System.out.print(elem+", ");
        }
    }   
}
