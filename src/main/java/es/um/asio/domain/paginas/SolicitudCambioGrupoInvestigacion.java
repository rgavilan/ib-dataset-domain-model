package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SolicitudCambioGrupoInvestigacion extends DataSetDataBase {  
    private long solinNumero;
    private String solinDeptCodigo;
    private long solinGrinCodigo;
    private Long investigadorPrincipal;
    private Long investigadorSolicitud;
    private String solinFechaSolicita;
    private String solinFCad;
    private String status;
    private Float solinEdp;
    private String solinEstado;
}