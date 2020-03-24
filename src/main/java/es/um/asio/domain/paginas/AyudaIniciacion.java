package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AyudaIniciacion extends DataSetDataBase {  
    private long bisoNumero;
    private Long solicitante;
    private String bisoTitulo;
    private String bisoObjetivos;
    private String bisoMetodologia;
    private String bisoCronograma;
    private Long tutor;
    private Long bisoCodTitulacion;
    private Long bisoCodPosgrado;
    private Float bisoPuntosExpediente;
    private Float bisoPuntosMaster;
    private String bisoAlegaNotaMedia;
    private Float bisoCoefPonderacion;
    private Float bisoCoefPonderacionMaster;
    private String bisoAlegaCoefPondera;
    private Long bisoNAluInterno;
    private Float bisoPuntosAlumInterno;
    private Long bisoNAluInternoNoReg;
    private String bisoAlegaAluInterno;
    private String bisoMec;
    private Float bisoPuntosColaboraMec;
    private String bisoMecNoReg;
    private String bisoAlegaBecaMec;
    private String beneficiario;
    private Float bisoPuntosBeneficiario;
    private Float expedienteAcademicoPonderado;
    private Float puntuacionTotal;
    private String bisoAlegaciones;
    private String bisoEstado;
}
