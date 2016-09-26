package bioinformatica;

public class Translate {

    String frame[];
    TranslateTable tt;

    Translate(String CDS) {
        CDS=CDS.toLowerCase();
        tt = new TranslateTable();
        frame = new String[6];
        setFrames(CDS);
    }

    private void setFrames(String CDS) {
        frame[0] = translate(CDS, 0, CDS.length());
        frame[1] = translate(CDS, 1, CDS.length() - 2);
        frame[2] = translate(CDS, 2, CDS.length() - 1);
        CDS=a35(CDS);
        frame[3] = translate(CDS, 0, CDS.length());
        frame[4] = translate(CDS, 1, CDS.length() - 2);
        frame[5] = translate(CDS, 2, CDS.length() - 1);
    }
    private String a35(String CDS){
    String temp="";
        for (int i = CDS.length()-1; i >= 0; i--) {
            char c=CDS.charAt(i);
            
            switch (c){
                case 't':
                    temp+='a';
                    break;
                case 'c':
                    temp+='g';
                    break;
                case 'a':
                    temp+='t';
                    break;
                case 'g':
                    temp+='c';
                    break;
            }
             
        }
        return temp;
}

    private String translate(String CDS, int i, int j) {
        String aminoacid = "";
        for (; i < j; i += 3) {
            aminoacid += tt.getAminoAcid(CDS.substring(i, i + 3));
        }
        return aminoacid;
    }

    String getAminoAcid(int i) {
        return frame[i - 1];
    }
}
