# 1.介绍
----------------------------
    openId 即开放的ID，先利用oauth2登陆，在获取用户权限的时候自定义为只返回openId,
    生成规则，使用客户端系统的url+用户信息生成的唯一标识。
    目前疼腾讯的openId对接，使用的就是上面介绍的方式
    http://wiki.open.qq.com/wiki/mobile/%E8%8E%B7%E5%8F%96%E7%94%A8%E6%88%B7OpenID
    
    第三方实现的。
    https://github.com/mitreid-connect/OpenID-Connect-Java-Spring-Server