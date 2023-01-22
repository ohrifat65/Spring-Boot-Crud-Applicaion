package com.crud.employee.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.crud.employee.model.empModel;

@Repository
public interface empRepository extends JpaRepository<empModel, Integer> {

}
