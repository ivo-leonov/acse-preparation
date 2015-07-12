/*
 * generated by Xtext
 */
package com.bundleDsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.bundleDsl.services.BundleDslGrammarAccess;

public class BundleDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BundleDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.bundleDsl.parser.antlr.internal.InternalBundleDslParser createParser(XtextTokenStream stream) {
		return new com.bundleDsl.parser.antlr.internal.InternalBundleDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public BundleDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BundleDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
