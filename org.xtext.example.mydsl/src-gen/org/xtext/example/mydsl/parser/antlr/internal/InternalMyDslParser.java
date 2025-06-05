package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_libraries_0_0= ruleLibrary ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_libraries_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_libraries_0_0= ruleLibrary ) )* )
            // InternalMyDsl.g:78:2: ( (lv_libraries_0_0= ruleLibrary ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_libraries_0_0= ruleLibrary ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_libraries_0_0= ruleLibrary )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_libraries_0_0= ruleLibrary )
            	    // InternalMyDsl.g:80:4: lv_libraries_0_0= ruleLibrary
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getLibrariesLibraryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_libraries_0_0=ruleLibrary();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"libraries",
            	    					lv_libraries_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Library");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLibrary"
    // InternalMyDsl.g:100:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalMyDsl.g:101:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalMyDsl.g:107:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_users_3_0= ruleUser ) )* ( (lv_books_4_0= ruleBook ) )* ( (lv_reservations_5_0= ruleReservation ) )* otherlv_6= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_users_3_0 = null;

        EObject lv_books_4_0 = null;

        EObject lv_reservations_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_users_3_0= ruleUser ) )* ( (lv_books_4_0= ruleBook ) )* ( (lv_reservations_5_0= ruleReservation ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_users_3_0= ruleUser ) )* ( (lv_books_4_0= ruleBook ) )* ( (lv_reservations_5_0= ruleReservation ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_users_3_0= ruleUser ) )* ( (lv_books_4_0= ruleBook ) )* ( (lv_reservations_5_0= ruleReservation ) )* otherlv_6= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= 'library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_users_3_0= ruleUser ) )* ( (lv_books_4_0= ruleBook ) )* ( (lv_reservations_5_0= ruleReservation ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_users_3_0= ruleUser ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:142:4: (lv_users_3_0= ruleUser )
            	    {
            	    // InternalMyDsl.g:142:4: (lv_users_3_0= ruleUser )
            	    // InternalMyDsl.g:143:5: lv_users_3_0= ruleUser
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getUsersUserParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_users_3_0=ruleUser();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"users",
            	    						lv_users_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.User");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:160:3: ( (lv_books_4_0= ruleBook ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:161:4: (lv_books_4_0= ruleBook )
            	    {
            	    // InternalMyDsl.g:161:4: (lv_books_4_0= ruleBook )
            	    // InternalMyDsl.g:162:5: lv_books_4_0= ruleBook
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_books_4_0=ruleBook();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"books",
            	    						lv_books_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Book");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:179:3: ( (lv_reservations_5_0= ruleReservation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:180:4: (lv_reservations_5_0= ruleReservation )
            	    {
            	    // InternalMyDsl.g:180:4: (lv_reservations_5_0= ruleReservation )
            	    // InternalMyDsl.g:181:5: lv_reservations_5_0= ruleReservation
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getReservationsReservationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_reservations_5_0=ruleReservation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reservations",
            	    						lv_reservations_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Reservation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleUser"
    // InternalMyDsl.g:206:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalMyDsl.g:206:45: (iv_ruleUser= ruleUser EOF )
            // InternalMyDsl.g:207:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMyDsl.g:213:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email=' ( (lv_email_3_0= RULE_STRING ) ) (otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) ) )? ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_email_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:219:2: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email=' ( (lv_email_3_0= RULE_STRING ) ) (otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:220:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email=' ( (lv_email_3_0= RULE_STRING ) ) (otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:220:2: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email=' ( (lv_email_3_0= RULE_STRING ) ) (otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) ) )? )
            // InternalMyDsl.g:221:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'email=' ( (lv_email_3_0= RULE_STRING ) ) (otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )? (otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
            		
            // InternalMyDsl.g:225:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:226:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:226:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:227:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getUserAccess().getEmailKeyword_2());
            		
            // InternalMyDsl.g:247:3: ( (lv_email_3_0= RULE_STRING ) )
            // InternalMyDsl.g:248:4: (lv_email_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:248:4: (lv_email_3_0= RULE_STRING )
            // InternalMyDsl.g:249:5: lv_email_3_0= RULE_STRING
            {
            lv_email_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_email_3_0, grammarAccess.getUserAccess().getEmailSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:265:3: (otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:266:4: otherlv_4= 'books=' otherlv_5= '{' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getUserAccess().getBooksKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:274:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMyDsl.g:275:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMyDsl.g:275:5: (otherlv_6= RULE_ID )
                    // InternalMyDsl.g:276:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_6, grammarAccess.getUserAccess().getOwnedBooksBookCrossReference_4_2_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:287:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:288:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_4); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUserAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:292:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalMyDsl.g:293:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:293:6: (otherlv_8= RULE_ID )
                    	    // InternalMyDsl.g:294:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUserRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getUserAccess().getOwnedBooksBookCrossReference_4_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:311:3: (otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:312:4: otherlv_10= 'currentReservation=' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getUserAccess().getCurrentReservationKeyword_5_0());
                    			
                    // InternalMyDsl.g:316:4: ( (otherlv_11= RULE_ID ) )
                    // InternalMyDsl.g:317:5: (otherlv_11= RULE_ID )
                    {
                    // InternalMyDsl.g:317:5: (otherlv_11= RULE_ID )
                    // InternalMyDsl.g:318:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUserRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_11, grammarAccess.getUserAccess().getCurrentReservationReservationCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleBook"
    // InternalMyDsl.g:334:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // InternalMyDsl.g:334:45: (iv_ruleBook= ruleBook EOF )
            // InternalMyDsl.g:335:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalMyDsl.g:341:1: ruleBook returns [EObject current=null] : (otherlv_0= 'book' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'author=' ( (lv_author_3_0= RULE_STRING ) ) otherlv_4= 'isbn=' ( (lv_isbn_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) ) )? ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token lv_author_3_0=null;
        Token otherlv_4=null;
        Token lv_isbn_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:347:2: ( (otherlv_0= 'book' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'author=' ( (lv_author_3_0= RULE_STRING ) ) otherlv_4= 'isbn=' ( (lv_isbn_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) ) )? ) )
            // InternalMyDsl.g:348:2: (otherlv_0= 'book' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'author=' ( (lv_author_3_0= RULE_STRING ) ) otherlv_4= 'isbn=' ( (lv_isbn_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) ) )? )
            {
            // InternalMyDsl.g:348:2: (otherlv_0= 'book' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'author=' ( (lv_author_3_0= RULE_STRING ) ) otherlv_4= 'isbn=' ( (lv_isbn_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) ) )? )
            // InternalMyDsl.g:349:3: otherlv_0= 'book' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= 'author=' ( (lv_author_3_0= RULE_STRING ) ) otherlv_4= 'isbn=' ( (lv_isbn_5_0= RULE_STRING ) ) (otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getBookAccess().getBookKeyword_0());
            		
            // InternalMyDsl.g:353:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalMyDsl.g:354:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:354:4: (lv_title_1_0= RULE_STRING )
            // InternalMyDsl.g:355:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_title_1_0, grammarAccess.getBookAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getBookAccess().getAuthorKeyword_2());
            		
            // InternalMyDsl.g:375:3: ( (lv_author_3_0= RULE_STRING ) )
            // InternalMyDsl.g:376:4: (lv_author_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:376:4: (lv_author_3_0= RULE_STRING )
            // InternalMyDsl.g:377:5: lv_author_3_0= RULE_STRING
            {
            lv_author_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_author_3_0, grammarAccess.getBookAccess().getAuthorSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author",
            						lv_author_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getBookAccess().getIsbnKeyword_4());
            		
            // InternalMyDsl.g:397:3: ( (lv_isbn_5_0= RULE_STRING ) )
            // InternalMyDsl.g:398:4: (lv_isbn_5_0= RULE_STRING )
            {
            // InternalMyDsl.g:398:4: (lv_isbn_5_0= RULE_STRING )
            // InternalMyDsl.g:399:5: lv_isbn_5_0= RULE_STRING
            {
            lv_isbn_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_isbn_5_0, grammarAccess.getBookAccess().getIsbnSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isbn",
            						lv_isbn_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:415:3: (otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:416:4: otherlv_6= 'borrowedBy=' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getBookAccess().getBorrowedByKeyword_6_0());
                    			
                    // InternalMyDsl.g:420:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMyDsl.g:421:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMyDsl.g:421:5: (otherlv_7= RULE_ID )
                    // InternalMyDsl.g:422:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBookRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getBookAccess().getBorrowerUserCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleReservation"
    // InternalMyDsl.g:438:1: entryRuleReservation returns [EObject current=null] : iv_ruleReservation= ruleReservation EOF ;
    public final EObject entryRuleReservation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReservation = null;


        try {
            // InternalMyDsl.g:438:52: (iv_ruleReservation= ruleReservation EOF )
            // InternalMyDsl.g:439:2: iv_ruleReservation= ruleReservation EOF
            {
             newCompositeNode(grammarAccess.getReservationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReservation=ruleReservation();

            state._fsp--;

             current =iv_ruleReservation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReservation"


    // $ANTLR start "ruleReservation"
    // InternalMyDsl.g:445:1: ruleReservation returns [EObject current=null] : (otherlv_0= 'reserve' otherlv_1= 'user=' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'book=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'from=' ( (lv_from_6_0= RULE_DATE ) ) otherlv_7= 'to=' ( (lv_to_8_0= RULE_DATE ) ) ) ;
    public final EObject ruleReservation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_from_6_0=null;
        Token otherlv_7=null;
        Token lv_to_8_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:451:2: ( (otherlv_0= 'reserve' otherlv_1= 'user=' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'book=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'from=' ( (lv_from_6_0= RULE_DATE ) ) otherlv_7= 'to=' ( (lv_to_8_0= RULE_DATE ) ) ) )
            // InternalMyDsl.g:452:2: (otherlv_0= 'reserve' otherlv_1= 'user=' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'book=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'from=' ( (lv_from_6_0= RULE_DATE ) ) otherlv_7= 'to=' ( (lv_to_8_0= RULE_DATE ) ) )
            {
            // InternalMyDsl.g:452:2: (otherlv_0= 'reserve' otherlv_1= 'user=' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'book=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'from=' ( (lv_from_6_0= RULE_DATE ) ) otherlv_7= 'to=' ( (lv_to_8_0= RULE_DATE ) ) )
            // InternalMyDsl.g:453:3: otherlv_0= 'reserve' otherlv_1= 'user=' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'book=' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'from=' ( (lv_from_6_0= RULE_DATE ) ) otherlv_7= 'to=' ( (lv_to_8_0= RULE_DATE ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getReservationAccess().getReserveKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReservationAccess().getUserKeyword_1());
            		
            // InternalMyDsl.g:461:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:462:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:462:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:463:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReservationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_2, grammarAccess.getReservationAccess().getUserUserCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getReservationAccess().getBookKeyword_3());
            		
            // InternalMyDsl.g:478:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:479:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:479:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:480:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReservationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_4, grammarAccess.getReservationAccess().getBookBookCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getReservationAccess().getFromKeyword_5());
            		
            // InternalMyDsl.g:495:3: ( (lv_from_6_0= RULE_DATE ) )
            // InternalMyDsl.g:496:4: (lv_from_6_0= RULE_DATE )
            {
            // InternalMyDsl.g:496:4: (lv_from_6_0= RULE_DATE )
            // InternalMyDsl.g:497:5: lv_from_6_0= RULE_DATE
            {
            lv_from_6_0=(Token)match(input,RULE_DATE,FOLLOW_21); 

            					newLeafNode(lv_from_6_0, grammarAccess.getReservationAccess().getFromDATETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReservationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"from",
            						lv_from_6_0,
            						"org.xtext.example.mydsl.MyDsl.DATE");
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getReservationAccess().getToKeyword_7());
            		
            // InternalMyDsl.g:517:3: ( (lv_to_8_0= RULE_DATE ) )
            // InternalMyDsl.g:518:4: (lv_to_8_0= RULE_DATE )
            {
            // InternalMyDsl.g:518:4: (lv_to_8_0= RULE_DATE )
            // InternalMyDsl.g:519:5: lv_to_8_0= RULE_DATE
            {
            lv_to_8_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

            					newLeafNode(lv_to_8_0, grammarAccess.getReservationAccess().getToDATETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReservationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"to",
            						lv_to_8_0,
            						"org.xtext.example.mydsl.MyDsl.DATE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReservation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000110C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001104000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});

}