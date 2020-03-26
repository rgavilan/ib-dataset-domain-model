package es.um.asio.domain.paginas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Ayudas iniciacion.xml"
 */
@Getter
@Setter
@ToString
public class AyudaIniciacion extends DataSetDataBase {  
    
    /**
     * Mapping of field BISO_NUMERO.
     */
    private long bisoNumero;
    
    /**
     * Mapping of field SOLICITANTE.
     */
    private Long solicitante;
    
    /**
     * Mapping of field BISO_TITULO.
     */
    private String bisoTitulo;
    
    /**
     * Mapping of field BISO_OBJETIVOS.
     */
    private String bisoObjetivos;
    
    /**
     * Mapping of field BISO_METODOLOGIA.
     */
    private String bisoMetodologia;
    
    /**
     * Mapping of field BISO_CRONOGRAMA.
     */
    private String bisoCronograma;
    
    /**
     * Mapping of field TUTOR.
     */
    private Long tutor;
    
    /**
     * Mapping of field BISO_COD_TITULACION.
     */
    private Long bisoCodTitulacion;
    
    /**
     * Mapping of field BISO_COD_POSGRADO.
     */
    private Long bisoCodPosgrado;
    
    /**
     * Mapping of field BISO_PUNTOSEXPEDIENTE.
     */
    private Float bisoPuntosExpediente;
    
    /**
     * Mapping of field BISO_PUNTOSMASTER.
     */
    private Float bisoPuntosMaster;
    
    /**
     * Mapping of field BISO_ALEGA_NOTAMEDIA.
     */
    private String bisoAlegaNotaMedia;
    
    /**
     * Mapping of field BISO_COEFPONDERACION.
     */
    private Float bisoCoefPonderacion;
    
    /**
     * Mapping of field BISO_COEFPONDERACION_MASTER.
     */
    private Float bisoCoefPonderacionMaster;
    
    /**
     * Mapping of field BISO_ALEGA_COEFPONDERA.
     */
    private String bisoAlegaCoefPondera;
    
    /**
     * Mapping of field BISO_N_ALUINTERNO.
     */
    private Long bisoNAluInterno;
    
    /**
     * Mapping of field BISO_PUNTOSALUMINTERNO.
     */
    private Float bisoPuntosAlumInterno;
    
    /**
     * Mapping of field BISO_N_ALUINTERNO_NO_REG.
     */
    private Long bisoNAluInternoNoReg;
    
    /**
     * Mapping of field BISO_ALEGA_ALUINTERNO.
     */
    private String bisoAlegaAluInterno;
    
    /**
     * Mapping of field BISO_MEC.
     */
    private String bisoMec;
    
    /**
     * Mapping of field BISO_PUNTOSCOLABORAMEC.
     */
    private Float bisoPuntosColaboraMec;
    
    /**
     * Mapping of field BISO_MEC_NO_REG.
     */
    private String bisoMecNoReg;
    
    /**
     * Mapping of field BISO_ALEGA_BECAMEC.
     */
    private String bisoAlegaBecaMec;
    
    /**
     * Mapping of field BENEFICIARIO.
     */
    private String beneficiario;
    
    /**
     * Mapping of field BISO_PUNTOSBENEFICIARIO.
     */
    private Float bisoPuntosBeneficiario;
    
    /**
     * Mapping of field EXPEDIENTE_ACADEMICO_PONDERADO.
     */
    private Float expedienteAcademicoPonderado;
    
    /**
     * Mapping of field PUNTUACION_TOTAL.
     */
    private Float puntuacionTotal;
    
    /**
     * Mapping of field BISO_ALEGACIONES.
     */
    private String bisoAlegaciones;
    
    /**
     * Mapping of field BISO_ESTADO.
     */
    private String bisoEstado;
}
