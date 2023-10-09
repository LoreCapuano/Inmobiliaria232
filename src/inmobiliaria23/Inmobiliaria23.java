package inmobiliaria23;

import inmobiliaria23.accesoAdatos.*;
import inmobiliaria23.entidades.*;
import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria23 {

    public static void main(String[] args) {
//ALTA INQUILINO

        Inquilino inquilino = new Inquilino("Abdala", "Samir",25454656, "20353658964", 221356254, "ulp","Garante1: Capuano Lorena DNI 26800372, garantia propietaria, presento escritura del inmueble sito en Pilar por un monto de $10.000.000; Garante 2: Matias Castro DNI 26532656, presento aval bancari del Banco Galicia SA por un monto de $5.000.000", true);
        InquilinoData inquiData = new InquilinoData();

        inquiData.nuevoInquilino(inquilino);
        System.out.println(inquilino);
////BAJA INQUILINO
//        Inquilino inquilino = new Inquilino(/*"Adonis", "Nina", 14141414, 171414146, 1160645898, "COCA COLA", 2, true*/);
//        InquilinoData inquiData = new InquilinoData();
//        inquiData.bajaInquilino(3);
//        System.out.println(inquilino);
//MODIFICAR INQUILINO
//        Inquilino inquilino = new Inquilino(4,"Perez","Laura",26800370,"27268003704",223458789,"PUNTA ALTA SA","Rey", "Patricio", true);
//        InquilinoData inquiData = new InquilinoData();
//        inquiData.modificarInquilino(inquilino);
//        System.out.println(inquilino);
//BUSCAR INQUILINO POR ID
//        InquilinoData inqui = new InquilinoData();
//        Inquilino inquilinoEncontrado = inqui.buscarInquilinoPorid(30);
//        if(inquilinoEncontrado!=null){
//            
//        System.out.println("DNI: " + inquilinoEncontrado.getDni());
//        System.out.println("NOMBRE: " + inquilinoEncontrado.getNombre());
//        System.out.println("APELLIDO: " + inquilinoEncontrado.getApellido());
//        }else{
//            System.out.println("No se encontro ningun inquilino con ese Id");
//        }
//BUSCAR INQUILINO POR DNI     
//        InquilinoData inqui = new InquilinoData();
//        Inquilino inquilinoEncontrado = inqui.buscarInquilinoPorDni(5333731);
//        if(inquilinoEncontrado!=null){
//        System.out.println("DNI: " + inquilinoEncontrado.getDni());
//        System.out.println("NOMBRE: " + inquilinoEncontrado.getNombre());
//        System.out.println("APELLIDO: " + inquilinoEncontrado.getApellido());
//        }else {
//            System.out.println("No se encontro ningun inquilino con ese Dni");
//      *****************************************************************************************      
//ALTA PROPIETARIO        
//        Propietario propietario=new Propietario("Gimenez","Mercedes",222222, 2213656,"Diagonal 25, La Plata");
//        PropietarioData propieData=new PropietarioData();
//        propieData.nuevoPropietario(propietario);
//        System.out.println(propietario);
//BAJA PROPIETARIO
//        Propietario propietario= new Propietario();
//        PropietarioData propieData = new PropietarioData();
//        propieData.bajaPropietario(3);
//        System.out.println(propietario.getApellido());
        // /MODIFICAR PROPIETARIO
//        Propietario propietario = new Propietario(1,"Gimenez","Mercedes",222222, 2213656,"Diagonal 56 nro.25, La Plata");
//        PropietarioData propieData = new PropietarioData();
//        propieData.modificarPropietario(propietario);
//        System.out.println(propietario);
//BUSCAR PROPIETARIO POR ID
//        PropietarioData propieD = new PropietarioData();
//        Propietario propietarioEncontrado = propieD.buscarPropietarioPorId(7);
//        if (propietarioEncontrado != null) {
//
//            System.out.println("DNI: " + propietarioEncontrado.getDni());
//            System.out.println("NOMBRE: " + propietarioEncontrado.getNombre());
//            System.out.println("APELLIDO: " + propietarioEncontrado.getApellido());
//        } else {
//            System.out.println("No se encontro ningun propietario con ese Id");
//        }
//BUSCAR PROPIETARIO POR DNI
//        PropietarioData propieD = new PropietarioData();
//        Propietario propietarioEncontrado = propieD.buscarPropietarioPorDni(12345678);
//        if (propietarioEncontrado != null) {
//
//            System.out.println("DNI: " + propietarioEncontrado.getDni());
//            System.out.println("NOMBRE: " + propietarioEncontrado.getNombre());
//            System.out.println("APELLIDO: " + propietarioEncontrado.getApellido());
//        } else {
//            System.out.println("No se encontro ningun propietario con ese dni");
//        }

//*****************************************************************************
//PROPIEDAD INMUEBLE DATA
//ALTA INMUEBLE
//
//            Propietario propietario=new Propietario
//          PropiedadInmueble propiedadInmueble=new PropiedadInmueble (6,"Deposito","Palermo", "Godoy Cruz 25",300,
//                  "con baño y cocina", "rampa",1000,true);
////        PropiedadInmuebleData;Po propieData=new PropiedadInmuebleData;
//        propieData.nuevoPropietario(propietario);
//        System.out.println(propietario);




//LISTAR INMUEBLES PROPIOS (LISTA DE INMUEBLES DE UN PROPIETARIO)
//        PropiedadInmuebleData propieData = new PropiedadInmuebleData();
//
//        List<PropiedadInmueble> listaInmuebles = propieData.ListarInmueblesPropios(15);//<una lista de tipo>nombre de la lista
//
//        if (!listaInmuebles.isEmpty()) {
//            for (PropiedadInmueble inmueble : listaInmuebles) {
//                System.out.println("id " + inmueble.getIdInmueble());
//                System.out.println("Tipo: " + inmueble.getTipoDeLocal());
//                System.out.println("Direccion: " + inmueble.getDireccion());
//                System.out.println("Zona: " + inmueble.getZona());
//                System.out.println("******************");
//            }
//        } else {
//            System.out.println("No existen propiedades para ese Dueño");
//        }
//    }
    }
}
