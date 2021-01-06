package cn.hacklike.app.gateway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TockenConfig {
    /*// Jwt方式
    private String SIGNING_KEY = "likedejwtfangan1996";

    @Bean
    public TokenStore tokenStore() {
        //JWT令牌存储方案
        return new JwtTokenStore(accessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey(SIGNING_KEY); //对称秘钥，资源服务器使用该秘钥来验证
        return converter;
    }*/

    // -------------------------------


    //令牌存贮策略（方式）
    /*@Bean
    public TokenStore tockenStore()
    {
        // 内存方式存储令牌
        return new InMemoryTokenStore();
    }*/


}
