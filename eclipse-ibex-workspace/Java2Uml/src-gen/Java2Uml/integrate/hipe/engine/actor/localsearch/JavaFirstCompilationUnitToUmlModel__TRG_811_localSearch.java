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

public class JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch extends GenericLocalSearchActor{
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
	ConstraintChecker node_constraint_44;
	ConstraintChecker node_constraint_45;
	ConstraintChecker node_constraint_46;
	ConstraintChecker node_constraint_47;
	ConstraintChecker node_constraint_48;
	ConstraintChecker node_constraint_49;
	ConstraintChecker node_constraint_50;
	ConstraintChecker node_constraint_51;
	ConstraintChecker node_constraint_52;
	ConstraintChecker node_constraint_53;
	ConstraintChecker node_constraint_54;
	ConstraintChecker node_constraint_55;
	ConstraintChecker node_constraint_56;
	ConstraintChecker node_constraint_57;
	ConstraintChecker node_constraint_58;
	ConstraintChecker node_constraint_59;
	ConstraintChecker node_constraint_60;
	ConstraintChecker node_constraint_61;
	ConstraintChecker node_constraint_62;
	ConstraintChecker node_constraint_63;
	ConstraintChecker node_constraint_64;
	ConstraintChecker node_constraint_65;
	ConstraintChecker node_constraint_66;
	ConstraintChecker node_constraint_67;
	ConstraintChecker node_constraint_68;
	ConstraintChecker node_constraint_69;
	ConstraintChecker node_constraint_70;
	ConstraintChecker node_constraint_71;
	ConstraintChecker node_constraint_72;
	ConstraintChecker node_constraint_73;
	ConstraintChecker node_constraint_74;
	ConstraintChecker node_constraint_75;
	ConstraintChecker node_constraint_76;
	ConstraintChecker node_constraint_77;
	ConstraintChecker node_constraint_78;
	ConstraintChecker node_constraint_79;
	ConstraintChecker node_constraint_80;
	ConstraintChecker node_constraint_81;
	ConstraintChecker node_constraint_82;
	ConstraintChecker node_constraint_83;
	ConstraintChecker node_constraint_84;
	ConstraintChecker node_constraint_85;
	ConstraintChecker node_constraint_86;
	ConstraintChecker node_constraint_87;
	ConstraintChecker node_constraint_88;
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
	ConstraintChecker constraint_checker_10;
	ConstraintChecker constraint_checker_11;
	ConstraintChecker constraint_checker_12;
	ConstraintChecker constraint_checker_13;
	ConstraintChecker constraint_checker_14;
	ConstraintChecker constraint_checker_15;
	ConstraintChecker constraint_checker_16;
	ConstraintChecker constraint_checker_17;
	ConstraintChecker constraint_checker_18;
	ConstraintChecker constraint_checker_19;
	ConstraintChecker constraint_checker_20;
	EdgeExplorer edge_explorer;
	EdgeExplorer edge_explorer_3;
	EdgeExplorer edge_explorer_4;
	EdgeExplorer edge_explorer_5;
	EdgeExplorer edge_explorer_6;
	EdgeExplorer edge_explorer_7;
	EdgeExplorer edge_explorer_8;
	EdgeExplorer edge_explorer_9;
	EdgeExplorer edge_explorer_10;
	EdgeExplorer edge_explorer_11;
	
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
		node_constraint_44 = new ConstraintChecker(this, this::node_constraint_44_method);
		name2explorer.put("node_constraint_44", node_constraint_44);
		node_constraint_45 = new ConstraintChecker(this, this::node_constraint_45_method);
		name2explorer.put("node_constraint_45", node_constraint_45);
		node_constraint_46 = new ConstraintChecker(this, this::node_constraint_46_method);
		name2explorer.put("node_constraint_46", node_constraint_46);
		node_constraint_47 = new ConstraintChecker(this, this::node_constraint_47_method);
		name2explorer.put("node_constraint_47", node_constraint_47);
		node_constraint_48 = new ConstraintChecker(this, this::node_constraint_48_method);
		name2explorer.put("node_constraint_48", node_constraint_48);
		node_constraint_49 = new ConstraintChecker(this, this::node_constraint_49_method);
		name2explorer.put("node_constraint_49", node_constraint_49);
		node_constraint_50 = new ConstraintChecker(this, this::node_constraint_50_method);
		name2explorer.put("node_constraint_50", node_constraint_50);
		node_constraint_51 = new ConstraintChecker(this, this::node_constraint_51_method);
		name2explorer.put("node_constraint_51", node_constraint_51);
		node_constraint_52 = new ConstraintChecker(this, this::node_constraint_52_method);
		name2explorer.put("node_constraint_52", node_constraint_52);
		node_constraint_53 = new ConstraintChecker(this, this::node_constraint_53_method);
		name2explorer.put("node_constraint_53", node_constraint_53);
		node_constraint_54 = new ConstraintChecker(this, this::node_constraint_54_method);
		name2explorer.put("node_constraint_54", node_constraint_54);
		node_constraint_55 = new ConstraintChecker(this, this::node_constraint_55_method);
		name2explorer.put("node_constraint_55", node_constraint_55);
		node_constraint_56 = new ConstraintChecker(this, this::node_constraint_56_method);
		name2explorer.put("node_constraint_56", node_constraint_56);
		node_constraint_57 = new ConstraintChecker(this, this::node_constraint_57_method);
		name2explorer.put("node_constraint_57", node_constraint_57);
		node_constraint_58 = new ConstraintChecker(this, this::node_constraint_58_method);
		name2explorer.put("node_constraint_58", node_constraint_58);
		node_constraint_59 = new ConstraintChecker(this, this::node_constraint_59_method);
		name2explorer.put("node_constraint_59", node_constraint_59);
		node_constraint_60 = new ConstraintChecker(this, this::node_constraint_60_method);
		name2explorer.put("node_constraint_60", node_constraint_60);
		node_constraint_61 = new ConstraintChecker(this, this::node_constraint_61_method);
		name2explorer.put("node_constraint_61", node_constraint_61);
		node_constraint_62 = new ConstraintChecker(this, this::node_constraint_62_method);
		name2explorer.put("node_constraint_62", node_constraint_62);
		node_constraint_63 = new ConstraintChecker(this, this::node_constraint_63_method);
		name2explorer.put("node_constraint_63", node_constraint_63);
		node_constraint_64 = new ConstraintChecker(this, this::node_constraint_64_method);
		name2explorer.put("node_constraint_64", node_constraint_64);
		node_constraint_65 = new ConstraintChecker(this, this::node_constraint_65_method);
		name2explorer.put("node_constraint_65", node_constraint_65);
		node_constraint_66 = new ConstraintChecker(this, this::node_constraint_66_method);
		name2explorer.put("node_constraint_66", node_constraint_66);
		node_constraint_67 = new ConstraintChecker(this, this::node_constraint_67_method);
		name2explorer.put("node_constraint_67", node_constraint_67);
		node_constraint_68 = new ConstraintChecker(this, this::node_constraint_68_method);
		name2explorer.put("node_constraint_68", node_constraint_68);
		node_constraint_69 = new ConstraintChecker(this, this::node_constraint_69_method);
		name2explorer.put("node_constraint_69", node_constraint_69);
		node_constraint_70 = new ConstraintChecker(this, this::node_constraint_70_method);
		name2explorer.put("node_constraint_70", node_constraint_70);
		node_constraint_71 = new ConstraintChecker(this, this::node_constraint_71_method);
		name2explorer.put("node_constraint_71", node_constraint_71);
		node_constraint_72 = new ConstraintChecker(this, this::node_constraint_72_method);
		name2explorer.put("node_constraint_72", node_constraint_72);
		node_constraint_73 = new ConstraintChecker(this, this::node_constraint_73_method);
		name2explorer.put("node_constraint_73", node_constraint_73);
		node_constraint_74 = new ConstraintChecker(this, this::node_constraint_74_method);
		name2explorer.put("node_constraint_74", node_constraint_74);
		node_constraint_75 = new ConstraintChecker(this, this::node_constraint_75_method);
		name2explorer.put("node_constraint_75", node_constraint_75);
		node_constraint_76 = new ConstraintChecker(this, this::node_constraint_76_method);
		name2explorer.put("node_constraint_76", node_constraint_76);
		node_constraint_77 = new ConstraintChecker(this, this::node_constraint_77_method);
		name2explorer.put("node_constraint_77", node_constraint_77);
		node_constraint_78 = new ConstraintChecker(this, this::node_constraint_78_method);
		name2explorer.put("node_constraint_78", node_constraint_78);
		node_constraint_79 = new ConstraintChecker(this, this::node_constraint_79_method);
		name2explorer.put("node_constraint_79", node_constraint_79);
		node_constraint_80 = new ConstraintChecker(this, this::node_constraint_80_method);
		name2explorer.put("node_constraint_80", node_constraint_80);
		node_constraint_81 = new ConstraintChecker(this, this::node_constraint_81_method);
		name2explorer.put("node_constraint_81", node_constraint_81);
		node_constraint_82 = new ConstraintChecker(this, this::node_constraint_82_method);
		name2explorer.put("node_constraint_82", node_constraint_82);
		node_constraint_83 = new ConstraintChecker(this, this::node_constraint_83_method);
		name2explorer.put("node_constraint_83", node_constraint_83);
		node_constraint_84 = new ConstraintChecker(this, this::node_constraint_84_method);
		name2explorer.put("node_constraint_84", node_constraint_84);
		node_constraint_85 = new ConstraintChecker(this, this::node_constraint_85_method);
		name2explorer.put("node_constraint_85", node_constraint_85);
		node_constraint_86 = new ConstraintChecker(this, this::node_constraint_86_method);
		name2explorer.put("node_constraint_86", node_constraint_86);
		node_constraint_87 = new ConstraintChecker(this, this::node_constraint_87_method);
		name2explorer.put("node_constraint_87", node_constraint_87);
		node_constraint_88 = new ConstraintChecker(this, this::node_constraint_88_method);
		name2explorer.put("node_constraint_88", node_constraint_88);
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
		constraint_checker_10 = new ConstraintChecker(this, this::constraint_checker_10_method);
		name2explorer.put("constraint_checker_10", constraint_checker_10);
		constraint_checker_11 = new ConstraintChecker(this, this::constraint_checker_11_method);
		name2explorer.put("constraint_checker_11", constraint_checker_11);
		constraint_checker_12 = new ConstraintChecker(this, this::constraint_checker_12_method);
		name2explorer.put("constraint_checker_12", constraint_checker_12);
		constraint_checker_13 = new ConstraintChecker(this, this::constraint_checker_13_method);
		name2explorer.put("constraint_checker_13", constraint_checker_13);
		constraint_checker_14 = new ConstraintChecker(this, this::constraint_checker_14_method);
		name2explorer.put("constraint_checker_14", constraint_checker_14);
		constraint_checker_15 = new ConstraintChecker(this, this::constraint_checker_15_method);
		name2explorer.put("constraint_checker_15", constraint_checker_15);
		constraint_checker_16 = new ConstraintChecker(this, this::constraint_checker_16_method);
		name2explorer.put("constraint_checker_16", constraint_checker_16);
		constraint_checker_17 = new ConstraintChecker(this, this::constraint_checker_17_method);
		name2explorer.put("constraint_checker_17", constraint_checker_17);
		constraint_checker_18 = new ConstraintChecker(this, this::constraint_checker_18_method);
		name2explorer.put("constraint_checker_18", constraint_checker_18);
		constraint_checker_19 = new ConstraintChecker(this, this::constraint_checker_19_method);
		name2explorer.put("constraint_checker_19", constraint_checker_19);
		constraint_checker_20 = new ConstraintChecker(this, this::constraint_checker_20_method);
		name2explorer.put("constraint_checker_20", constraint_checker_20);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer = new EdgeExplorer(this, 0, 9, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_3_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_3 = new EdgeExplorer(this, 7, 9, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_4_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_4 = new EdgeExplorer(this, 4, 9, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_5_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_5 = new EdgeExplorer(this, 5, 9, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_6_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_6 = new EdgeExplorer(this, 6, 9, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_7_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_7 = new EdgeExplorer(this, 2, 9, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_8_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_8 = new EdgeExplorer(this, 3, 9, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_9_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_9 = new EdgeExplorer(this, 8, 9, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_10_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_10 = new EdgeExplorer(this, 1, 9, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.unique_lookup = (o) -> {EObject result = ((uml.Type) o).getPackage(); return (result instanceof uml.Model ? result : null);};
						edge_explorer_11_methods.multi_opposite_lookup = (o) -> ((uml.Package) o).getOwnedType().stream().filter(obj -> obj instanceof uml.PrimitiveType).collect(Collectors.toList());
						edge_explorer_11 = new EdgeExplorer(this, 10, 9, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
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
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(node.getPorts().getPort().get(0), getSelf(), name2actor.get("JavaFirstCompilationUnitToUmlModel__BWD_823_junction"), this::returnTrue , 0  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("JavaFirstCompilationUnitToUmlModel__TRG_production"), this::returnTrue , 1  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "PrimitiveType_object_SP0": 
				{
					
					// booleanType
					HMatch match_0 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_1_orchestration, match_0);
					
					// byteType
					HMatch match_1 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_10_1_orchestration, match_1);
					
					// charType
					HMatch match_2 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_7_1_orchestration, match_2);
					
					// doubleType
					HMatch match_3 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_8_1_orchestration, match_3);
					
					// floatType
					HMatch match_4 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_4_1_orchestration, match_4);
					
					// intType
					HMatch match_5 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_5_1_orchestration, match_5);
					
					// longType
					HMatch match_6 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_6_1_orchestration, match_6);
					
					// shortType
					HMatch match_7 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_7.getNodes()[7] = objs[0];
					start(edge_explorer_3_1_orchestration, match_7);
					
					// stringType
					HMatch match_8 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_8.getNodes()[8] = objs[0];
					start(edge_explorer_9_1_orchestration, match_8);
					
					// voidType
					HMatch match_10 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					match_10.getNodes()[10] = objs[0];
					start(edge_explorer_11_1_orchestration, match_10);
				}
				break;
			case "Model_object_SP2": 
				{
					if(!lazy_initialization) {
						
						// umlModel
						HMatch match_9 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
						match_9.getNodes()[9] = objs[0];
						start(edge_explorer_2_orchestration, match_9);
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
			case "PrimitiveType_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				removeMatchesUsedBy(match.getNodes()[0], 1);
				removeMatchesUsedBy(match.getNodes()[0], 2);
				removeMatchesUsedBy(match.getNodes()[0], 3);
				removeMatchesUsedBy(match.getNodes()[0], 4);
				removeMatchesUsedBy(match.getNodes()[0], 5);
				removeMatchesUsedBy(match.getNodes()[0], 6);
				removeMatchesUsedBy(match.getNodes()[0], 7);
				removeMatchesUsedBy(match.getNodes()[0], 8);
				removeMatchesUsedBy(match.getNodes()[0], 10);
				break;
			case "Model_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 9);
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "uml.Type_package_Package": 
			if(!lazy_initialization) {
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[0] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[7] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_3_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[4] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_4_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[5] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_5_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[6] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_6_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[2] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_7_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[3] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_8_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[8] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_9_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[1] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_10_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[10] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
				}
				}
				
				if(msg.source instanceof uml.PrimitiveType) {
				if(msg.target instanceof uml.Model) {
				{
					HMatch match = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
					Object[] objs = match.getNodes();
					objs[10] = msg.source;
					objs[9] = msg.target;
					currentDepth++;
					start(edge_explorer_11_0_orchestration, match);
					currentDepth--;
				}
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
		case "uml.Type_package_Package": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
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
				Collection<HMatch> matches_19 = obj2matches.get(msg.source);
				if(matches_19 != null && !matches_19.isEmpty()) {
					Collection<HMatch> toBeRemoved_19 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_19) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_19.add(m);
					}
					if(!toBeRemoved_19.isEmpty()) {
						sendDeletedMatches(toBeRemoved_19);
					}
				}
				Collection<HMatch> matches_20 = obj2matches.get(msg.source);
				if(matches_20 != null && !matches_20.isEmpty()) {
					Collection<HMatch> toBeRemoved_20 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_20) {
						if(m.getNodes()[9].equals(msg.target))
							toBeRemoved_20.add(m);
					}
					if(!toBeRemoved_20.isEmpty()) {
						sendDeletedMatches(toBeRemoved_20);
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
		
		// register booleanType
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register byteType
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register charType
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register doubleType
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register floatType
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register intType
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register longType
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register shortType
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
		// register stringType
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 == null) {
			matches_8 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[8], matches_8);
		}
		matches_8.add(match);
		
		// register umlModel
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 == null) {
			matches_9 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[9], matches_9);
		}
		matches_9.add(match);
		
		// register voidType
		Collection<HMatch> matches_10 = obj2matches.get(objs[10]);
		if(matches_10 == null) {
			matches_10 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[10], matches_10);
		}
		matches_10.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister booleanType
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister byteType
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister charType
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister doubleType
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister floatType
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister intType
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister longType
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister shortType
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
		}
		
