package com.removel.mms_be.Controller;

import com.removel.mms_be.Exceptions.DuplicateResourceException;
import com.removel.mms_be.Exceptions.InvalidContentException;
import com.removel.mms_be.Pojo.Dept;
import com.removel.mms_be.Pojo.Result;
import com.removel.mms_be.Service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/departments")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //查找所有的部门
    @GetMapping
    public Result getAllDepartments(){
        log.info("查找所有部门");
        List<Dept> res= deptService.getAllDepartments();
        return Result.success(res);
    }

    //添加部门
    @PostMapping
    public Result addDepartment(@RequestBody Dept dept){
        log.info("添加部门");
        try {
            deptService.addDepartment(dept);
        } catch (DuplicateResourceException e) {
            log.error("存在重复用户名");
            return Result.error(e.getMessage(),409);
        }catch (InvalidContentException e){
            log.error("参数不合法");
            return Result.error(e.getMessage(),422);
        }
        log.info("添加成功");
        return Result.success();
    }

}
