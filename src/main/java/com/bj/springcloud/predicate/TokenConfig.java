package com.bj.springcloud.predicate;


import java.util.Objects;

public class TokenConfig {
    private String token;

    public TokenConfig() {
    }

    public TokenConfig(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TokenConfig{" +
                "token='" + token + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenConfig that = (TokenConfig) o;
        return Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }
}
