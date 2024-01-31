package lucore;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import lucore.LucoreStart1;
import lucore.lucoreChangeUsernameB.*;
import com.sun.tools.javac.Main;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
 
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.Color;
import static java.awt.Color.RED;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.lang.String;
import javax.swing.ComboBoxModel;
import com.sun.tools.javac.Main;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.im.InputContext;
import java.awt.image.ImageObserver;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import lucore.lucoreChangeUsernameB;
import lucore.lucoreChangeUsernameB;
import lucore.lucoreFilesInfluxA;
import lucore.lucoreFilesInfluxA;
import lucore.lucorePowerOffA;
import lucore.lucorePowerOffA;
import lucore.lucoreSearchA;
import lucore.lucoreSearchA;
import lucore.lucoreSleepModeA;
import lucore.lucoreSleepModeA;
import lucore.lucorecalenderA;
import lucore.lucorecalenderA;
import lucore.test;
import lucore.test;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import com.formdev.flatlaf.ui.FlatScrollBarUI;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.Properties;
import java.util.prefs.Preferences;
import suprtycoongamelib.GameSleep;
import com.sun.jna.platform.win32.Kernel32;
    import com.sun.jna.platform.win32.User32;
    import com.sun.jna.platform.win32.WinDef.HMODULE;
    import com.sun.jna.platform.win32.WinDef.LRESULT;
    import com.sun.jna.platform.win32.WinDef.WPARAM;
    import com.sun.jna.platform.win32.WinUser.HHOOK;
    import com.sun.jna.platform.win32.WinUser.KBDLLHOOKSTRUCT;
    import com.sun.jna.platform.win32.WinUser.LowLevelKeyboardProc;
    import com.sun.jna.platform.win32.WinUser.MSG;
import java.awt.geom.Area;
import java.awt.image.BufferedImageOp;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.ui.FlatButtonBorder;
import com.formdev.flatlaf.ui.FlatUIUtils;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import javax.crypto.SecretKey;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.ButtonUI;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author raide
 */
public class NewJFrame extends javax.swing.JFrame {



    
    
    private int offsetX, offsetY;
    private ImagePanel imagePanel;
    String data;
    boolean dnd;
    boolean launched = false;
    
    static double points = 0.0;
    
    private JPanel mainPanel;
    private JPanel previewPanel;
    private JLabel previewImage;
    private ImageIcon previewImageIcon;
   
    

    
   
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
    // Add a MouseAdapter to handle mouse press and drag events
        
        this.data = data;
        initComponents();
        
        
        // Initialize and run the command panel..
        //commandPanel cmd = new commandPanel();
        //cmd.setVisible(true);
        //cmd.iconify();
        
        
        /*LRespond.ResponsivenessListener responsivenessListener = new LRespond.ResponsivenessListener() {
            @Override
            public void onResponsive() {
                System.out.println("Application is responsive.");
            }

            @Override
            public void onNotResponsive() {
                System.out.println("Application is not responsive. Showing crash screen...");
                LRespond.showCrashScreen("Lucore was not responding..");
            }
        };

        // Check responsiveness with a timeout of 5 seconds
        LRespond.checkResponsiveness(5000, responsivenessListener);*/

        
        // **Start button operations** (Do not modify - Official Lucore code)
        
        // Set the button size to 45x45..
        jButton5.setSize(45, 45);
        
        
        
        // **Taskbar personalization operations** (Do not modify - Official Lucore code)
        
        // Operation to check if file exists
// Specify the path to the config.properties file
String filePath25 = "data/personalization.properties";

// Create a File object with the specified file path
File configFile25 = new File(filePath25);

// Check if the file exists
if (configFile25.exists()) {
    Properties loadedProperties5 = new Properties();
    try (FileInputStream fis = new FileInputStream("data/personalization.properties")) {
        loadedProperties5.load(fis);
    } catch (IOException e) {
        e.printStackTrace();
    }

    // Variable declaration
    boolean widgets = Boolean.parseBoolean(loadedProperties5.getProperty("widgets"));
    boolean pins = Boolean.parseBoolean(loadedProperties5.getProperty("pins"));
    boolean day = Boolean.parseBoolean(loadedProperties5.getProperty("day"));

    jButton4.setVisible(widgets);
    jButton9.setVisible(pins);
    jButton10.setVisible(pins);
    jLabel7.setVisible(day);

    // Assuming jLabel9 is in a container (replace Container with the actual type)
    Container container = jLabel9.getParent();

    // Set layout manager to null for absolute positioning
    container.setLayout(null);

    if (!day) {
        // Move jLabel9 if day is false
        jLabel9.setLocation(jLabel9.getX(), jLabel9.getY() + 12);
    }

    } else {
        // If the properties file does not exist, print that it does not exist..
        System.out.println("Personalization property file does not exist.");
    }
        
        jComboBox1.setVisible(false);
        
        //jPanel3.putClientProperty( FlatClientProperties.STYLE, "arc: 10" );
        
        // Timers
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Timer timer2 = new Timer(180000, e -> CR_Notification());
        //timer2.start();
        Timer timer4 = new Timer(1, e -> {
            //if (lucoreTaskbarSettings.mod == true) {
                //jPanel2.setBounds(40, 718, 1285, 50);
            //}
        });
        
        // Hide the Windows taskbar until the user closes the GUI..
        TaskbarControl.hideTaskbar();
        
        // Modify all classes in the 'lucore' package
        modifyClassesInPackage("lucore");

        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        // Define the task to be executed
        Runnable task = () -> {
            // Replace this with the action you want to perform
            updateTime();
        };
        
        // Schedule the task to run after an initial delay of 1 second and then every 0.5 seconds
        executorService.scheduleAtFixedRate(task, 1, 500, TimeUnit.MILLISECONDS);
        
        // Quicker loading
        jPanel2.setVisible(true);
        jPanel1.setVisible(true);
        
        previewPanel = new JPanel(new BorderLayout());
        previewPanel.setPreferredSize(new Dimension(150, 120)); // Set a non-zero preferred size
        previewPanel.setBackground(Color.WHITE);
        previewPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        previewPanel.setVisible(false);

        previewImage = new JLabel();
        previewPanel.add(previewImage, BorderLayout.CENTER);

