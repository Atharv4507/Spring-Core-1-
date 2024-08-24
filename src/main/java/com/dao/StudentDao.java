package com.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {
    private JdbcTemplate j;

    public void setJ(JdbcTemplate j) {
        this.j = j;
    }
    public int insertStudent(Student s1){
        String sql = "insert into Student(sname,scity,spercentage)values(?,?,?)";
        return j.update(sql, new Object[] {s1.getSname(),s1.getScity(),s1.getSpercentage()});
    }
}
