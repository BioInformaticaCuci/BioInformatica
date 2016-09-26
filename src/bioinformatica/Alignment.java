package bioinformatica;

public class Alignment {

    private int a[][];
    private final byte g = -2;
    private int m, n,score;
    private String s, t, aligns, alignt;

    Alignment(String s, String t) {
        m = s.length() + 1;
        n = t.length() + 1;
        a = new int[m][n];
        this.s = s;
        this.t = t;
        aligns = "";
        alignt = "";
        similarity();
        align(m - 1, n - 1);
        setScore();
    }

    private void similarity() {
        for (int i = 0; i < m; i++) {
            a[i][0] = i * g;
        }
        for (int j = 0; j < n; j++) {
            a[0][j] = j * g;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = Math.max(a[i - 1][j] + g, Math.max(a[i - 1][j - 1] + p(i, j), a[i][j - 1] + g));
            }
        }
    }

    private int p(int i, int j) {
        if (s.charAt(i - 1) == t.charAt(j - 1)) {
            return 1;
        }
        return -1;
    }

    private void align(int i, int j) {
        if(i==0&&j==0){
            
        }else if (i > 0 && a[i][j] == (a[i - 1][j] + g)) {
            align(i - 1, j);
            aligns += s.charAt(i - 1);
            alignt += '-';
        } else if (i > 0 && j > 0 && a[i][j] == a[i - 1][j - 1] + p(i, j)) {
            align(i - 1, j - 1);
            aligns += s.charAt(i - 1);
            alignt += t.charAt(j - 1);
        } else {
            align(i, j - 1);
            aligns += '-';
            alignt += t.charAt(j - 1);
        }
        
    }
    private void setScore(){
        score=0;
        for (int i = 0; i < aligns.length(); i++) {
            if (aligns.charAt(i)=='-'||alignt.charAt(i)=='-') {
                score-=2;
            }else if(aligns.charAt(i)==alignt.charAt(i)){
                score+=1;
            }else{
                score-=1;
            }
        }
    }
    String getAligns() {
        return aligns;
    }

    String getAlignt() {
        return alignt;
    }
    
    int getScore(){
        return score;
    }

    void showA() {
        for (int[] m : a) {
            for (int n : m) {
                System.out.print(n + "\t");
            }
            System.out.println("");
        }
    }
}
