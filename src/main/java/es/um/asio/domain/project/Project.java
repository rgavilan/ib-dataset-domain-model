package es.um.asio.domain.project;

import es.um.asio.domain.DataSetDataBase;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Project data set POJO
 */
@Getter
@Setter
@ToString
public class Project extends DataSetDataBase {
    /**
     * Project ID
     */
    private Long projectId;
    
    /**
     * project name
     */
    private String name;
    
    /**
     * Finalist project
     */
    private String finalistProject;
    
    /**
     * Limitative
     */
    private String limitative;
}
