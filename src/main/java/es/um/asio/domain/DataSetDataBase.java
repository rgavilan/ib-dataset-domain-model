package es.um.asio.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class DataSetDataBase implements DataSetData {
    
    /** 
     * The version of DataSetData
     * */
    private long version;
}
