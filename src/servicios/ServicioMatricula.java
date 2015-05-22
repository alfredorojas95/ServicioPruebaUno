package servicios;

import Diagramarefinado.Finanza.Matricula;
/**
 * 
 * @author Alfredo
 *
 */
public class ServicioMatricula {

	/**
	 * Este m�todo busca a los alumnos cuyo estado de matr�cula se encuentre en '0'
	 * que representa el estado no pagado.
	 * @return string concatenado con todos los alumnos morosos en el pago de matr�cula
	 */
	public String mostrarMorososMatricula(){
		String cadena = "";
		orm.Estudiante[] morosos = Matricula.obtenerListMorososMatricula();
		for (int i=0; i<morosos.length; i++){
			cadena += morosos[i].getPersona().getNombre()+"   "+morosos[i].getPersona().getApellido()+"    "+morosos[i].getPersona().getRut()+"\n";
		}
		System.out.println(cadena);
		return cadena;
	}
}
