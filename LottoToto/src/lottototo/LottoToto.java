
package lottototo;

import modell.MindentTudoGep;

public class LottoToto {

    public static void main(String[] args) {
        MindentTudoGep gep = new MindentTudoGep();
        
        System.out.println("Lottó szelvény: \n" + gep.generalLottoSzelveny());
        
        gep.generalTotoSzelveny();
    }
    
}
