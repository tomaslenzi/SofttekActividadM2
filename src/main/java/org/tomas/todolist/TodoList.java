package org.tomas.todolist;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Task> taskList;

    public TodoList() {
        this.taskList = new ArrayList<>();

    }

    //agrega una tarea a la lista
    public void addTask(Task task) {
        this.taskList.add(task);
    }

    //elimina una tarea de la lista
    public void deleteTask(Task task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
        } else {
            JOptionPane.showMessageDialog(null, "La tarea no se encuentra en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //edita una tarea de la lista
    public void updateTask(Task task) {
        int index = taskList.indexOf(task);
        if (index >= 0) {
            taskList.set(index, task);
        } else {
            JOptionPane.showMessageDialog(null, "La tarea no se encontró en la lista. No se puede actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskList); // Devuelve una copia de la lista para evitar modificaciones externas
    }

}
