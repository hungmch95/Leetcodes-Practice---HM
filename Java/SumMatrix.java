public class SumMatrix{

     public static void main(String []args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        SumMatrix matrix = new SumMatrix(mat);
        System.out.println(matrix.get(0,0,1,1));
        System.out.println(matrix.get(0,0,2,2));
        matrix.set(0,1,10);
        System.out.println(matrix.get(0,0,2,2));
        
     }
     
     private static class SumMatrix{
        int[][] matrix;
        
        public SumMatrix(int[][] matrix){
            this.matrix = matrix;
        }
        
        public int get(int r0, int c0, int r, int c){
            int result = 0;
            //iterate through rows
            for(int i = 0; i <= r; i++){
                for(int j = 0; j <= c; j++){
                    result += this.matrix[i][j];
                }
            }
            
            return result;
        }
        
        public void set(int r , int c,int val){
            this.matrix[r][c] = val;
        }
    }
}
