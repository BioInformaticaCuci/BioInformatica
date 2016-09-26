/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioinformatica;
import java.awt.EventQueue;
/**
 *
 * @author Luis
 */
public class BioInformatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            try{
               App app=new App();
               app.setVisible(true);
            }catch(Exception e){
                
            }
        });
        
        String CDS="atggtgcacctgactcctgaggagaagtctgccgttactgccctgtggggcaaggtgaac"
                + "gtggatgaagttggtggtgaggccctgggcaggttgctggtggtctacccttggacccaga"
                + "ggttctttgagtcctttggggatctgtccactcctgatgctgttatgggcaaccctaaggt"
                + "gaaggctcatggcaagaaagtgctcggtgcctttagtgatggcctggctcacctggacaac"
                + "ctcaagggcacctttgccacactgagtgagctgcactgtgacaagctgcacgtggatcctg"
                + "agaacttcaggctcctgggcaacgtgctggtctgtgtgctggcccatcactttggcaaaga"
                + "attcaccccaccagtgcaggctgcctatcagaaagtggtggctggtgtggctaatgccctg"
                + "gcccacaagtatcactaa";
        Translate t=new Translate(CDS);
        System.out.println("F1: "+t.getAminoAcid(1));
        System.out.println("F2: "+t.getAminoAcid(2));
        System.out.println("F3: "+t.getAminoAcid(3));
        System.out.println("F4: "+t.getAminoAcid(4));
        System.out.println("F5: "+t.getAminoAcid(5));
        System.out.println("F6: "+t.getAminoAcid(6));
        
        Alignment a=new Alignment("ATTCC-GC","AGTTCAGC"/*"ATGCCCGATC"*/);
        a.showA();
        System.out.println(a.getAligns()+"\n"+a.getAlignt()+"\n"+a.getScore());
        
        // TODO code application logic here
    }
    
}
