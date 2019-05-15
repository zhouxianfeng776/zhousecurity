1.开发中遇到的问题。
授权类型不支持 password
    @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            //要启用password授权类型，必须要authenticationManager
            endpoints.authenticationManager(authenticationManager);
        }

生成token的时候没有refresh token
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.userDetailsService(userDetailsService);
    }

2.启动时的脚本准备。
    导入 resouses/mysql-schemal-*.sql 到数据库。
3.初始化数据。（第一次的时候要使用，以后可以注释掉 withUser以后的）

spring security
 @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        auth.jdbcAuthentication().dataSource(dataSource)
                .withUser(users.username("1").password("1").roles("USER").authorities("product:read"))
                .withUser(users.username("2").password("2").roles("USER", "ADMIN"));
    }
spring oauth2
@Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.jdbc(dataSource)
        .withClient("client")
                .authorizedGrantTypes("password")
                .secret("{noop}secret")
                .scopes("all");
    }
4.启动

5.使用postman测试。

6.注意：Basic Authorization:是使用base64编码用户名和密码（base64.encod(username:password)）
        所以在服务端获取token的时候，服务端使用 client id 和client secret使用Basic Authorization去获取token.