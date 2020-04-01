package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Comite editorial.xml"
 */
@Entity
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class ComiteEditorial extends DataSetDataBase {  
    
    /**
     * Mapping of field REIS_ISSN.
     */
    private String reisIssn;
    
    /**
     * Mapping of field REIS_ELECTRONICA.
     */
    private String reisElectronica;
    
    /**
     * Mapping of field REIS_TITULO.
     */
    private String reisTitulo;
    
    /**
     * Mapping of field REIS_INRE_CODIGO.
     */
    private String reisInreCodigo;
    
    /**
     * Mapping of field REIS_URL.
     */
    private String reisUrl;
    
    /**
     * Mapping of field REIS_QUARTILE.
     */
    private Long reisQuartile;
    
    /**
     * Mapping of field REIS_IMPACTO.
     */
    private Float reisImpacto;
    
    /**
     * Mapping of field REIS_CRIT_CALIDAD.
     */
    private Long reisCritCalidad;
    
    /**
     * Mapping of field INRE_DESCRIPCION.
     */
    private String inreDescripcion;
    
    /**
     * Mapping of field REIS_CATEGORY.
     */
    private String reisCategory;
}
