package com.huaqi.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

    }

    public static void main(String[] args) {
        boolean f;
        for (int i = 0; i <=100; i++) {
            f=true;
            for (int j = 2; j < i-1; j++) {
                if (i%j==0) {
                    f=false;
                    break;
                }
            }
            if (f) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

}
