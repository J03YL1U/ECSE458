/*
 * generated by Xtext 2.32.0
 */
package xtext.featurelanguage.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FeatureLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("xtext/featurelanguage/parser/antlr/internal/InternalFeatureLanguage.tokens");
	}
}