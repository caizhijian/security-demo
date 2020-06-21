package com.czj.modules.userinfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @Author:caizhijian
 * @Date:2020-06-21
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {

    @RequestMapping("/getAllUserInfo")
    public List<Map> getAllUserInfo(){
        List<Map> userInfos = new ArrayList<>();
        Map userinfo = new HashMap();
        userinfo.put("id","1");
        userinfo.put("name","yi");
        userInfos.add(userinfo);
        return userInfos;
    }

    @RequestMapping("/getUserInfoById")
    public Map getUserInfoById(){
        Map userinfo = new HashMap();
        userinfo.put("id","2");
        userinfo.put("name","er");
        return userinfo;
    }

}
