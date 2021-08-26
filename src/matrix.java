public class matrix {

    private int row , column ;
    private double[][] matrix ;

    public matrix( int row , int column){
        this.row = row ;
        this.column = column ;
        matrix = new double[row][column] ;
    }

    public void fillMatrix(){

        for (int i = 0; i < row; i++){

            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 100 );
            }

        }
    }

    public void fillMatrixManual(){
        for (int i = 0; i < row; i++){

            for (int j = 0; j < column; j++) {
                System.out.print("-- ");
                matrix[i][j] = myScan.DATE.nextDouble();
            }

        }
    }

    public void showMatrix(){

        for (int i = 0; i < row; i++){

            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "  ");
            }

            System.out.println();

        }
    }

    public void addAllMatrix( double numberToAdd){

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix[i][j] += numberToAdd ;

            }

        }

        System.out.println("\n La nueva matriz \n ");

        this.showMatrix();

        System.out.println();

    }

    public void eroType1( int row , double numberI ){
        row -- ;
        for (int j = 0; j < column ; j++) {
            matrix[row][j] *= numberI ;
        }

    }

    public double[] eroType1Return( int row , double numberI ){
        row -- ;
        double[] auxArray = new double[column] ;
        for (int j = 0; j < column ; j++) {
            auxArray[j] = matrix[row][j] *= numberI ;
        }
        return auxArray ;
    }

    public void reduceMatrix(){
        double auxNumber ;
        double[] auxNumber2 = new double[getRow()] ;
        double[] auxNumber3 = new double[getRow()] ;

        for (int i = 0; i < this.getRow() ; i++) {//NUMERO QUE SIRVE PARA ALMACENAR EL VALOR POR EL QUE DIVIDIREMOS LA FILA

            for (int j = 0; j < column ; j++) {

                if ( i == j ){ // SE GUARDAN LOS VALORES PUNTEROS PARA LUEGO DIVIDIR

                    auxNumber = matrix[i][j] ;

                    for (int k = j; k < column ; k++){ // ENCARGADO DE HAER EL PRIMER NUMERO 1 Y DIVIDIR EL RESTO DE LA FILA

                        if (matrix[i][k] != 0 || auxNumber != 0 ){
                            matrix[i][k] = matrix[i][k] / auxNumber ;
                        }
                    }

                    for (int k = i; k > 0 ; k--){ //DIVIDE LA FILA EN LA PARTE SUPERIOR

                        auxNumber3[k] = - matrix[k-1][j] ;
                        matrix[(k-1)][j] += (auxNumber3[k] * matrix[i][j]) ;

                    }

                    if ( i < this.getRow() - 1){ //DIVIDE LA FILA EN LA PARTE INFERIOR

                        for (int k = i; k < (this.getRow() - 1); k++) {

                            auxNumber2[k] = - matrix[(k+1)][j] ;
                            matrix[(k+1)][j] += (auxNumber2[k] * matrix[i][j]) ;
                        }
                    }

                }else{ // CASOS PARA CUANDO LA COMBINACION NO ES LA DIAGONAL PRINCIPAL (NO GUARDA NUMEROS )

                    for (int k = i; k > 0 ; k--) {

                        matrix[(k-1)][j] += (auxNumber3[k] * matrix[i][j]) ;

                    }

                    if ( i < this.getRow() - 1){

                        for (int k = i; k < (this.getRow() - 1); k++) {
                            matrix[(k+1)][j] += (auxNumber2[k] * matrix[i][j]) ;
                        }
                    }
                }

            }

        }

    }

    public int getRow(){ return this.row ; }

    public int getColumn(){ return this.column ; }

    public double[][] getMatrix(){ return this.matrix ; }

}
