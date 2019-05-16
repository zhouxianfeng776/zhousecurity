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

  
    
    
    
    
    