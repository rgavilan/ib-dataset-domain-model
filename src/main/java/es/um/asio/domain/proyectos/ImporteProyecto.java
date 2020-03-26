package es.um.asio.domain.proyectos;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Importes proyectos.xml"
 */
@Getter
@Setter
@ToString
public class ImporteProyecto extends DataSetDataBase {  
    
    /**
     * Mapping of field IDPROYECTO.
     */
    private long idProyecto;
    
    /**
     * Mapping of field NUMERO.
     */
    private long numero;
    
    /**
     * Mapping of field CODTIPOMONEDA.
     */
    private String codTipoMoneda;
    
    /**
     * Mapping of field IMPORTESOLICITADO.
     */
    private Float importeSolicitado;
    
    /**
     * Mapping of field IMPORTECONCEDIDO.
     */
    private Float importeConcedido;
    
    /**
     * Mapping of field IMPORTEINFRAESTRUCTURASOLI.
     */
    private Float importeInfraestructuraSoli;
    
    /**
     * Mapping of field IMPORTEINFRAESTRUCTURACONCE.
     */
    private Float importeInfraestructuraConce;
    
    /**
     * Mapping of field IMPORTEGLOBAL.
     */
    private Float importeGlobal;
    
    /**
     * Mapping of field IMPORTE.
     */
    private Float importe;
}
