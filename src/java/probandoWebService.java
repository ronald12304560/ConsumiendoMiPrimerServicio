import java.util.ArrayList;
import wsdad.Exception_Exception;
/**
 *
 * @author ADVANCE
 */
public class probandoWebService {
    
    public static void main (String[] args) throws Exception_Exception{
            
            probandoWebService prob= new probandoWebService();
            
            for(int i=0; i<prob.getEgresados().size(); i++){
            System.out.println(prob.getEgresados().get(i).getOAlumnoApellidoPaterno());
            System.out.println(prob.getEgresados().get(i).getOAlumnoApellidoMaterno());
            System.out.println(prob.getEgresados().get(i).getOAlumnoCodigo());
            System.out.println(prob.getEgresados().get(i).getOAlumnoDireccion());
            System.out.println(prob.getEgresados().get(i).getOAlumnoNombres());
            }
            System.out.print(prob.getEgresados().size());
    }
    private static java.util.List<wsdad.Alumno> getEgresados() throws Exception_Exception{
        wsdad.SaludoWSdad_Service service= new wsdad.SaludoWSdad_Service();
        wsdad.SaludoWSdad port= service.getSaludoWSdadPort();
        return port.getEgresados();
    }
}
