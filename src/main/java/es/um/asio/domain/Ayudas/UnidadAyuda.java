package es.um.asio.domain.Ayudas;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UnidadAyuda extends DataSetDataBase {  
    private long idUnidadAyuda;
    private long idConvocatoriaAyuda;
    private long idSubprograma;
    private String codTipoAyuda;
    private String codTipoCategoria;
    private String fechaInicioSolicitudes;
    private String fechaFinSolicitudes;
    private String fechaAlegacion;
    private String fechaResolucion;
    private String fechaAlegacion_1;
    private String fechaFase1;
    private String fechaFase2;
    private String codTipoMoneda;
    private String importeMinimo;
    private String importeMaximo;
    private String interesMinimo;
    private String interesMaximo;
    private String anualidades;
    private String controlAnualidades;
    private String observaciones;
}
