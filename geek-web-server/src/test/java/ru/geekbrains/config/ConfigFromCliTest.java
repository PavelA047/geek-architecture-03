package ru.geekbrains.config;

import org.junit.Assert;
import org.junit.Test;

public class ConfigFromCliTest {

    public ServerConfig config;

    @Test
    public void testConfigFromFilePort() {
        config = new ConfigFromCli(new String[]{"/path", "8888"});
        Assert.assertEquals(8888, config.getPort());
    }

    @Test
    public void testConfigFromFilePath() {
        config = new ConfigFromCli(new String[]{"/path", "8888"});
        Assert.assertEquals("/path", config.getWww());
    }
}