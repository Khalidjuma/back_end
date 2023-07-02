package Hotel.Hotel.controller;

import Hotel.Hotel.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import Hotel.Hotel.repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
@RequestMapping("/room")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/getbyId/{room_id}")
    public Optional<Room>getroom(@PathVariable Long room_id){
        return roomRepository.findById(room_id);
    }

    @GetMapping(value = "/list")
    public List<Room> getroom(){
        return  roomRepository.findAll();
    }


       @PostMapping(value = "/save")

  public String saveroom(@RequestBody Room room){
        roomRepository.save(room);
        return "save...";
    }
    @PutMapping(value = "/update/{room_id}")
   public String updateroom(@PathVariable Long room_id,@RequestBody Room room) {
        Room updatedroom = roomRepository.findById(room_id).get();
        updatedroom.setName(room.getName());
        updatedroom.setType(room.getType());
        roomRepository.save(updatedroom);
        return "updated";

    }


    @DeleteMapping(value = "/delete/{room_id}")
    public String deleteroom(@PathVariable Long room_id) {
        Room deleteroom = roomRepository.findById(room_id).get();
        roomRepository.delete(deleteroom);
        return "delete room id: " + room_id;
      }


    }
//
