package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_DATE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'library'", "'{'", "'}'", "'user'", "'email='", "'books='", "','", "'currentReservation='", "'book'", "'author='", "'isbn='", "'borrowedBy='", "'reserve'", "'user='", "'book='", "'from='", "'to='"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_DATE=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__LibrariesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__LibrariesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__LibrariesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__LibrariesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__LibrariesAssignment )*
            {
             before(grammarAccess.getModelAccess().getLibrariesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__LibrariesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__LibrariesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__LibrariesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLibrariesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLibrary"
    // InternalMyDsl.g:78:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleLibrary EOF )
            // InternalMyDsl.g:80:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalMyDsl.g:87:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Library__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Library__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Library__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Library__Group__0 )
            // InternalMyDsl.g:94:4: rule__Library__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleUser"
    // InternalMyDsl.g:103:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleUser EOF )
            // InternalMyDsl.g:105:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMyDsl.g:112:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__User__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__User__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__User__Group__0 )
            // InternalMyDsl.g:119:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleBook"
    // InternalMyDsl.g:128:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleBook EOF )
            // InternalMyDsl.g:130:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalMyDsl.g:137:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Book__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Book__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Book__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Book__Group__0 )
            // InternalMyDsl.g:144:4: rule__Book__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleReservation"
    // InternalMyDsl.g:153:1: entryRuleReservation : ruleReservation EOF ;
    public final void entryRuleReservation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleReservation EOF )
            // InternalMyDsl.g:155:1: ruleReservation EOF
            {
             before(grammarAccess.getReservationRule()); 
            pushFollow(FOLLOW_1);
            ruleReservation();

            state._fsp--;

             after(grammarAccess.getReservationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReservation"


    // $ANTLR start "ruleReservation"
    // InternalMyDsl.g:162:1: ruleReservation : ( ( rule__Reservation__Group__0 ) ) ;
    public final void ruleReservation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Reservation__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Reservation__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Reservation__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Reservation__Group__0 )
            {
             before(grammarAccess.getReservationAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Reservation__Group__0 )
            // InternalMyDsl.g:169:4: rule__Reservation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reservation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReservationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReservation"


    // $ANTLR start "rule__Library__Group__0"
    // InternalMyDsl.g:177:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // InternalMyDsl.g:182:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0"


    // $ANTLR start "rule__Library__Group__0__Impl"
    // InternalMyDsl.g:189:1: rule__Library__Group__0__Impl : ( 'library' ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:193:1: ( ( 'library' ) )
            // InternalMyDsl.g:194:1: ( 'library' )
            {
            // InternalMyDsl.g:194:1: ( 'library' )
            // InternalMyDsl.g:195:2: 'library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLibraryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0__Impl"


    // $ANTLR start "rule__Library__Group__1"
    // InternalMyDsl.g:204:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // InternalMyDsl.g:209:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1"


    // $ANTLR start "rule__Library__Group__1__Impl"
    // InternalMyDsl.g:216:1: rule__Library__Group__1__Impl : ( ( rule__Library__NameAssignment_1 ) ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:220:1: ( ( ( rule__Library__NameAssignment_1 ) ) )
            // InternalMyDsl.g:221:1: ( ( rule__Library__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:221:1: ( ( rule__Library__NameAssignment_1 ) )
            // InternalMyDsl.g:222:2: ( rule__Library__NameAssignment_1 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:223:2: ( rule__Library__NameAssignment_1 )
            // InternalMyDsl.g:223:3: rule__Library__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__1__Impl"


    // $ANTLR start "rule__Library__Group__2"
    // InternalMyDsl.g:231:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // InternalMyDsl.g:236:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2"


    // $ANTLR start "rule__Library__Group__2__Impl"
    // InternalMyDsl.g:243:1: rule__Library__Group__2__Impl : ( '{' ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:247:1: ( ( '{' ) )
            // InternalMyDsl.g:248:1: ( '{' )
            {
            // InternalMyDsl.g:248:1: ( '{' )
            // InternalMyDsl.g:249:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__2__Impl"


    // $ANTLR start "rule__Library__Group__3"
    // InternalMyDsl.g:258:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:262:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // InternalMyDsl.g:263:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3"


    // $ANTLR start "rule__Library__Group__3__Impl"
    // InternalMyDsl.g:270:1: rule__Library__Group__3__Impl : ( ( rule__Library__UsersAssignment_3 )* ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:274:1: ( ( ( rule__Library__UsersAssignment_3 )* ) )
            // InternalMyDsl.g:275:1: ( ( rule__Library__UsersAssignment_3 )* )
            {
            // InternalMyDsl.g:275:1: ( ( rule__Library__UsersAssignment_3 )* )
            // InternalMyDsl.g:276:2: ( rule__Library__UsersAssignment_3 )*
            {
             before(grammarAccess.getLibraryAccess().getUsersAssignment_3()); 
            // InternalMyDsl.g:277:2: ( rule__Library__UsersAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:277:3: rule__Library__UsersAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Library__UsersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getUsersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__3__Impl"


    // $ANTLR start "rule__Library__Group__4"
    // InternalMyDsl.g:285:1: rule__Library__Group__4 : rule__Library__Group__4__Impl rule__Library__Group__5 ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( rule__Library__Group__4__Impl rule__Library__Group__5 )
            // InternalMyDsl.g:290:2: rule__Library__Group__4__Impl rule__Library__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4"


    // $ANTLR start "rule__Library__Group__4__Impl"
    // InternalMyDsl.g:297:1: rule__Library__Group__4__Impl : ( ( rule__Library__BooksAssignment_4 )* ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:301:1: ( ( ( rule__Library__BooksAssignment_4 )* ) )
            // InternalMyDsl.g:302:1: ( ( rule__Library__BooksAssignment_4 )* )
            {
            // InternalMyDsl.g:302:1: ( ( rule__Library__BooksAssignment_4 )* )
            // InternalMyDsl.g:303:2: ( rule__Library__BooksAssignment_4 )*
            {
             before(grammarAccess.getLibraryAccess().getBooksAssignment_4()); 
            // InternalMyDsl.g:304:2: ( rule__Library__BooksAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:304:3: rule__Library__BooksAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Library__BooksAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getBooksAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__4__Impl"


    // $ANTLR start "rule__Library__Group__5"
    // InternalMyDsl.g:312:1: rule__Library__Group__5 : rule__Library__Group__5__Impl rule__Library__Group__6 ;
    public final void rule__Library__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( rule__Library__Group__5__Impl rule__Library__Group__6 )
            // InternalMyDsl.g:317:2: rule__Library__Group__5__Impl rule__Library__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__5"


    // $ANTLR start "rule__Library__Group__5__Impl"
    // InternalMyDsl.g:324:1: rule__Library__Group__5__Impl : ( ( rule__Library__ReservationsAssignment_5 )* ) ;
    public final void rule__Library__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:328:1: ( ( ( rule__Library__ReservationsAssignment_5 )* ) )
            // InternalMyDsl.g:329:1: ( ( rule__Library__ReservationsAssignment_5 )* )
            {
            // InternalMyDsl.g:329:1: ( ( rule__Library__ReservationsAssignment_5 )* )
            // InternalMyDsl.g:330:2: ( rule__Library__ReservationsAssignment_5 )*
            {
             before(grammarAccess.getLibraryAccess().getReservationsAssignment_5()); 
            // InternalMyDsl.g:331:2: ( rule__Library__ReservationsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:331:3: rule__Library__ReservationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Library__ReservationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getReservationsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__5__Impl"


    // $ANTLR start "rule__Library__Group__6"
    // InternalMyDsl.g:339:1: rule__Library__Group__6 : rule__Library__Group__6__Impl ;
    public final void rule__Library__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( rule__Library__Group__6__Impl )
            // InternalMyDsl.g:344:2: rule__Library__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__6"


    // $ANTLR start "rule__Library__Group__6__Impl"
    // InternalMyDsl.g:350:1: rule__Library__Group__6__Impl : ( '}' ) ;
    public final void rule__Library__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:354:1: ( ( '}' ) )
            // InternalMyDsl.g:355:1: ( '}' )
            {
            // InternalMyDsl.g:355:1: ( '}' )
            // InternalMyDsl.g:356:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__6__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalMyDsl.g:366:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalMyDsl.g:371:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalMyDsl.g:378:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:382:1: ( ( 'user' ) )
            // InternalMyDsl.g:383:1: ( 'user' )
            {
            // InternalMyDsl.g:383:1: ( 'user' )
            // InternalMyDsl.g:384:2: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalMyDsl.g:393:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // InternalMyDsl.g:398:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalMyDsl.g:405:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // InternalMyDsl.g:410:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:410:1: ( ( rule__User__NameAssignment_1 ) )
            // InternalMyDsl.g:411:2: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:412:2: ( rule__User__NameAssignment_1 )
            // InternalMyDsl.g:412:3: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // InternalMyDsl.g:420:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:424:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // InternalMyDsl.g:425:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // InternalMyDsl.g:432:1: rule__User__Group__2__Impl : ( 'email=' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( ( 'email=' ) )
            // InternalMyDsl.g:437:1: ( 'email=' )
            {
            // InternalMyDsl.g:437:1: ( 'email=' )
            // InternalMyDsl.g:438:2: 'email='
            {
             before(grammarAccess.getUserAccess().getEmailKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getEmailKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // InternalMyDsl.g:447:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:451:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // InternalMyDsl.g:452:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // InternalMyDsl.g:459:1: rule__User__Group__3__Impl : ( ( rule__User__EmailAssignment_3 ) ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:463:1: ( ( ( rule__User__EmailAssignment_3 ) ) )
            // InternalMyDsl.g:464:1: ( ( rule__User__EmailAssignment_3 ) )
            {
            // InternalMyDsl.g:464:1: ( ( rule__User__EmailAssignment_3 ) )
            // InternalMyDsl.g:465:2: ( rule__User__EmailAssignment_3 )
            {
             before(grammarAccess.getUserAccess().getEmailAssignment_3()); 
            // InternalMyDsl.g:466:2: ( rule__User__EmailAssignment_3 )
            // InternalMyDsl.g:466:3: rule__User__EmailAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__User__EmailAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getEmailAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // InternalMyDsl.g:474:1: rule__User__Group__4 : rule__User__Group__4__Impl rule__User__Group__5 ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( rule__User__Group__4__Impl rule__User__Group__5 )
            // InternalMyDsl.g:479:2: rule__User__Group__4__Impl rule__User__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__User__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // InternalMyDsl.g:486:1: rule__User__Group__4__Impl : ( ( rule__User__Group_4__0 )? ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( ( ( rule__User__Group_4__0 )? ) )
            // InternalMyDsl.g:491:1: ( ( rule__User__Group_4__0 )? )
            {
            // InternalMyDsl.g:491:1: ( ( rule__User__Group_4__0 )? )
            // InternalMyDsl.g:492:2: ( rule__User__Group_4__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_4()); 
            // InternalMyDsl.g:493:2: ( rule__User__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:493:3: rule__User__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group__5"
    // InternalMyDsl.g:501:1: rule__User__Group__5 : rule__User__Group__5__Impl ;
    public final void rule__User__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( rule__User__Group__5__Impl )
            // InternalMyDsl.g:506:2: rule__User__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5"


    // $ANTLR start "rule__User__Group__5__Impl"
    // InternalMyDsl.g:512:1: rule__User__Group__5__Impl : ( ( rule__User__Group_5__0 )? ) ;
    public final void rule__User__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:1: ( ( ( rule__User__Group_5__0 )? ) )
            // InternalMyDsl.g:517:1: ( ( rule__User__Group_5__0 )? )
            {
            // InternalMyDsl.g:517:1: ( ( rule__User__Group_5__0 )? )
            // InternalMyDsl.g:518:2: ( rule__User__Group_5__0 )?
            {
             before(grammarAccess.getUserAccess().getGroup_5()); 
            // InternalMyDsl.g:519:2: ( rule__User__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:519:3: rule__User__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__User__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__5__Impl"


    // $ANTLR start "rule__User__Group_4__0"
    // InternalMyDsl.g:528:1: rule__User__Group_4__0 : rule__User__Group_4__0__Impl rule__User__Group_4__1 ;
    public final void rule__User__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( rule__User__Group_4__0__Impl rule__User__Group_4__1 )
            // InternalMyDsl.g:533:2: rule__User__Group_4__0__Impl rule__User__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__User__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__0"


    // $ANTLR start "rule__User__Group_4__0__Impl"
    // InternalMyDsl.g:540:1: rule__User__Group_4__0__Impl : ( 'books=' ) ;
    public final void rule__User__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( ( 'books=' ) )
            // InternalMyDsl.g:545:1: ( 'books=' )
            {
            // InternalMyDsl.g:545:1: ( 'books=' )
            // InternalMyDsl.g:546:2: 'books='
            {
             before(grammarAccess.getUserAccess().getBooksKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getBooksKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__0__Impl"


    // $ANTLR start "rule__User__Group_4__1"
    // InternalMyDsl.g:555:1: rule__User__Group_4__1 : rule__User__Group_4__1__Impl rule__User__Group_4__2 ;
    public final void rule__User__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( rule__User__Group_4__1__Impl rule__User__Group_4__2 )
            // InternalMyDsl.g:560:2: rule__User__Group_4__1__Impl rule__User__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__User__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__1"


    // $ANTLR start "rule__User__Group_4__1__Impl"
    // InternalMyDsl.g:567:1: rule__User__Group_4__1__Impl : ( '{' ) ;
    public final void rule__User__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( '{' ) )
            // InternalMyDsl.g:572:1: ( '{' )
            {
            // InternalMyDsl.g:572:1: ( '{' )
            // InternalMyDsl.g:573:2: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__1__Impl"


    // $ANTLR start "rule__User__Group_4__2"
    // InternalMyDsl.g:582:1: rule__User__Group_4__2 : rule__User__Group_4__2__Impl rule__User__Group_4__3 ;
    public final void rule__User__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( rule__User__Group_4__2__Impl rule__User__Group_4__3 )
            // InternalMyDsl.g:587:2: rule__User__Group_4__2__Impl rule__User__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__User__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__2"


    // $ANTLR start "rule__User__Group_4__2__Impl"
    // InternalMyDsl.g:594:1: rule__User__Group_4__2__Impl : ( ( rule__User__OwnedBooksAssignment_4_2 ) ) ;
    public final void rule__User__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__User__OwnedBooksAssignment_4_2 ) ) )
            // InternalMyDsl.g:599:1: ( ( rule__User__OwnedBooksAssignment_4_2 ) )
            {
            // InternalMyDsl.g:599:1: ( ( rule__User__OwnedBooksAssignment_4_2 ) )
            // InternalMyDsl.g:600:2: ( rule__User__OwnedBooksAssignment_4_2 )
            {
             before(grammarAccess.getUserAccess().getOwnedBooksAssignment_4_2()); 
            // InternalMyDsl.g:601:2: ( rule__User__OwnedBooksAssignment_4_2 )
            // InternalMyDsl.g:601:3: rule__User__OwnedBooksAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__User__OwnedBooksAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getOwnedBooksAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__2__Impl"


    // $ANTLR start "rule__User__Group_4__3"
    // InternalMyDsl.g:609:1: rule__User__Group_4__3 : rule__User__Group_4__3__Impl rule__User__Group_4__4 ;
    public final void rule__User__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( rule__User__Group_4__3__Impl rule__User__Group_4__4 )
            // InternalMyDsl.g:614:2: rule__User__Group_4__3__Impl rule__User__Group_4__4
            {
            pushFollow(FOLLOW_13);
            rule__User__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__3"


    // $ANTLR start "rule__User__Group_4__3__Impl"
    // InternalMyDsl.g:621:1: rule__User__Group_4__3__Impl : ( ( rule__User__Group_4_3__0 )* ) ;
    public final void rule__User__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( ( ( rule__User__Group_4_3__0 )* ) )
            // InternalMyDsl.g:626:1: ( ( rule__User__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:626:1: ( ( rule__User__Group_4_3__0 )* )
            // InternalMyDsl.g:627:2: ( rule__User__Group_4_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_4_3()); 
            // InternalMyDsl.g:628:2: ( rule__User__Group_4_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:628:3: rule__User__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__User__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__3__Impl"


    // $ANTLR start "rule__User__Group_4__4"
    // InternalMyDsl.g:636:1: rule__User__Group_4__4 : rule__User__Group_4__4__Impl ;
    public final void rule__User__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( rule__User__Group_4__4__Impl )
            // InternalMyDsl.g:641:2: rule__User__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__4"


    // $ANTLR start "rule__User__Group_4__4__Impl"
    // InternalMyDsl.g:647:1: rule__User__Group_4__4__Impl : ( '}' ) ;
    public final void rule__User__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( '}' ) )
            // InternalMyDsl.g:652:1: ( '}' )
            {
            // InternalMyDsl.g:652:1: ( '}' )
            // InternalMyDsl.g:653:2: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4__4__Impl"


    // $ANTLR start "rule__User__Group_4_3__0"
    // InternalMyDsl.g:663:1: rule__User__Group_4_3__0 : rule__User__Group_4_3__0__Impl rule__User__Group_4_3__1 ;
    public final void rule__User__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( rule__User__Group_4_3__0__Impl rule__User__Group_4_3__1 )
            // InternalMyDsl.g:668:2: rule__User__Group_4_3__0__Impl rule__User__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__User__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4_3__0"


    // $ANTLR start "rule__User__Group_4_3__0__Impl"
    // InternalMyDsl.g:675:1: rule__User__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__User__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( ( ',' ) )
            // InternalMyDsl.g:680:1: ( ',' )
            {
            // InternalMyDsl.g:680:1: ( ',' )
            // InternalMyDsl.g:681:2: ','
            {
             before(grammarAccess.getUserAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4_3__0__Impl"


    // $ANTLR start "rule__User__Group_4_3__1"
    // InternalMyDsl.g:690:1: rule__User__Group_4_3__1 : rule__User__Group_4_3__1__Impl ;
    public final void rule__User__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( rule__User__Group_4_3__1__Impl )
            // InternalMyDsl.g:695:2: rule__User__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4_3__1"


    // $ANTLR start "rule__User__Group_4_3__1__Impl"
    // InternalMyDsl.g:701:1: rule__User__Group_4_3__1__Impl : ( ( rule__User__OwnedBooksAssignment_4_3_1 ) ) ;
    public final void rule__User__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( ( ( rule__User__OwnedBooksAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:706:1: ( ( rule__User__OwnedBooksAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:706:1: ( ( rule__User__OwnedBooksAssignment_4_3_1 ) )
            // InternalMyDsl.g:707:2: ( rule__User__OwnedBooksAssignment_4_3_1 )
            {
             before(grammarAccess.getUserAccess().getOwnedBooksAssignment_4_3_1()); 
            // InternalMyDsl.g:708:2: ( rule__User__OwnedBooksAssignment_4_3_1 )
            // InternalMyDsl.g:708:3: rule__User__OwnedBooksAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__User__OwnedBooksAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getOwnedBooksAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_4_3__1__Impl"


    // $ANTLR start "rule__User__Group_5__0"
    // InternalMyDsl.g:717:1: rule__User__Group_5__0 : rule__User__Group_5__0__Impl rule__User__Group_5__1 ;
    public final void rule__User__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( rule__User__Group_5__0__Impl rule__User__Group_5__1 )
            // InternalMyDsl.g:722:2: rule__User__Group_5__0__Impl rule__User__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__User__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__0"


    // $ANTLR start "rule__User__Group_5__0__Impl"
    // InternalMyDsl.g:729:1: rule__User__Group_5__0__Impl : ( 'currentReservation=' ) ;
    public final void rule__User__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( ( 'currentReservation=' ) )
            // InternalMyDsl.g:734:1: ( 'currentReservation=' )
            {
            // InternalMyDsl.g:734:1: ( 'currentReservation=' )
            // InternalMyDsl.g:735:2: 'currentReservation='
            {
             before(grammarAccess.getUserAccess().getCurrentReservationKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCurrentReservationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__0__Impl"


    // $ANTLR start "rule__User__Group_5__1"
    // InternalMyDsl.g:744:1: rule__User__Group_5__1 : rule__User__Group_5__1__Impl ;
    public final void rule__User__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( rule__User__Group_5__1__Impl )
            // InternalMyDsl.g:749:2: rule__User__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__1"


    // $ANTLR start "rule__User__Group_5__1__Impl"
    // InternalMyDsl.g:755:1: rule__User__Group_5__1__Impl : ( ( rule__User__CurrentReservationAssignment_5_1 ) ) ;
    public final void rule__User__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( ( ( rule__User__CurrentReservationAssignment_5_1 ) ) )
            // InternalMyDsl.g:760:1: ( ( rule__User__CurrentReservationAssignment_5_1 ) )
            {
            // InternalMyDsl.g:760:1: ( ( rule__User__CurrentReservationAssignment_5_1 ) )
            // InternalMyDsl.g:761:2: ( rule__User__CurrentReservationAssignment_5_1 )
            {
             before(grammarAccess.getUserAccess().getCurrentReservationAssignment_5_1()); 
            // InternalMyDsl.g:762:2: ( rule__User__CurrentReservationAssignment_5_1 )
            // InternalMyDsl.g:762:3: rule__User__CurrentReservationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__User__CurrentReservationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getCurrentReservationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group_5__1__Impl"


    // $ANTLR start "rule__Book__Group__0"
    // InternalMyDsl.g:771:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:775:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // InternalMyDsl.g:776:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // InternalMyDsl.g:783:1: rule__Book__Group__0__Impl : ( 'book' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( 'book' ) )
            // InternalMyDsl.g:788:1: ( 'book' )
            {
            // InternalMyDsl.g:788:1: ( 'book' )
            // InternalMyDsl.g:789:2: 'book'
            {
             before(grammarAccess.getBookAccess().getBookKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBookKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // InternalMyDsl.g:798:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // InternalMyDsl.g:803:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // InternalMyDsl.g:810:1: rule__Book__Group__1__Impl : ( ( rule__Book__TitleAssignment_1 ) ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( ( ( rule__Book__TitleAssignment_1 ) ) )
            // InternalMyDsl.g:815:1: ( ( rule__Book__TitleAssignment_1 ) )
            {
            // InternalMyDsl.g:815:1: ( ( rule__Book__TitleAssignment_1 ) )
            // InternalMyDsl.g:816:2: ( rule__Book__TitleAssignment_1 )
            {
             before(grammarAccess.getBookAccess().getTitleAssignment_1()); 
            // InternalMyDsl.g:817:2: ( rule__Book__TitleAssignment_1 )
            // InternalMyDsl.g:817:3: rule__Book__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // InternalMyDsl.g:825:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // InternalMyDsl.g:830:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Book__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // InternalMyDsl.g:837:1: rule__Book__Group__2__Impl : ( 'author=' ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( 'author=' ) )
            // InternalMyDsl.g:842:1: ( 'author=' )
            {
            // InternalMyDsl.g:842:1: ( 'author=' )
            // InternalMyDsl.g:843:2: 'author='
            {
             before(grammarAccess.getBookAccess().getAuthorKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getAuthorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // InternalMyDsl.g:852:1: rule__Book__Group__3 : rule__Book__Group__3__Impl rule__Book__Group__4 ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( rule__Book__Group__3__Impl rule__Book__Group__4 )
            // InternalMyDsl.g:857:2: rule__Book__Group__3__Impl rule__Book__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Book__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // InternalMyDsl.g:864:1: rule__Book__Group__3__Impl : ( ( rule__Book__AuthorAssignment_3 ) ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ( rule__Book__AuthorAssignment_3 ) ) )
            // InternalMyDsl.g:869:1: ( ( rule__Book__AuthorAssignment_3 ) )
            {
            // InternalMyDsl.g:869:1: ( ( rule__Book__AuthorAssignment_3 ) )
            // InternalMyDsl.g:870:2: ( rule__Book__AuthorAssignment_3 )
            {
             before(grammarAccess.getBookAccess().getAuthorAssignment_3()); 
            // InternalMyDsl.g:871:2: ( rule__Book__AuthorAssignment_3 )
            // InternalMyDsl.g:871:3: rule__Book__AuthorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Book__AuthorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getAuthorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__Book__Group__4"
    // InternalMyDsl.g:879:1: rule__Book__Group__4 : rule__Book__Group__4__Impl rule__Book__Group__5 ;
    public final void rule__Book__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( rule__Book__Group__4__Impl rule__Book__Group__5 )
            // InternalMyDsl.g:884:2: rule__Book__Group__4__Impl rule__Book__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Book__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__4"


    // $ANTLR start "rule__Book__Group__4__Impl"
    // InternalMyDsl.g:891:1: rule__Book__Group__4__Impl : ( 'isbn=' ) ;
    public final void rule__Book__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( ( 'isbn=' ) )
            // InternalMyDsl.g:896:1: ( 'isbn=' )
            {
            // InternalMyDsl.g:896:1: ( 'isbn=' )
            // InternalMyDsl.g:897:2: 'isbn='
            {
             before(grammarAccess.getBookAccess().getIsbnKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getIsbnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__4__Impl"


    // $ANTLR start "rule__Book__Group__5"
    // InternalMyDsl.g:906:1: rule__Book__Group__5 : rule__Book__Group__5__Impl rule__Book__Group__6 ;
    public final void rule__Book__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( rule__Book__Group__5__Impl rule__Book__Group__6 )
            // InternalMyDsl.g:911:2: rule__Book__Group__5__Impl rule__Book__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Book__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__5"


    // $ANTLR start "rule__Book__Group__5__Impl"
    // InternalMyDsl.g:918:1: rule__Book__Group__5__Impl : ( ( rule__Book__IsbnAssignment_5 ) ) ;
    public final void rule__Book__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ( rule__Book__IsbnAssignment_5 ) ) )
            // InternalMyDsl.g:923:1: ( ( rule__Book__IsbnAssignment_5 ) )
            {
            // InternalMyDsl.g:923:1: ( ( rule__Book__IsbnAssignment_5 ) )
            // InternalMyDsl.g:924:2: ( rule__Book__IsbnAssignment_5 )
            {
             before(grammarAccess.getBookAccess().getIsbnAssignment_5()); 
            // InternalMyDsl.g:925:2: ( rule__Book__IsbnAssignment_5 )
            // InternalMyDsl.g:925:3: rule__Book__IsbnAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Book__IsbnAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getIsbnAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__5__Impl"


    // $ANTLR start "rule__Book__Group__6"
    // InternalMyDsl.g:933:1: rule__Book__Group__6 : rule__Book__Group__6__Impl ;
    public final void rule__Book__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( rule__Book__Group__6__Impl )
            // InternalMyDsl.g:938:2: rule__Book__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__6"


    // $ANTLR start "rule__Book__Group__6__Impl"
    // InternalMyDsl.g:944:1: rule__Book__Group__6__Impl : ( ( rule__Book__Group_6__0 )? ) ;
    public final void rule__Book__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ( rule__Book__Group_6__0 )? ) )
            // InternalMyDsl.g:949:1: ( ( rule__Book__Group_6__0 )? )
            {
            // InternalMyDsl.g:949:1: ( ( rule__Book__Group_6__0 )? )
            // InternalMyDsl.g:950:2: ( rule__Book__Group_6__0 )?
            {
             before(grammarAccess.getBookAccess().getGroup_6()); 
            // InternalMyDsl.g:951:2: ( rule__Book__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:951:3: rule__Book__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Book__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBookAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__6__Impl"


    // $ANTLR start "rule__Book__Group_6__0"
    // InternalMyDsl.g:960:1: rule__Book__Group_6__0 : rule__Book__Group_6__0__Impl rule__Book__Group_6__1 ;
    public final void rule__Book__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( rule__Book__Group_6__0__Impl rule__Book__Group_6__1 )
            // InternalMyDsl.g:965:2: rule__Book__Group_6__0__Impl rule__Book__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_6__0"


    // $ANTLR start "rule__Book__Group_6__0__Impl"
    // InternalMyDsl.g:972:1: rule__Book__Group_6__0__Impl : ( 'borrowedBy=' ) ;
    public final void rule__Book__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( 'borrowedBy=' ) )
            // InternalMyDsl.g:977:1: ( 'borrowedBy=' )
            {
            // InternalMyDsl.g:977:1: ( 'borrowedBy=' )
            // InternalMyDsl.g:978:2: 'borrowedBy='
            {
             before(grammarAccess.getBookAccess().getBorrowedByKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBorrowedByKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_6__0__Impl"


    // $ANTLR start "rule__Book__Group_6__1"
    // InternalMyDsl.g:987:1: rule__Book__Group_6__1 : rule__Book__Group_6__1__Impl ;
    public final void rule__Book__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( rule__Book__Group_6__1__Impl )
            // InternalMyDsl.g:992:2: rule__Book__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_6__1"


    // $ANTLR start "rule__Book__Group_6__1__Impl"
    // InternalMyDsl.g:998:1: rule__Book__Group_6__1__Impl : ( ( rule__Book__BorrowerAssignment_6_1 ) ) ;
    public final void rule__Book__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( ( rule__Book__BorrowerAssignment_6_1 ) ) )
            // InternalMyDsl.g:1003:1: ( ( rule__Book__BorrowerAssignment_6_1 ) )
            {
            // InternalMyDsl.g:1003:1: ( ( rule__Book__BorrowerAssignment_6_1 ) )
            // InternalMyDsl.g:1004:2: ( rule__Book__BorrowerAssignment_6_1 )
            {
             before(grammarAccess.getBookAccess().getBorrowerAssignment_6_1()); 
            // InternalMyDsl.g:1005:2: ( rule__Book__BorrowerAssignment_6_1 )
            // InternalMyDsl.g:1005:3: rule__Book__BorrowerAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__BorrowerAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getBorrowerAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_6__1__Impl"


    // $ANTLR start "rule__Reservation__Group__0"
    // InternalMyDsl.g:1014:1: rule__Reservation__Group__0 : rule__Reservation__Group__0__Impl rule__Reservation__Group__1 ;
    public final void rule__Reservation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( rule__Reservation__Group__0__Impl rule__Reservation__Group__1 )
            // InternalMyDsl.g:1019:2: rule__Reservation__Group__0__Impl rule__Reservation__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Reservation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__0"


    // $ANTLR start "rule__Reservation__Group__0__Impl"
    // InternalMyDsl.g:1026:1: rule__Reservation__Group__0__Impl : ( 'reserve' ) ;
    public final void rule__Reservation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( 'reserve' ) )
            // InternalMyDsl.g:1031:1: ( 'reserve' )
            {
            // InternalMyDsl.g:1031:1: ( 'reserve' )
            // InternalMyDsl.g:1032:2: 'reserve'
            {
             before(grammarAccess.getReservationAccess().getReserveKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getReserveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__0__Impl"


    // $ANTLR start "rule__Reservation__Group__1"
    // InternalMyDsl.g:1041:1: rule__Reservation__Group__1 : rule__Reservation__Group__1__Impl rule__Reservation__Group__2 ;
    public final void rule__Reservation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( rule__Reservation__Group__1__Impl rule__Reservation__Group__2 )
            // InternalMyDsl.g:1046:2: rule__Reservation__Group__1__Impl rule__Reservation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Reservation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__1"


    // $ANTLR start "rule__Reservation__Group__1__Impl"
    // InternalMyDsl.g:1053:1: rule__Reservation__Group__1__Impl : ( 'user=' ) ;
    public final void rule__Reservation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( 'user=' ) )
            // InternalMyDsl.g:1058:1: ( 'user=' )
            {
            // InternalMyDsl.g:1058:1: ( 'user=' )
            // InternalMyDsl.g:1059:2: 'user='
            {
             before(grammarAccess.getReservationAccess().getUserKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getUserKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__1__Impl"


    // $ANTLR start "rule__Reservation__Group__2"
    // InternalMyDsl.g:1068:1: rule__Reservation__Group__2 : rule__Reservation__Group__2__Impl rule__Reservation__Group__3 ;
    public final void rule__Reservation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( rule__Reservation__Group__2__Impl rule__Reservation__Group__3 )
            // InternalMyDsl.g:1073:2: rule__Reservation__Group__2__Impl rule__Reservation__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Reservation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__2"


    // $ANTLR start "rule__Reservation__Group__2__Impl"
    // InternalMyDsl.g:1080:1: rule__Reservation__Group__2__Impl : ( ( rule__Reservation__UserAssignment_2 ) ) ;
    public final void rule__Reservation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( ( ( rule__Reservation__UserAssignment_2 ) ) )
            // InternalMyDsl.g:1085:1: ( ( rule__Reservation__UserAssignment_2 ) )
            {
            // InternalMyDsl.g:1085:1: ( ( rule__Reservation__UserAssignment_2 ) )
            // InternalMyDsl.g:1086:2: ( rule__Reservation__UserAssignment_2 )
            {
             before(grammarAccess.getReservationAccess().getUserAssignment_2()); 
            // InternalMyDsl.g:1087:2: ( rule__Reservation__UserAssignment_2 )
            // InternalMyDsl.g:1087:3: rule__Reservation__UserAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reservation__UserAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReservationAccess().getUserAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__2__Impl"


    // $ANTLR start "rule__Reservation__Group__3"
    // InternalMyDsl.g:1095:1: rule__Reservation__Group__3 : rule__Reservation__Group__3__Impl rule__Reservation__Group__4 ;
    public final void rule__Reservation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( rule__Reservation__Group__3__Impl rule__Reservation__Group__4 )
            // InternalMyDsl.g:1100:2: rule__Reservation__Group__3__Impl rule__Reservation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Reservation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__3"


    // $ANTLR start "rule__Reservation__Group__3__Impl"
    // InternalMyDsl.g:1107:1: rule__Reservation__Group__3__Impl : ( 'book=' ) ;
    public final void rule__Reservation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( ( 'book=' ) )
            // InternalMyDsl.g:1112:1: ( 'book=' )
            {
            // InternalMyDsl.g:1112:1: ( 'book=' )
            // InternalMyDsl.g:1113:2: 'book='
            {
             before(grammarAccess.getReservationAccess().getBookKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getBookKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__3__Impl"


    // $ANTLR start "rule__Reservation__Group__4"
    // InternalMyDsl.g:1122:1: rule__Reservation__Group__4 : rule__Reservation__Group__4__Impl rule__Reservation__Group__5 ;
    public final void rule__Reservation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1126:1: ( rule__Reservation__Group__4__Impl rule__Reservation__Group__5 )
            // InternalMyDsl.g:1127:2: rule__Reservation__Group__4__Impl rule__Reservation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Reservation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__4"


    // $ANTLR start "rule__Reservation__Group__4__Impl"
    // InternalMyDsl.g:1134:1: rule__Reservation__Group__4__Impl : ( ( rule__Reservation__BookAssignment_4 ) ) ;
    public final void rule__Reservation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( ( ( rule__Reservation__BookAssignment_4 ) ) )
            // InternalMyDsl.g:1139:1: ( ( rule__Reservation__BookAssignment_4 ) )
            {
            // InternalMyDsl.g:1139:1: ( ( rule__Reservation__BookAssignment_4 ) )
            // InternalMyDsl.g:1140:2: ( rule__Reservation__BookAssignment_4 )
            {
             before(grammarAccess.getReservationAccess().getBookAssignment_4()); 
            // InternalMyDsl.g:1141:2: ( rule__Reservation__BookAssignment_4 )
            // InternalMyDsl.g:1141:3: rule__Reservation__BookAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reservation__BookAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReservationAccess().getBookAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__4__Impl"


    // $ANTLR start "rule__Reservation__Group__5"
    // InternalMyDsl.g:1149:1: rule__Reservation__Group__5 : rule__Reservation__Group__5__Impl rule__Reservation__Group__6 ;
    public final void rule__Reservation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( rule__Reservation__Group__5__Impl rule__Reservation__Group__6 )
            // InternalMyDsl.g:1154:2: rule__Reservation__Group__5__Impl rule__Reservation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Reservation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__5"


    // $ANTLR start "rule__Reservation__Group__5__Impl"
    // InternalMyDsl.g:1161:1: rule__Reservation__Group__5__Impl : ( 'from=' ) ;
    public final void rule__Reservation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( ( 'from=' ) )
            // InternalMyDsl.g:1166:1: ( 'from=' )
            {
            // InternalMyDsl.g:1166:1: ( 'from=' )
            // InternalMyDsl.g:1167:2: 'from='
            {
             before(grammarAccess.getReservationAccess().getFromKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getFromKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__5__Impl"


    // $ANTLR start "rule__Reservation__Group__6"
    // InternalMyDsl.g:1176:1: rule__Reservation__Group__6 : rule__Reservation__Group__6__Impl rule__Reservation__Group__7 ;
    public final void rule__Reservation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( rule__Reservation__Group__6__Impl rule__Reservation__Group__7 )
            // InternalMyDsl.g:1181:2: rule__Reservation__Group__6__Impl rule__Reservation__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Reservation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__6"


    // $ANTLR start "rule__Reservation__Group__6__Impl"
    // InternalMyDsl.g:1188:1: rule__Reservation__Group__6__Impl : ( ( rule__Reservation__FromAssignment_6 ) ) ;
    public final void rule__Reservation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ( rule__Reservation__FromAssignment_6 ) ) )
            // InternalMyDsl.g:1193:1: ( ( rule__Reservation__FromAssignment_6 ) )
            {
            // InternalMyDsl.g:1193:1: ( ( rule__Reservation__FromAssignment_6 ) )
            // InternalMyDsl.g:1194:2: ( rule__Reservation__FromAssignment_6 )
            {
             before(grammarAccess.getReservationAccess().getFromAssignment_6()); 
            // InternalMyDsl.g:1195:2: ( rule__Reservation__FromAssignment_6 )
            // InternalMyDsl.g:1195:3: rule__Reservation__FromAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Reservation__FromAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getReservationAccess().getFromAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__6__Impl"


    // $ANTLR start "rule__Reservation__Group__7"
    // InternalMyDsl.g:1203:1: rule__Reservation__Group__7 : rule__Reservation__Group__7__Impl rule__Reservation__Group__8 ;
    public final void rule__Reservation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( rule__Reservation__Group__7__Impl rule__Reservation__Group__8 )
            // InternalMyDsl.g:1208:2: rule__Reservation__Group__7__Impl rule__Reservation__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Reservation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reservation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__7"


    // $ANTLR start "rule__Reservation__Group__7__Impl"
    // InternalMyDsl.g:1215:1: rule__Reservation__Group__7__Impl : ( 'to=' ) ;
    public final void rule__Reservation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( 'to=' ) )
            // InternalMyDsl.g:1220:1: ( 'to=' )
            {
            // InternalMyDsl.g:1220:1: ( 'to=' )
            // InternalMyDsl.g:1221:2: 'to='
            {
             before(grammarAccess.getReservationAccess().getToKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getToKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__7__Impl"


    // $ANTLR start "rule__Reservation__Group__8"
    // InternalMyDsl.g:1230:1: rule__Reservation__Group__8 : rule__Reservation__Group__8__Impl ;
    public final void rule__Reservation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( rule__Reservation__Group__8__Impl )
            // InternalMyDsl.g:1235:2: rule__Reservation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reservation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__8"


    // $ANTLR start "rule__Reservation__Group__8__Impl"
    // InternalMyDsl.g:1241:1: rule__Reservation__Group__8__Impl : ( ( rule__Reservation__ToAssignment_8 ) ) ;
    public final void rule__Reservation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( ( rule__Reservation__ToAssignment_8 ) ) )
            // InternalMyDsl.g:1246:1: ( ( rule__Reservation__ToAssignment_8 ) )
            {
            // InternalMyDsl.g:1246:1: ( ( rule__Reservation__ToAssignment_8 ) )
            // InternalMyDsl.g:1247:2: ( rule__Reservation__ToAssignment_8 )
            {
             before(grammarAccess.getReservationAccess().getToAssignment_8()); 
            // InternalMyDsl.g:1248:2: ( rule__Reservation__ToAssignment_8 )
            // InternalMyDsl.g:1248:3: rule__Reservation__ToAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Reservation__ToAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getReservationAccess().getToAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__Group__8__Impl"


    // $ANTLR start "rule__Model__LibrariesAssignment"
    // InternalMyDsl.g:1257:1: rule__Model__LibrariesAssignment : ( ruleLibrary ) ;
    public final void rule__Model__LibrariesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( ( ruleLibrary ) )
            // InternalMyDsl.g:1262:2: ( ruleLibrary )
            {
            // InternalMyDsl.g:1262:2: ( ruleLibrary )
            // InternalMyDsl.g:1263:3: ruleLibrary
            {
             before(grammarAccess.getModelAccess().getLibrariesLibraryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getModelAccess().getLibrariesLibraryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__LibrariesAssignment"


    // $ANTLR start "rule__Library__NameAssignment_1"
    // InternalMyDsl.g:1272:1: rule__Library__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Library__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1277:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1277:2: ( RULE_ID )
            // InternalMyDsl.g:1278:3: RULE_ID
            {
             before(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__NameAssignment_1"


    // $ANTLR start "rule__Library__UsersAssignment_3"
    // InternalMyDsl.g:1287:1: rule__Library__UsersAssignment_3 : ( ruleUser ) ;
    public final void rule__Library__UsersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ruleUser ) )
            // InternalMyDsl.g:1292:2: ( ruleUser )
            {
            // InternalMyDsl.g:1292:2: ( ruleUser )
            // InternalMyDsl.g:1293:3: ruleUser
            {
             before(grammarAccess.getLibraryAccess().getUsersUserParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getUsersUserParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__UsersAssignment_3"


    // $ANTLR start "rule__Library__BooksAssignment_4"
    // InternalMyDsl.g:1302:1: rule__Library__BooksAssignment_4 : ( ruleBook ) ;
    public final void rule__Library__BooksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( ruleBook ) )
            // InternalMyDsl.g:1307:2: ( ruleBook )
            {
            // InternalMyDsl.g:1307:2: ( ruleBook )
            // InternalMyDsl.g:1308:3: ruleBook
            {
             before(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__BooksAssignment_4"


    // $ANTLR start "rule__Library__ReservationsAssignment_5"
    // InternalMyDsl.g:1317:1: rule__Library__ReservationsAssignment_5 : ( ruleReservation ) ;
    public final void rule__Library__ReservationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( ( ruleReservation ) )
            // InternalMyDsl.g:1322:2: ( ruleReservation )
            {
            // InternalMyDsl.g:1322:2: ( ruleReservation )
            // InternalMyDsl.g:1323:3: ruleReservation
            {
             before(grammarAccess.getLibraryAccess().getReservationsReservationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReservation();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getReservationsReservationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__ReservationsAssignment_5"


    // $ANTLR start "rule__User__NameAssignment_1"
    // InternalMyDsl.g:1332:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1337:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1337:2: ( RULE_ID )
            // InternalMyDsl.g:1338:3: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__User__EmailAssignment_3"
    // InternalMyDsl.g:1347:1: rule__User__EmailAssignment_3 : ( RULE_STRING ) ;
    public final void rule__User__EmailAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1352:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1352:2: ( RULE_STRING )
            // InternalMyDsl.g:1353:3: RULE_STRING
            {
             before(grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__EmailAssignment_3"


    // $ANTLR start "rule__User__OwnedBooksAssignment_4_2"
    // InternalMyDsl.g:1362:1: rule__User__OwnedBooksAssignment_4_2 : ( ( RULE_ID ) ) ;
    public final void rule__User__OwnedBooksAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1367:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1367:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1368:3: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getOwnedBooksBookCrossReference_4_2_0()); 
            // InternalMyDsl.g:1369:3: ( RULE_ID )
            // InternalMyDsl.g:1370:4: RULE_ID
            {
             before(grammarAccess.getUserAccess().getOwnedBooksBookIDTerminalRuleCall_4_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getOwnedBooksBookIDTerminalRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getUserAccess().getOwnedBooksBookCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__OwnedBooksAssignment_4_2"


    // $ANTLR start "rule__User__OwnedBooksAssignment_4_3_1"
    // InternalMyDsl.g:1381:1: rule__User__OwnedBooksAssignment_4_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__User__OwnedBooksAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1386:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1386:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1387:3: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getOwnedBooksBookCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:1388:3: ( RULE_ID )
            // InternalMyDsl.g:1389:4: RULE_ID
            {
             before(grammarAccess.getUserAccess().getOwnedBooksBookIDTerminalRuleCall_4_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getOwnedBooksBookIDTerminalRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getUserAccess().getOwnedBooksBookCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__OwnedBooksAssignment_4_3_1"


    // $ANTLR start "rule__User__CurrentReservationAssignment_5_1"
    // InternalMyDsl.g:1400:1: rule__User__CurrentReservationAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__User__CurrentReservationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1405:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1405:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1406:3: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getCurrentReservationReservationCrossReference_5_1_0()); 
            // InternalMyDsl.g:1407:3: ( RULE_ID )
            // InternalMyDsl.g:1408:4: RULE_ID
            {
             before(grammarAccess.getUserAccess().getCurrentReservationReservationIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCurrentReservationReservationIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getUserAccess().getCurrentReservationReservationCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__CurrentReservationAssignment_5_1"


    // $ANTLR start "rule__Book__TitleAssignment_1"
    // InternalMyDsl.g:1419:1: rule__Book__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Book__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1424:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1424:2: ( RULE_STRING )
            // InternalMyDsl.g:1425:3: RULE_STRING
            {
             before(grammarAccess.getBookAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__TitleAssignment_1"


    // $ANTLR start "rule__Book__AuthorAssignment_3"
    // InternalMyDsl.g:1434:1: rule__Book__AuthorAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Book__AuthorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1439:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1439:2: ( RULE_STRING )
            // InternalMyDsl.g:1440:3: RULE_STRING
            {
             before(grammarAccess.getBookAccess().getAuthorSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getAuthorSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__AuthorAssignment_3"


    // $ANTLR start "rule__Book__IsbnAssignment_5"
    // InternalMyDsl.g:1449:1: rule__Book__IsbnAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Book__IsbnAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1454:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1454:2: ( RULE_STRING )
            // InternalMyDsl.g:1455:3: RULE_STRING
            {
             before(grammarAccess.getBookAccess().getIsbnSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getIsbnSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__IsbnAssignment_5"


    // $ANTLR start "rule__Book__BorrowerAssignment_6_1"
    // InternalMyDsl.g:1464:1: rule__Book__BorrowerAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Book__BorrowerAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1469:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1469:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1470:3: ( RULE_ID )
            {
             before(grammarAccess.getBookAccess().getBorrowerUserCrossReference_6_1_0()); 
            // InternalMyDsl.g:1471:3: ( RULE_ID )
            // InternalMyDsl.g:1472:4: RULE_ID
            {
             before(grammarAccess.getBookAccess().getBorrowerUserIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBorrowerUserIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getBookAccess().getBorrowerUserCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__BorrowerAssignment_6_1"


    // $ANTLR start "rule__Reservation__UserAssignment_2"
    // InternalMyDsl.g:1483:1: rule__Reservation__UserAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Reservation__UserAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1488:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1488:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1489:3: ( RULE_ID )
            {
             before(grammarAccess.getReservationAccess().getUserUserCrossReference_2_0()); 
            // InternalMyDsl.g:1490:3: ( RULE_ID )
            // InternalMyDsl.g:1491:4: RULE_ID
            {
             before(grammarAccess.getReservationAccess().getUserUserIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getUserUserIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReservationAccess().getUserUserCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__UserAssignment_2"


    // $ANTLR start "rule__Reservation__BookAssignment_4"
    // InternalMyDsl.g:1502:1: rule__Reservation__BookAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Reservation__BookAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1507:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1507:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1508:3: ( RULE_ID )
            {
             before(grammarAccess.getReservationAccess().getBookBookCrossReference_4_0()); 
            // InternalMyDsl.g:1509:3: ( RULE_ID )
            // InternalMyDsl.g:1510:4: RULE_ID
            {
             before(grammarAccess.getReservationAccess().getBookBookIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getBookBookIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getReservationAccess().getBookBookCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__BookAssignment_4"


    // $ANTLR start "rule__Reservation__FromAssignment_6"
    // InternalMyDsl.g:1521:1: rule__Reservation__FromAssignment_6 : ( RULE_DATE ) ;
    public final void rule__Reservation__FromAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( RULE_DATE ) )
            // InternalMyDsl.g:1526:2: ( RULE_DATE )
            {
            // InternalMyDsl.g:1526:2: ( RULE_DATE )
            // InternalMyDsl.g:1527:3: RULE_DATE
            {
             before(grammarAccess.getReservationAccess().getFromDATETerminalRuleCall_6_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getFromDATETerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__FromAssignment_6"


    // $ANTLR start "rule__Reservation__ToAssignment_8"
    // InternalMyDsl.g:1536:1: rule__Reservation__ToAssignment_8 : ( RULE_DATE ) ;
    public final void rule__Reservation__ToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( RULE_DATE ) )
            // InternalMyDsl.g:1541:2: ( RULE_DATE )
            {
            // InternalMyDsl.g:1541:2: ( RULE_DATE )
            // InternalMyDsl.g:1542:3: RULE_DATE
            {
             before(grammarAccess.getReservationAccess().getToDATETerminalRuleCall_8_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getReservationAccess().getToDATETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reservation__ToAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000110C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});

}