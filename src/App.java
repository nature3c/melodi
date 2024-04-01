import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // ensures the GUI is executed on the event dispatch thread
            @Override
            public void run () {
                new PlayerGUI().setVisible(true);

                // 24:03
            }
        });
    }
}
