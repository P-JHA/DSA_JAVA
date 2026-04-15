package src;

public class tansposeOfMatrix {
    public static void main(String[] args) {
        int row = 2, column =3;
        int [][] Matrix= {{2,3,7},{5,6,7}};

        //display original matrix 
        printMatrix(Matrix);

        //Tanspose the Matrix
        int [][] transpose = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i] = Matrix[i][j];
            }
        }
        //print the transposed matrix 
        printMatrix(transpose);
    }
    public static void printMatrix(int [][] matrix){
        System.out.println("The Matrix is : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
