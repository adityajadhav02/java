import java.util.Arrays;

public class sortedMatrix {

    public static void main(String[] args) {
        
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Searched :");
        System.out.println(Arrays.toString(search(arr, 8)));
    }

    // Search in the given row between the provided cols.
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;

            if(arr[row][mid] == target)
            return new int[]{row, mid};

            else if(arr[row][mid] < target)
            cStart = mid + 1;

            else
            cEnd = mid - 1;
        } 
        return new int[] {-1, -1};
    }
    
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;
        if(col == 0)
        return new int[] {-1, -1};

        if(rows == 1)
        return binarySearch(matrix, 0, 0, col-1, target);

        // Take middle column and run binary search & run the loop till 2 rows are remaining.

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = col/2;

        // When this is true we will have more than 2 rows
        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target)
            return new int[] {mid, cMid};

            else if(matrix[mid][cMid] < target)
            rStart = mid;

            else
            rEnd = mid;
        }

        // Now we have 2 rows 
        // Check if the col of 2 rows contains target
        if(matrix[rStart][cMid] == target)
        return new int[] {rStart, cMid};

        if(matrix[rStart + 1][cMid] == target)
        return new int[] {rStart, cMid};

        // Search in 1st half
        if(target <= matrix[rStart][cMid-1])
            return binarySearch(matrix, rStart, 0, cMid-1, target);

        // Search in 2st half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1] )
            return binarySearch(matrix, rStart, cMid+1, col-1, target);

        // Search in 3st half
        if(target <= matrix[rStart+1][cMid-1])
            return binarySearch(matrix, rStart+1, 0, cMid-1, target);

        // Search in 4st half
        else
            return binarySearch(matrix, rStart+1, cMid+1, col-1, target);

    }
    
}

