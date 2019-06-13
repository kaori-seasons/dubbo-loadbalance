package com.aliware.tianchi.policy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import com.aliware.tianchi.ThrashConfig;

/**
 * @author guohaoice@gmail.com
 */
public class SmallConfig extends BaseConfig {
    private final int maxConcurrency = 180;
    private final int normalCurrency = 150;
    private final int minConcurrency = 100;
    private final ThrashConfig warmUp = new ThrashConfig(warmUpInSec + onePeriodInSec, maxConcurrency, normalRTTInMs);
    private final ThrashConfig max = new ThrashConfig(onePeriodInSec, maxConcurrency, minRTTInMs);
    private final ThrashConfig normal = new ThrashConfig(onePeriodInSec, normalCurrency, normalRTTInMs);
    private final ThrashConfig min = new ThrashConfig(onePeriodInSec, minConcurrency, maxRTTInMs);

    private final List<ThrashConfig> allConfig = Collections.unmodifiableList(Arrays.asList(warmUp, min, normal, max));

    public SmallConfig() {
        super(200, 20880);
    }

    @Override
    public List<ThrashConfig> getConfigs() {
        return allConfig;
    }
}
