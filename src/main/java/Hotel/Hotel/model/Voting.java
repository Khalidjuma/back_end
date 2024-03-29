//package voter.voter.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "voting")
//public class Voting {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "voterid")
//    private Voter voter;
//
//    @ManyToOne
//    @JoinColumn(name = "candid")
//    private Candidate candidate;
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public Voter getVoter() {
//        return this.voter;
//    }
//
//    public Candidate getCandidate() {
//        return this.candidate;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setVoter(Voter voter) {
//        this.voter = voter;
//    }
//
//    public void setCandidate(Candidate candidate) {
//        this.candidate = candidate;
//    }
//
//    // Getters and setters
//    // ...
//}
