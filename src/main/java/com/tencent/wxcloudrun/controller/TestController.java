package com.tencent.wxcloudrun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tencent.wxcloudrun.config.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.List;

/**
 * test控制器
 */
@RestController

public class TestController {

  final Logger logger;

  public TestController() {
    this.logger = LoggerFactory.getLogger(TestController.class);
  }

  /**
   * 测试接口
   * @return API response json
   */
  @GetMapping(value = "/api/test")
  ApiResponse get() {
    logger.info("/api/test get request");
    String txt = "测试接口调用成功了！";

    return ApiResponse.ok(txt);
  }
}