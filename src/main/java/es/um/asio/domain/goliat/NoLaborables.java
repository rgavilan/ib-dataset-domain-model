package es.um.asio.domain.goliat;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "No laborables.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class NoLaborables extends DataSetDataBase {  
    
    /**
     * Mapping of field ID.
     */
    private long id;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field FECHA.
     */
    private String fecha;
    
    /**
     * Mapping of field MOTIVO.
     */
    private String motivo;
    
    /**
     * Mapping of field AUTO.
     */
    private String auto;
}
