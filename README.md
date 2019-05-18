#SpringBootLog篇

##目标
1.测试SpringBoot默认日志框架

2.替换为Log4j2框架,切换日志框架

3.测试日志输出到文件及SpringBoot高级功能

##Q&A

Q:无法产生SpringBoot.log日志文件?

A:放进带有SpringBoot的注解文件就产生了。


##结论心得

    *logging.path指定路径，logging.file指定当前项目下的文件
    *替换日志框架需要将，其他实现框架剔除.加入转换中间包，当然可以直接剔除Loggging加入log4j2starter
    *loggging,pattern.file指定日志输出格式
    *使用logback.xml被logback识别，使用logback-spring.xml被springboot识别，可使用高级功能Profile
    
