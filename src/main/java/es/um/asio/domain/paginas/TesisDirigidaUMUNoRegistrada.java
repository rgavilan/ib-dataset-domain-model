package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TesisDirigidaUMUNoRegistrada extends DataSetDataBase {  
    private long tesiCodigo;
    private String tesiDniAutor;
    private String tesiTituloTesis;
    private String tesiPremio;
    private String tesiMencionEuro;
    private String tesiFechaLectura;
    private String tesiUnivNombre;
    private Long tesiAreaCodigoTob;
    private String tesiAreaCodigoTop;
    private String tesiEstuEstudioEnt;
    private Long tesiEstuEstudioSal;
    private Long tesiUnarCodigo;
    private Long tesiUncaCodigo;
    private Long tesiUnesCodigo;
    private Long tesiUnarCodigo2;
    private Long tesiUncaCodigo2;
    private Long tesiUnesCodigo2;
}