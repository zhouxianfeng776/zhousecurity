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

## jwt（Java web token）和jwk(java web key 通过web获取公钥)
    
    
    security.oauth2.resource.jwt.key-uri.
    $ curl https://uaa.run.pivotal.io/token_key
    {"alg":"SHA256withRSA","value":"-----BEGIN PUBLIC KEY-----\nMIIBI...\n-----END PUBLIC KEY-----\n"}
    Additionally, if your authorization server has an endpoint that returns a set of JSON Web Keys(JWKs), you can configure security.oauth2.resource.jwk.key-set-uri. E.g. on PWS:
    
    security.oauth2.resource.jwk.key-set-uri
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
    
    
    
    
    