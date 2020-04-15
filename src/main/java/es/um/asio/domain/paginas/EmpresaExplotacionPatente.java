package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.OperationableDataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Empresas explota patentes.xml"
 */
@Entity(name = "empresaExplotacionPatente_paginas")
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class EmpresaExplotacionPatente extends OperationableDataSetDataBase {  
    
    /**
     * Mapping of field EPAT_PATE_NUMERO.
     */
    private long epatPateNumero;
    
    /**
     * Mapping of field EPAT_ENTI_CODIGO.
     */
    private long epatEntiCodigo;
    
    /**
     * Mapping of field EPAT_OBSERVACIONES.
     */
    private String epatObservaciones;
}