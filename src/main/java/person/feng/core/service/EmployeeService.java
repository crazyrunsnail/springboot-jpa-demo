package person.feng.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import person.feng.core.entity.Employee;
import person.feng.core.repository.EmployeeRepository;

/**
 * Description
 * <p>
 * Writed by fengjy
 * Created on 3/19/17
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public Page<Employee> getPage(int pageNo, int pageSize) {
        PageRequest pageRequest = new PageRequest(pageNo -1 ,pageSize);
        return employeeRepository.findAll(pageRequest);

    }
}
