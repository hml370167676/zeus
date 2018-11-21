package com.uusoft.test.zeus.controller;

import com.uusoft.test.zeus.domain.model.AppManager;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 10/9/2018 6:16 PM
 */
@RestController("app")
public class AppController {

  private static Logger logger = LoggerFactory.getLogger(AppController.class);

  @Resource
  private AppManager appManager;

  @RequestMapping("app/addapp")
  public void addApplication() {

  }
}
