package org.example.javafx_mysql;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField id;

    @FXML
    private TextField title;

    @FXML
    private TextField author;

    @FXML
    private TextField year;

    @FXML
    private TextField pages;

    @FXML
    private TableView<Book> table;

    @FXML
    private TableColumn<Book,Integer> colId;

    @FXML
    private TableColumn<Book,String> colTitle;

    @FXML
    private TableColumn<Book,String> colAuthor;

    @FXML
    private TableColumn<Book,Integer> colYear;


    @FXML
    private TableColumn<Book,Integer> colPages;


    private ObservableList<Book> books = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Ánh xạ cột
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        colYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        colPages.setCellValueFactory(new PropertyValueFactory<>("pages"));
        loadDataFromDatabase();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onAddButtonClick() {
        System.out.println("id: " + id.getText( ) + " title: " + title.getText() + " author: " + author.getText() + " year: " + year.getText() + " pages: " + pages.getText());
        Connection conn = db.connect();        if (conn == null) return;
        System.out.println("Connected to database!");

        try {
            String query = "INSERT INTO books (id,author, year, pages, title) VALUES (?,?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, Integer.parseInt(id.getText()));
            stmt.setString(2, author.getText());
            stmt.setInt(3, Integer.parseInt(year.getText()));
            stmt.setInt(4, Integer.parseInt(pages.getText()));
            stmt.setString(5, title.getText());
            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }
        books.clear();
        loadDataFromDatabase();

    }



    private void loadDataFromDatabase() {
        Connection conn = db.connect();        if (conn == null) return;
        System.out.println("Connected to database!");

        try {
            String query = "SELECT * FROM books";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                books.add(new Book(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("year"),
                        rs.getInt("pages")
                ));
            }
            table.setItems(books);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}