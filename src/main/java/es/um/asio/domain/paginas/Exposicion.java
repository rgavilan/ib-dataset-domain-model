package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Exposicion extends DataSetDataBase {  
    private long codigo;
    private String nombre;
    private String fecha;
    private String lugar;
    private String tipo;
    private Long calidades;
    private String incorporarACvn;
}