package com.kalixia.grapi.apt.jaxrs;

enum Options {
    DAGGER("dagger"),
    METRICS("metrics"),
    SHIRO("shiro"),
    RXJAVA("rxjava");

    private final String value;

    Options(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
