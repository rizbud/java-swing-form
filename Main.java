import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SpinnerDateModel;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Tugas 2 PBO | Form Input Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridLayout(10, 2, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        // Label dan input fields
        formPanel.add(new JLabel("NIK:"));
        JTextField nikField = new JTextField();
        formPanel.add(nikField);

        formPanel.add(new JLabel("Nama:"));
        JTextField namaField = new JTextField();
        formPanel.add(namaField);

        formPanel.add(new JLabel("Alamat:"));
        JTextField alamatField = new JTextField();
        formPanel.add(alamatField);

        formPanel.add(new JLabel("Tempat Lahir:"));
        JTextField tempatLahirField = new JTextField();
        formPanel.add(tempatLahirField);

        formPanel.add(new JLabel("Tanggal Lahir:"));
        SpinnerDateModel dateModel = new SpinnerDateModel();
        dateModel.setStart(null); // No minimum date
        dateModel.setEnd(new Date()); // Max date is today
        JSpinner dateSpinner = new JSpinner(dateModel);
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "dd/MM/yyyy");
        dateSpinner.setEditor(dateEditor);
        formPanel.add(dateSpinner);

        formPanel.add(new JLabel("Jenis Kelamin:"));
        String[] genderOptions = {"Laki-laki", "Perempuan"};
        JComboBox<String> genderBox = new JComboBox<>(genderOptions);
        formPanel.add(genderBox);

        formPanel.add(new JLabel("Nomor Telepon:"));
        JTextField teleponField = new JTextField();
        formPanel.add(teleponField);

        formPanel.add(new JLabel("Status Pernikahan:"));
        String[] statusOptions = {"Belum Menikah", "Menikah", "Cerai"};
        JComboBox<String> statusBox = new JComboBox<>(statusOptions);
        formPanel.add(statusBox);

        formPanel.add(new JLabel("Alamat 1:"));
        JTextField alamat1Field = new JTextField();
        formPanel.add(alamat1Field);

        formPanel.add(new JLabel("Alamat 2:"));
        JTextField alamat2Field = new JTextField();
        formPanel.add(alamat2Field);

        frame.add(formPanel, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPanel.add(submitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Action listener untuk submit
        submitButton.addActionListener(e -> {
            String nik = nikField.getText();
            if (!nik.matches("\\d{16}")) {
                JOptionPane.showMessageDialog(frame, "NIK harus berupa angka dan terdiri dari 16 digit.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String nama = namaField.getText();
            String alamat = alamatField.getText();
            String tempatLahir = tempatLahirField.getText();
            Date tanggalLahir = (Date) dateSpinner.getValue();
            String jenisKelamin = (String) genderBox.getSelectedItem();
            String telepon = teleponField.getText();
            String status = (String) statusBox.getSelectedItem();
            String alamat1 = alamat1Field.getText();
            String alamat2 = alamat2Field.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = sdf.format(tanggalLahir);

            JOptionPane.showMessageDialog(frame,
                "NIK: " + nik + "\n" +
                "Nama: " + nama + "\n" +
                "Alamat: " + alamat + "\n" +
                "Tempat Lahir: " + tempatLahir + "\n" +
                "Tanggal Lahir: " + formattedDate + "\n" +
                "Jenis Kelamin: " + jenisKelamin + "\n" +
                "Telepon: " + telepon + "\n" +
                "Status Pernikahan: " + status + "\n" +
                "Alamat 1: " + alamat1 + "\n" +
                "Alamat 2: " + alamat2,
                "Data Input", JOptionPane.INFORMATION_MESSAGE);
        });

        JPanel authorPanel = new JPanel(new GridLayout(2, 1));
        authorPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        JLabel nameLabel = new JLabel("Nama: Rizki Budi Prasetyo", JLabel.CENTER); 
        JLabel nimLabel = new JLabel("NIM: 230401010019", JLabel.CENTER); 
        authorPanel.add(nameLabel);
        authorPanel.add(nimLabel);
        frame.add(authorPanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
