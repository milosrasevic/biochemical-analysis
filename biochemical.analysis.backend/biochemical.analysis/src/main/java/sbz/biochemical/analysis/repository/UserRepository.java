package sbz.biochemical.analysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbz.biochemical.analysis.model.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );

    User findOneById(Long id);
}
