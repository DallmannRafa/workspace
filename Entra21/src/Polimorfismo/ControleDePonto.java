package Polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void registroEntrada (Funcionario funcionario) {
		Date agora = new Date();
		funcionario.setRegistroPonto(funcionario.getRegistroPonto() + "Entrada c�d: " + funcionario.getIDFuncionario() + "\n Hor�rio: " + hora.format(agora) + "\n");
	}
	
	public void registroSaida (Funcionario funcionario) {
		Date agora = new Date();
		funcionario.setRegistroPonto(funcionario.getRegistroPonto() + "Sa�da c�d: " + funcionario.getIDFuncionario() + "\n Hor�rio: " + hora.format(agora) + "\n");
	}
}
