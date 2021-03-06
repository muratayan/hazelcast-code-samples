package com.hazelcast.spring.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


@Component("dummyBean")
public interface IDummyBean {

    @Cacheable("city")
    String getCity();

}
