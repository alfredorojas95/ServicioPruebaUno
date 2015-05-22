package servicios;

import Diagramarefinado.Academico.StaffAcademico.Curso;
/**
 * 
 * @author Alfredo
 *
 */
public class ServicioCrearCurso {

	/**
	 * este método crea un nuevo curso, sólo entregándole un nombre
	 * @param nombre nombre del curso
	 * @return respues confirmación 
	 */
	public String crearCurso(String nombre, String rutJefeAdm) {
		// TODO Auto-generated method stub
		return  Curso.crearCurso(new Curso(nombre),rutJefeAdm);
	}
	
	
	/**
	 * este método asigna un profesor a un curso
	 * @param id  código curso
	 * @param nombreCurso  nombre del curso
	 * @param rutProfe  rut del profesor para asignarle un curso
	 * @return respuesta confirmación
	 */
	public String asignarProfesor(int id, String nombreCurso,String rutProfe, String rutJefeAdm) {
		return Curso.asignarProfesor(id, nombreCurso, rutProfe,rutJefeAdm);
	}
}
