package com.removel.mms_be.Service;

import com.removel.mms_be.Pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {

    public List<Dept> getAllDepartments();
    public void addDepartment(Dept dept);
}
