package es.um.asio.domain.goliat;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Dedicacion investigador.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class DedicacionInvestigador extends DataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field ID_PROYECTO.
     */
    private Long idProyecto;
    
    /**
     * Mapping of field EJERCICIO.
     */
    private long ejercicio;
    
    /**
     * Mapping of field HORAS_TOTALES.
     */
    private Float horasTotales;
    
    /**
     * Mapping of field PORCENTAJE_INVESTIGAR.
     */
    private Float porcentajeInvestigar;
    
    /**
     * Mapping of field AUTO.
     */
    private String auto;
}
