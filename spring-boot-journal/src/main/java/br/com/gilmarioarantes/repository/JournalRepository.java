package br.com.gilmarioarantes.repository;

import br.com.gilmarioarantes.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}
