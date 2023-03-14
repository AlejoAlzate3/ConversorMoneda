package model;

import javax.swing.*;

import static ui.Menu.showMenu;

public class ConversorTemperatura {
    private static boolean continuarPrograma = true;
    private static double input;
    private static double resultado = 0;

    public static void convertirTemperatura() {
        while (continuarPrograma) {
            try{
                input = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:"));
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                System.exit(0);
            }

            String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celcius"};
            String temperatura = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de temperatura",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (temperatura == "Celsius a Fahrenheit"){
                resultado = (input * 9/5) +32;
                JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " Grados Fahrenheit");
            } else if (temperatura == "Fahrenheit a Celcius") {
                resultado = (input - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " Grados Celcius");
            }

            int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el convertidor de temperatura?",
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
