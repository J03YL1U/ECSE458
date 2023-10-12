/*
 * generated by Xtext 2.32.0
 */
package my.xtext.featurelist.myfeaturelist.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import my.xtext.featurelist.myfeaturelist.ide.contentassist.antlr.internal.InternalMyFeatureListParser;
import my.xtext.featurelist.myfeaturelist.services.MyFeatureListGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MyFeatureListParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyFeatureListGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyFeatureListGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getVerbAccess().getAlternatives(), "rule__Verb__Alternatives");
			builder.put(grammarAccess.getFeatureListAccess().getGroup(), "rule__FeatureList__Group__0");
			builder.put(grammarAccess.getConceptAccess().getGroup(), "rule__Concept__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup_2(), "rule__Feature__Group_2__0");
			builder.put(grammarAccess.getFeatureListAccess().getConceptAssignment_0(), "rule__FeatureList__ConceptAssignment_0");
			builder.put(grammarAccess.getFeatureListAccess().getFeatureAssignment_2(), "rule__FeatureList__FeatureAssignment_2");
			builder.put(grammarAccess.getConceptAccess().getNameAssignment_1(), "rule__Concept__NameAssignment_1");
			builder.put(grammarAccess.getConceptAccess().getAttributesAssignment_2(), "rule__Concept__AttributesAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment(), "rule__Attribute__NameAssignment");
			builder.put(grammarAccess.getFeatureAccess().getVerbAssignment_0(), "rule__Feature__VerbAssignment_0");
			builder.put(grammarAccess.getFeatureAccess().getConceptAssignment_1(), "rule__Feature__ConceptAssignment_1");
			builder.put(grammarAccess.getFeatureAccess().getAttributeAssignment_2_1(), "rule__Feature__AttributeAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyFeatureListGrammarAccess grammarAccess;

	@Override
	protected InternalMyFeatureListParser createParser() {
		InternalMyFeatureListParser result = new InternalMyFeatureListParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyFeatureListGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyFeatureListGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
