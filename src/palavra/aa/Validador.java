package palavra.aa;

import java.awt.*;
import palavra.aa.Palavras.*;
import palavra.aa.Main.*;

public class Validador {
    public void validar() {
        String letra1 = Main.text1.getText();
        if (letra1.equalsIgnoreCase(Palavras.palavraDividida[0])) {
            Main.text1.setBackground(Color.green);
        } else {
            Main.text1.setBackground(Color.red);
        }
    }
}

