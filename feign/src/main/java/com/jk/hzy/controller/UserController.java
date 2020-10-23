package com.jk.hzy.controller;

import com.jk.hzy.config.RedisConstant;
import com.jk.hzy.entity.UserEntity;
import com.jk.hzy.service.UserService;
import com.jk.hzy.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping("/userList")
    public String userList(Model model){
        List<UserEntity> userLisr = (List<UserEntity>) redisUtil.get(RedisConstant.USER_LIST_KEY);
        if(userLisr == null  || userLisr.isEmpty()){
            userLisr = userService.userList();
            redisUtil.set(RedisConstant.USER_LIST_KEY,userLisr);
        }
        model.addAttribute("usera",userLisr);
        return "list";
    }

    @RequestMapping("/userAdd")
    public String userAdd(UserEntity user){
        userService.userAdd(user);
        redisUtil.del(RedisConstant.USER_LIST_KEY);
        return "redirect:userList";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        model.addAttribute("user", new UserEntity());
        return "add";
    }

    @RequestMapping("userDelete")
    public String userDelete(@RequestParam Integer userId){
        userService.userDelete(userId);
        redisUtil.del(RedisConstant.USER_LIST_KEY);
        return "redirect:userList";
    }

    @RequestMapping("selectUserById")
    public String selectUserById(@RequestParam Integer userId,Model model){
        model.addAttribute("user",userService.selectUserById(userId));
        return "delete";
    }

    @RequestMapping("userUpdate")
    public String userUpdate(UserEntity user){
        userService.userUpdate(user);
        redisUtil.del(RedisConstant.USER_LIST_KEY);
        return "redirect:userList";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String find(){
        return userService.hello();
    }

}
