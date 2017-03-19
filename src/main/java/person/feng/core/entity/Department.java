package person.feng.core.entity;

import javax.persistence.*;

/**
 * Description
 * <p>
 * Writed by fengjy
 * Created on 3/19/17
 */
@Entity
@Table(name = "sssp_departments")
public class Department {
    private Long id;
    private String departmentName;

    @GeneratedValue
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "department_name")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
