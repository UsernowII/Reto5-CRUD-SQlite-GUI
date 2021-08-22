package controller;


import model.StudentsDTO;
import view.View;
import view.ViewGUI;

/**
 * Clase encargada hacer las llamadas y controlar el flujo
 * @author Jhon Erick Santos
 * @version 1.0
 */
public class Controller {
    /**
     * Atributos
     */
    private View view;
    private StudentsDTO institute;
    private ViewGUI frame;


    /**
     * Constructor
     * Desplegar GUI y arranque del sistema
     */
    public Controller() {
        view = new View();
        institute = new StudentsDTO();
        frame = new ViewGUI("Institución Educativa La Floresta");
    }
}

