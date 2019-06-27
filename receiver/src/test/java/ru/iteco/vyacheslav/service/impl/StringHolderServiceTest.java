package ru.iteco.vyacheslav.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import ru.iteco.vyacheslav.entity.StringHolder;
import ru.iteco.vyacheslav.service.api.IStringHolderService;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringHolderServiceTest {

    @Autowired
    private IStringHolderService stringHolderService;

    @Test
    public void createOrUpdateStringHolder() {
        String message = "Message";
        String emptyString = "";
        String defaultValue = "no value";

        StringHolder messageResult = stringHolderService.createOrUpdateStringHolder(message);
        StringHolder emptyResult = stringHolderService.createOrUpdateStringHolder(emptyString);
        StringHolder nullResult = stringHolderService.createOrUpdateStringHolder(null);

        Assert.assertEquals(message, messageResult.getValue());
        Assert.assertEquals(defaultValue, emptyResult.getValue());
        Assert.assertEquals(defaultValue, nullResult.getValue());
    }
}