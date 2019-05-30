# 1.问题
##  1.1swagger会请求/csrf和/目录，无法取消，只能加入不需要安全验证。
##  1.2 antMatchers和regexMatcher

    antMatchers根据路径进行过滤
    regexMatcher根据正则表达式过滤，所以二者千万不能搞混了
    
##  1.3 swagger list Could not resolve reference because of: Could not resolve point
    
    controller的参数要加   @RequestBody 类似的注解.否则会报错
    
