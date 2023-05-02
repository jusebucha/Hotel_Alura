package jdbc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import jdbc.modelo.usuarios;
import views.Login;
import views.MenuUsuario;

public class UserController implements ActionListener{

	private Login vista;
	
	public UserController (Login vista) {
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = vista.getNombre();
		String contraseña = vista.getContraseña();
		
		if (usuarios.validarUsuario(nombre, contraseña)) {
			MenuUsuario menu = new MenuUsuario();
			menu.setVisible(true);
			vista.dispose();
		}else {
			JOptionPane.showMessageDialog(vista, "Usuario o Contraseña no validos");
		}
	}
	
}
