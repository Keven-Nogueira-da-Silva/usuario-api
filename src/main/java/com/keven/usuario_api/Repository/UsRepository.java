package com.keven.usuario_api.Repository;

import com.keven.usuario_api.usuario.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsRepository extends JpaRepository<Model, Long> {
}
