/*
 * generated by Xtext
 */
grammar InternalBundleDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.bundleDsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.bundleDsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.bundleDsl.services.BundleDslGrammarAccess;

}

@parser::members {
 
 	private BundleDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(BundleDslGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getBundleAssignment()); }
(rule__Model__BundleAssignment)
{ after(grammarAccess.getModelAccess().getBundleAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBundle
entryRuleBundle 
:
{ before(grammarAccess.getBundleRule()); }
	 ruleBundle
{ after(grammarAccess.getBundleRule()); } 
	 EOF 
;

// Rule Bundle
ruleBundle
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBundleAccess().getGroup()); }
(rule__Bundle__Group__0)
{ after(grammarAccess.getBundleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCar
entryRuleCar 
:
{ before(grammarAccess.getCarRule()); }
	 ruleCar
{ after(grammarAccess.getCarRule()); } 
	 EOF 
;

// Rule Car
ruleCar
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCarAccess().getGroup()); }
(rule__Car__Group__0)
{ after(grammarAccess.getCarAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleExtra
entryRuleExtra 
:
{ before(grammarAccess.getExtraRule()); }
	 ruleExtra
{ after(grammarAccess.getExtraRule()); } 
	 EOF 
;

// Rule Extra
ruleExtra
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getExtraAccess().getGroup()); }
(rule__Extra__Group__0)
{ after(grammarAccess.getExtraAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleService
entryRuleService 
:
{ before(grammarAccess.getServiceRule()); }
	 ruleService
{ after(grammarAccess.getServiceRule()); } 
	 EOF 
;

// Rule Service
ruleService
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getServiceAccess().getGroup()); }
(rule__Service__Group__0)
{ after(grammarAccess.getServiceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCarExtra
entryRuleCarExtra 
:
{ before(grammarAccess.getCarExtraRule()); }
	 ruleCarExtra
{ after(grammarAccess.getCarExtraRule()); } 
	 EOF 
;

// Rule CarExtra
ruleCarExtra
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCarExtraAccess().getGroup()); }
(rule__CarExtra__Group__0)
{ after(grammarAccess.getCarExtraAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Bundle__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__0__Impl
	rule__Bundle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getBundleKeyword_0()); }

	'Bundle' 

{ after(grammarAccess.getBundleAccess().getBundleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__1__Impl
	rule__Bundle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getNameAssignment_1()); }
(rule__Bundle__NameAssignment_1)
{ after(grammarAccess.getBundleAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__2__Impl
	rule__Bundle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__3__Impl
	rule__Bundle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getBundleAccess().getCarsAssignment_3()); }
(rule__Bundle__CarsAssignment_3)
{ after(grammarAccess.getBundleAccess().getCarsAssignment_3()); }
)
(
{ before(grammarAccess.getBundleAccess().getCarsAssignment_3()); }
(rule__Bundle__CarsAssignment_3)*
{ after(grammarAccess.getBundleAccess().getCarsAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__4__Impl
	rule__Bundle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getServicesAssignment_4()); }
(rule__Bundle__ServicesAssignment_4)*
{ after(grammarAccess.getBundleAccess().getServicesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Bundle__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Bundle__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Car__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__0__Impl
	rule__Car__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getCarKeyword_0()); }

	'Car' 

{ after(grammarAccess.getCarAccess().getCarKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__1__Impl
	rule__Car__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getNameAssignment_1()); }
(rule__Car__NameAssignment_1)
{ after(grammarAccess.getCarAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__2__Impl
	rule__Car__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getCarAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__3__Impl
	rule__Car__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getTypeKeyword_3()); }

	'type' 

{ after(grammarAccess.getCarAccess().getTypeKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__4__Impl
	rule__Car__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getTypeAssignment_4()); }
(rule__Car__TypeAssignment_4)
{ after(grammarAccess.getCarAccess().getTypeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__5__Impl
	rule__Car__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getUsedAssignment_5()); }
(rule__Car__UsedAssignment_5)?
{ after(grammarAccess.getCarAccess().getUsedAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__6__Impl
	rule__Car__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getRightParenthesisKeyword_6()); }

	')' 

{ after(grammarAccess.getCarAccess().getRightParenthesisKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__7__Impl
	rule__Car__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_7()); }

	'{' 

{ after(grammarAccess.getCarAccess().getLeftCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__8__Impl
	rule__Car__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getCarAccess().getExtrasAssignment_8()); }
(rule__Car__ExtrasAssignment_8)
{ after(grammarAccess.getCarAccess().getExtrasAssignment_8()); }
)
(
{ before(grammarAccess.getCarAccess().getExtrasAssignment_8()); }
(rule__Car__ExtrasAssignment_8)*
{ after(grammarAccess.getCarAccess().getExtrasAssignment_8()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Car__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Car__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Car__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getCarAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__Extra__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Extra__Group__0__Impl
	rule__Extra__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Extra__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExtraAccess().getNameAssignment_0()); }
(rule__Extra__NameAssignment_0)
{ after(grammarAccess.getExtraAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Extra__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Extra__Group__1__Impl
	rule__Extra__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Extra__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExtraAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getExtraAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Extra__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Extra__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Extra__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExtraAccess().getDescriptionAssignment_2()); }
(rule__Extra__DescriptionAssignment_2)
{ after(grammarAccess.getExtraAccess().getDescriptionAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Service__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__0__Impl
	rule__Service__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getServiceKeyword_0()); }

	'Service' 

{ after(grammarAccess.getServiceAccess().getServiceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__1__Impl
	rule__Service__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getNameAssignment_1()); }
(rule__Service__NameAssignment_1)
{ after(grammarAccess.getServiceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__2__Impl
	rule__Service__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getForKeyword_2()); }

	'for' 

{ after(grammarAccess.getServiceAccess().getForKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Service__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Service__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Service__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getServiceAccess().getCarExtrasAssignment_3()); }
(rule__Service__CarExtrasAssignment_3)
{ after(grammarAccess.getServiceAccess().getCarExtrasAssignment_3()); }
)
(
{ before(grammarAccess.getServiceAccess().getCarExtrasAssignment_3()); }
(rule__Service__CarExtrasAssignment_3)*
{ after(grammarAccess.getServiceAccess().getCarExtrasAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}










rule__CarExtra__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CarExtra__Group__0__Impl
	rule__CarExtra__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarExtraAccess().getCarAssignment_0()); }
