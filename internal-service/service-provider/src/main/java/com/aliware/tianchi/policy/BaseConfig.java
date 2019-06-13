package com.aliware.tianchi.policy;

import java.util.List;
import com.aliware.tianchi.ThrashConfig;

/**
 * @author guohaoice@gmail.com
 */
public abstract class BaseConfig {
    final int onePeriodInSec = 15;
    final int warmUpInSec = 35;
    final int minRTTInMs = 45;
    final int normalRTTInMs = 50;
    final int maxRTTInMs = 55;
    private final int maxThreadCount;
    private final int port;

    protected BaseConfig(int maxThreadCount, int port) {
        this.maxThreadCount = maxThreadCount;
        this.port = port;
    }

    public int getMaxThreadCount() {
        return maxThreadCount;
    }

    public int getPort() {
        return port;
    }

    public abstract List<ThrashConfig> getConfigs();
}
