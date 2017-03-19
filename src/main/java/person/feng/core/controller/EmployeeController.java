package person.feng.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import person.feng.core.entity.Employee;
import person.feng.core.service.EmployeeService;

/**
 * Description
 * <p>
 * Writed by fengjy
 * Created on 3/19/17
 */
@Controller
public class EmployeeController {

    private final static  Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "emps")
    @ResponseBody
    public Object list(@RequestParam(value = "pageNo" ,required = false,defaultValue = "1")
                       String pageNoStr ,
                       Model model) {
        LOGGER.info("===> list");
        int pageNo = 1;
        try {
            pageNo = Integer.parseInt(pageNoStr);
            if(pageNo < 1) {
                pageNo = 1;
            }
        }catch (Exception e) {

        }

        Page<Employee> page = employeeService.getPage(pageNo,5);
        model.addAttribute("page",page);


        return page.getContent();
    }

}
