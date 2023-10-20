
package inmobiliaria23.accesoAdatos;

import java.sql.Connection;


public class ContratoAquilerData {
    private Connection con=null;

    public ContratoAquilerData() {
        con = Conexion.getConexion();
    }
    
    public void crearContrato(){
        
    }
    public void rescindirContrato(){
        
    }
     public void renovarContrato(){
         
     }
    public void listarContratosVigentes(){
        
    }
    
}