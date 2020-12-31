package com.michelan.main.repository;

import com.michelan.main.model.Galleryview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<Galleryview, Long> {
}
