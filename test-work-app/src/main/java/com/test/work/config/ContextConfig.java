package com.test.work.config;

import cn.stylefeng.roses.core.aop.RequestDataAop;
import cn.stylefeng.roses.kernel.logger.chain.aop.ChainOnConsumerAop;
import cn.stylefeng.roses.kernel.logger.chain.aop.ChainOnControllerAop;
import cn.stylefeng.roses.kernel.logger.chain.aop.ChainOnProviderAop;
import com.wulin.happy.system.api.AuthApi;
import com.wulin.happy.system.api.context.LoginContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 全局配置
 *
 */
@Configuration
public class ContextConfig {

    /**
     * 获取当前用户的便捷工具
     */
    @Bean
    public LoginContext loginContext(AuthApi authApi) {
        return new LoginContext(authApi);
    }

    /**
     * 调用链治理(调用远程服务之前的日志)
     */
    @Bean
    public ChainOnConsumerAop chainOnConsumerAop() {
        return new ChainOnConsumerAop();
    }

    /**
     * 调用链治理(控制器日志，和一些参数填充)
     */
    @Bean
    public ChainOnControllerAop chainOnControllerAop() {
        return new ChainOnControllerAop();
    }

    /**
     * 调用链治理(参数校验和错误日志的记录)
     */
    @Bean
    public ChainOnProviderAop chainOnProviderAop() {
        return new ChainOnProviderAop();
    }


    /**
     * 控制器层临时缓存RequestData的aop
     */
    @Bean
    public RequestDataAop requestDataAop() {
        return new RequestDataAop();
    }

//    /**
//     * RequestData解析器
//     */
//    @Bean
//    public RequestDataMessageConvert requestDataMessageConvert() {
//        //要使用 RequestDataMessageConvert 就必须把下面的转换Converter 注册进去
//        ClassUtil.scanPackageBySuper(StrUtil.EMPTY, IEnum.class).forEach(x -> {
//            if (!x.isEnum()) {
//                throw new IllegalArgumentException("Class[" + x + "]不是枚举类型");
//            }
//            Converter converter = (o, t) -> {
//                Object[] enums = x.getEnumConstants();
//                for (Object e : enums) {
//                    IEnum iEnum = (IEnum) e;
//                    if (iEnum.getValue().equals(o)) {
//                        return iEnum;
//                    }
//                }
//                return null;
//            };
//            ConverterRegistry.getInstance().putCustom(x, converter);
//        });
//        return new RequestDataMessageConvert();
//    }

}
