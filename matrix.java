public class matrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        boolean isIdentity = true;

        if (mat.length != mat[0].length) {
            isIdentity = false;
        } else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (i == j && mat[i][j] != 1) {
                        isIdentity = false;
                        break;
                    } else if (i != j && mat[i][j] != 0) {
                        isIdentity = false;
                        break;
                    }
                }
                if (!isIdentity) break;
            }
        }

        if (isIdentity) {
            System.out.println("Identity matrix");
        } else {
            System.out.println("Not an identity matrix");
        }
    }
}
