package es.um.asio.domain.exitStatus;

/**
 * The Enum that represents the Exit Status
 */
public enum ExitStatusCode {

    /**
     * Unknown code.
     */
    UNKNOWN, 
    
    /**
     * Executing code.
     */
    EXECUTING, 
    
    /**
     * Completed code.
     */
    COMPLETED, 
    
    /**
     * Noop code.
     */
    NOOP, 
    
    /**
     * Failed code.
     */
    FAILED, 
    
    /**
     * Stopped code.
     */
    STOPPED;

}
