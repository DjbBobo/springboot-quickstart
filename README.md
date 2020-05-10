# SpringBoot 快速开发脚手架

## 工程结构

```java
└──com.bo
    └──result
    	└──ResultCodeEnum.java			返回结果类枚举
    	└──R.java				统一返回的结果对象
    └──exception
    	└──GlobalExceptionHandler.java   	全局异常处理类
    	└──CMSException.java			自定义异常类
    └──config
    	└──RedisConfig.java			自定义RedisTemplate<String,Object>配置类
    	└──SwaggerConfiguration.java		knife4j配置类
    └──utils
    	└──RedisUtil.java			封装的Redis工具类
    	└──MailUtil.java			发送邮件工具类
    	└──ExceptionUtil.java			打印异常工具类
    └──controller
    	└──TestController.java			用于测试的controller
    └──pojo
    	└──Userinfo.java			用于测试的实体类
    └──mapper
    	└──UserinfoMapper.java			用于测试的mapper
    
└──test
	└──SpringbootQuickstartApplicationTests.java
    	└──sqlTest():测试能否查询到数据
    	└──redisTest():测试能否成功存取缓存
    	└──mailTest():发送邮件测试
```



## resources目录文件说明

> application.yml：相关的配置项。

当spring.profiles.active=dev，即开发环境下，会将日志打印在控制台；当其=proc，即生产环境下，会将日志输出在指定目录的文件中，具体设置可在logback-spring.xml中修改。

```xml
<property name="log.path" value="E:/log" />
```

使用前需修改自己对应的的host、port、username、password.....

> logback-spring.xml：logback日志配置文件。
