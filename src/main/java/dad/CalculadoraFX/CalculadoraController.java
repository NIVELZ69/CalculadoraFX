package dad.CalculadoraFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CalculadoraController implements Initializable {
	
	//model
	
	private StringProperty pantalla = new SimpleStringProperty("");
	
	Calculadora calculadora = new Calculadora();
	
	//view

    @FXML
    private Button borrarButton;

    @FXML
    private Button borrarTodoButton;

    @FXML
    private Button ceroButton;

    @FXML
    private Button cincoButton;

    @FXML
    private Button cuatroButton;

    @FXML
    private Button decimalButton;

    @FXML
    private Button dividirButton;

    @FXML
    private Button dosButton;

    @FXML
    private Button igualButton;

    @FXML
    private Button multiplicarButton;

    @FXML
    private Button nueveButton;

    @FXML
    private Button ochoButton;

    @FXML
    private TextField operacionText;

    @FXML
    private Button restarButton;

    @FXML
    private Button seisButton;

    @FXML
    private Button sieteButton;

    @FXML
    private Button sumarButton;

    @FXML
    private Button tresButton;

    @FXML
    private Button unoButton;
    
    @FXML
    private VBox root;
    
    public CalculadoraController() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CalculadoraView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
    
    @Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		
		// bindings
    	operacionText.textProperty().bindBidirectional(pantalla);
    	
	}

    @FXML
    void onBorrarAction(ActionEvent event) {
    	calculadora.borrarTodo();
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onBorrarTodoAction(ActionEvent event) {
    	calculadora.borrar();
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCeroAction(ActionEvent event) {
    	
		calculadora.insertar('0');
		pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCincoAction(ActionEvent event) {
    	calculadora.insertar('5');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onCuatroAction(ActionEvent event) {
    	calculadora.insertar('4');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onDecimalAction(ActionEvent event) {
    	calculadora.insertar('.');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onDividirAction(ActionEvent event) {
    	calculadora.operar('/');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onDosAction(ActionEvent event) {
    	calculadora.insertar('2');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onIgualAction(ActionEvent event) {
    	calculadora.operar('=');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onMultiplicarAction(ActionEvent event) {
    	calculadora.operar('*');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onNueveAction(ActionEvent event) {
    	calculadora.insertar('9');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onOchoAction(ActionEvent event) {
    	calculadora.insertar('8');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onRestarAction(ActionEvent event) {
    	calculadora.operar('-');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onSeisAction(ActionEvent event) {
    	calculadora.insertar('6');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onSieteAction(ActionEvent event) {
    	calculadora.insertar('7');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onSumarAction(ActionEvent event) {
    	calculadora.operar('+');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onTresAction(ActionEvent event) {
    	calculadora.insertar('3');
    	pantalla.set(calculadora.getPantalla());
    }

    @FXML
    void onUnoAction(ActionEvent event) {
    	calculadora.insertar('1');
    	pantalla.set(calculadora.getPantalla());
    }

	public final StringProperty pantallaProperty() {
		return this.pantalla;
	}
	

	public final String getPantalla() {
		return this.pantallaProperty().get();
	}
	

	public final void setPantalla(final String pantalla) {
		this.pantallaProperty().set(pantalla);
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public Button getBorrarButton() {
		return borrarButton;
	}

	public void setBorrarButton(Button borrarButton) {
		this.borrarButton = borrarButton;
	}

	public Button getBorrarTodoButton() {
		return borrarTodoButton;
	}

	public void setBorrarTodoButton(Button borrarTodoButton) {
		this.borrarTodoButton = borrarTodoButton;
	}

	public Button getCeroButton() {
		return ceroButton;
	}

	public void setCeroButton(Button ceroButton) {
		this.ceroButton = ceroButton;
	}

	public Button getCincoButton() {
		return cincoButton;
	}

	public void setCincoButton(Button cincoButton) {
		this.cincoButton = cincoButton;
	}

	public Button getCuatroButton() {
		return cuatroButton;
	}

	public void setCuatroButton(Button cuatroButton) {
		this.cuatroButton = cuatroButton;
	}

	public Button getDecimalButton() {
		return decimalButton;
	}

	public void setDecimalButton(Button decimalButton) {
		this.decimalButton = decimalButton;
	}

	public Button getDividirButton() {
		return dividirButton;
	}

	public void setDividirButton(Button dividirButton) {
		this.dividirButton = dividirButton;
	}

	public Button getDosButton() {
		return dosButton;
	}

	public void setDosButton(Button dosButton) {
		this.dosButton = dosButton;
	}

	public Button getIgualButton() {
		return igualButton;
	}

	public void setIgualButton(Button igualButton) {
		this.igualButton = igualButton;
	}

	public Button getMultiplicarButton() {
		return multiplicarButton;
	}

	public void setMultiplicarButton(Button multiplicarButton) {
		this.multiplicarButton = multiplicarButton;
	}

	public Button getNueveButton() {
		return nueveButton;
	}

	public void setNueveButton(Button nueveButton) {
		this.nueveButton = nueveButton;
	}

	public Button getOchoButton() {
		return ochoButton;
	}

	public void setOchoButton(Button ochoButton) {
		this.ochoButton = ochoButton;
	}

	public TextField getOperacionText() {
		return operacionText;
	}

	public void setOperacionText(TextField operacionText) {
		this.operacionText = operacionText;
	}

	public Button getRestarButton() {
		return restarButton;
	}

	public void setRestarButton(Button restarButton) {
		this.restarButton = restarButton;
	}

	public Button getSeisButton() {
		return seisButton;
	}

	public void setSeisButton(Button seisButton) {
		this.seisButton = seisButton;
	}

	public Button getSieteButton() {
		return sieteButton;
	}

	public void setSieteButton(Button sieteButton) {
		this.sieteButton = sieteButton;
	}

	public Button getSumarButton() {
		return sumarButton;
	}

	public void setSumarButton(Button sumarButton) {
		this.sumarButton = sumarButton;
	}

	public Button getTresButton() {
		return tresButton;
	}

	public void setTresButton(Button tresButton) {
		this.tresButton = tresButton;
	}

	public Button getUnoButton() {
		return unoButton;
	}

	public void setUnoButton(Button unoButton) {
		this.unoButton = unoButton;
	}

	public VBox getRoot() {
		return root;
	}

	public void setRoot(VBox root) {
		this.root = root;
	}

	public void setPantalla(StringProperty pantalla) {
		this.pantalla = pantalla;
	}
	
    
    

}
