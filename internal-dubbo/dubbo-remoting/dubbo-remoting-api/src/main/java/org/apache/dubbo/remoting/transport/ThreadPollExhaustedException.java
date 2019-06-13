package org.apache.dubbo.remoting.transport;

/**
 * @author daofeng.xjf
 */
public class ThreadPollExhaustedException extends RuntimeException {
    public ThreadPollExhaustedException(String message) {
        super(message);
    }
}
