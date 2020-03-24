package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContratoPostdoctoral extends DataSetDataBase {  
    private long solbNumero;
    private long idPersonaBecario;
    private String solbTituProyecto;
    private String solbObjetivos;
    private String solbObservaciones;
    private String solbEstado;
}