        try {
            previewImageIcon = new ImageIcon(ImageIO.read(getClass().getResource("app_preview.png")));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        jComboBox1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen() - previewPanel.getHeight() - jComboBox1.getHeight(); // Position above the button
                previewPanel.setLocation(x, y);
                previewPanel.setVisible(true);

                if (previewPanel.getWidth() > 0 && previewPanel.getHeight() > 0) {
                    // Scale the image to fit inside the preview panel
                    int maxWidth = previewPanel.getWidth();
                    int maxHeight = previewPanel.getHeight();
                    int imageWidth = previewImageIcon.getIconWidth();
                    int imageHeight = previewImageIcon.getIconHeight();

                    double widthRatio = (double) maxWidth / imageWidth;
                    double heightRatio = (double) maxHeight / imageHeight;
                    double scale = Math.min(widthRatio, heightRatio);

                    int scaledWidth = (int) (imageWidth * scale);
                    int scaledHeight = (int) (imageHeight * scale);

                    Image scaledImage = previewImageIcon.getImage().getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                    previewImage.setIcon(new ImageIcon(scaledImage));

                    repaint();
                }
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                previewPanel.setVisible(false);
            }
        });

        jComboBox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                previewPanel.setVisible(false);
            }
        });
        
        //timer4.start();
        //Timer timer3 = new Timer(1, e -> setBackgroundImage());
        //timer3.start();
        
        // Open the logger
        SwingLoggerExample.main(null);
        
        
        // Specify the source folder path
        File sourceFolder = new File("data");

        if (!sourceFolder.exists()) {
            // 'data' folder doesn't exist, show an error dialog
            JOptionPane.showMessageDialog(null,
                    "Fatal error: Data files don't exist. Run Calc1 by pressing the Escape key while in the home screen.",
                    "Fatal error", JOptionPane.ERROR_MESSAGE);

            // Continue to Calc1 or any other logic
            lucoreCalc1.main(null);
        }
        
        // Files..
        String folderPath = "C:/Lucore MIDAS (OS)"; // Replace with the path to the folder you want to create

        boolean folderCreated = createFolder(folderPath);

        if (folderCreated) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Failed to create the folder.");
        }
        
        // Create the updated file..
        try {
            File file = new File("C:/Lucore MIDAS (OS)/updated.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
            null,                  // Parent component (null for no parent)
            "Error creating required files. You wont be able to change your background image. To fix this, you might need to re-launch Lucore.", // Message to display
            "Error",               // Dialog title
            JOptionPane.ERROR_MESSAGE   // Message type (ERROR_MESSAGE displays an error icon)
        );
        }
        
        // **Point Modification** (Do not modify - Official Lucore code)
        
        // Create a ScheduledExecutorService with a single thread
        ScheduledExecutorService executorService11 = Executors.newSingleThreadScheduledExecutor();

        // Define the task to be executed
        Runnable task11 = () -> {
            // Replace this with the action you want to perform
            addPoints(0.2);
        };

        // Schedule the task to run after an initial delay of 1 second and then every 2 seconds
        executorService11.scheduleAtFixedRate(task11, 1, 10, TimeUnit.SECONDS);
        
        // Done with point modification
        
        System.out.println("Windows Username: " + WinUsername.getUsername());

        // **Variable Setting** (Do not modify - Official Lucore code)
        
        // Load properties from the file
        
        // Operation to check if file exists
        // Specify the path to the config.properties file
        String filePath2 = "data/config.properties";

        // Create a File object with the specified file path
        File configFile2 = new File(filePath2);

        // Check if the file exists
        if (configFile2.exists()) {
        Properties loadedProperties22 = new Properties();
        try (FileInputStream fis = new FileInputStream("data/config.properties")) {
            loadedProperties22.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Variable declaration
        String pointsProperty = loadedProperties22.getProperty("points");
        boolean passwordReq = Boolean.parseBoolean(loadedProperties22.getProperty("passwordRequirement"));
        String email = loadedProperties22.getProperty("email");
        boolean easyLimits = Boolean.parseBoolean(loadedProperties22.getProperty("easyEscapeLimits"));
        boolean appPassword = Boolean.parseBoolean(loadedProperties22.getProperty("boolPassword"));
        String password = loadedProperties22.getProperty("password");
        boolean hasEmail = Boolean.parseBoolean(loadedProperties22.getProperty("hasEmail"));
        String abcProp = loadedProperties22.getProperty("abc");
        
        if (pointsProperty != null) {
            double point = Double.parseDouble(pointsProperty);
            // Set points value..
            points = point;
            lucoreAccounts.hasAccount = hasEmail;
            lucoreSecuritySettings.pwreq = passwordReq;
            if (lucoreAccounts.jTextField1 != null) {
                lucoreAccounts.jTextField1.setText(email);
            }
            lucoreSecuritySettings.eetl = easyLimits;
            lucoreSecuritySettings.apppwreq = appPassword;
            lucoreChangePWA.password = password;
            lucoreChangePWB.password = password;
            
            if (abcProp != null) {
                double abc = Double.parseDouble(abcProp);
                
                if (points != abc) {
                setVisible(false);
                SevereErrorDialog.main(null);
                GameSleep.sleep(100, () -> {
                    dispose();
            });
            }
            }
            
        
        // Load all of the extension packs..
        loadTextFiles();
        
        // **Image Operations** (Do not modify - Official Lucore code)
            
    // Load properties from the file
    Properties loadedProperties = new Properties();
    try (FileInputStream fis = new FileInputStream("data/config.properties")) {
        loadedProperties.load(fis);
    } catch (IOException e) {
        e.printStackTrace();
        showErrorAndRecreate();
        return;
    }

    // Retrieve values from the loaded properties
String imagePath = loadedProperties.getProperty("imagePath");

if (imagePath != null) {
    // Replace double backslashes with single forward slashes
    imagePath = imagePath.replace("\\", "/");

    // Before loading properties
    System.out.println("Before loading properties: " + imagePath);

    lucorePersonalizationSettings.filedir = new File(imagePath);

    try {
        Image image = ImageIO.read(lucorePersonalizationSettings.filedir);

        // Get the size of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the scaling factors to fit the image into the screen
        double scaleWidth = screenSize.getWidth() / image.getWidth(null);
        double scaleHeight = screenSize.getHeight() / image.getHeight(null);

        // Use the larger scaling factor to ensure the image touches the top/bottom
        double scale = Math.max(scaleWidth, scaleHeight);

        // Scale the image to fit the screen
        Image scaledImage = image.getScaledInstance(
                (int) (image.getWidth(null) * scale),
                (int) (image.getHeight(null) * scale),
                Image.SCALE_SMOOTH
        );

        // Create an ImageIcon from the scaled image
        ImageIcon imageIcon = new ImageIcon(scaledImage);

        // Create a JLabel to display the image
        JLabel imageLabel = new JLabel(imageIcon);

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(imageLabel, BorderLayout.CENTER);

    } catch (IOException e) {
        e.printStackTrace();
        showErrorAndRecreate();
    }
} else {
    System.out.println("Properties file doesn't exist.. Lucore has set the background image to default.");
}
            
            /*try {
            // Load the properties file
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("data/config.properties");
            properties.load(fileInputStream);

            // Generate a new secret key (do this once and store it securely)
            SecretKey secretKey = PropertyEncryptionUtil.generateSecretKey();

            // Encrypt the password
            String originalPassword = properties.getProperty("password");
            String encryptedPassword = PropertyEncryptionUtil.encrypt(originalPassword, secretKey);

            // Set the encrypted password to a property
            properties.setProperty("password", encryptedPassword);

            // Save the updated properties back to the file
            properties.store(new FileOutputStream("data/config.properties"), null);

            // Decrypt the password (just for demonstration purposes)
            String decryptedPassword = PropertyEncryptionUtil.decrypt(encryptedPassword, secretKey);
            System.out.println("Decrypted Password: " + decryptedPassword);
            
            lucoreChangePWA.password = decryptedPassword;
            lucoreChangePWB.password = decryptedPassword;

        } catch (Exception e) {
            e.printStackTrace();
        }*/
                if (password.equals("") || password == null) {
                    jComboBox2.setEnabled(false);
                    jComboBox2.setToolTipText("Please create a password. Right-click home screen > Create password.");
                }
            }
        
        } else {
            // If the properties file does not exist, print that it does not exist..
            System.out.println("Properties file does not exist. Couldn't load the points, Lucore has reset the point variable.\nIf you re-launch Lucore and you have 0.0 points, please run Calc1! (Press ESC when in desktop)");
        }
        
        
        // **Position Operations** (Do not modify - Official Lucore code)
        
        // Load properties from the file
        
        // Operation to check if file exists
        // Specify the path to the config.properties file
        String filePath = "data/config.properties";

        // Create a File object with the specified file path
        File configFile = new File(filePath);

        // Check if the file exists
        if (configFile.exists()) {
        Properties loadedProperties = new Properties();
        try (FileInputStream fis = new FileInputStream("data/config.properties")) {
            loadedProperties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retrieve button 1 positions from the file..
        String button1XProperty = loadedProperties.getProperty("button1X");
        if (button1XProperty != null) {
            int button1X = Integer.parseInt(button1XProperty);
        int button1Y = Integer.parseInt(loadedProperties.getProperty("button1Y"));
        
        // Retrieve button 2 positions from the file..
        int button2X = Integer.parseInt(loadedProperties.getProperty("button2X"));
        int button2Y = Integer.parseInt(loadedProperties.getProperty("button2Y"));
        
        // Retrieve button 3 positions from the file..
        int button3X = Integer.parseInt(loadedProperties.getProperty("button3X"));
        int button3Y = Integer.parseInt(loadedProperties.getProperty("button3Y"));
        
        // Set button 1 position..
        jButton1.setLocation(button1X, button1Y);
        
        // Set button 2 position..
        jButton2.setLocation(button2X, button2Y);
        
        // Set button 3 positions..
        jButton3.setLocation(button3X, button3Y);
        }
        } else {
            // If the properties file does not exist, print that it does not exist..
            System.out.println("Properties file does not exist. Couldn't load the button positions, Lucore has set them to default positions.");
        }
            
            // **Taskbar Operations** (Do not modify - Official Lucore code)
        
        Properties properties2 = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("data/taskbar.properties")) {
            // Load properties from the file
            properties2.load(fileInputStream);

            // Retrieve the boolean property "modern" with null checking
            String tMode = properties2.getProperty("modern");
            boolean mode = (tMode != null) ? Boolean.parseBoolean(tMode) : false; // Default value is false

            // Retrieve the boolean property "trBool" with null checking
            String transpar = properties2.getProperty("trBool");
            boolean tr = (transpar != null) ? Boolean.parseBoolean(transpar) : false; // Default value is false

            lucoreTaskbarSettings.mod = mode;
            lucoreTaskbarSettings.def = !mode;

            System.out.println("Taskbar mode: " + mode + "\nTransparency state: " + tr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Add the taskbar (jToolBar2) to the bottom of the screen
        if (lucoreTaskbarSettings.def) {
            jPanel2.setBounds(0, 718, 1365, 50);
            // Get the default screen device
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        // Get the screen configuration
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        
        // Get the bounds of the screen
        Rectangle screenBounds = gc.getBounds();
        
        // Get the Y-coordinate of the bottom line
        int bottomLineY = screenBounds.y + screenBounds.height;

        System.out.println("Screen Bottom Line Y: " + bottomLineY);
        
        jPanel2.setLocation(jPanel2.getX(), bottomLineY-50);
        } else if (lucoreTaskbarSettings.mod) {
            jPanel2.setBounds(40, 700, 1285, 57);
            // Get the default screen device
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        
        // Get the screen configuration
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        
        // Get the bounds of the screen
        Rectangle screenBounds = gc.getBounds();
        
        // Get the Y-coordinate of the bottom line
        int bottomLineY = screenBounds.y + screenBounds.height;

        System.out.println("Screen Bottom Line Y: " + bottomLineY);
        
        jPanel2.setLocation(jPanel2.getX(), bottomLineY-70);
        }
    
                
        // Set up Flat Laf (Look and feel) - Lucore modern feature..
        FlatLightLaf.setup();
        
        // Taskbar blur image
        //try {
            // Replace "path/to/your/image.png" with the actual path to your image file
            //File file = new File("C:/Users/User/Documents/NetBeansProjects/Java/src/lucore/TaskbarImage3.jpg");
            //image = ImageIO.read(file);
        //} catch (IOException e) {
            //e.printStackTrace();
        //}
        //imagePanel = new ImagePanel(image);
        //jToolBar2.setLayout(new BorderLayout());
        //jToolBar2.add(imagePanel, BorderLayout.CENTER);

        
        jButton1.addMouseListener(new MouseAdapter() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        @Override
            public void mousePressed(MouseEvent e) {
                // Store the coordinates of the mouse press event
                offsetX = e.getX();
                offsetY = e.getY();
            }
        });

        jButton1.addMouseMotionListener(new MouseMotionAdapter() {
    // Add a MouseAdapter to handle mouse press and drag events
    
            @Override
            public void mouseDragged(MouseEvent e) {
                // Check if offsetX and offsetY are initialized
                if (offsetX != 0 && offsetY != 0) {
                    // Move the button to the new position based on the cursor location
                    int x = e.getXOnScreen() - offsetX;
                    int y = e.getYOnScreen() - offsetY;
                    jButton1.setLocation(x, y);
                }
        }
    });
        
        
        jButton2.addMouseListener(new MouseAdapter() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        @Override
            public void mousePressed(MouseEvent e) {
                // Store the coordinates of the mouse press event
                offsetX = e.getX();
                offsetY = e.getY();
            }
        });

        jButton2.addMouseMotionListener(new MouseMotionAdapter() {
    // Add a MouseAdapter to handle mouse press and drag events
    
            @Override
            public void mouseDragged(MouseEvent e) {
                // Check if offsetX and offsetY are initialized
                if (offsetX != 0 && offsetY != 0) {
                    // Move the button to the new position based on the cursor location
                    int x = e.getXOnScreen() - offsetX;
                    int y = e.getYOnScreen() - offsetY;
                    jButton2.setLocation(x, y);
                }
        }
    });
        
        
        jButton3.addMouseListener(new MouseAdapter() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        @Override
            public void mousePressed(MouseEvent e) {
                // Store the coordinates of the mouse press event
                offsetX = e.getX();
                offsetY = e.getY();
            }
        });

        jButton3.addMouseMotionListener(new MouseMotionAdapter() {
    // Add a MouseAdapter to handle mouse press and drag events
    
            @Override
            public void mouseDragged(MouseEvent e) {
                // Check if offsetX and offsetY are initialized
                if (offsetX != 0 && offsetY != 0) {
                    // Move the button to the new position based on the cursor location
                    int x = e.getXOnScreen() - offsetX;
                    int y = e.getYOnScreen() - offsetY;
                    jButton3.setLocation(x, y);
                }
        }
    });
        
        // Check when it is closing..
            // Add a shutdown hook to stop the timers when the program exits
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Program is closing. Stopping all executor services...");
            executorService11.shutdown();
        }));
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the start and end dates for the range
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 1, 7);

        // Check if the current date is within the specified range
        if (currentDate.isAfter(startDate) && currentDate.isBefore(endDate)) {
            // Do something if the current date is within the range
            System.out.println("Lucore 6.0 is out. Show notification..");
            
        } else {
            // Do something else if the current date is outside the range
            System.out.println("Lucore 6.0 notification alerts expired.. Don't show notifications anymore.");
        }
        
        addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    // This code will be executed when the frame is closed
                    System.out.println("GUI is closing. Perform cleanup or additional actions here.");
                    TaskbarControl.showTaskbar();
                    // Optionally, you can call System.exit(0) to terminate the application
                    // System.exit(0);
                }
            });
                }
    
    
    // Add these methods outside your main logic to avoid redundancy
