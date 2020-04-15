package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Estancias.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Estancia extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field CENTRO.
     */
    private String centro;
    
    /**
     * Mapping of field LOCALIDAD.
     */
    private String localidad;
    
    /**
     * Mapping of field PAIS.
     */
    private Long pais;
    
    /**
     * Mapping of field FECHA_INI.
     */
    private String fechaIni;
    
    /**
     * Mapping of field FECHA_FIN.
     */
    private String fechaFin;
    
    /**
     * Mapping of field TEMA.
     */
    private String tema;
    
    /**
     * Mapping of field CLAVE.
     */
    private String clave;
}