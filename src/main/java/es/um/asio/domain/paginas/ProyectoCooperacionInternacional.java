package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Proyectos cooperacion internacional.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ProyectoCooperacionInternacional extends OperationableDataSetDataBase {  
    
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