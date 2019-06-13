# dubbo-UniformityHashSelector
对dubbo自适应负载均衡的设计实现进行优先随机负载


# 试想是这样的

>基于dubbo本身基于随机的负载均衡


- 随机策略会先判断所有的 Invoker 的权重是不是一样的
- 如果都是一样的，那么处理就比较简单了。使用random.nexInt(length)就可以随机生成一个 Invoker 的序号
- 根据序号选择对应的 Invoker 。如果没有对服务 Provider 设置权重，那么所有的 Invoker 的权重就是一样的，默认是100。 
- 如果权重不一样，那就需要结合权重来设置随机概率了

>改造后的随机负载均衡
- 从本地当前注册的provider服务中获取一个服务的地址，如果与当前机器的ip相同，则优先获取这个provider
- 如果不同则重新进行随机负载，重新获取一个provider服务
