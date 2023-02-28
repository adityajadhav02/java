
class insertion
{
    public static void main(String[] args) {
        
        int n = 5;
        int[] arr = {4, 3, 5, 1, 2};

        for(int i = 1; i<n;i++){
            int j = i-1;
            int temp = arr[i];

            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for(int i=0;i<n;i++)
        System.out.print(arr[i] + " ");

    }

}