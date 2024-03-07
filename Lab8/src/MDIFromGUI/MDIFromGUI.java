package MDIFromGUI;

import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane mainframe;
    private JInternalFrame child1, child2, child3;
    private JMenuBar menubar;
    private JMenu menu_file, menu_edit, menu_view, menu_new;
    private JMenuItem item_open, item_save, item_exit, item_window, item_message;
    
    public JMenuBar my_menubar(){
        menubar = new JMenuBar();
        
        menu_file = new JMenu("File");
        menu_edit = new JMenu("Edit");
        menu_view = new JMenu("View");
        
        menu_new = new JMenu("New");
        
        item_message = new JMenuItem("Message");
        item_window = new JMenuItem("Window");
        
        item_open = new JMenuItem("Open");
        item_save = new JMenuItem("Save");
        item_exit = new JMenuItem("Exit");
        
        menu_new.add(item_window);
        menu_new.addSeparator();
        menu_new.add(item_message);
        
        menu_file.add(menu_new);
        menu_file.add(item_open);
        menu_file.addSeparator();
        menu_file.add(item_save);
        menu_file.addSeparator();
        menu_file.add(item_exit);
        
        menubar.add(menu_file);
        menubar.add(menu_edit);
        menubar.add(menu_view);
        
        return menubar;
    }
    
    public JInternalFrame my_child1(){
        child1 = new JInternalFrame("Application 01", true, true, true, true);
        child1.setSize(250, 250);
        child1.setVisible(true);
        
        return child1;
    }
    
    public JInternalFrame my_child2(){
        child2 = new JInternalFrame("Application 02", true, true, true, true);
        
        int x = my_child1().getX()+50;
        int y = my_child1().getY();
        
        child2.setLocation(x, y);
        child2.setSize(250, 250);
        child2.setVisible(true);
        
        return child2;
    }
    
    public JInternalFrame my_child3(){
        child3 = new JInternalFrame("Application 03", true, true, true, true);
        
        int x = my_child2().getX()+50;
        int y = my_child2().getY();
        
        child3.setLocation(x, y);
        child3.setSize(250, 250);
        child3.setVisible(true);
        
        return child3;
    }
    
    public JDesktopPane my_mainframe(){
        mainframe = new JDesktopPane();
        
        mainframe.add(my_child1());
        mainframe.add(my_child2());
        mainframe.add(my_child3());
        
        return mainframe;
    }
    
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        
        fr.setJMenuBar(my_menubar());
        fr.add(my_mainframe());
        
        fr.setSize(900, 900);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
