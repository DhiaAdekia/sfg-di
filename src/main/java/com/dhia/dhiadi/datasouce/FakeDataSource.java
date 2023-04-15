package com.dhia.dhiadi.datasouce;

public class FakeDataSource {
    private String username;
    private String password;
    private String jdbcrul;

    public FakeDataSource() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcrul() {
        return jdbcrul;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setJdbcrul(String jdbcrul) {
        this.jdbcrul = jdbcrul;
    }
}