(rule__CarExtra__CarAssignment_0)
{ after(grammarAccess.getCarExtraAccess().getCarAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CarExtra__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CarExtra__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarExtraAccess().getGroup_1()); }
(rule__CarExtra__Group_1__0)?
{ after(grammarAccess.getCarExtraAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__CarExtra__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CarExtra__Group_1__0__Impl
	rule__CarExtra__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarExtraAccess().getLeftParenthesisKeyword_1_0()); }

	'(' 

{ after(grammarAccess.getCarExtraAccess().getLeftParenthesisKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CarExtra__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CarExtra__Group_1__1__Impl
	rule__CarExtra__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getCarExtraAccess().getExtrasAssignment_1_1()); }
(rule__CarExtra__ExtrasAssignment_1_1)
{ after(grammarAccess.getCarExtraAccess().getExtrasAssignment_1_1()); }
)
(
{ before(grammarAccess.getCarExtraAccess().getExtrasAssignment_1_1()); }
(rule__CarExtra__ExtrasAssignment_1_1)*
{ after(grammarAccess.getCarExtraAccess().getExtrasAssignment_1_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__CarExtra__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__CarExtra__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarExtraAccess().getRightParenthesisKeyword_1_2()); }

	')' 

{ after(grammarAccess.getCarExtraAccess().getRightParenthesisKeyword_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__BundleAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getBundleBundleParserRuleCall_0()); }
	ruleBundle{ after(grammarAccess.getModelAccess().getBundleBundleParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__CarsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getCarsCarParserRuleCall_3_0()); }
	ruleCar{ after(grammarAccess.getBundleAccess().getCarsCarParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Bundle__ServicesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBundleAccess().getServicesServiceParserRuleCall_4_0()); }
	ruleService{ after(grammarAccess.getBundleAccess().getServicesServiceParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Car__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getCarAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Car__TypeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getTypeSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getCarAccess().getTypeSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Car__UsedAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getUsedUsedKeyword_5_0()); }
(
{ before(grammarAccess.getCarAccess().getUsedUsedKeyword_5_0()); }

	'used' 

{ after(grammarAccess.getCarAccess().getUsedUsedKeyword_5_0()); }
)

{ after(grammarAccess.getCarAccess().getUsedUsedKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Car__ExtrasAssignment_8
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarAccess().getExtrasExtraParserRuleCall_8_0()); }
	ruleExtra{ after(grammarAccess.getCarAccess().getExtrasExtraParserRuleCall_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Extra__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExtraAccess().getNameIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getExtraAccess().getNameIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Extra__DescriptionAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getExtraAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getExtraAccess().getDescriptionSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getServiceAccess().getNameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Service__CarExtrasAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getServiceAccess().getCarExtrasCarExtraParserRuleCall_3_0()); }
	ruleCarExtra{ after(grammarAccess.getServiceAccess().getCarExtrasCarExtraParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__CarAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarExtraAccess().getCarCarCrossReference_0_0()); }
(
{ before(grammarAccess.getCarExtraAccess().getCarCarIDTerminalRuleCall_0_0_1()); }
	RULE_ID{ after(grammarAccess.getCarExtraAccess().getCarCarIDTerminalRuleCall_0_0_1()); }
)
{ after(grammarAccess.getCarExtraAccess().getCarCarCrossReference_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__CarExtra__ExtrasAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCarExtraAccess().getExtrasExtraCrossReference_1_1_0()); }
(
{ before(grammarAccess.getCarExtraAccess().getExtrasExtraIDTerminalRuleCall_1_1_0_1()); }
	RULE_ID{ after(grammarAccess.getCarExtraAccess().getExtrasExtraIDTerminalRuleCall_1_1_0_1()); }
)
{ after(grammarAccess.getCarExtraAccess().getExtrasExtraCrossReference_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


