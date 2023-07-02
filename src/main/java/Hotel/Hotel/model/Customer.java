package Hotel.Hotel.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Customer")
public class Customer {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        @Column(name = "id", insertable = false, updatable = false)
        private Long id;
        private  String username;
        private  int password;
        private String firstName;
        private  String lastName;

        @ManyToOne
        @JoinColumn(name= "room_id")
        private Room room;

         //MediaSize.Other customer properties

        // Getters and setters
    }

