package es.um.asio.domain.paginas;

import javax.persistence.Entity;

import es.um.asio.domain.DataSetDataBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Class that represents the mapping of the file "Inventores patentes.xml"
 */
@Entity(name = "inventorpatente_paginas")
@Getter
@Setter
@ToString(includeFieldNames = true)
@EqualsAndHashCode(callSuper = true)
public class InventorPatente extends DataSetDataBase {  
    
    /**
     * Mapping of field INVT_PATE_NUMERO.
     */
    private long invtPateNumero;
    
    /**
     * Mapping of field IDPERSONA.
     */
    private long idPersona;
    
    /**
     * Mapping of field INVT_ORDEN.
     */
    private long invtOrden;
}