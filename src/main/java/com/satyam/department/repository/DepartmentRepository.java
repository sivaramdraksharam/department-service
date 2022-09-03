package com.satyam.department.repository;
import org.springframework.stereotype.Repository;

import com.satyam.department.entity.Department;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	public Department findByDepartmentId(Long departmentId) ;

}
