package com.example.junitdemo.model;

import lombok.*;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
public class Cts implements Project{

    List<Employee> employees;

    @Override
    public Integer getNumberOfEmployees() {
        if(Objects.nonNull(employees) && !employees.isEmpty()) {
            return employees.size();
        }
        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
