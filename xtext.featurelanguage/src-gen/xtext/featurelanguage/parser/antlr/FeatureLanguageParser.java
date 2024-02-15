/*
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.featurelanguage.parser.antlr.internal.InternalFeatureLanguageParser;
import xtext.featurelanguage.services.FeatureLanguageGrammarAccess;

public class FeatureLanguageParser extends AbstractAntlrParser {

	@Inject
	private FeatureLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFeatureLanguageParser createParser(XtextTokenStream stream) {
		return new InternalFeatureLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FeatureLanguage";
	}

	public FeatureLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FeatureLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
