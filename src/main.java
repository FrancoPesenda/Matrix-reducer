





public class main {

    public static void main(String[] args){

        int ingresOption , row , column ;

        double singleNumbre ;

        matrix matrix1 ;

        System.out.print("ingresa las filas: ");

        row = myScan.DATE.nextInt() ;

        System.out.print("ingresa las columnas: ");

        column = myScan.DATE.nextInt();

        matrix1 = new matrix( row , column ) ;

        System.out.println("*** TIPO ****");

        myScan.DATE.nextLine() ;

        String letra ;

        letra = myScan.DATE.nextLine() ;

        if (letra.equals("m")){
            matrix1.fillMatrixManual();
        }else{
            matrix1.fillMatrix();
        }

        do{

            System.out.println("\nIngresa la opcion: ");
            System.out.println("1 - Crea la Matrix");
            System.out.println("2 - Reduce la matriz");
            System.out.println("3 - Muestra la Matriz");
            System.out.println("4 - Suma un numero a la matriz");
            System.out.println("0 - Final \n");

            ingresOption = myScan.DATE.nextInt();

            switch (ingresOption){
                case 1 :

                    System.out.print("ingresa las filas: ");
                    row = myScan.DATE.nextInt() ;
                    System.out.print("ingresa las columnas: ");
                    column = myScan.DATE.nextInt();
                    matrix1 = new matrix( row , column ) ;
                    matrix1.fillMatrix();

                    break;

                case 2:

                    matrix1.reduceMatrix();

                    System.out.println("\n *** Mostrar reducida **** \n");

                    matrix1.showMatrix();

                    break;

                case 3:

                    System.out.println("\n**** La matriz ****");

                    matrix1.showMatrix();

                    break;

                case 4:

                    System.out.print("\n Numero a sumar: ");

                    singleNumbre = myScan.DATE.nextDouble() ;

                    matrix1.addAllMatrix( singleNumbre );

                    break;

                default:

                    break;
            }

        }while (ingresOption != 0 );

    }

}