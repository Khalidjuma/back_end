//package voter.voter.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import voter.voter.model.Voter;
//import voter.voter.repository.VoterRepository;
//import voter.voter.services.Voterservice;
//
//import java.util.List;
//@CrossOrigin("/")
//@Controller
//@RestController
//@RequestMapping( value = "/api/voter")
//public class Votercontroller {
//
//     @Autowired
//    private VoterRepository voterRepository;
//
//
//     @GetMapping(value="/Voter")
//    public List<Voter> getVoter(){
//         return voterRepository.findAll();
//     }
//
//
//     @PostMapping(value = "/save")
//    public String saveVoter(@RequestBody Voter voter){
//         voterRepository.save(voter);
//         return "save....";
//     }
//
//     @PutMapping(value = "update/{voterId}")
//    public String updateVoter(@PathVariable Long voterId,@RequestBody Voter voter){
//         Voter updatedVoter = voterRepository.findById(voterId).get();
//         updatedVoter.setFirstName(voter.getFirstName());
//         updatedVoter.setLastName(voter.getLastName());
//         updatedVoter.setEmail(voter.getEmail());
//         updatedVoter.setAddress(voter.getAddress());
//         voterRepository.save(updatedVoter);
//         return "updated...";
//     }
//
//     @DeleteMapping(value = "/delete/{voterId}")
//    public String deleteVoter(@PathVariable Long voterId){
//         Voter deleteVoter =voterRepository.findById(voterId).get();
//         voterRepository.delete(deleteVoter);
//         return "delete voter with id: "+voterId;
//     }
//
//
//
//
//
////    @Autowired
////    private Voterservice voterservice;
////
////    @PostMapping("/saveVoter")
////    public String saveVoter(Voter voter){
////        voterservice.insertVoter(voter);
////        return "redirect:/";
////    }
////
////    @GetMapping("/")
////    public  String getvoter(Model model){
////        model.addAttribute("voterList",voterservice.getAllVoter());
////        return "index";
////    }
////
////    @GetMapping("/registerForm")
////    public ModelAndView registerForm(){
////        ModelAndView mav = new ModelAndView("registerForm");
////        Voter voter = new Voter();
////        mav.addObject("register",voter);
////        return mav;
////    }
//
//
//
//
//}
