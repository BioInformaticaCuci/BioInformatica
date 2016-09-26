package bioinformatica;

public class TranslateTable {

    char table[][][];

    TranslateTable() {
        table = new char[4][4][4];
        fill();
    }

    private void fill() {
        table[0][0][0]='F';
        table[0][0][1]='F';
        table[0][0][2]='L';
        table[0][0][3]='L';
        
        table[0][1][0]='S';
        table[0][1][1]='S';
        table[0][1][2]='S';
        table[0][1][3]='S';
        
        table[0][2][0]='Y';
        table[0][2][1]='Y';
        table[0][2][2]='-';
        table[0][2][3]='-';
        
        table[0][3][0]='C';
        table[0][3][1]='C';
        table[0][3][2]='-';
        table[0][3][3]='W';
        
        table[1][0][0]='L';
        table[1][0][1]='L';
        table[1][0][2]='L';
        table[1][0][3]='L';
        
        table[1][1][0]='P';
        table[1][1][1]='P';
        table[1][1][2]='P';
        table[1][1][3]='P';
        
        table[1][2][0]='H';
        table[1][2][1]='H';
        table[1][2][2]='Q';
        table[1][2][3]='Q';
        
        table[1][3][0]='R';
        table[1][3][1]='R';
        table[1][3][2]='R';
        table[1][3][3]='R';
        
        table[2][0][0]='I';
        table[2][0][1]='I';
        table[2][0][2]='I';
        table[2][0][3]='M';
        
        table[2][1][0]='T';
        table[2][1][1]='T';
        table[2][1][2]='T';
        table[2][1][3]='T';
        
        table[2][2][0]='N';
        table[2][2][1]='N';
        table[2][2][2]='K';
        table[2][2][3]='K';
        
        table[2][3][0]='S';
        table[2][3][1]='S';
        table[2][3][2]='R';
        table[2][3][3]='R';
        
        table[3][0][0]='V';
        table[3][0][1]='V';
        table[3][0][2]='V';
        table[3][0][3]='V';
        
        table[3][1][0]='A';
        table[3][1][1]='A';
        table[3][1][2]='A';
        table[3][1][3]='A';
        
        table[3][2][0]='D';
        table[3][2][1]='D';
        table[3][2][2]='E';
        table[3][2][3]='E';
        
        table[3][3][0]='G';
        table[3][3][1]='G';
        table[3][3][2]='G';
        table[3][3][3]='G';
    }

    char getAminoAcid(String codon) {
        byte i, j, k;
        i = getIndex(codon.charAt(0));
        j = getIndex(codon.charAt(1));
        k = getIndex(codon.charAt(2));
        return table[i][j][k];
    }

    private byte getIndex(char c) {
        switch (c) {
            case 't':
                return 0;
            case 'c':
                return 1;
            case 'a':
                return 2;
            case 'g':
                return 3;
        }
        return -1;
    }

}
