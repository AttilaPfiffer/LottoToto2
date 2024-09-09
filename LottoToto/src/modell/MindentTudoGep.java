
package modell;

import java.util.Arrays;
import java.util.Random;

public class MindentTudoGep {
    private int[] lottoSzelveny;
    private String totoSzelveny;
    private String[] dalok;
    
    static Random rnd = new Random();

    public MindentTudoGep() {
        this(new String[0]);
    }
    
    public MindentTudoGep(String dal) {
        this(new String[]{dal});
    }
    
    public MindentTudoGep(String[] dalok) {
        this.lottoSzelveny = new int[5];
        this.totoSzelveny = "";
        dallalFeltolt();
        if ( !(dalok == null || dalok.length == 0 || dalok[0].isBlank())){
            dalokatFelvesz(dalok);
        }
    }
    
    public void ujraIndit() {
        
    }
    
    public String generalLottoSzelveny() {
        int[] szamok = new int[5];
        for (int i = 0; i < 5; i ++) {
            int random = rnd.nextInt(1, 100);
            szamok[i] = random;
        }
        String nyeroSzamok = Arrays.toString(szamok);
        
        return nyeroSzamok;
    }
    
    public String kerLottoSzelveny() {
        return "1, 2, 3, 4, 5";
    }
    
    public String generalTotoSzelveny() {
        String uresMezo = " ";
        for (int i = 0; 0 < 14; i++) {
            int random = rnd.nextInt(1, 3);
            uresMezo += random;
        }
        
        return "";
    }
    
    public String kerTotoSzelveny() {
        String s = "";
        s += "1 2 3 ... 13 13+1";
        s += "1 2 3 ... x 1";
        return s;
    }
    
    public String kerDal() {
        return "ayaya";
    }
    
    public void ujDal(String dal) {
        
    }    

    private void dallalFeltolt() {
    
    }

    private void dalokatFelvesz(String[] dalok) {
    
    }
    
    
    
}

