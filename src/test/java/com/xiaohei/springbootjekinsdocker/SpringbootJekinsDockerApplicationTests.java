package com.xiaohei.springbootjekinsdocker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJekinsDockerApplicationTests {

    @Test
    void contextLoads() {
        test("1");
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
