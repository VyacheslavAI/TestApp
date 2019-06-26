package ru.iteco.vyacheslav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.iteco.vyacheslav.entity.StringHolder;

@Repository
public interface IStringHolderRepository extends JpaRepository<StringHolder, String> {
}
