package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UnidadRecursosHumanos extends DataSetDataBase {  
    private long idUnidadRecursoHumano;
    private long idConvocatoriaRecursoHumano;
    private String idSubprograma;
    private String codTipoRecursoHumano;
    private Long idEmpresaGestora;
    private Long idResponsableEconomico;
    private String fechaInicioSolicitudes;
    private String fechaFinSolicitudes;
    private String fechaAlegacion;
    private String plazoPresentacionInformes;
    private String duracionMaxima;
    private String numeroMaximoRecursosHumanos;
    private String movilidad;
    private String observaciones;
}
