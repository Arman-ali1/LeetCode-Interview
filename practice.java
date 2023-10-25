public class practice {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(arr);
        System.out.println(arr.toString());
        // arr[3]=10;
        int arr1[]={1,2,3,4};
        int []arr2=arr1;
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);
        arr[2]=10;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
