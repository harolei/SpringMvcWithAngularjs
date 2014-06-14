package com.leiyu.springREST.service;

import com.leiyu.springREST.model.User;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.core.Is.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@TransactionConfiguration(defaultRollback=true)
@Transactional
public class RegisterServiceTest
        extends TestCase
{
    @Autowired
    RegisterService registerService;

    public RegisterServiceTest() {}

    @Test
    public void shouldCreateUserInDabatase()
            throws Exception
    {
        User user = new User("leiyu", "test");
        this.registerService.createUser(user);
        Assert.assertThat(this.registerService.findUserByName("leiyu"), is(user));
    }
}
