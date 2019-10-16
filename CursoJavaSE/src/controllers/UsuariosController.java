package controllers;

import service.implementation.UsuarioServiceImpl;

public class UsuariosController {
	UsuarioServiceImpl usarioService;
	
	public UsuariosController() {
		usarioService = new UsuarioServiceImpl();
		
	}
	
	public String registrer(String userName,String password) {
		usarioService.register(userName, password);
		return null;
	}

}
