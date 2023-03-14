package ui;

import static model.ConversorMoneda.*;
import static model.ConversorTemperatura.*;
import static model.ConversorMasa.*;
import javax.swing.*;

public class Menu {

    public static void showMenu(){
        Object[] options = {"Seleccione","Conversor de Monedas", "Conversor de Temperatura", "Conversor de Masa"};
        String elige = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
                "Menu", JOptionPane.DEFAULT_OPTION, null, options, options[0]);

        if (elige == "Conversor de Monedas"){
            convertirMoneda();
        } else if (elige == "Conversor de Temperatura") {
            convertirTemperatura();
        } else if (elige == "Conversor de Masa") {
            conversorMasa();
        }
    }
}
