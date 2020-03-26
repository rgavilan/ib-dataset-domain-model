package es.um.asio.domain.ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Amortizaciones financiacion registros ayudas definitivas.xml"
 */
@Getter
@Setter
@ToString
public class AmortizacionFinanciacionRegistroAyudaDefinitiva extends DataSetDataBase {  
    
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
     * Mapping of field NUMEROPAGO.
     */
    private Long numeroPago;
    
    /**
     * Mapping of field FECHALIMITEAMORTIZACION.
     */
    private String fechaLimiteAmortizacion;
    
    /**
     * Mapping of field IMPORTECAPITAL.
     */
    private String importeCapital;
    
    /**
     * Mapping of field IMPORTEINTERESES.
     */
    private String importeIntereses;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}
