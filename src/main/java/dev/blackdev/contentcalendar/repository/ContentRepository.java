package dev.blackdev.contentcalendar.repository;

import dev.blackdev.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content>findAllByTittleContains(String keyword);
}
