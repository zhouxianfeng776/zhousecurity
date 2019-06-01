# 1.介绍
--------------------------
##    1.1
    authorizationserver1 使用数据库保存token
    resourcesserver1 使用check_token校验token,并获取权限
##    1.2    
    resourcesserver2 使用jdbc检验token，并获取权限。
##    1.3     
    authorizationserver3 使用jwt
    resourcesserver3 获取公钥，验证签名正确性，获取jwt中的用户信息

## 1.4
    
    spring-kerberos 介绍认证原理，参照spring里的实现
    工作中暂时没用到，不做详细测试
    
## 1.5  

    spring-openid 开放的id（无测试实现。）
    
## 1.6  

    mybatisGeneratorPlugins（插件）
    帮助你重命名生成的文件后缀和生成po时带上注释。  
    

## jwt（Java web token）和jwk(java web key 通过web获取公钥)
    
    
    security.oauth2.resource.jwt.key-uri.
>    $ curl https://uaa.run.pivotal.io/token_key （返回的是一个公钥 token_key)
    
    {"alg":"SHA256withRSA","value":"-----BEGIN PUBLIC KEY-----\nMIIBI...\n-----END PUBLIC KEY-----\n"}
    Additionally, if your authorization server has an endpoint that returns a set of JSON Web Keys(JWKs), you can configure security.oauth2.resource.jwk.key-set-uri. E.g. on PWS:
    
>    security.oauth2.resource.jwk.key-set-uri(返回的是公钥列表 token_keys)
    
    $ curl https://uaa.run.pivotal.io/token_keys
    {"keys":[{"kid":"key-1","alg":"RS256","value":"-----BEGIN PUBLIC KEY-----\nMIIBI...\n-----END PUBLIC KEY-----\n"]}
    
    
    
    jwtTokenService
    security:
      oauth2:
        resource:
          jwt:
            keyValue: |
              -----BEGIN PUBLIC KEY-----
              MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC...
              -----END PUBLIC KEY-----
     
    jwkTokenService
    spring:
      security:
        oauth2:
          resourceserver:
            jwt:
              jwk-set-uri: https://idp.example.com/.well-known/jwks.json
    
# 2参考文档
-----
    spring security oauth
    https://projects.spring.io/spring-security-oauth/docs/oauth2.html   
    
    spring security 
    https://docs.spring.io/spring-security/site/docs/5.1.5.RELEASE/reference/htmlsingle/#oauth2resourceserver
    
    spring  oauth boot
    https://docs.spring.io/spring-security-oauth2-boot/docs/2.0.0.RELEASE/reference/htmlsingle/#boot-features-security-oauth2-resource-server
     
    
    
    