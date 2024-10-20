package SeguimientoEstudiantes;

import Actividades.Actividad;
import Actividades.Tarea;
import User.Estudiante;

public class SeguimientoTarea extends SeguimientoActividad {
	
	private String metodoEnvio;
	private String resultado;
	
	public SeguimientoTarea(Tarea tarea, Estudiante estudiante) {
		super(tarea, estudiante);
		this.metodoEnvio = "";
		this.resultado = "";
	}

	public String getMetodoEnvio() {
		return metodoEnvio;
	}

	public void setMetodoEnvio(String metodoEnvio) {
		this.metodoEnvio = metodoEnvio;
	}
	
	
	
	
	public void actualizarEstadoEnviado() {
		this.setEstado("Enviado");
	}
	
	public void actualizarEstadoFinal(boolean estado) {
		if (estado == true) {
			this.setEstado("Exitoso");
		}
		
		else {
			this.setEstado("No exitoso");
		}
	}
	
	
	
	
}
