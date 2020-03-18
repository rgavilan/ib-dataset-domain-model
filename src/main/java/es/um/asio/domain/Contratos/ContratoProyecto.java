package es.um.asio.domain.Contratos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContratoProyecto extends DataSetDataBase {  
    private String idDocumento;
    private Long codigoTipoContratoProyecto;
    private String tituloContrato;
    private Long idTerceroContratante;
    private String tipoConfidencialidad;
    private String propiedadResultados;
    private Float importeBase;
    private Float importeInfraestructura;
    private Float importe;
    private String codTipoMoneda;
    private String ccBancariaAbono;
    private String fechaAutorizacion;
    private String fechaFirma;
    private String fechaFinEjecucion;
    private String fechaFinGestion;
    private String fechaFinFacturacion;
    private String convocatoriaPublica;
    private String retencionGarantia;
    private String mediacion;
    private String idTerceroMediadora;
    private String importeGarantia;
    private String fechaDevolucionGarantia;
}
