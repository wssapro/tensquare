package com.tensquare.qa.client;

import com.tensquare.qa.client.impl.LabelClientImpl;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @Author wangshun
 * @create: 2019-11-28 18:19
 */
@FeignClient(value = "tensquare-base" , fallback = LabelClientImpl.class)
public interface LabelClient {

    @GetMapping(value = "/label/{labelId}")
    Result findById(@PathVariable("labelId") String labelId);
}
