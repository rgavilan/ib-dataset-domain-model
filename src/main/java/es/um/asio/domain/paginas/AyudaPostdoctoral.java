package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AyudaPostdoctoral extends DataSetDataBase {  
    private long solayNumero;
    private Long idPersona;
    private Long idPersonaDirector;
    private Long solayCodigoTesisSiva;
    private String tinaFecha;
    private String tinaCalificacion;
    private String tinaTitulo;
    private String solayFecIniPreDoc;
    private String solayFecFinPreDoc;
    private Long solaySolbNPostDoc;
    private String solayFecConvPostDoc;
    private String solayEntidadConvPostDoc;
    private String solayEstado;
}
