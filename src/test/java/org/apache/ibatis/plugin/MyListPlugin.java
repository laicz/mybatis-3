package org.apache.ibatis.plugin;

import java.util.List;
import java.util.Properties;

/**
 * Created by zhoumb on 2019/4/10
 */
@Intercepts(value = {
        @Signature(type = List.class, method = "add", args = Object.class)
})
public class MyListPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("执行之前  ----- ");
        Object proceed = invocation.proceed();
        System.out.println("执行之后  ----- ");
        return proceed;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
