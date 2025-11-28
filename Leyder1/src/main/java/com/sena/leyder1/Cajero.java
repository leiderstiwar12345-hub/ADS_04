package com.sena.leyder1;

import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Cajero {

    private int saldo = 7000000, saldoC = 20000000, retiroD = 2100000;
    private boolean continuar = true;

    public Cajero() {

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldoC() {
        return saldoC;
    }

    public void setSaldoC(int saldoC) {
        this.saldoC = saldoC;
    }

    public int getRetiroD() {
        return retiroD;

    }

    public void setRetiroD(int retiroD) {
        this.retiroD = retiroD;
    }

    public void cajero_automatico() {
        while (continuar) {
            try {
                StringBuilder menu = new StringBuilder("MENU CAJERO AUTOMATICO \n\n");
                menu.append("Seleccione una opcion asi \n")
                        .append("1. consultar Saldo \n")
                        .append("2. Consignar Dinero \n")
                        .append("3. Retirar Dinero \n")
                        .append("4. Salir");

                String opcion = JOptionPane.showInputDialog(null, menu, "Cajero Automatico", JOptionPane.QUESTION_MESSAGE);
                if (opcion == null) {
                    if (ConfirmarSalida()) {
                        continuar = false;

                    }
                    continue;
                }
                int opc = Integer.parseInt(opcion);
                switch (opc) {
                    case 1:
                        consultaSaldo();
                        break;
                    case 2:
                        ConsignarDinero();
                        break;
                    case 3:
                        RetirarDinero();
                        break;
                    case 4:
                        Salir();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error", "Ingrese un numero del 1 al 4",JOptionPane.QUESTION_MESSAGE);

                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showInputDialog("Error", "Ingrese un numero del 1 al 4");

            }

        }

    }

    private boolean ConfirmarSalida() {
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        return confirmar == JOptionPane.YES_OPTION;
    }

    public String idvalidacion() {
        Random random = new Random();
        int numero = random.nextInt(9000) + 1000;
        return "ID de la opercion #" + numero;
    }

    public void consultaSaldo() {
        String validacion = idvalidacion();
        StringBuilder mensaje = new StringBuilder("Consultar Saldo \n");
        mensaje.append(validacion)
                .append("Saldo actual $")
                .append(String.format("$,d", saldo));
        JOptionPane.showMessageDialog(null, mensaje, "Consultar Saldo", JOptionPane.INFORMATION_MESSAGE);

    }

    private void ConsignarDinero() {
        try {
            String consigna = id_validacion();
            JOptionPane.showMessageDialog(null, "ADVERTENCIA: El cajero no recibe monedas", "Recuerde que no se reciben billetes menores a 20.000 \n", JOptionPane.WARNING_MESSAGE);
            String Ds = JOptionPane.showInputDialog(null, "ingrese la cantidad a consignar", "CONSIGNAR DINERO", JOptionPane.INFORMATION_MESSAGE);
            int D = Integer.parseInt(Ds);

            if (D >= 20000) {
                saldo += D;

            } else {
                JOptionPane.showMessageDialog(null, "el valor que intenta ingresar no es correcto");

            }
            StringBuilder mensaje2 = new StringBuilder("CONSIGNAR DINERO \n");
            mensaje2.append(consigna)
                    .append("Saldo Actual: $")
                    .append(String.format("$, d", saldo));
            JOptionPane.showMessageDialog(null, mensaje2, "consignar dinero", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " debes ingresar solo numero", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void RetirarDinero() {

    }

    private void Salir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String id_validacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
