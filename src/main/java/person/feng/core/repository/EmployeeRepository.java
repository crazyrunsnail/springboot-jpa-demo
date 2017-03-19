package person.feng.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import person.feng.core.entity.Employee;

/**
 * Description
 * <p>
 * Writed by fengjy
 * Created on 3/19/17
 */
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
