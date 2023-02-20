package co.edu.polijic.todo.Services;

import co.edu.polijic.todo.Persistence.Entity.Task;
import co.edu.polijic.todo.Persistence.Entity.TaskStatus;
import co.edu.polijic.todo.Persistence.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(Task task){
        taskRepository.save(task);
        return task;
    }

    public List<Task> findAllByTaskStatus(TaskStatus status){
        return taskRepository.findAllByTaskStatus(status);
    }

   //* Tambien se puede de esta manera en vez de @RequiredArgsConstructor
   // @Autowired//private TaskRepository taskRepository;
    // public TaskService(TaskRepository taskRepository) {
    //this.taskRepository = taskRepository;


}
