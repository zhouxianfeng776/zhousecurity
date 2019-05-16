>OAuth2AuthenticationProcessingFilter
> >   负责去校验token
>>>    remoteTokenService
>>>    DefaultTokenService(InMemoryTokenStore,jdbcTokenStore)
    
    
#1.遇到的问题

##1.1配置权限不生效
    
    .mvcMatchers("/messages/**").hasAuthority("SCOPE_message:read")
    因为工程里配置了多个httpSecurity,每一个httpSecurity相当于一个过滤器链
    spring是根据 url来决定使用哪一个httpSecurity，因为都没配置http.antMatcher("/test2")
    所以两个都是 anyRequest，所以第一个就把第二个给覆盖了。
    
## 1.2 异常
    Caused by: java.lang.IllegalStateException: Cannot apply org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer@536b71b4 to already built object
    //因为覆盖了，又不实现自己的表达式处理，
    @Override
        public void configure(HttpSecurity http) throws Exception {
            /*http
                    .authorizeRequests()
                    .mvcMatchers("/messages/**").hasAuthority("SCOPE_message:read")
                    .anyRequest().authenticated();*/
        }
    //根本原因：执行下面一段时会，配置一个 ExpressionUrlAuthorizationConfigurer 
    http
                            .authorizeRequests()
                            .mvcMatchers("/messages/**").hasAuthority("SCOPE_message:read")
                            .anyRequest().authenticated();
    因此在执行
    C existingConfig = (C) getConfigurer(configurer.getClass());
    		if (existingConfig != null) {
    			return existingConfig;
    		}
    就会跳过 ResourceServerSecurityConfigurer 的初始化阶段。
    
    