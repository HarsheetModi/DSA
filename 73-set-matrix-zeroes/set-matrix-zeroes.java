class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        int rowsArr[] = new int[m];
        int colsArr[] = new int[n];

        Arrays.fill(rowsArr, 1);
        Arrays.fill(colsArr, 1);

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    rowsArr[i] = 0;
                    colsArr[j] = 0;
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(rowsArr[i]==0 || colsArr[j]==0){
                    matrix[i][j] = 0;
                }
            }
        }





















        // int m = matrix.length, n = matrix[0].length;
        // int copyMatrix[][] = new int[m][n];
        // for(int i =0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         copyMatrix[i][j] = matrix[i][j];
        //     }
        // }

        // for(int i =0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j] == 0){
        //             for(int a =0; a<n; a++){
        //                 copyMatrix[i][a] = 0;
        //             }
        //             for(int b=0; b<m; b++){
        //                 copyMatrix[b][j] = 0;
        //             }
        //         }
        //     }
        // }

        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j] = copyMatrix[i][j];
        //     }
        // }
    }
}