package sbz.biochemical.analysis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbz.biochemical.analysis.model.mind.DailyMindState;

import java.util.Optional;

public interface DailyMindStateRepository extends JpaRepository<DailyMindState, Long> {
    Optional<DailyMindState> findByUserIdAndDay(Long userId, String day);
}
