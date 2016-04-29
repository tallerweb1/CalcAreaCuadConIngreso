package ar.edu.unlam.www.cerradura;

public class Cerradura {

	private Integer claveApertura;
	private Boolean estaAbierta = true;
	private Boolean estaBloqueada = false;
	private Integer failsPermitidos = 0;
	private Integer contadorFails = 0;
	private Integer exitosas = 0;
	private Integer fallidas = 0;
	
	
	public Cerradura(Integer clave, Integer cantidad) {
		claveApertura = clave;
		failsPermitidos = cantidad;
	}
	
	
	public Boolean abrir(Integer llave) {
		if (llave.equals(claveApertura)) {
			if (estaBloqueada == false) {
				estaAbierta = true;
				contadorFails=0;
				exitosas++;
				return true;
			}
			else {
				return false;
			}
		}
		else {
			estaAbierta = false;
			contadorFails++;
			fallidas++;
			
			if (contadorFails >= failsPermitidos) {
				estaBloqueada = true;
			}
		
			return false;
		}

	}
	
	public Boolean cerrar() {
		if(estaAbierta) {
			estaAbierta = false;
			return true;
		}
		return false;
	}
	
	public Boolean estaAbierta() {
		if(estaAbierta) {
			return true;
		}
		return false;
	}
	
	public Boolean estaCerrada() {
		if(!estaAbierta) {
			return true;
		}
		return false;
	}	

	public Boolean fueBloqueada() {
		if(estaBloqueada) {
			System.out.print("\nLa cerradura fue BLOQUEADA");
			return true;
		}
		return false;
	}

	public Integer aperturasExitosas() {
		return exitosas;
	}
	
	public Integer aperturasFallidas() {
		return fallidas;
	}
	
	public Boolean cambiarClave(Integer clave, Integer nuevaClave, Integer repetirClave) {
		if (clave.equals(claveApertura)) {
			if (nuevaClave.equals(repetirClave)) {
				claveApertura = nuevaClave;
				System.out.print("\nLa clave se cambio exitosamente");
				return true;
			}
			else {
				System.out.print("\nLa nueva clave y repetir clave no coinciden!");
				return false;
			}	
		}
		else {
			System.out.print("\nLa clave ingresada no es correcta!");
			return false;
		}
		
	}
	
} // fin 
