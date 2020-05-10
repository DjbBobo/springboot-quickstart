package com.bo;

import com.bo.mapper.UserInfoMapper;
import com.bo.pojo.Userinfo;
import com.bo.utils.MailUtil;
import com.bo.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
class SpringbootQuickstartApplicationTests {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private MailUtil mailUtil;

    //数据库测试
    @Test
    void sqlTest() {
        List<Userinfo> list = userInfoMapper.selectList(null);
        list.forEach(System.out::println);
    }

    //redis测试
    @Test
    void redisTest() {
       redisUtil.set("k1","v1");
        System.out.println(redisUtil.get("k1"));
    }

    //QQ邮箱测试
    @Test
    void mailTest() {
        mailUtil.sendEmail("xxx@qq.com","213123");
    }

}
