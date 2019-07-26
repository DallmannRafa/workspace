package Polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto {
	SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public void registroEntrada (Funcionario funcionario) {
		Date agora = new Date();
		funcionario.setRegistroPonto(funcionario.getRegistroPonto() + "Entrada cód: " + funcionario.getIDFuncionario() + "\n Horário: " + hora.format(agora) + "\n");
	}
	
	public void registroSaida (Funcionario funcionario) {
		Date agora = new Date();
		funcionario.setRegistroPonto(funcionario.getRegistroPonto() + "Saída cód: " + funcionario.getIDFuncionario() + "\n Horário: " + hora.format(agora) + "\n");
	}
}
