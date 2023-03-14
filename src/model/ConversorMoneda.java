package model;

import static ui.Menu.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMoneda {

    private static boolean continuarPrograma = true;
    private static double pesoColombiano = 0.00021;
    private static double dolar = 4722;
    private static double euro = 5116;
    private static double libra = 5811;
    private static double yen = 35.73;
    private static double won = 3.68;
    private static double input;

    public ConversorMoneda() {
    }

    public static void convertirMoneda() {
        DecimalFormat formatearDivisa = new DecimalFormat("#.##");
        while (continuarPrograma) {
            try {
                input = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:"));
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                System.exit(0);
            }

            String[] opciones = {"Pesos Colombianos a Dolares", "Pesos Colombianos a Euros", "Pesos Colombianos a Libras Esterlinas",
                    "Pesos Colombianos a Yen", "Pesos Colombianos a Won", "Dolares a Pesos Colombianos", "Euros a Pesos Colombianos",
                    "Libras Esterlinas a Pesos Colombianos", "Yen a Pesos Colombianos", "Won a Pesos Colombianos"};

            String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción:", "Conversor de moneda",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (cambio.equals("Pesos Colombianos a Dolares")) {
                double dolares = input / dolar;
                JOptionPane.showMessageDialog(null, " Tienes $ " + formatearDivisa.format(dolares) + " Dolares.");
            } else if (cambio.equals("Pesos Colombianos a Euros")) {
                double euros = input / euro;
                JOptionPane.showMessageDialog(null, " Tienes € " + formatearDivisa.format(euros) + " Euros.");
            } else if (cambio.equals("Pesos Colombianos a Libras Esterlinas")) {
                double libras = input / libra;
                JOptionPane.showMessageDialog(null,  " Tienes £ " + formatearDivisa.format(libras) + " Libras Esterlinas.");
            } else if (cambio.equals("Pesos Colombianos a Yen")) {
                double yenes = input / yen;
                JOptionPane.showMessageDialog(null,  " Tienes ¥ " + formatearDivisa.format(yenes) + " Yenes.");
            } else if (cambio.equals("Pesos Colombianos a Won")) {
                double wones = input / won;
                JOptionPane.showMessageDialog(null,  " Tienes ¥ " + formatearDivisa.format(wones) + " Wones.");
            }else if (cambio.equals("Dolares a Pesos Colombianos")) {
                double dolares = dolar * input;
                JOptionPane.showMessageDialog(null, " Tienes $ " + formatearDivisa.format(dolares) + " Dolares.");
            } else if (cambio.equals("Euros a Pesos Colombianos")) {
                double euros = euro * input;
                JOptionPane.showMessageDialog(null, " Tienes $ " + formatearDivisa.format(euros) + " Euros.");
            } else if (cambio.equals("Libras Esterlinas a Pesos Colombianos")) {
                double libras = libra * input;
                JOptionPane.showMessageDialog(null,  " Tienes $ " + formatearDivisa.format(libras) + " Libras Esterlinas.");
            } else if (cambio.equals("Yen a Pesos Colombianos")) {
                double yenes = yen * input;
                JOptionPane.showMessageDialog(null,  " Tienes $ " + formatearDivisa.format(yenes) + " Yenes.");
            } else if (cambio.equals("Won a Pesos Colombianos")) {
                double wones = won * input;
                JOptionPane.showMessageDialog(null,  " Tienes $ " + formatearDivisa.format(wones) + " Wones.");
            }

            int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el convertidor de divisas?",
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
