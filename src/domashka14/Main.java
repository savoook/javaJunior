package domashka14;

public class Main {
    public static void main(String[] args) {
        IMatrixImpl matrix = new IMatrixImpl(new double[4][4]);
        int a = matrix.getRows();
        int b = matrix.getColumns();
        matrix.setValueAt(0, 0, 1);
        matrix.setValueAt(0, 1, 6);
        matrix.setValueAt(0, 2, 7);
        matrix.setValueAt(0, 3, 3);
        matrix.setValueAt(1, 0, 8);
        matrix.setValueAt(1, 1, 6);
        matrix.setValueAt(1, 2, 3);
        matrix.setValueAt(1, 3, 9);
        matrix.setValueAt(2, 0, 4);
        matrix.setValueAt(2, 1, 3);
        matrix.setValueAt(2, 2, 2);
        matrix.setValueAt(2, 3, 1);
        matrix.setValueAt(3, 0, 5);
        matrix.setValueAt(3, 1, 7);
        matrix.setValueAt(3, 2, 8);
        matrix.setValueAt(3, 3, 4);

        double c = matrix.getValueAt(0, 0);
IMatrix matrixsum = matrix.transpose();
        //matrix.fillMatrix(1);
        //System.out.println(matrix.printToConsole());
        //matrix.printToConsole();
        //System.out.println(2);
        //IMatrixImpl otherMatrix = null;

        IMatrix otherMatrix = new IMatrixImpl(new double[3][3]);

        //    e.printStackTrace();
        // }

        //  otherMatrix.setValueAt(0, 0, 1);
        //  otherMatrix.setValueAt(0, 1, 2);
        // otherMatrix.setValueAt(0, 2, 3);
        // otherMatrix.setValueAt(1, 0, 4);
        //  otherMatrix.setValueAt(1, 1, 5);
        //  otherMatrix.setValueAt(1, 2, 5);
        //   matrix.add(otherMatrix);


        //matrix.transpose().printToConsole();
        //boolean z = matrix.isIdentityMatrix();
        matrix.printToConsole();
        try {
            System.out.println(matrix.determinant());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
