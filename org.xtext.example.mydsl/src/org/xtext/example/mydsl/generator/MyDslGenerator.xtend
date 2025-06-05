package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.Library
import org.xtext.example.mydsl.myDsl.User
import org.xtext.example.mydsl.myDsl.Book
import org.xtext.example.mydsl.myDsl.Reservation

class MyDslGenerator implements IGenerator2 {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (lib : resource.allContents.toIterable.filter(Library)) {
            fsa.generateFile(lib.name + ".txt", '''
                Library: «lib.name»

                Users:
                «FOR u : lib.users»
                - «u.name» (email: «u.email»)
                  Books: «IF u.ownedBooks !== null»«u.ownedBooks.map[b|b.title].join(", ")»«ENDIF»
                  Current Reservation: «IF u.currentReservation !== null»«u.currentReservation.book.title» (from «u.currentReservation.from» to «u.currentReservation.to»)«ENDIF»
                «ENDFOR»

                Books:
                «FOR b : lib.books»
                - «b.title» by «b.author», ISBN: «b.isbn»
                  Borrowed by: «IF b.borrower !== null»«b.borrower.name»«ELSE»Available«ENDIF»
                «ENDFOR»

                Reservations:
                «FOR r : lib.reservations»
                - «r.user.name» reserved «r.book.title» from «r.from» to «r.to»
                «ENDFOR»
            ''')
        }
    }

    override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // no-op
    }

    override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // no-op
    }
}
