package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Alegacion extends DataSetDataBase {  
    private long numero;
    private long codTipo;
    private String titulo;
    private long idPersona;
    private String motivo;
    private String texto;
    private String resuelveText;
    private String fecha;
    private String estado;
}
