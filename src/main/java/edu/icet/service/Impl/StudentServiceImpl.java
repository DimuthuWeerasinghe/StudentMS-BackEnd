package edu.icet.service.Impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository ;

    @Override
    public List<Student> getStudent() {

        List<Student> all =  repository.findAll();
        return all;
    }

    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }
}
