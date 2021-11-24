package com.xiaohei.springbootjekinsdocker;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiaohei.springbootjekinsdocker.entity.UserInfo;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootJekinsDockerApplicationTests {

    @Test
    void contextLoads() {
//        test("1");
//
//        List<Long> valueUuids = Arrays.asList(1l, 2l);
//
//        List<Long> allValueUuids = new ArrayList<>(valueUuids);
//        System.out.println(allValueUuids);

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("1");
        userInfo.setPassword("2");
        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUsername("3");
        userInfo2.setPassword("4");
        UserInfo userInfo3 = new UserInfo();
        userInfo3.setUsername("5");
        userInfo3.setPassword("6");

        List<UserInfo> list1 = new ArrayList<>();
        list1.add(userInfo);
        list1.add(userInfo2);
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("1",JSONObject.toJSON(list1));
        hashMap.put("2", JSONObject.toJSON(userInfo3));
        System.out.println(hashMap);
        System.out.println(hashMap.get("2"));
        System.out.println(hashMap.get("1"));
    }


    void test(String actionName) {
        switch (actionName) {
            //确认收货
            case "1":
                //晒单审核通过
            case "2":
                //取消申请退款
            case "3":
                //退款
            case "4":
                System.out.println("444444");
                break;
            default:
                System.out.println("default");
        }
    }

}
