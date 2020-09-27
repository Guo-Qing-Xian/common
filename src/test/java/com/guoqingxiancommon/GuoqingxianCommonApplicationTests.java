package com.guoqingxiancommon;

import com.guoqingxiancommon.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class GuoqingxianCommonApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testUtil() {
        String sql = "select * from t_order where create_time>='"+ DateUtil.getDateByInitMonth(new Date()) +"' and create_time<='"+DateUtil.getDateByFullMonth(new Date())+"' ";
        System.out.println(sql);
    }
}
