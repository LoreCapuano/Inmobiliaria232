package inmobiliaria23.entidades;

public class TituloMensajes {
    
    private String mensajeTitulo;

    public TituloMensajes() {
    }

    public TituloMensajes(String mensajeTitulo) {
        this.mensajeTitulo = mensajeTitulo;
    }

    public String getMensajeTitulo() {
        return mensajeTitulo;
    }

    public void setMensajeTitulo(String mensajeTitulo) {
        this.mensajeTitulo = mensajeTitulo;
    }
    
    
    public void MostrarTituloMensaje(){
        System.out.println("Mostrando mensaje");
    }
    
}
