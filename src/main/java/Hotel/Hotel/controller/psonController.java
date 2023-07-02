//package voter.voter.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import voter.voter.model.pson;
//import voter.voter.model.staff;
//import voter.voter.repository.psonRepository;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/")
//public class psonController {
//    @Autowired
//    private psonRepository psonRepository;
//
//    @GetMapping("/person")
//    public List<pson> getallpson(){
//        return psonRepository.findAll();
//    }
//
//    @PostMapping(value = "/save")
//    public String savepson(@RequestBody pson pson) {
//        psonRepository.save(pson);
//        return "save...";
//    }
//}
