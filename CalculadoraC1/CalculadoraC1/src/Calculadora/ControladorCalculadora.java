package Calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    private Button btnSumar;

    @FXML
    private Button btnRestar;

    @FXML
    private Button btnMultiplicar;

    @FXML
    private Button btnDividir;

    @FXML
    private Label lblSalida;

    Cliente cliente = new Cliente();

    @FXML
    private void sumar() {
        operar("+");
    }

    @FXML
    private void restar() {
        operar("-");
    }

    @FXML
    private void multiplicar() {
        operar("*");
    }

    @FXML
    private void dividir() {
        operar("/");
    }

    private void operar(String op) {
        try {
            double n1 = Double.parseDouble(txtN1.getText());
            double n2 = Double.parseDouble(txtN2.getText());

            String respuesta = cliente.enviar("127.0.0.1", 5000, n1, n2, op);
            lblSalida.setText(respuesta);

        } catch (NumberFormatException e) {
            lblSalida.setText("Ingrese numeros validos");
        } catch (Exception e) {
            lblSalida.setText("Error de conexion");
            e.printStackTrace();
        }
    }

    @FXML
    private void limpiar() {
        txtN1.clear();
        txtN2.clear();
        lblSalida.setText("");
    }
}