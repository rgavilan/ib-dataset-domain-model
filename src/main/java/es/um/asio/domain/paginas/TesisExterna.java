package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TesisExterna extends DataSetDataBase {  
    private long tesiCodigo;
    private String tesiDniAutor;
    private String tesiTituloTesis;
    private String tesiPremio;
    private String tesiMencioEuro;
    private String tesiFechaLectura;
    private String tesiUnivNombre;
    private Long tesiAreaCodigoTob;
    private Long tesiAreaCodigoTop;
    private Long tesiEstuEstudioEnt;
    private Long tesiEstuEstudioSal;
    private Long tesiUnarCodigo;
    private Long tesiUncaCodigo;
    private Long tesiUnesCodigo;
    private Long tesiUnarCodigo2;
    private Long tesiUncaCodigo2;
    private Long tesiUnesCodigo2;    
}