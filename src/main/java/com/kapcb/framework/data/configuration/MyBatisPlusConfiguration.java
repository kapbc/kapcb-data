package com.kapcb.framework.data.configuration;

import org.springframework.context.annotation.Configuration;

/**
 * <a>Title: MyBatisPlusConfiguration </a>
 * <a>Author: Kapcb <a>
 * <a>Description: MyBatisPlusConfiguration <a>
 *
 * @author Kapcb
 * @version 1.0.0
 * @date 2021/11/7 16:28
 */
@Configuration(proxyBeanMethods = false)
public class MyBatisPlusConfiguration {

//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
//        // 配置mybatis plus 分页插件
//        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
//        // paginationInterceptor.setOverflow(false);
//        // 设置最大单页限制数量，默认 500 条，-1 不受限制
//        // paginationInterceptor.setLimit(500);
//        // 开启 count 的 join 优化,只针对部分 left join
//        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//
//        // 配置mybatis plus 乐观锁插件
//        mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
//
//        return mybatisPlusInterceptor;
//    }

}
