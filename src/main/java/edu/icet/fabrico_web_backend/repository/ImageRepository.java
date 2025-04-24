package edu.icet.fabrico_web_backend.repository;

import edu.icet.fabrico_web_backend.entity.ImageEntity;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepository extends CrudRepository<ImageEntity,Integer> {
}
