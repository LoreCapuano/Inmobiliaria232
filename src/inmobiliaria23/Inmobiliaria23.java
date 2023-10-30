package inmobiliaria23;

import inmobiliaria23.accesoAdatos.*;
import inmobiliaria23.entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Inmobiliaria23 {

    public static void main(String[] args) {
//ALTA INQUILINO

//        Inquilino inquilino = new Inquilino("Abdala", "Samir", 25454656, "20353658964", 221356254, "ulp", "Garante1: Capuano Lorena DNI 26800372, garantia propietaria, presento escritura del inmueble sito en Pilar por un monto de $10.000.000; Garante 2: Matias Castro DNI 26532656, presento aval bancari del Banco Galicia SA por un monto de $5.000.000", true);
//        InquilinoData inquiData = new InquilinoData();
//
//        inquiData.nuevoInquilino(inquilino);
//        System.out.println(inquilino);
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
//LISTAR INQUILINOS
//try {
//            InquilinoData inquiData = new InquilinoData();
//            List<Inquilino> milista = inquiData.listarInquilinos();//<una lista de tipo>nombre de la lista
//            if (!milista.isEmpty()) {
//                for (Inquilino inquilino : milista) {
//                    System.out.println("id " + inquilino.getId_inquilino());
//                    System.out.println("Apellido: " + inquilino.getApellido());
//                    System.out.println("Nombre: " + inquilino.getNombre());
//
//                    System.out.println("-------------------");
//                }
//            } else {
//                System.out.println("No existen inquilinos");
//            }
//        } catch (NullPointerException npe) {
//            JOptionPane.showMessageDialog(null, "error no se encuentra  propietario " + npe.getMessage());
//        }
//    }
//}
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
//        System.out.println("Apellido"+propietario.getApellido());
//        
//        PropiedadInmuebleData inmuData=new PropiedadInmuebleData();
//        PropiedadInmueble propiedadActual=new PropiedadInmueble();
//        System.out.println("Propiedades asociadas"+ propiedadActual.getPropietario().getId_propietario());
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
//LISTAR PROPIETARIOS
//        try {
//            PropietarioData proData = new PropietarioData();
//            List<Propietario> milista = proData.listarPropietarios();//<una lista de tipo>nombre de la lista
//            if (!milista.isEmpty()) {
//                for (Propietario propietario : milista) {
//                    System.out.println("id " + propietario.getId_propietario());
//                    System.out.println("Apellido: " + propietario.getApellido());
//                    System.out.println("Nombre: " + propietario.getNombre());
//
//                    System.out.println("-------------------");
//                }
//            } else {
//                System.out.println("No existen propiedades disponibles");
//            }
//        } catch (NullPointerException npe) {
//            JOptionPane.showMessageDialog(null, "error no se encuentra  propietario " + npe.getMessage());
//        }
//    }   }
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
//LISTAR INMUEBLES DISPONIBLES POR TIPO 
//        PropiedadInmuebleData propieData = new PropiedadInmuebleData();
//        List<PropiedadInmueble> listaInmuebles = propieData.listarInmueblesDisponibles("Piso");//<una lista de tipo>nombre de la lista
//        if (!listaInmuebles.isEmpty()) {
//            for (PropiedadInmueble inmueble : listaInmuebles) {
//                System.out.println("id " + inmueble.getIdInmueble());
//                System.out.println("Tipo: " + inmueble.getTipoDeLocal());
//                System.out.println("Direccion: " + inmueble.getDireccion());
//                System.out.println("Zona: " + inmueble.getZona());
//                System.out.println("******************");
//            }
//        } else {
//            System.out.println("No existen propiedades de ese tipo");
//        }
//    }
//LISTAR INMUEBLES DISPONIBLES
//        try {
//
//            PropiedadInmuebleData propieData = new PropiedadInmuebleData();
//            List<PropiedadInmueble> listaInmuebles = propieData.listarInmueblesDisponibles(Boolean.TRUE);//<una lista de tipo>nombre de la lista
//            if (!listaInmuebles.isEmpty()) {
//                for (PropiedadInmueble inmueble : listaInmuebles) {
//                    System.out.println("id " + inmueble.getIdInmueble());
//                    System.out.println("Tipo: " + inmueble.getTipoDeLocal());
//                    System.out.println("Direccion: " + inmueble.getDireccion());
//                   //System.out.println("Dueño: " + inmueble.getPropietario().getId_propietario());
//                                                                                                                                                            
//                    System.out.println("-------------------");
//                }
//            } else {
//                System.out.println("No existen propiedades de ese tipo");
//            }
//        } catch (NullPointerException npe) {
//           JOptionPane.showMessageDialog(null,"error"+npe.getMessage());
//        }
        //   }   }
// LISTAR INMUEBLES DISPONIBLES Y SU DUEÑO
//        try {
//            PropiedadInmuebleData propieData = new PropiedadInmuebleData();
//            List<PropiedadInmueble> listaInmuebles = propieData.listarInmueblesDisponiblesYsuDueño(true);//<una lista de tipo>nombre de la lista
//            if (!listaInmuebles.isEmpty()) {
//                for (PropiedadInmueble inmueble : listaInmuebles) {
//                    System.out.println("id " + inmueble.getIdInmueble());
//                    System.out.println("Tipo: " + inmueble.getTipoDeLocal());
//                    System.out.println("Direccion: " + inmueble.getDireccion());
//                    System.out.println("Dueño: " + inmueble.getPropietario().getApellido());
//
//                    System.out.println("-------------------");
//                }
//            } else {
//                System.out.println("No existen propiedades disponibles");
//            }
//        } catch (NullPointerException npe) {
//            JOptionPane.showMessageDialog(null, "error no se encuentra  propietario " + npe.getMessage());
//        }
//// LISTAR INMUEBLES
//        try {
//            PropiedadInmuebleData propieData = new PropiedadInmuebleData();
//            List<PropiedadInmueble> listaInmuebles = propieData.listarInmuebles();//<una lista de tipo>nombre de la lista
//            if (!listaInmuebles.isEmpty()) {
//                for (PropiedadInmueble inmueble : listaInmuebles) {
//                    System.out.println("id " + inmueble.getIdInmueble());
//                    System.out.println("Tipo: " + inmueble.getTipoDeLocal());
//                    System.out.println("Direccion: " + inmueble.getDireccion());
//
//                    System.out.println("-------------------");
//                }
//            } else {
//                System.out.println("No existen propiedades disponibles");
//            }
//        } catch (NullPointerException npe) {
//            JOptionPane.showMessageDialog(null, "error no se encuentra  propietario " + npe.getMessage());
//        }
//    }
//}
//LISTAR INMUEBLES PROPIOS (LISTA DE INMUEBLES DE UN PROPIETARIO)
//        PropiedadInmuebleData propieData = new PropiedadInmuebleData();
//
//        List<PropiedadInmueble> listaInmuebles = propieData.ListarInmueblesPropios(6);//<una lista de tipo>nombre de la lista
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
//BUSCAR PROP.INMUEBLE X ID
//        PropiedadInmuebleData inmuData = new PropiedadInmuebleData(); // Asegúrate de crearla adecuadamente
//        // ID del inmueble que deseas buscar
//        //int idInmuebleABuscar = 23; // Cambia este valor al ID que desees buscar
//        // Llama al método buscarInmuebleXid
//        PropiedadInmueble inmuebleEncontrado = inmuData.buscarInmuebleXid(23);
//        if (inmuebleEncontrado != null) {
//            // Muestra la información del inmueble encontrado
//            System.out.println("Inmueble encontrado:");
//            System.out.println("ID: " + inmuebleEncontrado.getIdInmueble());
//            //System.out.println("ID Propietario"+inmuebleEncontrado.getPropietario().getId_propietario());
//            System.out.println("Tipo de local: " + inmuebleEncontrado.getTipoDeLocal());
//            System.out.println("Zona: " + inmuebleEncontrado.getZona());
//            System.out.println("Dirección: " + inmuebleEncontrado.getDireccion());
//            // ... Agrega más campos según sea necesario
//
//            Propietario propietario = inmuebleEncontrado.getPropietario();
//            if (propietario != null) {
//                System.out.println("ID de Propietario: " + propietario.getId_propietario());
//            } else {
//                System.out.println("Propietario no encontrado.");
//            }
//            // ... Agrega más campos según sea necesario
//        } else {
//            System.out.println("No se encontró ningún inmueble con el ID proporcionado.");
//        }
//   }
//}
//*********************************************************************************
//CONTRATO DE ALQUILER DATA
//CREAR CONTRATO
        InquilinoData nuevo = new InquilinoData();
        Inquilino encontrado = nuevo.buscarInquilinoPorid(5);
        System.out.println("" + encontrado.getApellido());

        PropiedadInmuebleData nueva = new PropiedadInmuebleData();
        PropiedadInmueble encontrada = nueva.buscarInmuebleXid(12);
        System.out.println("" + encontrada.getIdInmueble());
        ContratoAlquiler nc = new ContratoAlquiler(encontrado, LocalDate.of(2023, 1, 11), LocalDate.of(2026, 1, 11), 40000.00, encontrada, "galpon", "1");
        ContratoAquilerData generado = new ContratoAquilerData();
        generado.crearContrato(nc);
//LISTAR CONTRATOS VIGENTES***************
//        ContratoAquilerData  nueva= new ContratoAquilerData();
//        List<ContratoAlquiler> listaContratos = nueva.listarContratosVigentes(2);
//        if (!listaContratos.isEmpty()){
//            for(ContratoAlquiler iterador:listaContratos  ){
//                System.out.println("id contrato alquiler: "+ iterador.getId_contrato());
//                System.out.println("id inquilino: "+ iterador.getInquilino());
//                System.out.println("id propiedad: "+ iterador.getIdpropiedad().getIdInmueble());
//                System.out.println("fecha de inicio: "+ iterador.getFechaInicio());
//                System.out.println("fecha vencimiento: "+ iterador.getFechaFinal());
//                System.out.println("monto del alquiler: "+ iterador.getMontoAlquilerPesos());
//                System.out.println("detalle: "+ iterador.getDetalles());
//                System.out.println("estado: "+ iterador.getEstado());
//                
//                System.out.println("*************__________________*************");
//            }
//            
//        }
//        else {
//            System.out.println("no existen contratos vigentes");
//        }
//BUSCAR POR CRITERIOS MULTIPLES
//        PropiedadInmuebleData inmuebleData = new PropiedadInmuebleData();
//        PropiedadInmueble inmuebleEncontrado = inmuebleData.buscarInmueblePorCriterios("Casa", "Zona A", 200, 150000);
//        if (inmuebleEncontrado != null) {
//            System.out.println("ID: " + inmuebleEncontrado.getIdInmueble() + "\n Tipo Local: " + inmuebleEncontrado.getTipoDeLocal() + "\n Zona: " + inmuebleEncontrado.getZona() + "\n Superficie: " + inmuebleEncontrado.getSuperficie() + "\n Precio Base: " + inmuebleEncontrado.getPrecioTasado());
//        } else {
//            System.out.println("No se encontró el criterio deseado");
//LISTAR POR CRITERIO
//            try {
//                PropiedadInmuebleData propiedadBuscada = new PropiedadInmuebleData();
//                List<PropiedadInmueble> listarBuscado = propiedadBuscada.listarInmueblesPorCriterios("Casa", "Zona A", 200, 150000, 6);
//                //propiedadBuscada.buscarInmueblePorCriterios("Casa", "Zona A", 200, 150000);
//                if (!listarBuscado.isEmpty()) {
//                    for (PropiedadInmueble propiedadinmueble : listarBuscado) {
//                        System.out.println(propiedadinmueble.getIdInmueble() + "\n" + propiedadinmueble.getTipoDeLocal() + "\n");
//                        System.out.println(propiedadinmueble.getZona() + "\n" + propiedadinmueble.getDireccion() + "\n");
//                        System.out.println(propiedadinmueble.getPrecioTasado());
//                        System.out.println("---------------------------------");
//                    }
//                } else {
//                    System.out.println("No exite inmueble");
//                }
//            } catch (NullPointerException npe) {
//                JOptionPane.showMessageDialog(null, "Error no se encuentra propietario " + npe.getMessage());
//            }
//        }
//    }
//BUSCAR POR CRITERIOS
//        PropiedadInmuebleData inmuebleData = new PropiedadInmuebleData();
//        PropiedadInmueble inmuebleEncontrado = inmuebleData.buscarInmueblePorCriterios("Casa", "Zona A", 200, 150000);
//        if (inmuebleEncontrado != null) {
//            System.out.println("ID: " + inmuebleEncontrado.getIdInmueble() + "\n Tipo Local: " + inmuebleEncontrado.getTipoDeLocal() + "\n Zona: " + inmuebleEncontrado.getZona() + "\n Superficie: " + inmuebleEncontrado.getSuperficie() + "\n Precio Base: " + inmuebleEncontrado.getPrecioTasado());
//        } else {
//            System.out.println("No se encontró el criterio deseado");
//    
//LISTAR POR PRECIO BASE EN RANGO
//            PropiedadInmuebleData PrecioBase = new PropiedadInmuebleData();
//            List<PropiedadInmueble> ListarPrecio = PrecioBase.listarInmueblesPorPrecioBaseEnRango(10000, 90000);
//            if (!ListarPrecio.isEmpty()) {
//                for (PropiedadInmueble propiedadinmueble : ListarPrecio) {
//                    System.out.println("\nZona: " + propiedadinmueble.getZona() + 
//                            "\nPrecio Base: " + propiedadinmueble.getPrecioTasado() + 
//                            "\nDireccion: " + propiedadinmueble.getDireccion()
//                            + "\nTipo Local: " + propiedadinmueble.getTipoDeLocal());
//                    System.out.println("--------------------------------------");
//                }
//
//            }
//        }
//    }
    }
}
