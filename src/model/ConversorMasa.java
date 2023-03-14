package model;

import javax.swing.*;

import static ui.Menu.showMenu;

public class ConversorMasa {

    private static boolean continuarPrograma = true;
    private static double input;
    private static double resultado = 0;


    public static void conversorMasa() {
        while (continuarPrograma) {
            try {
                input = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita la cantidad en Kilogramos:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no valido");
                System.exit(0);
            }

            String[] opciones = {"Kilogramo a Gramo", "Kilogramo a Tonelada", "Kilogramo a Libra", "Kilogramo a Onza"};
            String masa = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de masa",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (masa == "Kilogramo a Gramo"){
                resultado = input * 1000;
                JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " Gramos");
            } else if (masa == "Kilogramo a Tonelada") {
                resultado = input / 1000;
                JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " Toneladas");
            } else if (masa == "Kilogramo a Libra") {
                resultado = input * 2.205;
                JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " Libras");
            } else if (masa == "Kilogramo a Onza") {
                resultado = input * 35.274;
                JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " Onzas");
            }

            int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el convertidor de masa?",
                    "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirma == 1) {
                JOptionPane.showMessageDialog(null, "Volviendo al menu principal");
                showMenu();
            } else if (confirma == 2) {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                System.exit(0);
            }
        }
    }
}
