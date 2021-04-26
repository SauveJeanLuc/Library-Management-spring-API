package edu.lib.data;

import edu.lib.model.Reader;
import edu.lib.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report,Long> {

}
