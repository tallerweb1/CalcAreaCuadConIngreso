package ar.edu.unlam.www.cerradura;

public class Cerradura {

	private Integer claveApertura;
	private Boolean estaAbierta = true;
	private Integer failsPermitidos = 0;
	private Integer contadorFails = 0;
	private Integer exitosas = 0;
	private Integer fallidas = 0;
	
	
	public Cerradura(Integer clave, Integer cantidad) {
		claveApertura = clave;
		failsPermitidos = cantidad;
	}
	
	
	public Boolean abrir(Integer llave) {
		
		if(llave.equals(claveApertura)) {
			estaAbierta = true;
			contadorFails=0;
			fallidas=0;
			exitosas++;
			return estaAbierta;
		}
		
		else {
			estaAbierta = false;
			contadorFails++;
			fallidas++;
			
			return estaAbierta;
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
		if(contadorFails>=failsPermitidos) {
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
	
} // fin 
