package domashka14;

public class Main {
    public static void main(String[] args) {
        IMatrixImpl matrix = new IMatrixImpl(new double[4][4]);
        int a = matrix.getRows();
        int b = matrix.getColumns();
        matrix.setValueAt(0, 0, 1);
        matrix.setValueAt(0, 1, 0);
        matrix.setValueAt(0, 2, 0);
        matrix.setValueAt(0, 3, 0);
        matrix.setValueAt(1, 0, 0);
        matrix.setValueAt(1, 1, 1);
        matrix.setValueAt(1, 2, 0);
        matrix.setValueAt(1, 3, 0);
        matrix.setValueAt(2, 0, 0);
        matrix.setValueAt(2, 1, 0);
        matrix.setValueAt(2, 2, 1);
        matrix.setValueAt(2, 3, 0);
        matrix.setValueAt(3, 0, 0);
        matrix.setValueAt(3, 1, 0);
        matrix.setValueAt(3, 2, 0);
        matrix.setValueAt(3, 3, 1);

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


    }
}
