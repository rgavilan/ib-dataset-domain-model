package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Patentes.xml"
 */
@Entity(name = "patente_paginas")
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class Patente extends DataSetDataBase {  
    
    /**
     * Mapping of field PATE_NUMERO.
     */
    private long pateNumero;
    
    /**
     * Mapping of field PATE_TITULO.
     */
    private String pateTitulo;
    
    /**
     * Mapping of field PATE_TIPO.
     */
    private String pateTipo;
    
    /**
     * Mapping of field PATE_FSOLICITUD.
     */
    private String pateFSolicitud;
    
    /**
     * Mapping of field PATE_REFERENCIA.
     */
    private String pateReferencia;
    
    /**
     * Mapping of field PATE_FCONCESION.
     */
    private String pateFConcesion;
    
    /**
     * Mapping of field PATE_FPRIORIDAD.
     */
    private String pateFPrioridad;
    
    /**
     * Mapping of field PATE_PAIS_PI.
     */
    private String patePaisPi;
    
    /**
     * Mapping of field PATE_EJER_PI.
     */
    private String pateEjerPi;
    
    /**
     * Mapping of field PATE_NUME_PI.
     */
    private String pateNumePi;
    
    /**
     * Mapping of field PATE_AGENTE.
     */
    private String pateAgente;
    
    /**
     * Mapping of field PATE_ENTI_CODIGO.
     */
    private String pateEntiCodigo;
    
    /**
     * Mapping of field PATE_ENTIDADTITULAR.
     */
    private String pateEntidadTitular;
    
    /**
     * Mapping of field PATE_SECT_CODIGO.
     */
    private Long pateSectCodigo;
}