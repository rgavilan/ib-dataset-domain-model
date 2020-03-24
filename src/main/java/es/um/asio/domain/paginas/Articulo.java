package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Articulo extends DataSetDataBase {  
    private long codigo;
    private String titulo;
    private Long ano;
    private Long paisCodigo;
    private String reisIssn;
    private String catalago;
    private Long area;
    private String nombreRevista;
    private Long cuartilRevista;
    private String urlRevista;
    private String volumen;
    private Long numero;
    private Long pagDesde;
    private Long pagHasta;
    private Long numPag;
    private String coautExt;
}
