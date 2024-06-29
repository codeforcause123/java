import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class XPStartMenuGUI extends JFrame {

    public XPStartMenuGUI() {
        setTitle("Windows XP Start Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BorderLayout());

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // Create the top panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(400, 40));
        topPanel.setBackground(Color.LIGHT_GRAY);

        // Create the "Start" button
        JButton startButton = new JButton("Aayush");
        startButton.setFocusable(false);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPopupMenu popupMenu = new JPopupMenu();

                // Create submenu items
                JMenu programMenu = new JMenu("Programs");

                JMenuItem program1 = new JMenuItem("Program 1");
                JMenuItem program2 = new JMenuItem("Program 2");
                JMenuItem program3 = new JMenuItem("Program 3");

                programMenu.add(program1);
                programMenu.add(program2);
                programMenu.add(program3);

                // Add the submenu to the popup menu
                popupMenu.add(programMenu);

                // Display the popup menu relative to the start button
                popupMenu.show(startButton, 0, startButton.getHeight());
            }
        });
        topPanel.add(startButton, BorderLayout.WEST);

        // Create the bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setPreferredSize(new Dimension(400, 360));
        bottomPanel.setBackground(Color.WHITE);

        // Add components to the main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.CENTER);

        // Add the main panel to the frame
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new XPStartMenuGUI());
    }
}
