package Hotel.Hotel.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Room")
public class Room {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
//    @Column(name = "room_id", insertable = false, updatable = false)
    @Column(name = "room_id")
    private Long room_id;
    @Column(name = "type")
    public String type;
    @Column(name = "name")
    public String name;



    public Long getId() {
        return this.room_id;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public void setId(Long room_id) {
        this.room_id = room_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
