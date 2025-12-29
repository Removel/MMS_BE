package com.removel.mms_be.Service.Impl;

import com.removel.mms_be.Mapper.DeptMapper;
import com.removel.mms_be.Pojo.Dept;
import com.removel.mms_be.Service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getAllDepartments(){
        return deptMapper.getAllDepartments();
    }

    @Override
    public void addDepartment(Dept dept){
        //检查是否符合规范：


        deptMapper.addDepartment(dept);

    }


}
