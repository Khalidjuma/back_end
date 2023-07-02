//package voter.voter.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import voter.voter.model.Voting;
//
//public interface VotingRepository extends JpaRepository<Voting, Long> {
//    @Query("SELECT COUNT(v) FROM Voting v")
//    Long countVotes();
//}
