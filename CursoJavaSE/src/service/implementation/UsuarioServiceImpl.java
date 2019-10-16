package service.implementation;

import daos.IUsuariosDao;
import services.interfaces.IUsuarioService;

public class UsuarioServiceImpl implements IUsuarioService {
	
	IUsuariosDao usuarioDao;
	
	@Override
	public String register(String usuario, String password) {
		return usuarioDao.register(usuario, password);
	}

}
