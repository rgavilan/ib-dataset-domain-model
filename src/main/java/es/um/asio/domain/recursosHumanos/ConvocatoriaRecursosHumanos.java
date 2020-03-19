package es.um.asio.domain.recursosHumanos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ConvocatoriaRecursosHumanos extends DataSetDataBase {  
    private long idConvocatoriaRecursoHumano;
    private String descripcion;
    private long idEmpresaFinanciadora;
    private String referenciaConvocatoria;
    private String fechaConvocatoria;
    private String fechaAlegacion;
    private String fechaPublicacionBoletin;
    private String observaciones;
}
