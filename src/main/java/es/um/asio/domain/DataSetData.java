package es.um.asio.domain;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Interface representing generic data set data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public interface DataSetData {
    
    /**
     * Gets the version of DataSetData
     *
     * @return the version
     */
    long getVersion();
    
    /**
     * Sets the version of DataSetData
     *
     * @param id the new version
     */
    void setVersion(long id);
}
