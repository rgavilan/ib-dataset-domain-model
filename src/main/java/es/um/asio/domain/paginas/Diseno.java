package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Diseno extends DataSetDataBase {  
    private long diseCodigo;
    private String diseDescripcion;
    private String diseFecha;
    private long diseTdisCodigo;
    private Long diseCalidades;
}