package dev.vitaep.TripPlannerAI.repository;

import dev.vitaep.TripPlannerAI.model.TripItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripItemRepository extends JpaRepository<TripItemModel, Long> {
}
