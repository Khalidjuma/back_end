//package voter.voter.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import voter.voter.model.staff;
//import voter.voter.repository.StaffRepository;
//
//import java.util.List;
//
//@RestController
//@Controller
//@RequestMapping("/staff")
//public class staffController {
//    @Autowired
//    private StaffRepository staffRepository;
//
//    @GetMapping(value = "/list")
//    public List<staff> getstaff() {
//        return  staffRepository.findAll();
//    }
//
//
//    @PostMapping(value = "/save")
//    public String savestaff(@RequestBody staff staff) {
//        staffRepository.save(staff);
//        return "save...";
//    }
//
//    @PutMapping(value = "update/{id}")
//    public String updatestaff(@PathVariable Long id, @RequestBody staff staff) {
//        staff updatedstaff = staffRepository.findById(id).get();
//        staffRepository.save(updatedstaff);
//        return "upadated...";
//    }
//    @DeleteMapping(value = "/delete/{id}")
//    public String deletestaff(@PathVariable Long id) {
//        staff deletestaff = staffRepository.findById(id).get();
//        staffRepository.delete(deletestaff);
//        return "delete staff id: " + id;
//    }
//}