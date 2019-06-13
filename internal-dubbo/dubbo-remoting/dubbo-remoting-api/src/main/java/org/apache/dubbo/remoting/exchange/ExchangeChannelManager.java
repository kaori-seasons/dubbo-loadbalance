package org.apache.dubbo.remoting.exchange;

import org.apache.dubbo.common.extension.SPI;

@SPI
public interface ExchangeChannelManager {

    void addChannel(ExchangeChannel exchangeChannel);

    void removeChannel(String address);

    void getChannel(String address);

}
