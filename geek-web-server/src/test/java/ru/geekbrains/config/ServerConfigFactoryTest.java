package ru.geekbrains.config;

import org.junit.Assert;
import org.junit.Test;

public class ServerConfigFactoryTest {

    @Test
    public void createCliConfig() {
        ServerConfig serverConfig = ServerConfigFactory.create(new String[]{"/path", "8787"});
        Assert.assertEquals(serverConfig.getPort(), 8787);
    }

    @Test
    public void createFileConfig() {
        ServerConfig serverConfig = ServerConfigFactory.create(new String[0]);
        Assert.assertEquals(serverConfig.getWww(), "D:www");
    }
}