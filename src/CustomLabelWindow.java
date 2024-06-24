import javax.swing.*;
import java.awt.*;

class CustomLabelWindow {

    public static void main(String[] args) {
        // Создаем главное окно
        JFrame frame = new JFrame("Мое окно");
        frame.setSize(800, 600); // Устанавливаем размер окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем JLabel с текстом
        JLabel label = new JLabel("Моя первая надпись!", SwingConstants.CENTER);

        // Устанавливаем шрифт JLabel
        Font font = new Font("Serif", Font.ITALIC, 50);
        label.setFont(font);

        // Добавляем JLabel в центр окна
        frame.add(label);

        // Устанавливаем расположение окна по центру экрана
        frame.setLocationRelativeTo(null);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}
