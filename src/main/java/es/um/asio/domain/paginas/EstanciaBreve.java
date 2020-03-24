package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EstanciaBreve extends DataSetDataBase {  
    private long estaSolbNumero;
    private long estaNumero;
    private Long idPersona;
    private String solbTituProyecto;
    private Long estaPaisCodigo;
    private Long estaComCodigo;
    private String estaCiudad;
    private String estaCentro;
    private Long idPersona_1;
    private Long duracionPrevista;
    private String estaFechaIdaPrevis;
    private Float estaPresupViaje;
    private String estaObjetoEstancia;
    private Float estaConcedidoEstancia;
    private Float estaTotConcedido;
    private String estaEstado;
}