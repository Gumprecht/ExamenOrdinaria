package main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import view.MovieDisplay;
import view.SwingMovieDisplay;

public class MainFrame extends JFrame {

    private MovieDisplay movieDisplay;

    public MainFrame() {
        this.setTitle("Movie Catalog");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(1366, 768);
        this.setLocationRelativeTo(null);
        //this.getContentPane().add(movieDisplay());
        this.getContentPane().add(toolbar(), BorderLayout.SOUTH);
        this.setVisible(true);
    }

    private JPanel toolbar() {
        JPanel panel = new JPanel();
        panel.add(GenreButton());
        panel.add(NewButton());
        panel.add(ViewsButton());
        panel.add(RatingButton());
        return panel;
    }

    private Component GenreButton() {
        JButton button = new JButton("Genre");
        button.addActionListener(sortByGenre());
        return button;
    }

    private ActionListener sortByGenre() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //model.OperationsForMovies.sortByGenre();
            }
        };
    }

    private Component NewButton() {
        JButton button = new JButton("New");
        //button.addActionListener(nextImage());
        return button;
    }
//
//    private ActionListener nextImage() {
//        return new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                imageDisplay.show(imageDisplay.current().next());
//            }
//        };
//    }
//
   
    
//    private JPanel movieDisplay() {
//        SwingMovieDisplay sid = new SwingMovieDisplay();
//        this.movieDisplay = sid; 
//        return sid;
//    }
//
//    public MovieDisplay getMovieDisplay() {
//        return movieDisplay;
//    }
    
    
    private Component ViewsButton() {
        JButton button = new JButton("Views");
        //button.addActionListener(nextImage());
        return button;
    }
    
     private Component RatingButton() {
        JButton button = new JButton("Rating");
        //button.addActionListener(nextImage());
        return button;
    }

}