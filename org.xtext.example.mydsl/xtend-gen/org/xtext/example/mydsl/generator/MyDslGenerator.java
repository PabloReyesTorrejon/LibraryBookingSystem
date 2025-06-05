package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.mydsl.myDsl.Book;
import org.xtext.example.mydsl.myDsl.Library;
import org.xtext.example.mydsl.myDsl.Reservation;
import org.xtext.example.mydsl.myDsl.User;

@SuppressWarnings("all")
public class MyDslGenerator implements IGenerator2 {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Library> _filter = Iterables.<Library>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Library.class);
    for (final Library lib : _filter) {
      String _name = lib.getName();
      String _plus = (_name + ".txt");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Library: ");
      String _name_1 = lib.getName();
      _builder.append(_name_1);
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("Users:");
      _builder.newLine();
      {
        EList<User> _users = lib.getUsers();
        for(final User u : _users) {
          _builder.append("- ");
          String _name_2 = u.getName();
          _builder.append(_name_2);
          _builder.append(" (email: ");
          String _email = u.getEmail();
          _builder.append(_email);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("Books: ");
          {
            EList<Book> _ownedBooks = u.getOwnedBooks();
            boolean _tripleNotEquals = (_ownedBooks != null);
            if (_tripleNotEquals) {
              final Function1<Book, String> _function = (Book b) -> {
                return b.getTitle();
              };
              String _join = IterableExtensions.join(ListExtensions.<Book, String>map(u.getOwnedBooks(), _function), ", ");
              _builder.append(_join, "  ");
            }
          }
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("Current Reservation: ");
          {
            Reservation _currentReservation = u.getCurrentReservation();
            boolean _tripleNotEquals_1 = (_currentReservation != null);
            if (_tripleNotEquals_1) {
              String _title = u.getCurrentReservation().getBook().getTitle();
              _builder.append(_title, "  ");
              _builder.append(" (from ");
              Date _from = u.getCurrentReservation().getFrom();
              _builder.append(_from, "  ");
              _builder.append(" to ");
              Date _to = u.getCurrentReservation().getTo();
              _builder.append(_to, "  ");
              _builder.append(")");
            }
          }
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("Books:");
      _builder.newLine();
      {
        EList<Book> _books = lib.getBooks();
        for(final Book b : _books) {
          _builder.append("- ");
          String _title_1 = b.getTitle();
          _builder.append(_title_1);
          _builder.append(" by ");
          String _author = b.getAuthor();
          _builder.append(_author);
          _builder.append(", ISBN: ");
          String _isbn = b.getIsbn();
          _builder.append(_isbn);
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("Borrowed by: ");
          {
            User _borrower = b.getBorrower();
            boolean _tripleNotEquals_2 = (_borrower != null);
            if (_tripleNotEquals_2) {
              String _name_3 = b.getBorrower().getName();
              _builder.append(_name_3, "  ");
            } else {
              _builder.append("Available");
            }
          }
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("Reservations:");
      _builder.newLine();
      {
        EList<Reservation> _reservations = lib.getReservations();
        for(final Reservation r : _reservations) {
          _builder.append("- ");
          String _name_4 = r.getUser().getName();
          _builder.append(_name_4);
          _builder.append(" reserved ");
          String _title_2 = r.getBook().getTitle();
          _builder.append(_title_2);
          _builder.append(" from ");
          Date _from_1 = r.getFrom();
          _builder.append(_from_1);
          _builder.append(" to ");
          Date _to_1 = r.getTo();
          _builder.append(_to_1);
          _builder.newLineIfNotEmpty();
        }
      }
      fsa.generateFile(_plus, _builder);
    }
  }

  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }

  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
}