		// deregister stringType
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 != null) {
			matches_8.remove(match);
		}
		
		// deregister umlModel
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 != null) {
			matches_9.remove(match);
		}
		
		// deregister voidType
		Collection<HMatch> matches_10 = obj2matches.get(objs[10]);
		if(matches_10 != null) {
			matches_10.remove(match);
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
		if(obj instanceof uml.PrimitiveType) {
			HMatch match_0 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_1_orchestration, match_0);
			HMatch match_1 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_1.getNodes()[1] = obj;
			Collection<HMatch> formerMatches_1 = obj2matches.get(obj);
			if(formerMatches_1 != null) {
				
				formerMatches_1 = formerMatches_1.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_1);
			}
			start(edge_explorer_10_1_orchestration, match_1);
			HMatch match_2 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_7_1_orchestration, match_2);
			HMatch match_3 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_8_1_orchestration, match_3);
			HMatch match_4 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_4.getNodes()[4] = obj;
			Collection<HMatch> formerMatches_4 = obj2matches.get(obj);
			if(formerMatches_4 != null) {
				
				formerMatches_4 = formerMatches_4.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_4);
			}
			start(edge_explorer_4_1_orchestration, match_4);
			HMatch match_5 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_5.getNodes()[5] = obj;
			Collection<HMatch> formerMatches_5 = obj2matches.get(obj);
			if(formerMatches_5 != null) {
				
				formerMatches_5 = formerMatches_5.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_5);
			}
			start(edge_explorer_5_1_orchestration, match_5);
			HMatch match_6 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_6.getNodes()[6] = obj;
			Collection<HMatch> formerMatches_6 = obj2matches.get(obj);
			if(formerMatches_6 != null) {
				
				formerMatches_6 = formerMatches_6.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_6);
			}
			start(edge_explorer_6_1_orchestration, match_6);
			HMatch match_7 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_7.getNodes()[7] = obj;
			Collection<HMatch> formerMatches_7 = obj2matches.get(obj);
			if(formerMatches_7 != null) {
				
				formerMatches_7 = formerMatches_7.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_7);
			}
			start(edge_explorer_3_1_orchestration, match_7);
			HMatch match_8 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_8.getNodes()[8] = obj;
			Collection<HMatch> formerMatches_8 = obj2matches.get(obj);
			if(formerMatches_8 != null) {
				
				formerMatches_8 = formerMatches_8.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_8);
			}
			start(edge_explorer_9_1_orchestration, match_8);
			HMatch match_10 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_10.getNodes()[10] = obj;
			Collection<HMatch> formerMatches_10 = obj2matches.get(obj);
			if(formerMatches_10 != null) {
				
				formerMatches_10 = formerMatches_10.stream().filter(m -> !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m) || !constraint_checker_3.check(m) || !constraint_checker_4.check(m) || !constraint_checker_5.check(m) || !constraint_checker_6.check(m) || !constraint_checker_7.check(m) || !constraint_checker_8.check(m) || !constraint_checker_9.check(m) || !constraint_checker_11.check(m) || !constraint_checker_12.check(m) || !constraint_checker_13.check(m) || !constraint_checker_14.check(m) || !constraint_checker_15.check(m) || !constraint_checker_16.check(m) || !constraint_checker_17.check(m) || !constraint_checker_18.check(m) || !constraint_checker_19.check(m) || !constraint_checker_20.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_10);
			}
			start(edge_explorer_11_1_orchestration, match_10);
		}
		if(obj instanceof uml.Model) {
			HMatch match_9 = new LocalSearchMatch("JavaFirstCompilationUnitToUmlModel__TRG_811_localSearch", 11);
			match_9.getNodes()[9] = obj;
			Collection<HMatch> formerMatches_9 = obj2matches.get(obj);
			if(formerMatches_9 != null) {
				
				formerMatches_9 = formerMatches_9.stream().filter(m -> !constraint_checker.check(m) || !constraint_checker_10.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_9);
			}
			start(edge_explorer_2_orchestration, match_9);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean node_constraint_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[1]);;
		return predicate;
	}
	
	public boolean node_constraint_0_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[2]);;
		return predicate;
	}
	
	public boolean node_constraint_1_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_2_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_3_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_4_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_5_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_6_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_7_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_8_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[2]);;
		return predicate;
	}
	
	public boolean node_constraint_9_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_10_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_11_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_12_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_13_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_14_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_15_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_16_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_17_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_18_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_19_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_20_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_21_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_22_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_23_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_24_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_25_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_26_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_27_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_28_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_29_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_30_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_31_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_32_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_33_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_34_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_35_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_36_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_37_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_38_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_39_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_40_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_41_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_42_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_43_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[8].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_44_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[1]);;
		return predicate;
	}
	
	public boolean node_constraint_45_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[2]);;
		return predicate;
	}
	
	public boolean node_constraint_46_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_47_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_48_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_49_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_50_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_51_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_52_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[0].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_53_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[2]);;
		return predicate;
	}
	
	public boolean node_constraint_54_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_55_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_56_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_57_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_58_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_59_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_60_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[1].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_61_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[3]);;
		return predicate;
	}
	
	public boolean node_constraint_62_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_63_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_64_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_65_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_66_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_67_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[2].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_68_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[4]);;
		return predicate;
	}
	
	public boolean node_constraint_69_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_70_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_71_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_72_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_73_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[3].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_74_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[5]);;
		return predicate;
	}
	
	public boolean node_constraint_75_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_76_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_77_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_78_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[4].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_79_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[6]);;
		return predicate;
	}
	
	public boolean node_constraint_80_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_81_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_82_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[5].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_83_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[7]);;
		return predicate;
	}
	
	public boolean node_constraint_84_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_85_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[6].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_86_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[8]);;
		return predicate;
	}
	
	public boolean node_constraint_87_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[7].equals(objs[10]);;
		return predicate;
	}
	
	public boolean node_constraint_88_method(HMatch match) {
		
		Object[] objs = match.getNodes();
		
		boolean predicate = !objs[8].equals(objs[10]);;
		return predicate;
	}
	
	public boolean constraint_checker_method(HMatch match) {
		uml.Model umlModel = (uml.Model) match.getNodes()[9];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_107 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_107.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_107.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_107.solve();
		
		boolean predicate = csp_107.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		uml.PrimitiveType booleanType = (uml.PrimitiveType) match.getNodes()[0];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_108 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_108.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_108.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, booleanType.getName(), "java.lang.String"));
		csp_108.solve();
		
		boolean predicate = csp_108.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_1_method(HMatch match) {
		uml.PrimitiveType byteType = (uml.PrimitiveType) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_109 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_109.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_109.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, byteType.getName(), "java.lang.String"));
		csp_109.solve();
		
		boolean predicate = csp_109.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_2_method(HMatch match) {
		uml.PrimitiveType charType = (uml.PrimitiveType) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_110 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_110.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_110.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, charType.getName(), "java.lang.String"));
		csp_110.solve();
		
		boolean predicate = csp_110.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_3_method(HMatch match) {
		uml.PrimitiveType floatType = (uml.PrimitiveType) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_111 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_111.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_111.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, floatType.getName(), "java.lang.String"));
		csp_111.solve();
		
		boolean predicate = csp_111.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_4_method(HMatch match) {
		uml.PrimitiveType doubleType = (uml.PrimitiveType) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_112 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_112.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_112.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, doubleType.getName(), "java.lang.String"));
		csp_112.solve();
		
		boolean predicate = csp_112.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_5_method(HMatch match) {
		uml.PrimitiveType intType = (uml.PrimitiveType) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_113 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_113.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_113.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, intType.getName(), "java.lang.String"));
		csp_113.solve();
		
		boolean predicate = csp_113.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_6_method(HMatch match) {
		uml.PrimitiveType longType = (uml.PrimitiveType) match.getNodes()[6];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_114 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_114.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_114.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, longType.getName(), "java.lang.String"));
		csp_114.solve();
		
		boolean predicate = csp_114.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_7_method(HMatch match) {
		uml.PrimitiveType shortType = (uml.PrimitiveType) match.getNodes()[7];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_115 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_115.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_115.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, shortType.getName(), "java.lang.String"));
		csp_115.solve();
		
		boolean predicate = csp_115.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_8_method(HMatch match) {
		uml.PrimitiveType stringType = (uml.PrimitiveType) match.getNodes()[8];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_116 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_116.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_116.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, stringType.getName(), "java.lang.String"));
		csp_116.solve();
		
		boolean predicate = csp_116.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_9_method(HMatch match) {
		uml.PrimitiveType voidType = (uml.PrimitiveType) match.getNodes()[10];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_117 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_117.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_117.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, voidType.getName(), "java.lang.String"));
		csp_117.solve();
		
		boolean predicate = csp_117.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_10_method(HMatch match) {
		uml.Model umlModel = (uml.Model) match.getNodes()[9];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_96 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_96.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_96.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_96.solve();
		
		boolean predicate = csp_96.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_11_method(HMatch match) {
		uml.PrimitiveType booleanType = (uml.PrimitiveType) match.getNodes()[0];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_97 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_97.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_97.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, booleanType.getName(), "java.lang.String"));
		csp_97.solve();
		
		boolean predicate = csp_97.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_12_method(HMatch match) {
		uml.PrimitiveType byteType = (uml.PrimitiveType) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_98 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_98.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_98.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, byteType.getName(), "java.lang.String"));
		csp_98.solve();
		
		boolean predicate = csp_98.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_13_method(HMatch match) {
		uml.PrimitiveType charType = (uml.PrimitiveType) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_99 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_99.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_99.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, charType.getName(), "java.lang.String"));
		csp_99.solve();
		
		boolean predicate = csp_99.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_14_method(HMatch match) {
		uml.PrimitiveType floatType = (uml.PrimitiveType) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_100 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_100.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_100.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, floatType.getName(), "java.lang.String"));
		csp_100.solve();
		
		boolean predicate = csp_100.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_15_method(HMatch match) {
		uml.PrimitiveType doubleType = (uml.PrimitiveType) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_101 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_101.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_101.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, doubleType.getName(), "java.lang.String"));
		csp_101.solve();
		
		boolean predicate = csp_101.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_16_method(HMatch match) {
		uml.PrimitiveType intType = (uml.PrimitiveType) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_102 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_102.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_102.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, intType.getName(), "java.lang.String"));
		csp_102.solve();
		
		boolean predicate = csp_102.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_17_method(HMatch match) {
		uml.PrimitiveType longType = (uml.PrimitiveType) match.getNodes()[6];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_103 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_103.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_103.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, longType.getName(), "java.lang.String"));
		csp_103.solve();
		
		boolean predicate = csp_103.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_18_method(HMatch match) {
		uml.PrimitiveType shortType = (uml.PrimitiveType) match.getNodes()[7];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_104 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_104.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_104.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, shortType.getName(), "java.lang.String"));
		csp_104.solve();
		
		boolean predicate = csp_104.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_19_method(HMatch match) {
		uml.PrimitiveType stringType = (uml.PrimitiveType) match.getNodes()[8];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_105 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_105.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_105.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, stringType.getName(), "java.lang.String"));
		csp_105.solve();
		
		boolean predicate = csp_105.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_20_method(HMatch match) {
		uml.PrimitiveType voidType = (uml.PrimitiveType) match.getNodes()[10];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_106 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_106.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_106.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, voidType.getName(), "java.lang.String"));
		csp_106.solve();
		
		boolean predicate = csp_106.isSatisfied();
		return predicate;
	}
	
	
}

