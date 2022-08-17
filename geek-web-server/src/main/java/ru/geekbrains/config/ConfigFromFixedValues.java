package ru.geekbrains.config;

class ConfigFromFixedValues implements ServerConfig {

    @Override
    public String getWww() {
        return "C:\\Users\\Павлик\\Desktop\\geek-architecture-02 (3)\\geek-architecture-02\\www";
    }

    @Override
    public int getPort() {
        return 8088;
    }
}
