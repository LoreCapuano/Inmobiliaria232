
package inmobiliaria23.entidades;

import java.time.LocalDate;


public class ContratoAlquiler {
    private int id_contrato;
    private Inquilino inquilino;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalDate fechaRealizacion;
    private PropiedadInmueble propiedad;
    private String estado;//vigente=1, no vigente=0, Renovado=renovado
//constructor vacio
    public ContratoAlquiler() {
    }
//constructor completo
    public ContratoAlquiler(int id_contrato, Inquilino inquilino, LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaRealizacion, PropiedadInmueble propiedad, String marca) {
        this.id_contrato = id_contrato;
        this.inquilino = inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRealizacion = fechaRealizacion;
        this.propiedad = propiedad;
        this.estado = estado;
    }
//constructor sin id
    public ContratoAlquiler(Inquilino inquilino, LocalDate fechaInicio, LocalDate fechaFinal, LocalDate fechaRealizacion, PropiedadInmueble propiedad, String marca) {
        this.inquilino = inquilino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRealizacion = fechaRealizacion;
        this.propiedad = propiedad;
        this.estado = estado;
    }

    public int getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(int id_contrato) {
        this.id_contrato = id_contrato;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public PropiedadInmueble getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(PropiedadInmueble propiedad) {
        this.propiedad = propiedad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" + "inquilino=" + inquilino + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", fechaRealizacion=" + fechaRealizacion + '}';
    }
  
    
    
    
}
