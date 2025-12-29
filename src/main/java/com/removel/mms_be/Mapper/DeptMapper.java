package com.removel.mms_be.Mapper;

import com.removel.mms_be.Pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    //查找部门所有的数据
    @Select("SELECT id,name,description,leader_id,create_time from department")
    List<Dept> getAllDepartments();

    //添加部门数据
    @Insert("INSERT into department(department.id,department.name,department.description,department.leader_id,department.create_time) values (#{id},#{name},#{description},#{leaderId},#{createTime})")
    void addDepartment(Dept dept);
}
