package cajeroautomatico;

import cajeroautomatico.Data.DTO.Cuenta;
import cajeroautomatico.Data.FuncionesCajero;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        JFrame frame = new JFrame();
        FuncionesCajero funcionCajero = new FuncionesCajero();
        String cuenta = JOptionPane.showInputDialog("Ingrese su N° de Cuenta");
        int validarCuenta = Integer.parseInt(cuenta);
        
        try{
            Cuenta validar = funcionCajero.consultaSaldo(validarCuenta); 
            String nombre = validar.getNombre();
            String apellido = validar.getApellido();
            if(validar != null){
                String clave = JOptionPane.showInputDialog("Bienvenido " + nombre + " " +  apellido + " Ingrese su clave");
                if(clave.equals(validar.getClave())){
                    Object[] options = {"Consultar Saldo", "Depositar", "Retirar", "Cambiar Clave"};
                    String operacion = (String)JOptionPane.showInputDialog(frame, "Seleccione la operación a realizar ", "Operación", JOptionPane.PLAIN_MESSAGE, null, options, "Consultar Saldo");
                    double saldoActual = validar.getSaldo();
                    switch(operacion){
                        case "Consultar Saldo":
                            JOptionPane.showMessageDialog(frame, "Su saldo es de: $" + validar.getSaldo());
                            funcionCajero.realizarTransaccion(validar.getNoCuenta(), "ConsultaSaldo", 0);
                            break;
                        case "Depositar":
                            String valorDeposito = JOptionPane.showInputDialog("Ingrese el monto que desea depositar:");
                            double cantidadDepositada = Double.parseDouble(valorDeposito);
                            Cuenta deposito = funcionCajero.depositar(cantidadDepositada, saldoActual, validarCuenta);
                            JOptionPane.showMessageDialog(frame, "Su nuevo saldo es $" + deposito.getSaldo());
                            break;
                        case "Retirar":
                            String valorRetiro = JOptionPane.showInputDialog("Ingrese el monto que desea retirar:");
                            double cantidadRetirada = Double.parseDouble(valorRetiro);
                            Cuenta retiro = funcionCajero.retirar(cantidadRetirada, saldoActual, validarCuenta);
                            JOptionPane.showMessageDialog(frame, "Su nuevo saldo es #" + retiro.getSaldo());
                            break;
                        case "Cambiar Clave":
                            String cambioClave = JOptionPane.showInputDialog("Ingrese la nueva clave:");
                            boolean cambio = funcionCajero.cambiarClave(clave, cambioClave, validarCuenta);
                            if (cambio) {
                                JOptionPane.showMessageDialog(frame, "El cambio de clave ha sido exitoso");
                            } else {
                                JOptionPane.showMessageDialog(frame, "Ha fallado el cambio de clave, intente nuevamente");
                            }
                            break;
                    }
                }else{
                    JOptionPane.showMessageDialog(frame, "Su clave esta errada, intente nuevamente");
                }
            }else {
                JOptionPane.showMessageDialog(frame ,"No existe la cuenta");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CajeroAutomatico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