private void showErrorAndRecreate() {
        
        lucorePersonalizationSettings.filedir = new File("resources/img3.jpg");
    
        Properties properties = new Properties();
        
        // Set properties with Lucore desktop's data
        properties.setProperty("imagePath", lucorePersonalizationSettings.filedir.getPath());
        properties.setProperty("button1X", "" + jButton1.getX());
        properties.setProperty("button1Y", "" + jButton1.getY());
        properties.setProperty("button2X", "" + jButton2.getX());
        properties.setProperty("button2Y", "" + jButton2.getY());
        properties.setProperty("button3X", "" + jButton3.getX());
        properties.setProperty("button3Y", "" + jButton3.getY());
        properties.setProperty("points", "" + points);
        properties.setProperty("abc", "" + points);
        properties.setProperty("lookAndFeel", "" + UIManager.getLookAndFeel().getName());
        properties.setProperty("passwordRequirement", "" + lucoreSecuritySettings.pwreq);
        properties.setProperty("easyEscapeLimits", "" + lucoreSecuritySettings.eetl);
        properties.setProperty("boolPassword", "" + lucoreSecuritySettings.apppwreq);
        properties.setProperty("hasAccount", "" + lucoreAccounts.hasAccount);
        if (lucoreChangePWA.password != null) {
            properties.setProperty("password", lucoreChangePWA.password);
        }

        // Save the properties to a file
        try (FileOutputStream fos = new FileOutputStream("data/config.properties")) {
            properties.store(fos, "Program Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    int result = JOptionPane.showConfirmDialog(
                    null,
                    "Fatal error: We couldn't load the image file; The data was corrupted/changed. Re-creating data files and launching Lucore.",
                    "Fatal error",
                    JOptionPane.ERROR_MESSAGE
            );

            if (result == JOptionPane.OK_OPTION) {
                recreateAndLaunch();
            } else {
                disposeAndLaunchNewFrame();
            }
}

private void recreateAndLaunch() {
    GameSleep.sleep(1000, () -> {
        dispose();
        NewJFrame.main(null);
    });
}

private void disposeAndLaunchNewFrame() {
    GameSleep.sleep(1000, () -> {
        dispose();
        NewJFrame.main(null);
    });
}
    
    
    private void loadTextFiles() {
    String directoryPath = "Sys/tem/.extensions/custom/";
    File directory = new File(directoryPath);

    // Check if the directory exists
    if (directory.exists() && directory.isDirectory()) {
        // Get all files in the directory
        File[] files = directory.listFiles();

        // Load content of each text file
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try {
                    java.util.List<String> lines = java.nio.file.Files.readAllLines(file.toPath());
                    // Convert the List<String> to a single String
                    String code = String.join("\n", lines);
                    // Use the content as needed
                    // For example, display in your IDE or execute the code
                    IDE2.runCode(code);
                } catch (IOException e) {
                    e.printStackTrace();
                    // Handle the IOException, you might want to log or display an error message
                }
            }
        }
    }
}
    
    
    private static ImageIcon createCircularIcon(ImageIcon squareIcon, int diameter) {
        // Get the image from the square icon
        Image squareImage = squareIcon.getImage();

        // Create a buffered image with transparency
        BufferedImage bufferedImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);

        // Get the graphics context from the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();

        // Create a circular clip shape
        Ellipse2D.Double clip = new Ellipse2D.Double(0, 0, diameter, diameter);

        // Set the clip to the graphics context
        g2d.setClip(clip);

        // Draw the image onto the buffered image
        g2d.drawImage(squareImage, 0, 0, diameter, diameter, null);

        // Dispose the graphics context
        g2d.dispose();

        // Return the circular image as an ImageIcon
        return new ImageIcon(bufferedImage);
    }
    
    
    private static BufferedImage applySimpleSharpening(BufferedImage inputImage) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();

        // Create a copy of the input image
        BufferedImage outputImage = new BufferedImage(width, height, inputImage.getType());
        Graphics2D g = outputImage.createGraphics();
        g.drawImage(inputImage, 0, 0, null);
        g.dispose();

        // Apply a simple sharpening filter
        float[] kernelData = {
            -1.0f, -1.0f, -1.0f,
            -1.0f,  9.0f, -1.0f,
            -1.0f, -1.0f, -1.0f
        };
        Kernel kernel = new Kernel(3, 3, kernelData);
        ConvolveOp op = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);
        outputImage = op.filter(outputImage, null);

        return outputImage;
    }            
    
    
    
    public static boolean createFolder(String folderPath) {
        File folder = new File(folderPath);

        // Use mkdirs() to create the folder and any necessary parent directories
        boolean folderCreated = folder.mkdirs();

        return folderCreated;
    }
    
    private static void applyBlur(Graphics g) {
        int width = g.getClipBounds().width;
        int height = g.getClipBounds().height;

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Adjust the color and transparency as needed
        g2.setColor(new Color(255, 255, 255, 200)); // 200 for 80% transparency
        g2.fill(new RoundRectangle2D.Double(0, 0, width, height, 10, 10));

        // Apply a blur effect by drawing a partially transparent rectangle
        // over the content
    }
    
    
    
    
    

    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu28 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        textField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        textField2 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu25 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu27 = new javax.swing.JMenu();
        jMenu33 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu34 = new javax.swing.JMenu();
        jMenu35 = new javax.swing.JMenu();
        jMenu36 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jXFrame1 = new org.jdesktop.swingx.JXFrame();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton18 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu12.setText("jMenu12");

        jMenu14.setText("jMenu14");

        jMenu23.setText("jMenu23");

        jMenuItem36.setText("jMenuItem36");

        jMenuItem13.setText("jMenuItem13");

        jMenu28.setText("jMenu28");

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter username");

        label1.setText("LUCORE INC (OS) - SUPR CORP. 2023");

        jLabel3.setText("Enter a username above");

        jLabel4.setText("Welcome, User 1");

        jButton6.setText("Cancel");

        jButton7.setText("Confirm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Second user");

        jLabel6.setText("Welcome, User 2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jDialog1Layout.createSequentialGroup()
                                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(61, 61, 61)
                                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)))))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(jLabel2)))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        jMenu11.setText("jMenu11");

        jMenuItem14.setText("jMenuItem14");

        jMenu25.setText("jMenu25");

        jMenu27.setText("File");
        jMenuBar4.add(jMenu27);

        jMenu33.setText("Edit");
        jMenuBar4.add(jMenu33);

        jMenu34.setText("File");
        jMenuBar5.add(jMenu34);

        jMenu35.setText("Edit");
        jMenuBar5.add(jMenu35);

        jMenu36.setText("jMenu36");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jXFrame1Layout = new javax.swing.GroupLayout(jXFrame1.getContentPane());
        jXFrame1.getContentPane().setLayout(jXFrame1Layout);
        jXFrame1Layout.setHorizontalGroup(
            jXFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jXFrame1Layout.setVerticalGroup(
            jXFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lucore Desktop");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(51, 153, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 512));
        setResizable(false);
        setSize(getMaximumSize());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1410, 512));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/settings.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBackground( new Color(255, 255, 255, 0) );
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/desktopnotepad.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBackground( new Color(255, 255, 255, 0) );
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/desktopcalculator.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBackground( new Color(255, 255, 255, 0) );
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        Properties properties2 = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("data\\taskbar.properties")) {
            // Load properties from the file
            properties2.load(fileInputStream);

            // Retrieve the boolean property "modern" with null checking
            String tMode = properties2.getProperty("modern");
            boolean mode = (tMode != null) ? Boolean.parseBoolean(tMode) : false; // Default value is false

            // Retrieve the boolean property "trBool" with null checking
            String transpar = properties2.getProperty("trBool");
            boolean tr = (transpar != null) ? Boolean.parseBoolean(transpar) : false; // Default value is false

            if (mode) {
                jPanel2 = new JPanel()
                {
                    protected void paintComponent(Graphics g)
                    {
                        g.setColor( getBackground() );
                        g.fillRect(0, 0, getWidth(), getHeight());
                        super.paintComponent(g);
                    }
                };
            }

            if (tr) {
                jPanel2 = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        int arc = 25; // Adjust the arc value as needed
                        int width = getWidth();
                        int height = getHeight();
                        Graphics2D g2d = (Graphics2D) g.create();
                        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        g2d.setColor(getBackground());
                        g2d.fill(new RoundRectangle2D.Double(0, 0, width, height, arc, arc));
                        g2d.dispose();
                    }
                };
                jPanel2.setBackground( new Color(255, 255, 255, 230) );
                jPanel2.setOpaque(false); // background of parent will be painted first

            }
            System.out.println("Taskbar mode: " + mode + "\nTransparency state: " + tr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        jPanel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    if (e.getComponent() instanceof JPanel) {
                        showTaskbarMenu(e.getX(), e.getY());
                    }
                }
            }

        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("12:00 2023/04/23");
        jLabel9.setToolTipText("Shortcut to the calendar");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jButton12.setBackground(new Color(0, 0, 0, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/lucorefulltimeicon.png"))); // NOI18N
        jButton12.setToolTipText("Open full time");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "More", "Log out", "Power", "Force exit", "Shut down", "Sleep", "Alerts", "Calc1", "Volume" }));
        jComboBox2.setToolTipText("More options including force exit, power off and logout.");
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.setMaximumSize(new java.awt.Dimension(150, 45));
        jComboBox2.setMinimumSize(new java.awt.Dimension(150, 22));
        jComboBox2.setPreferredSize(new java.awt.Dimension(150, 22));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new Color(0, 0, 0, 0));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/lucoreactionbaricon.png"))); // NOI18N
        jButton18.setToolTipText("Open the action center");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setMaximumSize(new java.awt.Dimension(61, 45));
        jButton18.setPreferredSize(new java.awt.Dimension(61, 45));
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new Color(0, 0, 0, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/calculator.png"))); // NOI18N
        jButton10.setToolTipText("Open calculator");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(80, 45));
        jButton10.setMinimumSize(new java.awt.Dimension(80, 45));
        jButton10.setPreferredSize(new java.awt.Dimension(80, 45));
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new Color(0, 0, 0, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/notepad.png"))); // NOI18N
        jButton9.setToolTipText("Open notepad");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(80, 45));
        jButton9.setPreferredSize(new java.awt.Dimension(80, 45));
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new Color(0, 0, 0, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton8.setText("Lucore 7.0");
        jButton8.setToolTipText("Lucore version: " + jButton8.getText());
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(80, 45));
        jButton8.setPreferredSize(new java.awt.Dimension(80, 45));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setOpaque(false);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Start", "Pac Man", "Lucore Search", "Settings", "Run", "Luzaet - AI Copilot", "Lucore Chat - AI", "Files", "Notepad", "Paint", "Calender", "Lucore Accounts", "Calculator", "Google Chrome", "More Lucore", "Lucore Fun", "Lucore Create", "CPS Test", "Word Find", "Search - PubEd", "Lucore To-do", "Lucore Clock", "Emoji Center", "Time Changer" }));
        jComboBox1.setToolTipText("Open the start menu.");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setMaximumSize(new java.awt.Dimension(125, 45));
        jComboBox1.setMinimumSize(new java.awt.Dimension(125, 22));
        jComboBox1.setPreferredSize(new java.awt.Dimension(125, 45));
        jComboBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBox1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBox1FocusLost(evt);
            }
        });
        jComboBox1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jComboBox1MouseWheelMoved(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new Color(0, 0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/widgets.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Monday");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucore/startmenulucore2.png"))); // NOI18N
        jButton5.setToolTipText("Open the start menu");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setMaximumSize(new java.awt.Dimension(47, 47));
        jButton5.setMinimumSize(new java.awt.Dimension(47, 47));
        jButton5.setPreferredSize(new java.awt.Dimension(47, 47));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton4)
                .addGap(12, 12, 12)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(178, 178, 178))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(548, 548, 548)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(493, 493, 493)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 670));
        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    if (e.getComponent() instanceof JPanel) {
                        showPopupMenu(e.getX(), e.getY());
                    }
                }
            }

        });

        setContentPane(jPanel1);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(0, 0));

        jMenu3.setText("calc1");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, 0));
        jMenuItem1.setText("run calc1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        jMenuItem3.setText("run apps");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, 0));
        jMenuItem4.setText("run start");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        jMenuItem5.setText("modtb");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_WINDOWS, 0));
        jMenuItem6.setText("check win");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("operations");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, 0));
        jMenuItem7.setText("openvol");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("debug");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("update6.0");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("LucoreDesktop");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    


     
    
    int wifiOff = 0;
    
    
    
    
    int SoundVolume = 50;
    
    
    
    
   
    
    
    
    int UserConfirm = 0;
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         UserConfirm++;
         
        
        
        if (UserConfirm == 4) {
            // TAKE US TO THE HOME PAGE - LATER ON IT WILL BE DONE
            System.out.println("Works!");
        }
        
        if (UserConfirm == 3) {
            // RESET USERCONFIRM
            UserConfirm = 0;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

   

    
    
    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        String data2 = textField2.getText();
        String data = textField1.getText();
        System.out.println(data);
       jLabel4.setText("Welcome, " + data);
       
       
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // SECOND USERNAME INPUT (NOT GOING TO BE IN INFLUX!!) (ONLY LUCORE MIDAS!!)
        String data2 = textField2.getText();
        System.out.println(data2);
        jLabel6.setText("Welcome, " + data2);
        // jLabel(NUMBER).setText(data2);
    }//GEN-LAST:event_textField2ActionPerformed

    int uUDA = 0;
    
    
    
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // GET SLECTED MODEL AND IF IT EQUALS THE MODEL, ENTER E.G: PACMAN
        
        
        int x = 0;
        int y = 198;
        
        
        JPopupMenu popupMenu = new JPopupMenu();
        String GetText2 = popupMenu.getLabel();
      
        JMenuItem forceExitItem = new JMenuItem("Pac Man");
        JMenuItem changeColor = new JMenuItem("Lucore Search");
        JMenuItem helpCentre = new JMenuItem("Settings");
        JMenuItem minim = new JMenuItem("Run");
        JMenuItem forceExitItem2 = new JMenuItem("Luzaet - Your very own AI Copilot ChatBot");
        JMenuItem changeColor2 = new JMenuItem("Lucore Chat - AI");
        JMenuItem helpCentre2 = new JMenuItem("Files");
        JMenuItem minim2 = new JMenuItem("Notepad");
        JMenuItem forceExitItem3 = new JMenuItem("Paint");
        JMenuItem changeColor3 = new JMenuItem("Calender");
        JMenuItem helpCentre3 = new JMenuItem("Lucore Accounts");
        JMenuItem minim3 = new JMenuItem("Calculator");
        JMenuItem forceExitItem4 = new JMenuItem("More Lucore");
        JMenuItem changeColor4 = new JMenuItem("Lucore Fun");
        JMenuItem helpCentre4 = new JMenuItem("Lucore Create");
        JMenuItem minim4 = new JMenuItem("CPS Test");
        // new line
        JMenuItem forceExitItem5 = new JMenuItem("Word Find");
        JMenuItem changeColor5 = new JMenuItem("Search - PubEd");
        JMenuItem helpCentre5 = new JMenuItem("Lucore To-do");
        JMenuItem minim5 = new JMenuItem("Lucore Clock");
        if (GetText2 == "More Lucore") {
            moreLucoreA moreLucore = new moreLucoreA();
            moreLucore.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Lucore Clock") {
            ClockGUI c = new ClockGUI();
            c.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        
        if (GetText2 == "Lucore To-do") {
            lucoreToDo t = new lucoreToDo();
            t.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Luzaet - AI Copilot") {
            //LucoreLuzaet1 luzaet = new LucoreLuzaet1();
            //luzaet.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Paint") {
            LucorePaint1 paint1 = new LucorePaint1();
            paint1.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Lucore Create") {
            PhotoEditorGUI create = new PhotoEditorGUI();
            create.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Search - PubEd") {
            SearchEngineGUI search1 = new SearchEngineGUI();
            search1.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Google Chrome") {
            try {
                openChrome();
            } catch (URISyntaxException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        
        
        
        
        
        
        if (GetText2 == "CPS Test") {
            CPSTestGUI cps = new CPSTestGUI();
            cps.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Word Find") {
            WordMatchGameGUI wordfind = new WordMatchGameGUI();
            wordfind.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        if (GetText2 == "Lucore Chat - AI") {
            ChatBotGUI lcc = new ChatBotGUI();
            lcc.setVisible(true);
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
            
        } 
        
        
        
        
        
        
        
        
        if (GetText2 == "Pac Man") {
            Pacman pacman = new Pacman();
            pacman.setVisible(true);
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
            
        } 
        
        if (GetText2 == "Lucore Search") {
            lucoreSearchA Search = new lucoreSearchA();
            Search.setVisible(true);
            
            
            
            
            jComboBox1.setSelectedItem("Start");
            
        }
        
        
        
        
        
        
       
        
        if (GetText2 == "Settings") {
            lucoreSettingsA Settings = new lucoreSettingsA();
            Settings.setVisible(true);
            
           
            
            jComboBox1.setSelectedItem("Start");
            
        }
        
        
        
        if (GetText2 == "Run") {
            lucoreRunA Run = new lucoreRunA();
            Run.setVisible(true);
            
            
            
            
            
            //jButton11.setText("Run");
            jComboBox1.setSelectedItem("Start");
                    }
        
        if (GetText2 == "Files") {
            lucoreFilesInfluxA files = new lucoreFilesInfluxA();
            files.setVisible(true);
        
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        if (GetText2 == "Notepad") {
            test notepad = new test();
            notepad.setVisible(true);
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        if (GetText2 == "Lucore Fun") {
            lucoreFunA fun = new lucoreFunA();
            fun.setVisible(true);
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText2 == "Lucore Accounts") {
            lucoreAccounts accs = new lucoreAccounts();
            accs.setVisible(true);
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        if (GetText2 == "Calender") {
            lucorecalenderA calender = new lucorecalenderA();
            calender.setVisible(true);
            
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        forceExitItem.addActionListener(e -> {
            // Perform force exit operation
            System.exit(0);
        });
        
        minim.addActionListener(e -> {
            // Perform minimize exit operation
            dispose();
            lucoreMinimized min = new lucoreMinimized();
            min.setVisible(true);
        });
        
        changeColor.addActionListener(e -> {
            // Change background color
            LucoreStart1 start = new LucoreStart1();
            start.setVisible(true);
        });
        
        helpCentre.addActionListener(e -> {
            // Open Help Centre
            lucoreHelpCentre help = new lucoreHelpCentre();
            help.setVisible(true);
        });
        
        popupMenu.add(forceExitItem);
        popupMenu.add(changeColor);
        popupMenu.add(helpCentre);
        popupMenu.add(minim);
        popupMenu.add(forceExitItem2);
        popupMenu.add(changeColor2);
        popupMenu.add(helpCentre2);
        popupMenu.add(minim2);
        popupMenu.add(forceExitItem3);
        popupMenu.add(changeColor3);
        popupMenu.add(helpCentre3);
        popupMenu.add(minim3);
        popupMenu.add(forceExitItem4);
        popupMenu.add(changeColor4);
        popupMenu.add(helpCentre4);
        popupMenu.add(minim4);
        popupMenu.add(forceExitItem5);
        popupMenu.add(changeColor5);
        popupMenu.add(helpCentre5);
        popupMenu.add(minim5);

        // Add more menu items as needed

        popupMenu.show(this, x, y);
        
        
        String GetText;
        GetText = (String) jComboBox1.getSelectedItem();
        
        String jB11;
        //jB11 = (String) jButton11.getText();
        
        String jB12;
        jB12 = (String) jButton12.getText();
        
        
        
        
        
        
        
        String jB18;
        jB18 = (String) jButton18.getText();
        
        
       
        
        if (GetText == "More Lucore") {
            moreLucoreA moreLucore = new moreLucoreA();
            moreLucore.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        
        if (GetText == "Lucore Clock") {
            ClockGUI c = new ClockGUI();
            c.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        if (GetText == "Lucore To-do") {
            lucoreToDo t = new lucoreToDo();
            t.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Luzaet - AI Copilot") {
            //LucoreLuzaet1 luzaet = new LucoreLuzaet1();
            //luzaet.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Paint") {
            LucorePaint1 paint1 = new LucorePaint1();
            paint1.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Lucore Create") {
            PhotoEditorGUI create = new PhotoEditorGUI();
            create.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Search - PubEd") {
            SearchEngineGUI search1 = new SearchEngineGUI();
            search1.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Google Chrome") {
            try {
                openChrome();
            } catch (URISyntaxException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        
        
        
        
        
        
        if (GetText == "CPS Test") {
            CPSTestGUI cps = new CPSTestGUI();
            cps.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Word Find") {
            WordMatchGameGUI wordfind = new WordMatchGameGUI();
            wordfind.setVisible(true);
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        if (GetText == "Lucore Chat - AI") {
            ChatBotGUI lcc = new ChatBotGUI();
            lcc.setVisible(true);
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
            
        } 
        
        
        
        
        
        
        
        
        if (GetText == "Pac Man") {
            Pacman pacman = new Pacman();
            pacman.setVisible(true);
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
            
        } 
        
        if (GetText == "Lucore Search") {
            lucoreSearchA Search = new lucoreSearchA();
            Search.setVisible(true);
            
            
            
            
            jComboBox1.setSelectedItem("Start");
            
        }
        
        
        
        
        
        
       
        
        if (GetText == "Settings") {
            lucoreSettingsA Settings = new lucoreSettingsA();
            Settings.setVisible(true);
            
           
            
            jComboBox1.setSelectedItem("Start");
            
        }
        
        
        
        if (GetText == "Run") {
            lucoreRunA Run = new lucoreRunA();
            Run.setVisible(true);
            
            
            
            
            
            //jButton11.setText("Run");
            jComboBox1.setSelectedItem("Start");
                    }
        
        if (GetText == "Files") {
            lucoreFilesInfluxA files = new lucoreFilesInfluxA();
            files.setVisible(true);
        
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        if (GetText == "Notepad") {
            test notepad = new test();
            notepad.setVisible(true);
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        if (GetText == "Lucore Fun") {
            lucoreFunA fun = new lucoreFunA();
            fun.setVisible(true);
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        if (GetText == "Lucore Accounts") {
            lucoreAccounts accs = new lucoreAccounts();
            accs.setVisible(true);
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        if (GetText == "Calender") {
            lucorecalenderA calender = new lucorecalenderA();
            calender.setVisible(true);
            
            
            
            
            
            
            
            
            
            jComboBox1.setSelectedItem("Start");
        }
        
    
        
        
            
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    private Image loadImage(String imagePath) {
        try {
            File file = new File(imagePath);
            BufferedImage image = ImageIO.read(file);
            return image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // OPEN NOTEPAD                              
    int x = 540;
    int y = 85;
    
    test np = new test();

    // Create a Timer to handle the animation
    int animationDuration = 100; // Duration of the animation in milliseconds
    int steps = 30; // Number of animation steps
    int delay = animationDuration / steps;

    /*javax.swing.Timer timer = new javax.swing.Timer(delay, new ActionListener() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        private int step = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            float fraction = (float) step / steps;
            np.setOpacity(fraction); // Set the opacity based on the animation step
            np.repaint(); // Repaint the component to reflect the opacity change

            step++;
            if (step >= steps) {
                ((javax.swing.Timer) e.getSource()).stop(); // Animation completed, stop the Timer
            }
        }
    });

    // Start the Timer to initiate the animation
    timer.start();*/
    
    
    // Open the notepad with the dialog animator class (New code)
    DialogAnimator.startAnimationAndOpen(np, 0, 0, 0, 0, 150, 150, DialogAnimator.OPEN_RIGHT);
    }//GEN-LAST:event_jButton9ActionPerformed

    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // OPEN CALCULATOR
        ModernCalculator.main(null);
    }
/*
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // OPEN CALCULATOR
    ModernCalculator.main(args);
    }//GEN-LAST:event_jButton10ActionPerformed
*/
    
    int i = 0;
    
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // MAKE A 'IF' FUNCTION
        /* // Don't open the more options GUI..
        lucoreMoreOptions more = new lucoreMoreOptions();
        more.setVisible(true);
        */
        
        Properties properties = new Properties();
        
        // Set properties with Lucore desktop's data
        properties.setProperty("imagePath", lucorePersonalizationSettings.filedir.getPath());
        properties.setProperty("button1X", "" + jButton1.getX());
        properties.setProperty("button1Y", "" + jButton1.getY());
        properties.setProperty("button2X", "" + jButton2.getX());
        properties.setProperty("button2Y", "" + jButton2.getY());
        properties.setProperty("button3X", "" + jButton3.getX());
        properties.setProperty("button3Y", "" + jButton3.getY());
        properties.setProperty("points", "" + points);
        properties.setProperty("abc", "" + points);
        properties.setProperty("lookAndFeel", "" + UIManager.getLookAndFeel().getName());
        properties.setProperty("passwordRequirement", "" + lucoreSecuritySettings.pwreq);
        properties.setProperty("easyEscapeLimits", "" + lucoreSecuritySettings.eetl);
        properties.setProperty("boolPassword", "" + lucoreSecuritySettings.apppwreq);
        properties.setProperty("hasAccount", "" + lucoreAccounts.hasAccount);
        if (lucoreChangePWA.password != null) {
            properties.setProperty("password", lucoreChangePWA.password);
        }

        // Save the properties to a file
        try (FileOutputStream fos = new FileOutputStream("data/config.properties")) {
            properties.store(fos, "Program Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String T = (String) jComboBox2.getSelectedItem();
        if (T == "Log out") {
            int x = 540;
    int y = 85;
            dispose();
    
    lucoreLoginPassword np = new lucoreLoginPassword();

    np.setOpacity(0.95f);
    np.setVisible(true);
        }
        
        
        if (T == "Alerts") {
            lucoreNotificationSettings.main(null);
            
            
            
            jComboBox2.setSelectedItem("More");
        }
        
        if (T == "Volume") {
            DialogAnimator.startAnimationAndOpen(new VolumeDialog(), new VolumeDialog().getX(), new VolumeDialog().getY()-75, new VolumeDialog().getX(), new VolumeDialog().getY(), 100, 100, DialogAnimator.OPEN_UP);
            
            
            
            jComboBox2.setSelectedItem("More");
        }
        
        if (T == "Calc1") {
            lucoreCalc1.main(null);
            
            
            
            jComboBox2.setSelectedItem("More");
        }
        
            if (T == "Power") {
                lucorePowerSettings power = new lucorePowerSettings();
                 power.setVisible(true);
            jComboBox2.setSelectedItem("More");
            
            
        }
            
            
            
        
            
            if (T == "Force exit") {
                Properties properties1 = new Properties();
        
        // Set properties with Lucore desktop's data
        properties1.setProperty("imagePath", lucorePersonalizationSettings.filedir.getPath());
        properties1.setProperty("button1X", "" + jButton1.getX());
        properties1.setProperty("button1Y", "" + jButton1.getY());
        properties1.setProperty("button2X", "" + jButton2.getX());
        properties1.setProperty("button2Y", "" + jButton2.getY());
        properties1.setProperty("button3X", "" + jButton3.getX());
        properties1.setProperty("button3Y", "" + jButton3.getY());
        properties1.setProperty("points", "" + points);
        properties1.setProperty("abc", "" + points);
        properties1.setProperty("lookAndFeel", "" + UIManager.getLookAndFeel().getName());
        properties1.setProperty("passwordRequirement", "" + lucoreSecuritySettings.pwreq);
        properties1.setProperty("easyEscapeLimits", "" + lucoreSecuritySettings.eetl);
        properties1.setProperty("boolPassword", "" + lucoreSecuritySettings.apppwreq);
        properties1.setProperty("hasAccount", "" + lucoreAccounts.hasAccount);
        if (lucoreChangePWA.password != null) {
            properties1.setProperty("password", lucoreChangePWA.password);
        }

        // Save the properties to a file
        try (FileOutputStream fos = new FileOutputStream("data/config.properties")) {
            properties1.store(fos, "Program Configuration");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
                TaskbarControl.showTaskbar();
                
                // Wait 100ms until force exit to give it time to save data..
                GameSleep.sleep(100, () -> {
                    // Use SwingUtilities.invokeLater() for a clean exit
                    SwingUtilities.invokeLater(() -> {
                        System.exit(0);
                    });
                });
            }
            
            
            if (T == "Background color") {
                LucoreStart1 color = new LucoreStart1();
                color.setVisible(true);
            }
            
            if (T == "Shut down") {
        lucorePowerOffA off = new lucorePowerOffA();
        off.setVisible(true);
    }
            
            if (T == "Sleep") {
            lucoreSleepModeA sleep = new lucoreSleepModeA();
            sleep.setVisible(true);
            }  
            jComboBox2.setSelectedItem("More");
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Enter Calc1
        lucoreCalc1 c = new lucoreCalc1();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {
    SwingUtilities.invokeLater(() -> {
            int x = 380;
            int startY = 600; // Start off-screen
            int endY = 260;

            lucoreStartMenu s = new lucoreStartMenu();

            // Set initial opacity to 0 (fully transparent)
            s.setOpacity(0.0f);
            s.setLocation(x, startY);
            s.setVisible(true);

            int animationDuration = 500; // Duration of the animation in milliseconds
            int steps = 60; // Number of animation steps

            long delay = animationDuration / steps;
            long period = animationDuration / steps;

            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

            // Schedule the animation with a fixed rate
            executorService.scheduleAtFixedRate(new Runnable() {
    
                private int step = 0;

                @Override
                public void run() {
    
                    if (step >= steps) {
                        executorService.shutdown();
                        s.setOpacity(0.95f);
                        return; // Animation completed, shutdown the executor
                    }

                    float fraction = (float) step / steps;

                    int currentY = (int) (startY + fraction * (endY - startY));
                    s.setLocation(x, currentY); // Update the Y-coordinate for slide-up effect

                    s.setOpacity(fraction); // Set the opacity based on the animation step
                    SwingUtilities.invokeLater(() -> s.repaint()); // Repaint the component

                    step++;
                }
            }, delay, period,TimeUnit.MILLISECONDS);
        });
    }




    /*
    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // Open lucore start menu..
        int x = 540;
        int y = 176;
        
       

        lucoreStartMenu s = new lucoreStartMenu();
        s.setVisible(true);
    }//GEN-LAST:event_jComboBox1MouseClicked
 */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // Open full time..
        lucoreFullTime f = new lucoreFullTime();
        //f.setVisible(true);
        DialogAnimator.startAnimationAndOpen(f, f.getX(), 600, f.getX(), f.getY(), 150, 150, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // Open lucore action center..
        lucoreActionCenter a = new lucoreActionCenter();
        DialogAnimator.startAnimationAndOpen(a, a.getX(), 600, a.getX(), a.getY(), 150, 150, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // Open more options.. - Update: Don't open..
        /*
        lucoreMoreOptions more = new lucoreMoreOptions();
        more.setVisible(true);
        */
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        lucoreSettingsA s = new lucoreSettingsA();
        DialogAnimator.startAnimationAndOpen(s, 0, 0, 0, 0, 150, 150, DialogAnimator.OPEN_UP);
    }
    
    
    /*
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Calculate the offset from the top-left corner of the button to the cursor position
                offsetX = e.getX();
                offsetY = e.getY();
        lucoreSettingsA s = new lucoreSettingsA();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
*/
    
    
    private static void modifyClassesInPackage(String packageName) {
        try {
            // Get all classes in the specified package
            java.util.List<Class<?>> classes = getClasses(packageName);

            // Iterate through each class and modify it (exclude certain classes as needed)
            for (Class<?> clazz : classes) {
                String className = clazz.getSimpleName();
                if (!className.equals("ExcludedClass1") && !className.equals("ExcludedClass2")) {
                    // Create an instance and use the utility method to modify it
                    Object instance = clazz.getDeclaredConstructor().newInstance();
                    if (instance instanceof JFrame) {
                        ComponentModifier.modifyComponent((JFrame) instance);
                    } else {
                        // Handle other types of components if needed
                    }

                    // You can do additional modifications here if needed
                }
            }
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
                InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static java.util.List<Class<?>> getClasses(String packageName) throws ClassNotFoundException, IOException {
    java.util.List<Class<?>> classes = new ArrayList<>();
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    String path = packageName.replace('.', '/');

    Enumeration<URL> resources = classLoader.getResources(path);
    java.util.List<File> dirs = new ArrayList<>();

    while (resources.hasMoreElements()) {
        URL resource = resources.nextElement();
        dirs.add(new File(resource.getFile()));
    }

    for (File directory : dirs) {
        classes.addAll(findClasses(directory, packageName));
    }

    return classes;
}

private static java.util.List<Class<?>> findClasses(File directory, String packageName) throws ClassNotFoundException {
    java.util.List<Class<?>> classes = new ArrayList<>();
    if (!directory.exists()) {
        return classes;
    }

    File[] files = directory.listFiles();
    if (files != null) {
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
    }

    return classes;
}


    private static String[] getClassNames(String packageDirectory, String packageName) {
        File packageDir = new File(packageDirectory);
        return packageDir.list((dir, name) -> name.endsWith(".class"));
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Open notepad..
        test s = new test();
        DialogAnimator.startAnimationAndOpen(s, 0, 0, 0, 0, 150, 150, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Open calculator..
        String[] args = null;
        ModernCalculator.main(args);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Run the apps.. (Not anymore)
        //ShutdownOrRestartPCGUI sr = new ShutdownOrRestartPCGUI();
        //new ShutdownOrRestartPCGUI();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:SwingUtilities.invokeLater(() -> {
            int x = 380;
            int startY = 600; // Start off-screen
            int endY = 260;

            lucoreStartMenu s = new lucoreStartMenu();

            // Set initial opacity to 0 (fully transparent)
            s.setOpacity(0.0f);
            s.setLocation(x, startY);
            s.setVisible(true);

            int animationDuration = 500; // Duration of the animation in milliseconds
            int steps = 60; // Number of animation steps

            long delay = animationDuration / steps;
            long period = animationDuration / steps;

            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

            // Schedule the animation with a fixed rate
            executorService.scheduleAtFixedRate(new Runnable() {
    
                private int step = 0;

                @Override
                public void run() {
    
                    if (step >= steps) {
                        executorService.shutdown();
                        return; // Animation completed, shutdown the executor
                    }

                    float fraction = (float) step / steps;

                    int currentY = (int) (startY + fraction * (endY - startY));
                    s.setLocation(x, currentY); // Update the Y-coordinate for slide-up effect

                    s.setOpacity(fraction); // Set the opacity based on the animation step
                    SwingUtilities.invokeLater(() -> s.repaint()); // Repaint the component

                    step++;
                }
            }, delay, period,TimeUnit.MILLISECONDS);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jPanel2.setBounds(40, 718, 1285, 50);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        lucorecalenderA calender = new lucorecalenderA();
        //calender.setVisible(true);
        DialogAnimator.startAnimationAndOpen(calender, calender.getX(), calender.getY(), calender.getX(), calender.getY(), 150, 150, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            Robot robot = new Robot();
            
            // Simulate pressing the "Escape" key
            robot.keyPress(KeyEvent.VK_ESCAPE);
            robot.keyRelease(KeyEvent.VK_ESCAPE);
        } catch (AWTException e) {
            e.printStackTrace();
        }
       
       SwingUtilities.invokeLater(() -> {
            jButton5ActionPerformed(null);
        });
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jComboBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusGained
        // TODO add your handling code here:
        //lucoreStartMenu s = new lucoreStartMenu();
        //DialogAnimator.startAnimationAndOpen(s, s.getX(), s.getY(), s.getX(), s.getY(), 200, 200, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jComboBox1FocusGained

    private void jComboBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBox1FocusLost
        // TODO add your handling code here:
        //lucoreStartMenu s = new lucoreStartMenu();
        //DialogAnimator.startAnimationAndDispose(s, s.getX(), s.getY(), s.getX(), s.getY(), 200, 200, DialogAnimator.CLOSE_UP);
    }//GEN-LAST:event_jComboBox1FocusLost

    private void jComboBox1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jComboBox1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseWheelMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        lucoreWidgetsMenu w = new lucoreWidgetsMenu();
        //w.setVisible(true);
        
        DialogAnimator.startAnimationAndOpen(w, w.getX(), 600, w.getX(), 220, 150, 150, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Open the start menu..
        SwingUtilities.invokeLater(() -> {
            int x = 380;
            int startY = 600; // Start off-screen
            int endY = 280;

            lucoreStartMenu s = new lucoreStartMenu();

            // Set initial opacity to 0 (fully transparent)
            s.setOpacity(0.0f);
            s.setLocation(x, startY);
            s.setVisible(true);

            int animationDuration = 500; // Duration of the animation in milliseconds
            int steps = 60; // Number of animation steps

            long delay = animationDuration / steps;
            long period = animationDuration / steps;

            ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

            // Schedule the animation with a fixed rate
            executorService.scheduleAtFixedRate(new Runnable() {
    
                private int step = 0;

                @Override
                public void run() {
    
                    if (step >= steps) {
                        executorService.shutdown();
                        s.setOpacity(0.95f);
                        return; // Animation completed, shutdown the executor
                    }

                    float fraction = (float) step / steps;

                    int currentY = (int) (startY + fraction * (endY - startY));
                    s.setLocation(x, currentY); // Update the Y-coordinate for slide-up effect

                    s.setOpacity(fraction); // Set the opacity based on the animation step
                    SwingUtilities.invokeLater(() -> s.repaint()); // Repaint the component

                    step++;
                }
            }, delay, period,TimeUnit.MILLISECONDS);
        });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Restore all windows (Newer syntax)
        //RestoreAllWindows.main(null);
        
        // Open the Ion assistant with animation..
        lucoreIonAssistant a = new lucoreIonAssistant();
        DialogAnimator.startAnimationAndOpen(a, a.getX(), a.getY(), a.getX(), a.getY(), 150, 150, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Open the volume changer dialog..
        DialogAnimator.startAnimationAndOpen(new VolumeDialog(), new VolumeDialog().getX(), new VolumeDialog().getY()-75, new VolumeDialog().getX(), new VolumeDialog().getY(), 100, 100, DialogAnimator.OPEN_UP);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        lucore6point0Notification.main(null);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

   
    
    

    
    
    private void updateTime() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        // Operation to check if file exists
        // Specify the path to the config.properties file
        String filePath2 = "data/personalization.properties";

        // Create a File object with the specified file path
        File configFile2 = new File(filePath2);

        // Check if the file exists
        if (configFile2.exists()) {
        Properties loadedProperties = new Properties();
        try (FileInputStream fis = new FileInputStream("data/personalization.properties")) {
            loadedProperties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Variable declaration
        boolean secs = Boolean.parseBoolean(loadedProperties.getProperty("secs"));
    
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm yyyy/MM/dd");
        if (!secs) {
            dateFormat = new SimpleDateFormat("HH:mm yyyy/MM/dd");
            jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        } else if (secs) {
            dateFormat = new SimpleDateFormat("HH:mm:ss yyyy/MM/dd");
            jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        }
        Date currentTime = new Date();
        String formattedTime = dateFormat.format(currentTime);
        jLabel9.setText("" + formattedTime);
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // Get the month
        Month month = currentDate.getMonth();
        String monthString = month.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        
        // Display the day of the week
        String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        jLabel7.setText(dayOfWeekString);
        
        } else {
            // If the properties file does not exist, print that it does not exist..
            System.out.println("Personalization property file does not exist.");
        }
    }
    
    
    private void CR_Notification() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        if (dnd = false) {
            CRNotification crn = new CRNotification();
            crn.setVisible(true);
        }
    }
    
    private void CCR_Notification() {
    // Add a MouseAdapter to handle mouse press and drag events
    
        CRNotification crn = new CRNotification();
        crn.setVisible(false);
    }
    
    
    static void openChrome() throws URISyntaxException {
        try {
            // Specify the URL or web page you want to open in Chrome
            String url = "https://www.google.com";

            // Create a URI object with the URL
            URI uri = new URI(url);

            // Check if the Desktop class is supported on the current platform
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    // Open the URI in the default web browser
                    desktop.browse(uri);
                } else {
                    System.out.println("Default browser is not supported.");
                }
            } else {
                System.out.println("Desktop is not supported.");
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    void Dispose() {
        dispose();
    }

    
   private void createDraggableButton(JFrame frame, JPanel panel, String buttonText, int x, int y) {
        FlatLightLaf.setup();
        
    JButton button = new JButton(buttonText);
    button.setBounds(x, y, 90, 90);
    
    button.setBorderPainted(true);
    button.setContentAreaFilled(true);

    panel.add(button);

    button.addActionListener(e -> frame.setVisible(true));

    button.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            offsetX = e.getX();
            offsetY = e.getY();
        }
    });

    button.addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {
            if (offsetX != 0 && offsetY != 0) {
                int x = e.getXOnScreen() - offsetX;
                int y = e.getYOnScreen() - offsetY;
                button.setLocation(x, y);
                button.repaint();
            }
        }
    });
}
    
    
    
    
    
    private void showPopupMenu(int x, int y) {
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem forceExitItem = new JMenuItem("<html><b><font size='4'>Force Exit</font></b></html>");
        JMenuItem changeColor = new JMenuItem("<html><b><font size='4'>Open Calc1</font></b></html>");
        JMenuItem helpCentre = new JMenuItem("<html><b><font size='4'>Help Centre</font></b></html>");
        JMenuItem minim = new JMenuItem("<html><b><font size='4'>Minimize Exit</font></b></html>");
        JMenuItem refresh = new JMenuItem("<html><b><font size='4'>Refresh Desktop</font></b></html>");
        JMenuItem background = new JMenuItem("<html><b><font size='4'>Change Background</font></b></html>");
        JMenuItem button = new JMenuItem("<html><b><font size='4'>Personalize</font></b></html>");
        JMenuItem debugger = new JMenuItem("<html><b><font size='4'>Debugger</font></b></html>");
        JMenu shortcut = new JMenu("<html><b><font size='4'>Shortcuts (In development)</font></b></html>");
        JMenuItem cal = new JMenuItem("<html><b><font size='4'>Calendar</font></b></html>");
        JMenuItem pacman = new JMenuItem("<html><b><font size='4'>Pac-Man</font></b></html>");
        JMenuItem files = new JMenuItem("<html><b><font size='4'>Files</font></b></html>");
        JMenuItem sx = new JMenuItem("<html><b><font size='4'>SearchX</font></b></html>");
        JMenuItem pword = new JMenuItem("<html><b><font size='4'>Create password</font></b></html>");
        shortcut.add(cal);
        shortcut.add(pacman);
        shortcut.add(files);
        shortcut.add(sx);
        
        
        cal.addActionListener(e -> {
            // Create and add a draggable button to the panel
            createDraggableButton(new lucorecalenderA(), jPanel1, "Calendar", 50, 50);
        });
        
        forceExitItem.addActionListener(e -> {
            // Perform force exit operation
            
            TaskbarControl.showTaskbar();
            
            Properties properties = new Properties();
        
        // Set properties with Lucore desktop's data
        properties.setProperty("imagePath", lucorePersonalizationSettings.filedir.getPath());
        properties.setProperty("button1X", "" + jButton1.getX());
        properties.setProperty("button1Y", "" + jButton1.getY());
        properties.setProperty("button2X", "" + jButton2.getX());
        properties.setProperty("button2Y", "" + jButton2.getY());
        properties.setProperty("button3X", "" + jButton3.getX());
        properties.setProperty("button3Y", "" + jButton3.getY());
        properties.setProperty("points", "" + points);
        properties.setProperty("abc", "" + points);
        properties.setProperty("lookAndFeel", "" + UIManager.getLookAndFeel().getName());
        properties.setProperty("passwordRequirement", "" + lucoreSecuritySettings.pwreq);
        properties.setProperty("easyEscapeLimits", "" + lucoreSecuritySettings.eetl);
        properties.setProperty("boolPassword", "" + lucoreSecuritySettings.apppwreq);
        properties.setProperty("hasAccount", "" + lucoreAccounts.hasAccount);
        if (lucoreChangePWA.password != null) {
            properties.setProperty("password", lucoreChangePWA.password);
        }

        // Save the properties to a file
        try (FileOutputStream fos = new FileOutputStream("data/config.properties")) {
            properties.store(fos, "Program Configuration");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        GameSleep.sleep(10, () -> {
            
            dispose();
            NewJFrame np = new NewJFrame();
            np.setVisible(true);
            
            FlatLightLaf.setup();
        });
        GameSleep.sleep(10, () -> {
            System.exit(0);
        });
        });
        
        minim.addActionListener(e -> {
            // Perform minimize exit operation
            Properties properties = new Properties();
        
        // Set properties with Lucore desktop's data
        properties.setProperty("imagePath", lucorePersonalizationSettings.filedir.getPath());
        properties.setProperty("button1X", "" + jButton1.getX());
        properties.setProperty("button1Y", "" + jButton1.getY());
        properties.setProperty("button2X", "" + jButton2.getX());
        properties.setProperty("button2Y", "" + jButton2.getY());
        properties.setProperty("button3X", "" + jButton3.getX());
        properties.setProperty("button3Y", "" + jButton3.getY());
        properties.setProperty("points", "" + points);
        properties.setProperty("abc", "" + points);
        properties.setProperty("lookAndFeel", "" + UIManager.getLookAndFeel().getName());
        properties.setProperty("passwordRequirement", "" + lucoreSecuritySettings.pwreq);
        properties.setProperty("easyEscapeLimits", "" + lucoreSecuritySettings.eetl);
        properties.setProperty("boolPassword", "" + lucoreSecuritySettings.apppwreq);
        properties.setProperty("hasAccount", "" + lucoreAccounts.hasAccount);
        if (lucoreChangePWA.password != null) {
            properties.setProperty("password", lucoreChangePWA.password);
        }

        // Save the properties to a file
        try (FileOutputStream fos = new FileOutputStream("data/config.properties")) {
            properties.store(fos, "Program Configuration");
        } catch (IOException eex) {
            eex.printStackTrace();
        }
        GameSleep.sleep(10, () -> {
            dispose();
            lucoreMinimized min = new lucoreMinimized();
            min.setVisible(true);
        });
        });
        
        changeColor.addActionListener(e -> {
            // Change background color
            lucoreCalc1.main(null);
        });
        
        helpCentre.addActionListener(e -> {
            // Open Help Centre
            lucoreHelpCentre help = new lucoreHelpCentre();
            help.setVisible(true);
        });
        
        pword.addActionListener(e -> {
            // Open Help Centre
            lucoreChangePWA.main(null);
        });
        
        refresh.addActionListener(e -> {
            // Perform desktop refresh operation..
            Properties properties = new Properties();
        
        // Set properties with Lucore desktop's data
        properties.setProperty("imagePath", lucorePersonalizationSettings.filedir.getPath());
        properties.setProperty("button1X", "" + jButton1.getX());
        properties.setProperty("button1Y", "" + jButton1.getY());
        properties.setProperty("button2X", "" + jButton2.getX());
        properties.setProperty("button2Y", "" + jButton2.getY());
        properties.setProperty("button3X", "" + jButton3.getX());
        properties.setProperty("button3Y", "" + jButton3.getY());
        properties.setProperty("points", "" + points);
        properties.setProperty("abc", "" + points);
        properties.setProperty("lookAndFeel", "" + UIManager.getLookAndFeel().getName());
        properties.setProperty("passwordRequirement", "" + lucoreSecuritySettings.pwreq);
        properties.setProperty("easyEscapeLimits", "" + lucoreSecuritySettings.eetl);
        properties.setProperty("boolPassword", "" + lucoreSecuritySettings.apppwreq);
        properties.setProperty("hasAccount", "" + lucoreAccounts.hasAccount);
        if (lucoreChangePWA.password != null) {
            properties.setProperty("password", lucoreChangePWA.password);
        }

        // Save the properties to a file
        try (FileOutputStream fos = new FileOutputStream("data/config.properties")) {
            properties.store(fos, "Program Configuration");
        } catch (IOException exx) {
            exx.printStackTrace();
        }
        
        GameSleep.sleep(10, () -> {
            
            dispose();
            NewJFrame np = new NewJFrame();
            np.setVisible(true);
            
            FlatLightLaf.setup();
            jPanel2.putClientProperty(FlatClientProperties.STYLE, "arc: 50"); // Set a different arc value
            SwingUtilities.updateComponentTreeUI(this);
        });
        });
        
        
        background.addActionListener(e -> {
            // Change background image..
            // Set the new style property for jPanel2
            jPanel2.putClientProperty(FlatClientProperties.STYLE, "arc: 50");

            // Repaint jPanel2 to apply the new style
            jPanel2.revalidate();
            jPanel2.repaint();
        });
        
        button.addActionListener(e -> {
            // Open personlization settings..
            lucorePersonalizationSettings personalization = new lucorePersonalizationSettings();
            personalization.setVisible(true);
        });
        
        debugger.addActionListener(e -> {
            // Restore debugger..
            SwingLoggerExample.restore();
        });
        
        popupMenu.add(forceExitItem);
        popupMenu.add(changeColor);
        popupMenu.add(helpCentre);
        popupMenu.add(minim);
        popupMenu.add(refresh);
        popupMenu.add(button);
        popupMenu.add(debugger);
        popupMenu.add(background);
        popupMenu.add(pword);
        //popupMenu.add(shortcut);

        // Add more menu items as needed

        popupMenu.show(this, x, y);
    }
    
    
    private void showTaskbarMenu(int x, int y) {
        JPopupMenu popupMenu1 = new JPopupMenu();

        JMenuItem forceExitItem = new JMenuItem("<html><b><font size='4'>Taskbar settings</font></b></html>");
        JMenuItem changeColor = new JMenuItem("<html><b><font size='4'>Task manager</font></b></html>");
        JMenuItem helpCentre = new JMenuItem("<html><b><font size='4'>Personalization settings</font></b></html>");
        JMenuItem minim = new JMenuItem("<html><b><font size='4'>Logger</font></b></html>");
        
        forceExitItem.addActionListener(e -> {
            // Open the taskbar settings..
            lucoreTaskbarSettings.main(null);
        });
        
        minim.addActionListener(e -> {
            SwingLoggerExample.restore();
        });
        
        changeColor.addActionListener(e -> {
            // Change background color
            TaskManagerApp.main(null);
        });
        
        helpCentre.addActionListener(e -> {
            // Open Help Centre
            lucorePersonalizationSettings.main(null);
        });
        
        
        popupMenu1.add(forceExitItem);
        popupMenu1.add(changeColor);
        popupMenu1.add(helpCentre);
        popupMenu1.add(minim);

        // Add more menu items as needed

        popupMenu1.show(jPanel2, x, y);
    }
    
    
    
    private void setBackgroundImage() {
    // Add a MouseAdapter to handle mouse press and drag events
    
         Image image = null;
        
        try {
            lucorePersonalizationSettings p = new lucorePersonalizationSettings();
            
            // Files
            image = ImageIO.read(p.fileChooser.getSelectedFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        imagePanel = new ImagePanel(image);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(imagePanel, BorderLayout.CENTER);
        
    }
    
    
    
    private void showStartMenu(int x, int y) {
        JPopupMenu popupMenu = new JPopupMenu();

      
        JMenuItem forceExitItem = new JMenuItem("Pac Man");
        JMenuItem changeColor = new JMenuItem("Lucore Search");
        JMenuItem helpCentre = new JMenuItem("Settings");
        JMenuItem minim = new JMenuItem("Run");
        JMenuItem forceExitItem2 = new JMenuItem("Luzaet - Your very own AI Copilot ChatBot");
        JMenuItem changeColor2 = new JMenuItem("Lucore Chat - AI");
        JMenuItem helpCentre2 = new JMenuItem("Files");
        JMenuItem minim2 = new JMenuItem("Notepad");
        JMenuItem forceExitItem3 = new JMenuItem("Paint");
        JMenuItem changeColor3 = new JMenuItem("Calender");
        JMenuItem helpCentre3 = new JMenuItem("Lucore Accounts");
        JMenuItem minim3 = new JMenuItem("Calculator");
        JMenuItem forceExitItem4 = new JMenuItem("More Lucore");
        JMenuItem changeColor4 = new JMenuItem("Lucore Fun");
        JMenuItem helpCentre4 = new JMenuItem("Lucore Create");
        JMenuItem minim4 = new JMenuItem("CPS Test");
        // new line
        JMenuItem forceExitItem5 = new JMenuItem("Word Find");
        JMenuItem changeColor5 = new JMenuItem("Search - PubEd");
        JMenuItem helpCentre5 = new JMenuItem("Lucore To-do");
        JMenuItem minim5 = new JMenuItem("Lucore Clock");
        forceExitItem.addActionListener(e -> {
            // Perform force exit operation
            System.exit(0);
        });
        
        minim.addActionListener(e -> {
            // Perform minimize exit operation
            dispose();
            lucoreMinimized min = new lucoreMinimized();
            min.setVisible(true);
        });
        
        changeColor.addActionListener(e -> {
            // Change background color
            LucoreStart1 start = new LucoreStart1();
            start.setVisible(true);
        });
        
        helpCentre.addActionListener(e -> {
            // Open Help Centre
            lucoreHelpCentre help = new lucoreHelpCentre();
            help.setVisible(true);
        });
        
        popupMenu.add(forceExitItem);
        popupMenu.add(changeColor);
        popupMenu.add(helpCentre);
        popupMenu.add(minim);
        popupMenu.add(forceExitItem2);
        popupMenu.add(changeColor2);
        popupMenu.add(helpCentre2);
        popupMenu.add(minim2);
        popupMenu.add(forceExitItem3);
        popupMenu.add(changeColor3);
        popupMenu.add(helpCentre3);
        popupMenu.add(minim3);
        popupMenu.add(forceExitItem4);
        popupMenu.add(changeColor4);
        popupMenu.add(helpCentre4);
        popupMenu.add(minim4);
        popupMenu.add(forceExitItem5);
        popupMenu.add(changeColor5);
        popupMenu.add(helpCentre5);
        popupMenu.add(minim5);

        // Add more menu items as needed

        popupMenu.show(this, x, y);
    }
    
    
     public static JPanel createRoundedPanel(int arcWidth, int arcHeight, Color bgColor) {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBackground(bgColor);
        panel.setLayout(new BorderLayout());

        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(bgColor);

        RoundRectangle2D roundedRect = new RoundRectangle2D.Float(0, 0, 100, 100, arcWidth, arcHeight);
        g2d.fill(roundedRect);
        g2d.dispose();

        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        panel.add(label);

        return panel;
    }
     
     
     
     private void addPoints(double amount) {
         points += amount;
         System.out.println("User recieved " + amount + " Lucore points.");
     }
    
    
    

   
   
    
    
    
    /**
     * @param args the command line arguments
     */    
    
   
   
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatLaf.registerCustomDefaultsSource( "lucore" );
        
        lucoreLucoreCustomizer c = new lucoreLucoreCustomizer();
        if (c.clicked) {
            UIManager.put("TextComponent.arc", c.fieldArc);
            UIManager.put( "Button.arc", c.buttonArc );
            // Make the toolbar's corners "pill" shaped
            UIManager.put("Component.focusWidth", 0);
            UIManager.put("Component.arc", c.otherArc); // Adjust the radius for your desired shape
        } else {
            UIManager.put("TextComponent.arc", 20);
            UIManager.put( "Button.arc", 50 );
            // Make the toolbar's corners "pill" shaped
            UIManager.put("Component.focusWidth", 0);
            UIManager.put("Component.arc", 20); // Adjust the radius for your desired shape
        }
        
        FlatLightLaf.setup();
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
    // Add a MouseAdapter to handle mouse press and drag events
    
            public void run() {
    // Add a MouseAdapter to handle mouse press and drag events
    
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton12;
    public static javax.swing.JButton jButton18;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu35;
    private javax.swing.JMenu jMenu36;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private org.jdesktop.swingx.JXFrame jXFrame1;
    private java.awt.Label label1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    // End of variables declaration//GEN-END:variables

    void user(String userName) {
        
    }
}

    

    

    
