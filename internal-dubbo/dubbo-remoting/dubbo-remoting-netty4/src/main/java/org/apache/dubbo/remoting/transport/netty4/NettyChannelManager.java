package org.apache.dubbo.remoting.transport.netty4;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NettyChannelManager {

    private static Map<String, NettyChannel> channelMap = new ConcurrentHashMap<>();

    public static void addChannel(NettyChannel nettyChannel) {
        InetSocketAddress remoteAddress = nettyChannel.getRemoteAddress();
        String addressKey = remoteAddress.getHostName() + ":" + remoteAddress.getPort();
        channelMap.putIfAbsent(addressKey, nettyChannel);
    }

    public static void removeChannel(NettyChannel nettyChannel) {
        InetSocketAddress remoteAddress = nettyChannel.getRemoteAddress();
        String addressKey = remoteAddress.getHostName() + ":" + remoteAddress.getPort();
        channelMap.remove(addressKey);
    }

    /**
     * ip:port
     * @param address
     * @return
     */
    public static NettyChannel getChannel(String address) {
        return channelMap.get(address);
    }

}
