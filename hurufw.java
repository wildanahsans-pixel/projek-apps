public class hurufw {
    public static void main(String[] args) {
        int baris = 6;
        int kolom = 7;

        char[][] w = new char[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                w[i][j] = ' ';
            }
        }

        for (int i = 0; i < baris; i++) {
            w[i][0] = 'W';           
            w[i][kolom - 1] = 'W';   
            if (i >= baris / 2) {    
                w[i][i] = 'W';
                w[i][kolom - 1 - i] = 'W';
            }
        }

        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(w[i][j]);
            }
            System.out.println();
        }
    }
}

