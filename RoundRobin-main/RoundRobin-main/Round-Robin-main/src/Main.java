import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Crea una instancia de la clase Browser
        App sistma = new App();
        //Titulo del JFrame
        sistma.setTitle("Process");
        //Tamanio del JFrame
        sistma.setSize(700, 700);
        //Hace visible el browser (JFrame)
        sistma.setVisible(true);
        //Indica que la aplicación debe finalizar completamente cuando se cierra la ventana JFrame
        sistma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}