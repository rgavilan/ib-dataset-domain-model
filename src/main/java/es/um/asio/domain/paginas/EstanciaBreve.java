package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class EstanciaBreve.
 */
@Getter
@Setter
@ToString
public class EstanciaBreve extends DataSetDataBase {  
    
    /**
     * Mapping of field ESTA_SOLB_NUMERO.
     */
    private long estaSolbNumero;
    
    /**
     * Mapping of field ESTA_NUMERO.
     */
    private long estaNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private Long idPersona;
    
    /**
     * Mapping of field SOLB_TITUPROYECTO.
     */
    private String solbTituProyecto;
    
    /**
     * Mapping of field ESTA_PAIS_CODIGO.
     */
    private Long estaPaisCodigo;
    
    /**
     * Mapping of field ESTA_COM_CODIGO.
     */
    private Long estaComCodigo;
    
    /**
     * Mapping of field ESTA_CIUDAD.
     */
    private String estaCiudad;
    
    /**
     * Mapping of field ESTA_CENTRO.
     */
    private String estaCentro;
    
    /**
     * Mapping of field IDPERSONA_1.
     */
    private Long idPersona1;
    
    /**
     * Mapping of field DURACION_PREVISTA.
     */
    private Long duracionPrevista;
    
    /**
     * Mapping of field ESTA_FECHAIDAPREVIS.
     */
    private String estaFechaIdaPrevis;
    
    /**
     * Mapping of field ESTA_PRESUPVIAJE.
     */
    private Float estaPresupViaje;
    
    /**
     * Mapping of field ESTA_OBJETO_ESTANCIA.
     */
    private String estaObjetoEstancia;
    
    /**
     * Mapping of field ESTA_CONCEDIDOESTANCIA.
     */
    private Float estaConcedidoEstancia;
    
    /**
     * Mapping of field ESTA_TOTCONCEDIDO.
     */
    private Float estaTotConcedido;
    
    /**
     * Mapping of field ESTA_ESTADO.
     */
    private String estaEstado;
}