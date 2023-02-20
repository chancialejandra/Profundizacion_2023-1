package co.edu.polijic.todo.Persistence.Repository;


import co.edu.polijic.todo.Persistence.Entity.Task;
import co.edu.polijic.todo.Persistence.Entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    List<Task> findAllByTaskStatus(TaskStatus taskStatus);


}
