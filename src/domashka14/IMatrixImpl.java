package domashka14;

public class IMatrixImpl implements IMatrix {

    private double[][] matrix;

    public IMatrixImpl() {
    }

    public IMatrixImpl(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex >= matrix.length || colIndex >= matrix[0].length || rowIndex < 0 || colIndex < 0) {
            throw new IndexOutOfBoundsException("некорректные данные");
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex >= matrix.length || colIndex >= matrix[0].length || rowIndex < 0 || colIndex < 0) {
            throw new IndexOutOfBoundsException("некорректные данные");
        }
        matrix[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrixImpl add = new IMatrixImpl(new double[matrix.length][matrix[0].length]);
        if (otherMatrix.getRows() != matrix.length && otherMatrix.getColumns() != matrix[0].length) {
            throw new IllegalArgumentException("Несовместимое колличество строк и столбцов");
        }
        if (otherMatrix.getRows() != matrix.length) {
            throw new IllegalArgumentException("Несовместимое колличество строк");
        }
        if (otherMatrix.getColumns() != matrix[0].length) {
            throw new IllegalArgumentException("Несовместимое колличество столбцов");
        }
        if (otherMatrix.isNullMatrix() == true) {
            throw new NullPointerException("Второй элемент не задан");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                add.setValueAt(i, j, matrix[i][j] + otherMatrix.getValueAt(i, j));
            }
        }
        return add;
    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrixImpl sub = new IMatrixImpl(new double[matrix.length][matrix[0].length]);
        if (otherMatrix.getRows() != matrix.length && otherMatrix.getColumns() != matrix[0].length) {
            throw new IllegalArgumentException("Несовместимое колличество строк и столбцов");
        }
        if (otherMatrix.getRows() != matrix.length) {
            throw new IllegalArgumentException("Несовместимое колличество строк");
        }
        if (otherMatrix.getColumns() != matrix[0].length) {
            throw new IllegalArgumentException("Несовместимое колличество столбцов");
        }
        if (otherMatrix.isNullMatrix() == true) {
            throw new NullPointerException("Второй элемент не задан");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sub.setValueAt(i, j, matrix[i][j] - otherMatrix.getValueAt(i, j));
            }
        }
        return sub;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        IMatrixImpl mul = new IMatrixImpl(new double[matrix.length][matrix[0].length]);
        if (otherMatrix.getRows() != matrix.length && otherMatrix.getColumns() != matrix[0].length) {
            throw new IllegalArgumentException("Несовместимое колличество строк и столбцов");
        }
        if (otherMatrix.getRows() != matrix.length) {
            throw new IllegalArgumentException("Несовместимое колличество строк");
        }
        if (otherMatrix.getColumns() != matrix[0].length) {
            throw new IllegalArgumentException("Несовместимое колличество столбцов");
        }
        if (otherMatrix.isNullMatrix() == true) {
            throw new NullPointerException("Второй элемент не задан");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                mul.setValueAt(i, j, matrix[i][j] * otherMatrix.getValueAt(i, j));
            }
        }
        return mul;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrixImpl multy = new IMatrixImpl(new double[matrix.length][matrix[0].length]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                multy.setValueAt(i, j, (matrix[i][j] * value));
            }
        }
        return multy;
    }

    @Override
    public IMatrix transpose() {
        IMatrixImpl transpose = new IMatrixImpl(new double[matrix[0].length][matrix.length]);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transpose.setValueAt(i, j, (matrix[j][i]));
            }
        }
        return transpose;
    }

    @Override
    public void fillMatrix(double value) {
        IMatrixImpl newMatrix = new IMatrixImpl(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                newMatrix.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() throws Exception {
        if (matrix.length != matrix[0].length){
            throw new Exception("матрица не квадратная");
        }

        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        boolean nullMatrix = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    nullMatrix = true;
                } else {
                    nullMatrix = false;
                    return nullMatrix;
                }
            }
        }
        return nullMatrix;
    }

    @Override
    public boolean isIdentityMatrix() throws Exception {
        if (matrix.length != matrix[0].length){
            throw new Exception("матрица не квадратная");
        }
        boolean identityMatrix = true;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] == 0) {
                    identityMatrix = true;
                } else {
                    identityMatrix = false;
                    return identityMatrix;
                }
            }
        }
        for (int j = 1; j < matrix.length; j++) {
            for (int i = 0; i < j; i++) {
                if (matrix[i][j] == 0) {
                    identityMatrix = true;
                } else {
                    identityMatrix = false;
                    return identityMatrix;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int j = i;
            if (matrix[i][j] == 1) {
                identityMatrix = true;
            } else {
                identityMatrix = false;
                return identityMatrix;
            }
        }


        return identityMatrix;
}

    @Override
    public boolean isSquareMatrix() {
        boolean square = false;
        if (matrix.length == matrix[0].length) {
            square = true;
        }
        return square;
    }


    @Override
    public void printToConsole() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
