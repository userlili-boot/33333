package org.free.manage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvTest {

    @Autowired
    private Environment environment;

    @Test
    public void testCloudConfig(){
        System.err.println(environment.getProperty("spring.datasource.username"));
    }
}
