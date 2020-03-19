package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SolicitudRecursosHumanos extends DataSetDataBase {  
    private String idDocumento;
    private Long idPersonaSolicitante;
    private Long idConvocatoriaRecursoHumano;
    private String descripcionConvocatoria;
    private String referenciaConvocatoria;
    private Long idSubprograma;
    private String descripcionSubprograma;
    private Long idUnidadRecursoHumano;
    private String descripcionUnidadRecursoHumano;
    private Long idTerceroConvocante;
    private String fechaConvocatoria;
    private String universidad;
    private String codigoPaisUniversidad;
    private String estudiosReconocidos;
    private Long anioFinEstudios;
    private Long codigoTitulacion;
    private Long idPersonaDirector;
    private String titulo;
    private String objetivos;
    private String metodologia;
    private String cronograma;
}
