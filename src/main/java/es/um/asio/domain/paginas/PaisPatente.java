package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Paises patentes.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class PaisPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field PAIP_PATE_NUMERO.
     */
    private long paipPateNumero;
    
    /**
     * Mapping of field PAIP_PAIS_CODIGO.
     */
    private long paipPaisCodigo;
    
    /**
     * Mapping of field PAIS_NOMBRE.
     */
    private String paisNombre;
    
    /**
     * Mapping of field PAIP_PRIORITARIO.
     */
    private String paipPrioritario;
}