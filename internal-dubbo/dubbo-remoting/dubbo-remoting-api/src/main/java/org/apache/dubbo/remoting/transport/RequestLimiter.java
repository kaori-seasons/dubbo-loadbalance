package org.apache.dubbo.remoting.transport;

import org.apache.dubbo.common.extension.SPI;
import org.apache.dubbo.remoting.exchange.Request;

import java.util.concurrent.ExecutorService;

/**
 * @author daofeng.xjf
 */
@SPI
public interface RequestLimiter {

    boolean tryAcquire(Request request, int activeTaskCount);

}
