package Java2Uml.integrate.hipe.engine.actor.localsearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.match.OverlapMatch;
import hipe.engine.match.LocalSearchMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.production.MatchAdded;
import hipe.engine.message.production.MatchDeleted;
import hipe.engine.util.HiPEMultiUtil;

import hipe.network.LocalSearchNode;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;
import hipe.generic.actor.local.GenericLocalSearchActor;
import hipe.generic.actor.local.search.*;
import hipe.generic.actor.local.search.misc.*;

import org.eclipse.emf.ecore.EObject;

public class JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch extends GenericLocalSearchActor{
	ConstraintChecker node_constraint;
	ConstraintChecker node_constraint_0;
	ConstraintChecker node_constraint_1;
	ConstraintChecker node_constraint_2;
	ConstraintChecker node_constraint_3;
	ConstraintChecker node_constraint_4;
	ConstraintChecker node_constraint_5;
	ConstraintChecker node_constraint_6;
	ConstraintChecker node_constraint_7;
	ConstraintChecker node_constraint_8;
	ConstraintChecker node_constraint_9;
	ConstraintChecker node_constraint_10;
	ConstraintChecker node_constraint_11;
	ConstraintChecker node_constraint_12;
	ConstraintChecker node_constraint_13;
	ConstraintChecker node_constraint_14;
	ConstraintChecker node_constraint_15;
	ConstraintChecker node_constraint_16;
	ConstraintChecker node_constraint_17;
	ConstraintChecker node_constraint_18;
	ConstraintChecker node_constraint_19;
	ConstraintChecker node_constraint_20;
	ConstraintChecker node_constraint_21;
	ConstraintChecker node_constraint_22;
	ConstraintChecker node_constraint_23;
	ConstraintChecker node_constraint_24;
	ConstraintChecker node_constraint_25;
	ConstraintChecker node_constraint_26;
	ConstraintChecker node_constraint_27;
	ConstraintChecker node_constraint_28;
	ConstraintChecker node_constraint_29;
	ConstraintChecker node_constraint_30;
	ConstraintChecker node_constraint_31;
	ConstraintChecker node_constraint_32;
	ConstraintChecker node_constraint_33;
	ConstraintChecker node_constraint_34;
	ConstraintChecker node_constraint_35;
	ConstraintChecker node_constraint_36;
	ConstraintChecker node_constraint_37;
	ConstraintChecker node_constraint_38;
	ConstraintChecker node_constraint_39;
	ConstraintChecker node_constraint_40;
	ConstraintChecker node_constraint_41;
	ConstraintChecker node_constraint_42;
	ConstraintChecker node_constraint_43;
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	ConstraintChecker constraint_checker_1;
	ConstraintChecker constraint_checker_2;
	ConstraintChecker constraint_checker_3;
	ConstraintChecker constraint_checker_4;
	ConstraintChecker constraint_checker_5;
	ConstraintChecker constraint_checker_6;
	ConstraintChecker constraint_checker_7;
	ConstraintChecker constraint_checker_8;
	ConstraintChecker constraint_checker_9;
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	CachedEdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	CachedEdgeExplorer edge_explorer_11;
	CachedEdgeExplorer edge_explorer_12;
	CachedEdgeExplorer edge_explorer_13;
	CachedEdgeExplorer edge_explorer_14;
	CachedEdgeExplorer edge_explorer_15;
	CachedEdgeExplorer edge_explorer_16;
	CachedEdgeExplorer edge_explorer_17;
	PACExplorer pac_explorer;
	PACExplorer pac_explorer_0;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_6_1_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_8_1_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_9_1_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_10_1_orchestration;
	SearchOrchestration edge_explorer_11_0_orchestration;
	SearchOrchestration edge_explorer_11_1_orchestration;
	SearchOrchestration edge_explorer_12_0_orchestration;
	SearchOrchestration edge_explorer_13_0_orchestration;
	SearchOrchestration edge_explorer_13_1_orchestration;
	SearchOrchestration edge_explorer_14_0_orchestration;
	SearchOrchestration edge_explorer_14_1_orchestration;
	SearchOrchestration edge_explorer_15_0_orchestration;
	SearchOrchestration edge_explorer_15_1_orchestration;
	SearchOrchestration edge_explorer_16_0_orchestration;
	SearchOrchestration edge_explorer_16_1_orchestration;
	SearchOrchestration edge_explorer_17_0_orchestration;
	SearchOrchestration pac_explorer_orchestration;
	SearchOrchestration pac_explorer_0_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_1 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		node_constraint = new ConstraintChecker(this, this::node_constraint_method);
		name2explorer.put("node_constraint", node_constraint);
		node_constraint_0 = new ConstraintChecker(this, this::node_constraint_0_method);
		name2explorer.put("node_constraint_0", node_constraint_0);
		node_constraint_1 = new ConstraintChecker(this, this::node_constraint_1_method);
		name2explorer.put("node_constraint_1", node_constraint_1);
		node_constraint_2 = new ConstraintChecker(this, this::node_constraint_2_method);
		name2explorer.put("node_constraint_2", node_constraint_2);
		node_constraint_3 = new ConstraintChecker(this, this::node_constraint_3_method);
		name2explorer.put("node_constraint_3", node_constraint_3);
		node_constraint_4 = new ConstraintChecker(this, this::node_constraint_4_method);
		name2explorer.put("node_constraint_4", node_constraint_4);
		node_constraint_5 = new ConstraintChecker(this, this::node_constraint_5_method);
		name2explorer.put("node_constraint_5", node_constraint_5);
		node_constraint_6 = new ConstraintChecker(this, this::node_constraint_6_method);
		name2explorer.put("node_constraint_6", node_constraint_6);
		node_constraint_7 = new ConstraintChecker(this, this::node_constraint_7_method);
		name2explorer.put("node_constraint_7", node_constraint_7);
		node_constraint_8 = new ConstraintChecker(this, this::node_constraint_8_method);
		name2explorer.put("node_constraint_8", node_constraint_8);
		node_constraint_9 = new ConstraintChecker(this, this::node_constraint_9_method);
		name2explorer.put("node_constraint_9", node_constraint_9);
		node_constraint_10 = new ConstraintChecker(this, this::node_constraint_10_method);
		name2explorer.put("node_constraint_10", node_constraint_10);
		node_constraint_11 = new ConstraintChecker(this, this::node_constraint_11_method);
		name2explorer.put("node_constraint_11", node_constraint_11);
		node_constraint_12 = new ConstraintChecker(this, this::node_constraint_12_method);
		name2explorer.put("node_constraint_12", node_constraint_12);
		node_constraint_13 = new ConstraintChecker(this, this::node_constraint_13_method);
		name2explorer.put("node_constraint_13", node_constraint_13);
		node_constraint_14 = new ConstraintChecker(this, this::node_constraint_14_method);
		name2explorer.put("node_constraint_14", node_constraint_14);
		node_constraint_15 = new ConstraintChecker(this, this::node_constraint_15_method);
		name2explorer.put("node_constraint_15", node_constraint_15);
		node_constraint_16 = new ConstraintChecker(this, this::node_constraint_16_method);
		name2explorer.put("node_constraint_16", node_constraint_16);
		node_constraint_17 = new ConstraintChecker(this, this::node_constraint_17_method);
		name2explorer.put("node_constraint_17", node_constraint_17);
		node_constraint_18 = new ConstraintChecker(this, this::node_constraint_18_method);
		name2explorer.put("node_constraint_18", node_constraint_18);
		node_constraint_19 = new ConstraintChecker(this, this::node_constraint_19_method);
		name2explorer.put("node_constraint_19", node_constraint_19);
		node_constraint_20 = new ConstraintChecker(this, this::node_constraint_20_method);
		name2explorer.put("node_constraint_20", node_constraint_20);
		node_constraint_21 = new ConstraintChecker(this, this::node_constraint_21_method);
		name2explorer.put("node_constraint_21", node_constraint_21);
		node_constraint_22 = new ConstraintChecker(this, this::node_constraint_22_method);
		name2explorer.put("node_constraint_22", node_constraint_22);
		node_constraint_23 = new ConstraintChecker(this, this::node_constraint_23_method);
		name2explorer.put("node_constraint_23", node_constraint_23);
		node_constraint_24 = new ConstraintChecker(this, this::node_constraint_24_method);
		name2explorer.put("node_constraint_24", node_constraint_24);
		node_constraint_25 = new ConstraintChecker(this, this::node_constraint_25_method);
		name2explorer.put("node_constraint_25", node_constraint_25);
		node_constraint_26 = new ConstraintChecker(this, this::node_constraint_26_method);
		name2explorer.put("node_constraint_26", node_constraint_26);
		node_constraint_27 = new ConstraintChecker(this, this::node_constraint_27_method);
		name2explorer.put("node_constraint_27", node_constraint_27);
		node_constraint_28 = new ConstraintChecker(this, this::node_constraint_28_method);
		name2explorer.put("node_constraint_28", node_constraint_28);
		node_constraint_29 = new ConstraintChecker(this, this::node_constraint_29_method);
		name2explorer.put("node_constraint_29", node_constraint_29);
		node_constraint_30 = new ConstraintChecker(this, this::node_constraint_30_method);
		name2explorer.put("node_constraint_30", node_constraint_30);
		node_constraint_31 = new ConstraintChecker(this, this::node_constraint_31_method);
		name2explorer.put("node_constraint_31", node_constraint_31);
		node_constraint_32 = new ConstraintChecker(this, this::node_constraint_32_method);
		name2explorer.put("node_constraint_32", node_constraint_32);
		node_constraint_33 = new ConstraintChecker(this, this::node_constraint_33_method);
		name2explorer.put("node_constraint_33", node_constraint_33);
		node_constraint_34 = new ConstraintChecker(this, this::node_constraint_34_method);
		name2explorer.put("node_constraint_34", node_constraint_34);
		node_constraint_35 = new ConstraintChecker(this, this::node_constraint_35_method);
		name2explorer.put("node_constraint_35", node_constraint_35);
		node_constraint_36 = new ConstraintChecker(this, this::node_constraint_36_method);
		name2explorer.put("node_constraint_36", node_constraint_36);
		node_constraint_37 = new ConstraintChecker(this, this::node_constraint_37_method);
		name2explorer.put("node_constraint_37", node_constraint_37);
		node_constraint_38 = new ConstraintChecker(this, this::node_constraint_38_method);
		name2explorer.put("node_constraint_38", node_constraint_38);
		node_constraint_39 = new ConstraintChecker(this, this::node_constraint_39_method);
		name2explorer.put("node_constraint_39", node_constraint_39);
		node_constraint_40 = new ConstraintChecker(this, this::node_constraint_40_method);
		name2explorer.put("node_constraint_40", node_constraint_40);
		node_constraint_41 = new ConstraintChecker(this, this::node_constraint_41_method);
		name2explorer.put("node_constraint_41", node_constraint_41);
		node_constraint_42 = new ConstraintChecker(this, this::node_constraint_42_method);
		name2explorer.put("node_constraint_42", node_constraint_42);
		node_constraint_43 = new ConstraintChecker(this, this::node_constraint_43_method);
		name2explorer.put("node_constraint_43", node_constraint_43);
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		constraint_checker_0 = new ConstraintChecker(this, this::constraint_checker_0_method);
		name2explorer.put("constraint_checker_0", constraint_checker_0);
		constraint_checker_1 = new ConstraintChecker(this, this::constraint_checker_1_method);
		name2explorer.put("constraint_checker_1", constraint_checker_1);
		constraint_checker_2 = new ConstraintChecker(this, this::constraint_checker_2_method);
		name2explorer.put("constraint_checker_2", constraint_checker_2);
		constraint_checker_3 = new ConstraintChecker(this, this::constraint_checker_3_method);
		name2explorer.put("constraint_checker_3", constraint_checker_3);
		constraint_checker_4 = new ConstraintChecker(this, this::constraint_checker_4_method);
		name2explorer.put("constraint_checker_4", constraint_checker_4);
		constraint_checker_5 = new ConstraintChecker(this, this::constraint_checker_5_method);
		name2explorer.put("constraint_checker_5", constraint_checker_5);
		constraint_checker_6 = new ConstraintChecker(this, this::constraint_checker_6_method);
		name2explorer.put("constraint_checker_6", constraint_checker_6);
		constraint_checker_7 = new ConstraintChecker(this, this::constraint_checker_7_method);
		name2explorer.put("constraint_checker_7", constraint_checker_7);
		constraint_checker_8 = new ConstraintChecker(this, this::constraint_checker_8_method);
		name2explorer.put("constraint_checker_8", constraint_checker_8);
		constraint_checker_9 = new ConstraintChecker(this, this::constraint_checker_9_method);
		name2explorer.put("constraint_checker_9", constraint_checker_9);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__stringType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer = new CachedEdgeExplorer(this, 14, 10, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__byteType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_3 = new CachedEdgeExplorer(this, 14, 3, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__umlModel(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 14, 11, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__longType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_5 = new CachedEdgeExplorer(this, 14, 8, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCONTEXT__SRC__javaPackage(); return (result instanceof org.emftext.language.java.containers.Package ? result : null);};
						edge_explorer_6 = new CachedEdgeExplorer(this, 14, 1, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__intType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_7 = new CachedEdgeExplorer(this, 14, 7, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__SRC__compilationUnit(); return (result instanceof org.emftext.language.java.containers.CompilationUnit ? result : null);};
						edge_explorer_8 = new CachedEdgeExplorer(this, 14, 0, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__doubleType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_9 = new CachedEdgeExplorer(this, 14, 5, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__shortType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_10 = new CachedEdgeExplorer(this, 14, 9, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.unique_lookup = (o) -> ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__CORR__javaCompUnitToUmlModel();
						edge_explorer_11 = new CachedEdgeExplorer(this, 14, 13, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
		EdgeLookupMethods edge_explorer_12_methods = new EdgeLookupMethods();
						edge_explorer_12_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaCompilationUnitToUmlModel) o).getTarget(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_12 = new CachedEdgeExplorer(this, 13, 11, edge_explorer_12_methods);
		name2explorer.put("edge_explorer_12", edge_explorer_12);
		EdgeLookupMethods edge_explorer_13_methods = new EdgeLookupMethods();
						edge_explorer_13_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__booleanType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_13 = new CachedEdgeExplorer(this, 14, 2, edge_explorer_13_methods);
		name2explorer.put("edge_explorer_13", edge_explorer_13);
		EdgeLookupMethods edge_explorer_14_methods = new EdgeLookupMethods();
						edge_explorer_14_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__charType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_14 = new CachedEdgeExplorer(this, 14, 4, edge_explorer_14_methods);
		name2explorer.put("edge_explorer_14", edge_explorer_14);
		EdgeLookupMethods edge_explorer_15_methods = new EdgeLookupMethods();
						edge_explorer_15_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__floatType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_15 = new CachedEdgeExplorer(this, 14, 6, edge_explorer_15_methods);
		name2explorer.put("edge_explorer_15", edge_explorer_15);
		EdgeLookupMethods edge_explorer_16_methods = new EdgeLookupMethods();
						edge_explorer_16_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker) o).getCREATE__TRG__voidType(); return (result instanceof uml.PrimitiveType ? result : null);};
						edge_explorer_16 = new CachedEdgeExplorer(this, 14, 12, edge_explorer_16_methods);
		name2explorer.put("edge_explorer_16", edge_explorer_16);
		EdgeLookupMethods edge_explorer_17_methods = new EdgeLookupMethods();
						edge_explorer_17_methods.unique_lookup = (o) -> {EObject result = ((Java2Uml.JavaCompilationUnitToUmlModel) o).getSource(); return (result instanceof org.emftext.language.java.containers.CompilationUnit ? result : null);};
						edge_explorer_17 = new CachedEdgeExplorer(this, 13, 0, edge_explorer_17_methods);
		name2explorer.put("edge_explorer_17", edge_explorer_17);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {0,1}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
		pac_explorer_0 = new PACExplorer(this, Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12}), node.getAllOverlaps().get(1));
		name2explorer.put("pac_explorer_0", pac_explorer_0);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_8_1_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_9_1_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		edge_explorer_10_1_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
		edge_explorer_11_0_orchestration = initializeOrchestration(node.getOrchestrations().get(19).getPlan());
		edge_explorer_11_1_orchestration = initializeOrchestration(node.getOrchestrations().get(20).getPlan());
		edge_explorer_12_0_orchestration = initializeOrchestration(node.getOrchestrations().get(21).getPlan());
		edge_explorer_13_0_orchestration = initializeOrchestration(node.getOrchestrations().get(22).getPlan());
		edge_explorer_13_1_orchestration = initializeOrchestration(node.getOrchestrations().get(23).getPlan());
		edge_explorer_14_0_orchestration = initializeOrchestration(node.getOrchestrations().get(24).getPlan());
		edge_explorer_14_1_orchestration = initializeOrchestration(node.getOrchestrations().get(25).getPlan());
		edge_explorer_15_0_orchestration = initializeOrchestration(node.getOrchestrations().get(26).getPlan());
		edge_explorer_15_1_orchestration = initializeOrchestration(node.getOrchestrations().get(27).getPlan());
		edge_explorer_16_0_orchestration = initializeOrchestration(node.getOrchestrations().get(28).getPlan());
		edge_explorer_16_1_orchestration = initializeOrchestration(node.getOrchestrations().get(29).getPlan());
		edge_explorer_17_0_orchestration = initializeOrchestration(node.getOrchestrations().get(30).getPlan());
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(31).getPlan());
		pac_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(32).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "JavaCompilationUnitToUmlModel_object": 
				{
					edge_explorer_12.registerSourceObject(objs[0]);
					edge_explorer_17.registerSourceObject(objs[0]);
					
					// javaCompUnitToUmlModel
					HMatch match_13 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					match_13.getNodes()[13] = objs[0];
					start(edge_explorer_11_1_orchestration, match_13);
				}
				break;
			case "JavaFirstCompilationUnitToUmlModel__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					edge_explorer_8.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_10.registerSourceObject(objs[0]);
					edge_explorer_11.registerSourceObject(objs[0]);
					edge_explorer_13.registerSourceObject(objs[0]);
					edge_explorer_14.registerSourceObject(objs[0]);
					edge_explorer_15.registerSourceObject(objs[0]);
					edge_explorer_16.registerSourceObject(objs[0]);
					
					// JavaFirstCompilationUnitToUmlModel_eMoflon_ProtocolNode
					HMatch match_14 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					match_14.getNodes()[14] = objs[0];
					start(edge_explorer_1_orchestration, match_14);
				}
				break;
			case "JavaFirstCompilationUnitToUmlModel__FWD_883_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
						acMatch_0.getNodes()[0] = objs[1];
						acMatch_0.getNodes()[1] = objs[0];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
					}
				}
				break;
			case "JavaFirstCompilationUnitToUmlModel__BWD_844_junction": 
				{
					if(pac_explorer_0.register(match)) {
						HMatch acMatch_1 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
						acMatch_1.getNodes()[1] = objs[0];
						acMatch_1.getNodes()[2] = objs[1];
						acMatch_1.getNodes()[3] = objs[2];
						acMatch_1.getNodes()[4] = objs[3];
						acMatch_1.getNodes()[5] = objs[4];
						acMatch_1.getNodes()[6] = objs[5];
						acMatch_1.getNodes()[7] = objs[6];
						acMatch_1.getNodes()[8] = objs[7];
						acMatch_1.getNodes()[9] = objs[8];
						acMatch_1.getNodes()[10] = objs[9];
						acMatch_1.getNodes()[11] = objs[10];
						acMatch_1.getNodes()[12] = objs[11];
						
						// start search
						currentDepth++;
						start(pac_explorer_0_orchestration, acMatch_1);
						currentDepth--;
					}
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "JavaCompilationUnitToUmlModel_object": 
				removeMatchesUsedBy(match.getNodes()[0], 13);
				break;
			case "JavaFirstCompilationUnitToUmlModel__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 14);
				break;
			case "JavaFirstCompilationUnitToUmlModel__FWD_883_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(2);
					acMatch_0.getNodes()[0] = match.getNodes()[1];
					acMatch_0.getNodes()[1] = match.getNodes()[0];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "JavaFirstCompilationUnitToUmlModel__BWD_844_junction": 
				if(pac_explorer_0.deregister(match)) {
					OverlapMatch acMatch_1 = new OverlapMatch(12);
					acMatch_1.getNodes()[0] = match.getNodes()[0];
					acMatch_1.getNodes()[1] = match.getNodes()[1];
					acMatch_1.getNodes()[2] = match.getNodes()[2];
					acMatch_1.getNodes()[3] = match.getNodes()[3];
					acMatch_1.getNodes()[4] = match.getNodes()[4];
					acMatch_1.getNodes()[5] = match.getNodes()[5];
					acMatch_1.getNodes()[6] = match.getNodes()[6];
					acMatch_1.getNodes()[7] = match.getNodes()[7];
					acMatch_1.getNodes()[8] = match.getNodes()[8];
					acMatch_1.getNodes()[9] = match.getNodes()[9];
					acMatch_1.getNodes()[10] = match.getNodes()[10];
					acMatch_1.getNodes()[11] = match.getNodes()[11];
					Collection<HMatch> o2Matches_1 = overlap2matches_1.get(acMatch_1);
					if(o2Matches_1 != null) {
						if(!o2Matches_1.isEmpty()) {
							sendDeletedMatches(o2Matches_1);
							o2Matches_1.clear();
						}
					}
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__stringType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[10] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[10] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[10] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__byteType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_3.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[3] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__umlModel_Model": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Model) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[11] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.Model) {
				{
					edge_explorer_4.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[11] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__longType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_5.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[8] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CONTEXT__SRC__javaPackage_Package": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.containers.Package) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.containers.Package) {
				{
					edge_explorer_6.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[1] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__intType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_7.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[7] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__SRC__compilationUnit_CompilationUnit": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.containers.CompilationUnit) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof org.emftext.language.java.containers.CompilationUnit) {
				{
					edge_explorer_8.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__doubleType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_9.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[5] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__shortType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_10.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__CORR__javaCompUnitToUmlModel_JavaCompilationUnitToUmlModel": 
			if(!lazy_initialization) {
				{
					edge_explorer_11.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[13] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				
				{
					edge_explorer_11.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[13] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				
			}
			break;
		case "Java2Uml.JavaCompilationUnitToUmlModel_target_Model": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.Model) {
				{
					edge_explorer_12.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[13] = msg.source;
					objs[11] = msg.target;
					currentDepth++;
					start(edge_explorer_12_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__booleanType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_13.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_13_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_13.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[2] = msg.target;
					currentDepth++;
					start(edge_explorer_13_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__charType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_14.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_14_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_14.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[4] = msg.target;
					currentDepth++;
					start(edge_explorer_14_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__floatType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_15.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_15_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_15.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[6] = msg.target;
					currentDepth++;
					start(edge_explorer_15_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__voidType_PrimitiveType": 
			if(!lazy_initialization) {
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_16.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[12] = msg.target;
					currentDepth++;
					start(edge_explorer_16_0_orchestration, match);
					currentDepth--;
				}
				}
				
				if(msg.target instanceof uml.PrimitiveType) {
				{
					edge_explorer_16.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[14] = msg.source;
					objs[12] = msg.target;
					currentDepth++;
					start(edge_explorer_16_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		case "Java2Uml.JavaCompilationUnitToUmlModel_source_CompilationUnit": 
			if(!lazy_initialization) {
				if(msg.target instanceof org.emftext.language.java.containers.CompilationUnit) {
				{
					edge_explorer_17.registerEdge(msg.source, msg.target);
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
					Object[] objs = match.getNodes();
					objs[13] = msg.source;
					objs[0] = msg.target;
					currentDepth++;
					start(edge_explorer_17_0_orchestration, match);
					currentDepth--;
				}
				}
				
			}
			break;
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__stringType_PrimitiveType": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[10].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[10].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[10].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__byteType_PrimitiveType": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__umlModel_Model": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[11].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[11].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__longType_PrimitiveType": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CONTEXT__SRC__javaPackage_Package": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__intType_PrimitiveType": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__SRC__compilationUnit_CompilationUnit": 
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				edge_explorer_8.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__doubleType_PrimitiveType": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__shortType_PrimitiveType": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
					}
				}
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_18.add(m);
					}
					if(!toBeRemoved_18.isEmpty()) {
						sendDeletedMatches(toBeRemoved_18);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__CORR__javaCompUnitToUmlModel_JavaCompilationUnitToUmlModel": 
				edge_explorer_11.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_19 = obj2matches.get(msg.source);
				if(matches_19 != null && !matches_19.isEmpty()) {
					Collection<HMatch> toBeRemoved_19 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_19) {
						if(m.getNodes()[13].equals(msg.target))
							toBeRemoved_19.add(m);
					}
					if(!toBeRemoved_19.isEmpty()) {
						sendDeletedMatches(toBeRemoved_19);
					}
				}
				edge_explorer_11.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_20 = obj2matches.get(msg.source);
				if(matches_20 != null && !matches_20.isEmpty()) {
					Collection<HMatch> toBeRemoved_20 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_20) {
						if(m.getNodes()[13].equals(msg.target))
							toBeRemoved_20.add(m);
					}
					if(!toBeRemoved_20.isEmpty()) {
						sendDeletedMatches(toBeRemoved_20);
					}
				}
				break;
		case "Java2Uml.JavaCompilationUnitToUmlModel_target_Model": 
				edge_explorer_12.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_21 = obj2matches.get(msg.source);
				if(matches_21 != null && !matches_21.isEmpty()) {
					Collection<HMatch> toBeRemoved_21 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_21) {
						if(m.getNodes()[11].equals(msg.target))
							toBeRemoved_21.add(m);
					}
					if(!toBeRemoved_21.isEmpty()) {
						sendDeletedMatches(toBeRemoved_21);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__booleanType_PrimitiveType": 
				edge_explorer_13.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_22 = obj2matches.get(msg.source);
				if(matches_22 != null && !matches_22.isEmpty()) {
					Collection<HMatch> toBeRemoved_22 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_22) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_22.add(m);
					}
					if(!toBeRemoved_22.isEmpty()) {
						sendDeletedMatches(toBeRemoved_22);
					}
				}
				edge_explorer_13.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_23 = obj2matches.get(msg.source);
				if(matches_23 != null && !matches_23.isEmpty()) {
					Collection<HMatch> toBeRemoved_23 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_23) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_23.add(m);
					}
					if(!toBeRemoved_23.isEmpty()) {
						sendDeletedMatches(toBeRemoved_23);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__charType_PrimitiveType": 
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_24 = obj2matches.get(msg.source);
				if(matches_24 != null && !matches_24.isEmpty()) {
					Collection<HMatch> toBeRemoved_24 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_24) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_24.add(m);
					}
					if(!toBeRemoved_24.isEmpty()) {
						sendDeletedMatches(toBeRemoved_24);
					}
				}
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_25 = obj2matches.get(msg.source);
				if(matches_25 != null && !matches_25.isEmpty()) {
					Collection<HMatch> toBeRemoved_25 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_25) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_25.add(m);
					}
					if(!toBeRemoved_25.isEmpty()) {
						sendDeletedMatches(toBeRemoved_25);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__floatType_PrimitiveType": 
				edge_explorer_15.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_26 = obj2matches.get(msg.source);
				if(matches_26 != null && !matches_26.isEmpty()) {
					Collection<HMatch> toBeRemoved_26 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_26) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_26.add(m);
					}
					if(!toBeRemoved_26.isEmpty()) {
						sendDeletedMatches(toBeRemoved_26);
					}
				}
				edge_explorer_15.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_27 = obj2matches.get(msg.source);
				if(matches_27 != null && !matches_27.isEmpty()) {
					Collection<HMatch> toBeRemoved_27 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_27) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_27.add(m);
					}
					if(!toBeRemoved_27.isEmpty()) {
						sendDeletedMatches(toBeRemoved_27);
					}
				}
				break;
		case "Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker_CREATE__TRG__voidType_PrimitiveType": 
				edge_explorer_16.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_28 = obj2matches.get(msg.source);
				if(matches_28 != null && !matches_28.isEmpty()) {
					Collection<HMatch> toBeRemoved_28 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_28) {
						if(m.getNodes()[12].equals(msg.target))
							toBeRemoved_28.add(m);
					}
					if(!toBeRemoved_28.isEmpty()) {
						sendDeletedMatches(toBeRemoved_28);
					}
				}
				edge_explorer_16.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_29 = obj2matches.get(msg.source);
				if(matches_29 != null && !matches_29.isEmpty()) {
					Collection<HMatch> toBeRemoved_29 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_29) {
						if(m.getNodes()[12].equals(msg.target))
							toBeRemoved_29.add(m);
					}
					if(!toBeRemoved_29.isEmpty()) {
						sendDeletedMatches(toBeRemoved_29);
					}
				}
				break;
		case "Java2Uml.JavaCompilationUnitToUmlModel_source_CompilationUnit": 
				edge_explorer_17.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_30 = obj2matches.get(msg.source);
				if(matches_30 != null && !matches_30.isEmpty()) {
					Collection<HMatch> toBeRemoved_30 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_30) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_30.add(m);
					}
					if(!toBeRemoved_30.isEmpty()) {
						sendDeletedMatches(toBeRemoved_30);
					}
				}
				break;
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		// register JavaFirstCompilationUnitToUmlModel__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register JavaFirstCompilationUnitToUmlModel__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(12);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[1];
		oMatch_Nodes_1[1] = objs[2];
		oMatch_Nodes_1[2] = objs[3];
		oMatch_Nodes_1[3] = objs[4];
		oMatch_Nodes_1[4] = objs[5];
		oMatch_Nodes_1[5] = objs[6];
		oMatch_Nodes_1[6] = objs[7];
		oMatch_Nodes_1[7] = objs[8];
		oMatch_Nodes_1[8] = objs[9];
		oMatch_Nodes_1[9] = objs[10];
		oMatch_Nodes_1[10] = objs[11];
		oMatch_Nodes_1[11] = objs[12];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		
		// register booleanType
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register byteType
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register charType
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register doubleType
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register floatType
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register intType
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
		// register longType
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 == null) {
			matches_8 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[8], matches_8);
		}
		matches_8.add(match);
		
		// register shortType
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 == null) {
			matches_9 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[9], matches_9);
		}
		matches_9.add(match);
		
		// register stringType
		Collection<HMatch> matches_10 = obj2matches.get(objs[10]);
		if(matches_10 == null) {
			matches_10 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[10], matches_10);
		}
		matches_10.add(match);
		
		// register umlModel
		Collection<HMatch> matches_11 = obj2matches.get(objs[11]);
		if(matches_11 == null) {
			matches_11 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[11], matches_11);
		}
		matches_11.add(match);
		
		// register voidType
		Collection<HMatch> matches_12 = obj2matches.get(objs[12]);
		if(matches_12 == null) {
			matches_12 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[12], matches_12);
		}
		matches_12.add(match);
		
		// register javaCompUnitToUmlModel
		Collection<HMatch> matches_13 = obj2matches.get(objs[13]);
		if(matches_13 == null) {
			matches_13 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[13], matches_13);
		}
		matches_13.add(match);
		
		// register JavaFirstCompilationUnitToUmlModel_eMoflon_ProtocolNode
		Collection<HMatch> matches_14 = obj2matches.get(objs[14]);
		if(matches_14 == null) {
			matches_14 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[14], matches_14);
		}
		matches_14.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister JavaFirstCompilationUnitToUmlModel__FWD
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[0];
		oMatch_Nodes_0[1] = objs[1];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister JavaFirstCompilationUnitToUmlModel__BWD
		OverlapMatch oMatch_1 = new OverlapMatch(12);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[1];
		oMatch_Nodes_1[1] = objs[2];
		oMatch_Nodes_1[2] = objs[3];
		oMatch_Nodes_1[3] = objs[4];
		oMatch_Nodes_1[4] = objs[5];
		oMatch_Nodes_1[5] = objs[6];
		oMatch_Nodes_1[6] = objs[7];
		oMatch_Nodes_1[7] = objs[8];
		oMatch_Nodes_1[8] = objs[9];
		oMatch_Nodes_1[9] = objs[10];
		oMatch_Nodes_1[10] = objs[11];
		oMatch_Nodes_1[11] = objs[12];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
		}
		
		// deregister booleanType
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister byteType
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister charType
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister doubleType
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister floatType
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister intType
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
		}
		
		// deregister longType
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 != null) {
			matches_8.remove(match);
		}
		
		// deregister shortType
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 != null) {
			matches_9.remove(match);
		}
		
		// deregister stringType
		Collection<HMatch> matches_10 = obj2matches.get(objs[10]);
		if(matches_10 != null) {
			matches_10.remove(match);
		}
		
		// deregister umlModel
		Collection<HMatch> matches_11 = obj2matches.get(objs[11]);
		if(matches_11 != null) {
			matches_11.remove(match);
		}
		
		// deregister voidType
		Collection<HMatch> matches_12 = obj2matches.get(objs[12]);
		if(matches_12 != null) {
			matches_12.remove(match);
		}
		
		// deregister javaCompUnitToUmlModel
		Collection<HMatch> matches_13 = obj2matches.get(objs[13]);
		if(matches_13 != null) {
			matches_13.remove(match);
		}
		
		// deregister JavaFirstCompilationUnitToUmlModel_eMoflon_ProtocolNode
		Collection<HMatch> matches_14 = obj2matches.get(objs[14]);
		if(matches_14 != null) {
			matches_14.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof uml.Model) {
			HMatch match_11 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_11.getNodes()[11] = obj;
			Collection<HMatch> formerMatches_11 = obj2matches.get(obj);
			if(formerMatches_11 != null) {
				
				formerMatches_11 = formerMatches_11.stream().filter(m -> !constraint_checker.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_11);
			}
			start(edge_explorer_4_1_orchestration, match_11);
		}
		if(obj instanceof uml.PrimitiveType) {
			HMatch match_2 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_13_1_orchestration, match_2);
			HMatch match_3 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_3_1_orchestration, match_3);
			HMatch match_4 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_4.getNodes()[4] = obj;
			Collection<HMatch> formerMatches_4 = obj2matches.get(obj);
			if(formerMatches_4 != null) {
				
				formerMatches_4 = formerMatches_4.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_4);
			}
			start(edge_explorer_14_1_orchestration, match_4);
			HMatch match_5 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_5.getNodes()[5] = obj;
			Collection<HMatch> formerMatches_5 = obj2matches.get(obj);
			if(formerMatches_5 != null) {
				
				formerMatches_5 = formerMatches_5.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_5);
			}
			start(edge_explorer_9_1_orchestration, match_5);
			HMatch match_6 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_6.getNodes()[6] = obj;
			Collection<HMatch> formerMatches_6 = obj2matches.get(obj);
			if(formerMatches_6 != null) {
				
				formerMatches_6 = formerMatches_6.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_6);
			}
			start(edge_explorer_15_1_orchestration, match_6);
			HMatch match_7 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_7.getNodes()[7] = obj;
			Collection<HMatch> formerMatches_7 = obj2matches.get(obj);
			if(formerMatches_7 != null) {
				
				formerMatches_7 = formerMatches_7.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_7);
			}
			start(edge_explorer_7_1_orchestration, match_7);
			HMatch match_8 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_8.getNodes()[8] = obj;
			Collection<HMatch> formerMatches_8 = obj2matches.get(obj);
			if(formerMatches_8 != null) {
				
				formerMatches_8 = formerMatches_8.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_8);
			}
			start(edge_explorer_5_1_orchestration, match_8);
			HMatch match_9 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_9.getNodes()[9] = obj;
			Collection<HMatch> formerMatches_9 = obj2matches.get(obj);
			if(formerMatches_9 != null) {
				
				formerMatches_9 = formerMatches_9.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_9);
			}
			start(edge_explorer_10_1_orchestration, match_9);
			HMatch match_10 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_10.getNodes()[10] = obj;
			Collection<HMatch> formerMatches_10 = obj2matches.get(obj);
			if(formerMatches_10 != null) {
				
				formerMatches_10 = formerMatches_10.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_10);
			}
			start(edge_explorer_2_orchestration, match_10);
			HMatch match_12 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_884_localSearch", 15);
			match_12.getNodes()[12] = obj;
			Collection<HMatch> formerMatches_12 = obj2matches.get(obj);
			if(formerMatches_12 != null) {
				
				formerMatches_12 = formerMatches_12.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_12);
			}
			start(edge_explorer_16_1_orchestration, match_12);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean node_constraint_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_0_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_1_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_2_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_3_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_4_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_5_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_6_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_7_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_8_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_9_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_10_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_11_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_12_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_13_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_14_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_15_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_16_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_17_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_18_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_19_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_20_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_21_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_22_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_23_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_24_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_25_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_26_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_27_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_28_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_29_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_30_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_31_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_32_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_33_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_34_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_35_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_36_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_37_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_38_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[8].equals(objs[9]);;
		return predicate;
	}
	
	public boolean node_constraint_39_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[8].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_40_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[8].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_41_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[9].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_42_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[9].equals(objs[12]);;
		return predicate;
	}
	
	public boolean node_constraint_43_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[10].equals(objs[12]);;
		return predicate;
	}
	
	public boolean constraint_checker_method(HMatch match) {
		uml.Model umlModel = (uml.Model) match.getNodes()[11];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_131 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_131.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_131.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_131.solve();
		
		boolean predicate = csp_131.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		uml.PrimitiveType booleanType = (uml.PrimitiveType) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_132 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_132.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_132.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, booleanType.getName(), "java.lang.String"));
		csp_132.solve();
		
		boolean predicate = csp_132.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_1_method(HMatch match) {
		uml.PrimitiveType byteType = (uml.PrimitiveType) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_133 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_133.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_133.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, byteType.getName(), "java.lang.String"));
		csp_133.solve();
		
		boolean predicate = csp_133.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_2_method(HMatch match) {
		uml.PrimitiveType charType = (uml.PrimitiveType) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_134 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_134.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_134.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, charType.getName(), "java.lang.String"));
		csp_134.solve();
		
		boolean predicate = csp_134.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_3_method(HMatch match) {
		uml.PrimitiveType floatType = (uml.PrimitiveType) match.getNodes()[6];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_135 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_135.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_135.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, floatType.getName(), "java.lang.String"));
		csp_135.solve();
		
		boolean predicate = csp_135.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_4_method(HMatch match) {
		uml.PrimitiveType doubleType = (uml.PrimitiveType) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_136 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_136.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_136.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, doubleType.getName(), "java.lang.String"));
		csp_136.solve();
		
		boolean predicate = csp_136.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_5_method(HMatch match) {
		uml.PrimitiveType intType = (uml.PrimitiveType) match.getNodes()[7];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_137 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_137.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_137.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, intType.getName(), "java.lang.String"));
		csp_137.solve();
		
		boolean predicate = csp_137.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_6_method(HMatch match) {
		uml.PrimitiveType longType = (uml.PrimitiveType) match.getNodes()[8];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_138 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_138.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_138.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, longType.getName(), "java.lang.String"));
		csp_138.solve();
		
		boolean predicate = csp_138.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_7_method(HMatch match) {
		uml.PrimitiveType shortType = (uml.PrimitiveType) match.getNodes()[9];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_139 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_139.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_139.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, shortType.getName(), "java.lang.String"));
		csp_139.solve();
		
		boolean predicate = csp_139.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_8_method(HMatch match) {
		uml.PrimitiveType stringType = (uml.PrimitiveType) match.getNodes()[10];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_140 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_140.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_140.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, stringType.getName(), "java.lang.String"));
		csp_140.solve();
		
		boolean predicate = csp_140.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_9_method(HMatch match) {
		uml.PrimitiveType voidType = (uml.PrimitiveType) match.getNodes()[12];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_141 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_141.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_141.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, voidType.getName(), "java.lang.String"));
		csp_141.solve();
		
		boolean predicate = csp_141.isSatisfied();
		return predicate;
	}
	
	
}

