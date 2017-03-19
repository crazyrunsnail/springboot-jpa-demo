package person.feng.core.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Description
 * <p>
 * Writed by fengjy
 * Created on 3/19/17
 */
@Entity
@Table(name = "sssp_employee")
public class Employee {

    private Long id;
    private String name;
    private String email;
    private Date birth;
    private Department department;
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @JoinColumn(name = "department_id")
    @ManyToOne
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
