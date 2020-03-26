package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Proyectos cooperacion internacional.xml"
 */
@Getter
@Setter
@ToString
public class ProyectoCooperacionInternacional extends DataSetDataBase {  
    
    /**
     * Mapping of field PROYECTO.
     */
    private long proyecto;
    
    /**
     * Mapping of field IDENTIFICADOR.
     */
    private String identificador;
    
    /**
     * Mapping of field TITULO.
     */
    private String titulo;
    
    /**
     * Mapping of field FECINICIO.
     */
    private String fecInicio;
    
    /**
     * Mapping of field FECFIN.
     */
    private String fecFin;
    
    /**
     * Mapping of field PCIN_PORCENTAJE.
     */
    private Long pcInPorcentaje;
}