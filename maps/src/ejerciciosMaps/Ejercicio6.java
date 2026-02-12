package ejerciciosMaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio 6.- Control de usuarios
Crea un sistema básico de usuarios usando un Map<String, String>, donde se guarde el nombre de usuario y la 
contraseña.
Operaciones:
• Registrar usuarios sin permitir duplicados
• Validar el inicio de sesión
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		Map<String, String> sistemaUsuario = new HashMap<>();

		// Registrar Usuario
		try {
			registrarUsuario(sistemaUsuario, "Mariano", "1234");
			registrarUsuario(sistemaUsuario, "Eder", "1234");
			registrarUsuario(sistemaUsuario, "Juanjo", "1234");
			registrarUsuario(sistemaUsuario, "Mariano", "1234");
			
		}catch (UsuarioExistenteException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(sistemaUsuario);
		
		// Validar inicio sesion
		System.out.println(validarInicioSesion(sistemaUsuario, "Miguel", "12345"));
		
	}
	public static void registrarUsuario(Map<String, String> sistemaUsuario, String usuario, String password) throws UsuarioExistenteException {
		if (sistemaUsuario.containsKey(usuario)) {
			throw new UsuarioExistenteException(usuario);
		}
		sistemaUsuario.put(usuario, password);
	}
	public static boolean validarInicioSesion (Map<String, String> sistemaUsuario, String usuario, String password) {
		if (!sistemaUsuario.containsKey(usuario)) {
			return false;
		}
		if (sistemaUsuario.get(usuario).equals(password)) {
			return true;
		}
		
		return false;
	}
	
	// Excepciones
	private static class UsuarioExistenteException extends Exception{

		/**
		 * 
		 */
		public UsuarioExistenteException(String usuario) {
			super("Usuario "+usuario+" ya utilizado");
		}
		
	}
}
