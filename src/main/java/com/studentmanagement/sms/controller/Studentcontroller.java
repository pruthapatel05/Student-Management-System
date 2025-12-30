package com.studentmanagement.sms.controller;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.studentmanagement.sms.entity.Studententity;
import com.studentmanagement.sms.services.Studentservices;



@Controller
@RequestMapping("/students")
public class Studentcontroller {

    private Studentservices studentservices;
    public Studentcontroller(Studentservices studentservices) {
        super();
        this.studentservices = studentservices;
    }

    @GetMapping
    public String listStudents(Model model){
        model.addAttribute("students", studentservices.getAllStudents());
        return "students";
    }

    @GetMapping("/test")
    public String test() {
        return "Test endpoint is working!";
    }


    @GetMapping("/new")
    public String create_student(Model model) {
        Studententity student = new Studententity();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") Studententity student) {
        studentservices.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable("id") Long id, Model model) {
        Studententity existingStudent = studentservices.getStudentById(id);
        model.addAttribute("student", existingStudent);
        return "edit_student";
    }

    @PostMapping("/{id}")
    public String updateStudent(@PathVariable("id") Long id,
                                @ModelAttribute("student") Studententity student,
                                Model model) {
        Studententity existingStudent = studentservices.getStudentById(id);
        // existingStudent.setId(id);
        existingStudent.setFirstname(student.getFirstname());
        existingStudent.setLastname(student.getLastname());
        existingStudent.setEmail(student.getEmail());

        studentservices.updateStudent(existingStudent);
        return "redirect:/students";
    }


    public Studentservices getStudentservices() {
        return studentservices;
    }

    public void setStudentservices(Studentservices studentservices) {
        this.studentservices = studentservices;
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentservices.deleteStudentById(id);
        return "redirect:/students";
    }
    
}
