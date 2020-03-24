package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Estancia extends DataSetDataBase {  
    private long idPersona;
    private String centro;
    private String localidad;
    private Long pais;
    private String fechaIni;
    private String fechaFin;
    private String tema;
    private String clave;
}