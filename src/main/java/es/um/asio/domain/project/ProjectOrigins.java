package es.um.asio.domain.project;

import es.um.asio.domain.DataSetData;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
public class ProjectOrigins implements DataSetData {
    /**
     * Origin project ID
     */
    private Long originProjectId;
    
    /**
     * project description
     */
    private String description;
    
}
