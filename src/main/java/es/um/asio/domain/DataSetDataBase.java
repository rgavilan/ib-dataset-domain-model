package es.um.asio.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * The class of representing generic data set data.
 */
@Getter
@Setter
public abstract class DataSetDataBase implements DataSetData {
    
    /**
     * The version of DataSetData.
     */
    private long version;
}
