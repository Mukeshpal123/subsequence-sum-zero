import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Select Element: ");
        for(int i = 0; i<n; i++){

            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = findSubSequenceSumZero(arr);
        if(list != null){

            for(int num:list){
                System.out.print(num+" ");
            }
        }
        else{
            System.out.println("No Elements found");
        }
    }

    private static ArrayList<Integer> findSubSequenceSumZero(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0 && !containsZero(arr,i,j)){
                    for(int k=i;k<=j;k++){
                        list.add(arr[k]);
                    }
                    return list;
                }
            }
        }
        return null;
    }

    private static boolean containsZero(int[] arr, int start, int end) {
        for(int i=start;i<=end;i++){
            if(arr[i]==0){
                return true;
            }
        }
        return false;
    }
}