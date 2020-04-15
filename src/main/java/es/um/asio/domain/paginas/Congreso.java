package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Congresos.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Congreso extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field CONG_NUMERO.
     */
    private long congNumero;
    
    /**
     * Mapping of field TIPO_PARTICIPACION.
     */
    private Long tipoParticipacion;
    
    /**
     * Mapping of field TITULO_CONTRIBUCION.
     */
    private String tituloContribucion;
    
    /**
     * Mapping of field TITULO_CONGRESO.
     */
    private String tituloCongreso;
    
    /**
     * Mapping of field FECHA_CELEBRACION.
     */
    private String fechaCelebracion;
    
    /**
     * Mapping of field LUGAR_CELEBRACION.
     */
    private String lugarCelebracion;
    
    /**
     * Mapping of field CONGRESO_INTERNACIONAL.
     */
    private String congresoInternacional;
}
