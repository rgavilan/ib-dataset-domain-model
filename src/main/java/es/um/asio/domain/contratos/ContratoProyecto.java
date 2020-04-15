package es.um.asio.domain.contratos;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Contratos proyectos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ContratoProyecto extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field IDDOCUMENTO.
     */
    private String idDocumento;
    
    /**
     * Mapping of field CODIGOTIPOCONTRATOPROYECTO.
     */
    private Long codigoTipoContratoProyecto;
    
    /**
     * Mapping of field TITULOCONTRATO.
     */
    private String tituloContrato;
    
    /**
     * Mapping of field IDTERCEROCONTRATANTE.
     */
    private Long idTerceroContratante;
    
    /**
     * Mapping of field TIPOCONFIDENCIALIDAD.
     */
    private String tipoConfidencialidad;
    
    /**
     * Mapping of field PROPIEDADRESULTADOS.
     */
    private String propiedadResultados;
    
    /**
     * Mapping of field IMPORTEBASE.
     */
    private Float importeBase;
    
    /**
     * Mapping of field IMPORTEINFRAESTRUCTURA.
     */
    private Float importeInfraestructura;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field CCBANCARIAABONO.
     */
    private String ccBancariaAbono;
    
    /**
     * Mapping of field FECHAAUTORIZACION.
     */
    private String fechaAutorizacion;
    
    /**
     * Mapping of field FECHAFIRMA.
     */
    private String fechaFirma;
    
    /**
     * Mapping of field FECHAFINEJECUCION.
     */
    private String fechaFinEjecucion;
    
    /**
     * Mapping of field FECHAFINGESTION.
     */
    private String fechaFinGestion;
    
    /**
     * Mapping of field FECHAFINFACTURACION.
     */
    private String fechaFinFacturacion;
    
    /**
     * Mapping of field CONVOCATORIAPUBLICA.
     */
    private String convocatoriaPublica;
    
    /**
     * Mapping of field RETENCIONGARANTIA.
     */
    private String retencionGarantia;
    
    /**
     * Mapping of field MEDIACION.
     */
    private String mediacion;
    
    /**
     * Mapping of field IDTERCEROMEDIADORA.
     */
    private String idTerceroMediadora;
    
    /**
     * Mapping of field IMPORTEGARANTIA.
     */
    private String importeGarantia;
    
    /**
     * Mapping of field FECHADEVOLUCIONGARANTIA.
     */
    private String fechaDevolucionGarantia;
}
