package com.sky.springaspectlog.controller;

import com.sky.springaspectlog.annotation.SysLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @packageName:com.sky.springaspectlog.controller
 * @ClassName:LogTestController
 * @Description:
 * @Author:
 * @Data:2021/11/22@Time:16:28
 */
@RestController
public class LogTestController {
	@SysLog("测试")
	@GetMapping("/test")
	public String test(@RequestParam("name") String name){
		return name;
	}
}
