package Section4BitMagic;

public class FindOneOddElementInArray {
    public static int findOneOddElement(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j =0;j<n;j++)
                if(arr[i] == arr[j])
                    count++;

            if(count % 2 != 0)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,7,3,7,7};
        System.out.println(findOneOddElement(arr));
    }
}
