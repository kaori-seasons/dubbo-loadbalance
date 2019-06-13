package org.apache.dubbo.remoting.transport;

/**
 * @author daofeng.xjf
 */
public class RequestLimitException extends RuntimeException {
    public RequestLimitException(String errorMessage) {
        super(errorMessage);
    }
}
