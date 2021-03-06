/*
 * generated by Xtext
 */
package com.bundleDsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class BundleDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cBundleAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cBundleBundleParserRuleCall_0 = (RuleCall)cBundleAssignment.eContents().get(0);
		
		//Model:
		//	bundle=Bundle;
		@Override public ParserRule getRule() { return rule; }

		//bundle=Bundle
		public Assignment getBundleAssignment() { return cBundleAssignment; }

		//Bundle
		public RuleCall getBundleBundleParserRuleCall_0() { return cBundleBundleParserRuleCall_0; }
	}

	public class BundleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Bundle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBundleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCarsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCarsCarParserRuleCall_3_0 = (RuleCall)cCarsAssignment_3.eContents().get(0);
		private final Assignment cServicesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cServicesServiceParserRuleCall_4_0 = (RuleCall)cServicesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Bundle:
		//	"Bundle" name=ID "{" cars+=Car+ services+=Service* "}";
		@Override public ParserRule getRule() { return rule; }

		//"Bundle" name=ID "{" cars+=Car+ services+=Service* "}"
		public Group getGroup() { return cGroup; }

		//"Bundle"
		public Keyword getBundleKeyword_0() { return cBundleKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//cars+=Car+
		public Assignment getCarsAssignment_3() { return cCarsAssignment_3; }

		//Car
		public RuleCall getCarsCarParserRuleCall_3_0() { return cCarsCarParserRuleCall_3_0; }

		//services+=Service*
		public Assignment getServicesAssignment_4() { return cServicesAssignment_4; }

		//Service
		public RuleCall getServicesServiceParserRuleCall_4_0() { return cServicesServiceParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class CarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Car");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeSTRINGTerminalRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Assignment cUsedAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final Keyword cUsedUsedKeyword_5_0 = (Keyword)cUsedAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cExtrasAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cExtrasExtraParserRuleCall_8_0 = (RuleCall)cExtrasAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Car:
		//	"Car" name=ID "(" "type" type=STRING used?="used"? ")" "{" // at least one. No information about that was found
		//	extras+=Extra+ "}";
		@Override public ParserRule getRule() { return rule; }

		//"Car" name=ID "(" "type" type=STRING used?="used"? ")" "{" // at least one. No information about that was found
		//extras+=Extra+ "}"
		public Group getGroup() { return cGroup; }

		//"Car"
		public Keyword getCarKeyword_0() { return cCarKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//"type"
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }

		//type=STRING
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }

		//STRING
		public RuleCall getTypeSTRINGTerminalRuleCall_4_0() { return cTypeSTRINGTerminalRuleCall_4_0; }

		//used?="used"?
		public Assignment getUsedAssignment_5() { return cUsedAssignment_5; }

		//"used"
		public Keyword getUsedUsedKeyword_5_0() { return cUsedUsedKeyword_5_0; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }

		//// at least one. No information about that was found
		//extras+=Extra+
		public Assignment getExtrasAssignment_8() { return cExtrasAssignment_8; }

		//Extra
		public RuleCall getExtrasExtraParserRuleCall_8_0() { return cExtrasExtraParserRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class ExtraElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Extra");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_0 = (RuleCall)cDescriptionAssignment_2.eContents().get(0);
		
		//Extra:
		//	name=ID "=" description=STRING;
		@Override public ParserRule getRule() { return rule; }

		//name=ID "=" description=STRING
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//description=STRING
		public Assignment getDescriptionAssignment_2() { return cDescriptionAssignment_2; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_0() { return cDescriptionSTRINGTerminalRuleCall_2_0; }
	}

	public class ServiceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Service");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cServiceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCarExtrasAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCarExtrasCarExtraParserRuleCall_3_0 = (RuleCall)cCarExtrasAssignment_3.eContents().get(0);
		
		//Service:
		//	"Service" name=STRING "for" // multiplicity not stated
		//	carExtras+=CarExtra+;
		@Override public ParserRule getRule() { return rule; }

		//"Service" name=STRING "for" // multiplicity not stated
		//carExtras+=CarExtra+
		public Group getGroup() { return cGroup; }

		//"Service"
		public Keyword getServiceKeyword_0() { return cServiceKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"for"
		public Keyword getForKeyword_2() { return cForKeyword_2; }

		//// multiplicity not stated
		//carExtras+=CarExtra+
		public Assignment getCarExtrasAssignment_3() { return cCarExtrasAssignment_3; }

		//CarExtra
		public RuleCall getCarExtrasCarExtraParserRuleCall_3_0() { return cCarExtrasCarExtraParserRuleCall_3_0; }
	}

	public class CarExtraElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CarExtra");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCarAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cCarCarCrossReference_0_0 = (CrossReference)cCarAssignment_0.eContents().get(0);
		private final RuleCall cCarCarIDTerminalRuleCall_0_0_1 = (RuleCall)cCarCarCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExtrasAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cExtrasExtraCrossReference_1_1_0 = (CrossReference)cExtrasAssignment_1_1.eContents().get(0);
		private final RuleCall cExtrasExtraIDTerminalRuleCall_1_1_0_1 = (RuleCall)cExtrasExtraCrossReference_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//CarExtra:
		//	car=[Car] ("(" extras+=[Extra]+ ")")? // scope provider for car needed here
		//;
		@Override public ParserRule getRule() { return rule; }

		//car=[Car] ("(" extras+=[Extra]+ ")")? // scope provider for car needed here
		public Group getGroup() { return cGroup; }

		//car=[Car]
		public Assignment getCarAssignment_0() { return cCarAssignment_0; }

		//[Car]
		public CrossReference getCarCarCrossReference_0_0() { return cCarCarCrossReference_0_0; }

		//ID
		public RuleCall getCarCarIDTerminalRuleCall_0_0_1() { return cCarCarIDTerminalRuleCall_0_0_1; }

		//("(" extras+=[Extra]+ ")")?
		public Group getGroup_1() { return cGroup_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }

		//extras+=[Extra]+
		public Assignment getExtrasAssignment_1_1() { return cExtrasAssignment_1_1; }

		//[Extra]
		public CrossReference getExtrasExtraCrossReference_1_1_0() { return cExtrasExtraCrossReference_1_1_0; }

		//ID
		public RuleCall getExtrasExtraIDTerminalRuleCall_1_1_0_1() { return cExtrasExtraIDTerminalRuleCall_1_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	
	
	private final ModelElements pModel;
	private final BundleElements pBundle;
	private final CarElements pCar;
	private final ExtraElements pExtra;
	private final ServiceElements pService;
	private final CarExtraElements pCarExtra;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BundleDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pBundle = new BundleElements();
		this.pCar = new CarElements();
		this.pExtra = new ExtraElements();
		this.pService = new ServiceElements();
		this.pCarExtra = new CarExtraElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.bundleDsl.BundleDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	bundle=Bundle;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Bundle:
	//	"Bundle" name=ID "{" cars+=Car+ services+=Service* "}";
	public BundleElements getBundleAccess() {
		return pBundle;
	}
	
	public ParserRule getBundleRule() {
		return getBundleAccess().getRule();
	}

	//Car:
	//	"Car" name=ID "(" "type" type=STRING used?="used"? ")" "{" // at least one. No information about that was found
	//	extras+=Extra+ "}";
	public CarElements getCarAccess() {
		return pCar;
	}
	
	public ParserRule getCarRule() {
		return getCarAccess().getRule();
	}

	//Extra:
	//	name=ID "=" description=STRING;
	public ExtraElements getExtraAccess() {
		return pExtra;
	}
	
	public ParserRule getExtraRule() {
		return getExtraAccess().getRule();
	}

	//Service:
	//	"Service" name=STRING "for" // multiplicity not stated
	//	carExtras+=CarExtra+;
	public ServiceElements getServiceAccess() {
		return pService;
	}
	
	public ParserRule getServiceRule() {
		return getServiceAccess().getRule();
	}

	//CarExtra:
	//	car=[Car] ("(" extras+=[Extra]+ ")")? // scope provider for car needed here
	//;
	public CarExtraElements getCarExtraAccess() {
		return pCarExtra;
	}
	
	public ParserRule getCarExtraRule() {
		return getCarExtraAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
