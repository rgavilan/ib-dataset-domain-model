package es.um.asio.domain.ayudas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Anualidades financiacion registros ayudas definitivas.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class AnualidadFinanciacionRegistroAyudaDefinitiva extends DataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field NUMEROLINEAFINANCIACION.
     */
    private Long numeroLineaFinanciacion;
    
    /**
     * Mapping of field CODIGOTIPOFINANCIACION.
     */
    private String codigoTipoFinanciacion;
    
    /**
     * Mapping of field CODIGOTIPOFUENTE.
     */
    private String codigoTipoFuente;
    
    /**
     * Mapping of field NUMEROANUALIDAD.
     */
    private Long numeroAnualidad;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}
