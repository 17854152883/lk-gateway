package cn.hacklike.app.gateway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceServerConfig {

    /*public static final String RESOURCE_ID = "likeProject";

    // （新增）jwt方式
    @Autowired
    TokenStore tokenStore;

    // 配置访问权限微服务的权限
    @Configuration
    @EnableResourceServer
    public class OauthResourceServerConfig extends ResourceServerConfigurerAdapter {

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) {
            resources.resourceId(RESOURCE_ID)//资源 id
                    .tokenStore(tokenStore)
//                .tokenServices(tokenService())//验证令牌的服务
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests()
                    .antMatchers("/**").access("#oauth2.hasScope('all')")
                    .and().csrf().disable()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        }
    }

    // 配置访问用户微服务的权限
    @Configuration
    @EnableResourceServer
    public class UserResourceServerConfig extends ResourceServerConfigurerAdapter {

        @Override
        public void configure(ResourceServerSecurityConfigurer resources) {
            resources.resourceId(RESOURCE_ID)//资源 id
                    .tokenStore(tokenStore)
//                .tokenServices(tokenService())//验证令牌的服务
                    .stateless(true);
        }

        @Override
        public void configure(HttpSecurity http) throws Exception {

            http.authorizeRequests()
                    .antMatchers("/**").access("#oauth2.hasScope('all')")
                    .and().csrf().disable()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        }
    }*/


    //内存方式
    //资源服务令牌解析服务
//    @Bean
//    public ResourceServerTokenServices tokenService() {
//        //使用远程服务请求授权服务器校验token,必须指定校验token 的url、client_id，client_secret
//        RemoteTokenServices service=new RemoteTokenServices();
//        service.setCheckTokenEndpointUrl("http://localhost:5001/oauth/check_token");
//        service.setClientId("cl");
//        service.setClientSecret("secret");
//        return service;
//    }

}
