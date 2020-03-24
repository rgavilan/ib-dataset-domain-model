package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ComiteEditorial extends DataSetDataBase {  
    private String reisIssn;
    private String reisElectronica;
    private String reisTitulo;
    private String reisInreCodigo;
    private String reisUrl;
    private Long reisQuartile;
    private Float reisImpacto;
    private Long reisCritCalidad;
    private String inreDescripcion;
    private String reisCategory;
}
