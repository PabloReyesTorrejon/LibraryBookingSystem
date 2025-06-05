package org.xtext.example.mydsl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManagerUIWithReservations {

    static List<String> users = new ArrayList<>();
    static List<String> books = new ArrayList<>();

    // Mapear usuario a libros que posee
    static Map<String, List<String>> userBooks = new HashMap<>();

    // Mapear libro a dueño (usuario)
    static Map<String, String> bookOwners = new HashMap<>();

    // Clase interna para reservas
    static class Reservation {
        String user;
        String book;
        String from;
        String to;

        Reservation(String user, String book, String from, String to) {
            this.user = user;
            this.book = book;
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return user + " reserved \"" + book + "\" from " + from + " to " + to;
        }
    }

    static List<Reservation> reservations = new ArrayList<>();

    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Library Manager (With Reservations)");
        shell.setSize(800, 600);
        shell.setLayout(null);

        // --- Usuarios ---
        Label userLabel = new Label(shell, SWT.NONE);
        userLabel.setText("User:");
        userLabel.setBounds(10, 10, 100, 20);
        Text userText = new Text(shell, SWT.BORDER);
        userText.setBounds(120, 10, 200, 20);

        Label emailLabel = new Label(shell, SWT.NONE);
        emailLabel.setText("Email:");
        emailLabel.setBounds(10, 40, 100, 20);
        Text emailText = new Text(shell, SWT.BORDER);
        emailText.setBounds(120, 40, 200, 20);

        Button addUserButton = new Button(shell, SWT.PUSH);
        addUserButton.setText("Add User");
        addUserButton.setBounds(350, 25, 100, 30);

        // --- Libros ---
        Label bookLabel = new Label(shell, SWT.NONE);
        bookLabel.setText("Book Title:");
        bookLabel.setBounds(10, 80, 100, 20);
        Text bookText = new Text(shell, SWT.BORDER);
        bookText.setBounds(120, 80, 200, 20);

        Label authorLabel = new Label(shell, SWT.NONE);
        authorLabel.setText("Author:");
        authorLabel.setBounds(10, 110, 100, 20);
        Text authorText = new Text(shell, SWT.BORDER);
        authorText.setBounds(120, 110, 200, 20);

        Label isbnLabel = new Label(shell, SWT.NONE);
        isbnLabel.setText("ISBN:");
        isbnLabel.setBounds(10, 140, 100, 20);
        Text isbnText = new Text(shell, SWT.BORDER);
        isbnText.setBounds(120, 140, 200, 20);

        Button addBookButton = new Button(shell, SWT.PUSH);
        addBookButton.setText("Add Book");
        addBookButton.setBounds(350, 110, 100, 30);

        // --- Widgets List para mostrar datos ---
        Label usersListLabel = new Label(shell, SWT.NONE);
        usersListLabel.setText("Users:");
        usersListLabel.setBounds(10, 180, 100, 20);
        org.eclipse.swt.widgets.List usersList = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.V_SCROLL);
        usersList.setBounds(10, 200, 200, 120);

        Label booksListLabel = new Label(shell, SWT.NONE);
        booksListLabel.setText("Books:");
        booksListLabel.setBounds(220, 180, 100, 20);
        org.eclipse.swt.widgets.List booksList = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.V_SCROLL);
        booksList.setBounds(220, 200, 200, 120);

        Label ownedBooksListLabel = new Label(shell, SWT.NONE);
        ownedBooksListLabel.setText("Books owned by selected user:");
        ownedBooksListLabel.setBounds(10, 330, 200, 20);
        org.eclipse.swt.widgets.List ownedBooksList = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.V_SCROLL);
        ownedBooksList.setBounds(10, 350, 200, 120);

        Label bookOwnerLabel = new Label(shell, SWT.NONE);
        bookOwnerLabel.setText("Owner of selected book:");
        bookOwnerLabel.setBounds(220, 330, 150, 20);
        Text bookOwnerText = new Text(shell, SWT.BORDER | SWT.READ_ONLY);
        bookOwnerText.setBounds(220, 350, 200, 20);

        // --- Reservas ---
        Label reserveUserLabel = new Label(shell, SWT.NONE);
        reserveUserLabel.setText("Reserve User:");
        reserveUserLabel.setBounds(450, 10, 100, 20);
        Combo reserveUserCombo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        reserveUserCombo.setBounds(560, 10, 200, 20);

        Label reserveBookLabel = new Label(shell, SWT.NONE);
        reserveBookLabel.setText("Book Title:");
        reserveBookLabel.setBounds(450, 40, 100, 20);
        Combo reserveBookCombo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        reserveBookCombo.setBounds(560, 40, 200, 20);

        Label fromLabel = new Label(shell, SWT.NONE);
        fromLabel.setText("From (YYYY-MM-DD):");
        fromLabel.setBounds(450, 70, 120, 20);
        Text fromText = new Text(shell, SWT.BORDER);
        fromText.setBounds(580, 70, 180, 20);

        Label toLabel = new Label(shell, SWT.NONE);
        toLabel.setText("To (YYYY-MM-DD):");
        toLabel.setBounds(450, 100, 120, 20);
        Text toText = new Text(shell, SWT.BORDER);
        toText.setBounds(580, 100, 180, 20);

        Button reserveButton = new Button(shell, SWT.PUSH);
        reserveButton.setText("Create Reservation");
        reserveButton.setBounds(530, 130, 150, 30);

        Label reservationsListLabel = new Label(shell, SWT.NONE);
        reservationsListLabel.setText("Reservations:");
        reservationsListLabel.setBounds(450, 180, 100, 20);
        org.eclipse.swt.widgets.List reservationsList = new org.eclipse.swt.widgets.List(shell, SWT.BORDER | SWT.V_SCROLL);
        reservationsList.setBounds(450, 200, 300, 270);

        // === Eventos ===

        // Agregar usuario
        addUserButton.addListener(SWT.Selection, e -> {
            String name = userText.getText().trim();
            String email = emailText.getText().trim();
            if (!name.isEmpty() && !email.isEmpty()) {
                if (!users.contains(name)) {
                    users.add(name);
                    userBooks.put(name, new ArrayList<>());
                    usersList.add(name);
                    reserveUserCombo.add(name);
                }
                System.out.println("User added: " + name + " email=\"" + email + "\"");
                userText.setText("");
                emailText.setText("");
            }
        });

        // Agregar libro
        addBookButton.addListener(SWT.Selection, e -> {
            String title = bookText.getText().trim();
            String author = authorText.getText().trim();
            String isbn = isbnText.getText().trim();
            if (!title.isEmpty() && !author.isEmpty() && !isbn.isEmpty()) {
                if (!books.contains(title)) {
                    books.add(title);
                    booksList.add(title);
                    reserveBookCombo.add(title);
                    // Por simplicidad, asignamos propietario nulo al agregar libro (no dueño)
                    bookOwners.put(title, null);
                }
                System.out.println("Book added: \"" + title + "\" author=\"" + author + "\" isbn=\"" + isbn + "\"");
                bookText.setText("");
                authorText.setText("");
                isbnText.setText("");
            }
        });

        // Cuando se selecciona un usuario, mostrar libros que posee
        usersList.addListener(SWT.Selection, e -> {
            int idx = usersList.getSelectionIndex();
            if (idx != -1) {
                String selectedUser = usersList.getItem(idx);
                ownedBooksList.removeAll();
                List<String> owned = userBooks.get(selectedUser);
                if (owned != null) {
                    for (String b : owned) {
                        ownedBooksList.add(b);
                    }
                }
            }
        });

        // Cuando se selecciona un libro, mostrar dueño
        booksList.addListener(SWT.Selection, e -> {
            int idx = booksList.getSelectionIndex();
            if (idx != -1) {
                String selectedBook = booksList.getItem(idx);
                String owner = bookOwners.get(selectedBook);
                if (owner == null) {
                    bookOwnerText.setText("Available");
                } else {
                    bookOwnerText.setText(owner);
                }
            }
        });

        // Crear reserva
        reserveButton.addListener(SWT.Selection, e -> {
            String user = reserveUserCombo.getText();
            String book = reserveBookCombo.getText();
            String from = fromText.getText().trim();
            String to = toText.getText().trim();

            if (user.isEmpty() || book.isEmpty() || from.isEmpty() || to.isEmpty()) {
                return;
            }

            // Validar que el libro esté disponible (no reservado ni prestado)
            boolean isAvailable = true;
            for (Reservation r : reservations) {
                if (r.book.equals(book)) {
                    isAvailable = false;
                    break;
                }
            }
            if (!isAvailable) {
                // Podrías mostrar alerta de "Libro no disponible"
                return;
            }

            // Crear reserva
            Reservation res = new Reservation(user, book, from, to);
            reservations.add(res);
            reservationsList.add(res.toString());

            // Actualizar dueño del libro
            bookOwners.put(book, user);

            // Actualizar libros que posee el usuario
            List<String> owned = userBooks.get(user);
            if (owned == null) {
                owned = new ArrayList<>();
                userBooks.put(user, owned);
            }
            if (!owned.contains(book)) {
                owned.add(book);
            }

            System.out.println("Reservation created: " + res);

            // Limpiar campos
            fromText.setText("");
            toText.setText("");
            reserveUserCombo.deselectAll();
            reserveBookCombo.deselectAll();

            // Actualizar UI si está seleccionado el usuario o libro
            int selectedUserIdx = usersList.getSelectionIndex();
            if (selectedUserIdx != -1 && usersList.getItem(selectedUserIdx).equals(user)) {
                ownedBooksList.removeAll();
                for (String b : owned) {
                    ownedBooksList.add(b);
                }
            }

            int selectedBookIdx = booksList.getSelectionIndex();
            if (selectedBookIdx != -1 && booksList.getItem(selectedBookIdx).equals(book)) {
                bookOwnerText.setText(user);
            }
        });

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}
