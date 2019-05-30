# 1.问题
##  1.1swagger会请求/csrf和/目录，无法取消，只能加入不需要安全验证。
##  1.2 antMatchers和regexMatcher

    antMatchers根据路径进行过滤
    regexMatcher根据正则表达式过滤，所以二者千万不能搞混了
    
##  1.3 swagger list Could not resolve reference because of: Could not resolve point
    
    controller的参数要加   @RequestBody 类似的注解.否则会报错
    
##  1.4具体用法：

>    2种用法：
>>    1.生成参数时校验 (validator.validate(list)) <br/>
    1.1注意：对List对象校验无效 <br/>
    2.创建controller代理对象，在处理具体的请求时  <br/>
    由代理的MethodValidationInterceptor 拦截器执行参数校验 <br/>
    validatorImpl.validateParameters(T object, Method method, Object[] parameterValues, Class<?>... groups)  <br/>
    2.1注意：getWarehouseWithSupplier( @RequestBody @Size(min = 1)  List<@Valid SupplierModel> list) <br/>

    两个使用都是同一个validator，一个注入时延时加载，使用的是代理，
    另一个已加载完成，使用的是具体的validator ，
    ValidationAutoConfiguration 使用的是自动配置。
    
