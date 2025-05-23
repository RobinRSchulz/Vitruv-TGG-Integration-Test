package HospitalTransformRules.api.rules;

import HospitalExample.Department;
import HospitalExample.Room;
import HospitalTransformRules.api.HospitalTransformRulesAPI;
import HospitalTransformRules.api.matches.FindRoomInDepartmentMatch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationPattern;
import org.emoflon.ibex.gt.engine.GraphTransformationInterpreter;

/**
 * The pattern [org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@34e6649c (name: department), org.emoflon.ibex.patternmodel.IBeXPatternModel.impl.IBeXNodeImpl@41082a0 (name: otherroom)] which does the following:
 * If this pattern is not self-explaining, you really should add some comment in the specification.
 */
@SuppressWarnings("unused")
public class FindRoomInDepartmentPattern extends GraphTransformationPattern<FindRoomInDepartmentMatch, FindRoomInDepartmentPattern> {
	private static String patternName = "findRoomInDepartment";

	/**
	 * Creates a new pattern findRoomInDepartment().
	 * 
	 * @param api
	 *            the API the pattern belongs to
	 * @param interpreter
	 *            the interpreter
	 */
	
	public FindRoomInDepartmentPattern(final HospitalTransformRulesAPI api, final GraphTransformationInterpreter interpreter) {
		super(api, interpreter, patternName);
	}

	@Override
	public FindRoomInDepartmentMatch convertMatch(final IMatch match) {
		return new FindRoomInDepartmentMatch(this, match);
	}

	@Override
	protected List<String> getParameterNames() {
		List<String> names = new ArrayList<String>();
		names.add("department");
		names.add("otherroom");
		return names;
	}

	/**
	 * Binds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindRoomInDepartmentPattern bindDepartment(final Department object) {
		parameters.put("department", Objects.requireNonNull(object, "department must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node department to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindRoomInDepartmentPattern unbindDepartment() {
		parameters.remove("department");
		return this;
	}

	/**
	 * Binds the node otherroom to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindRoomInDepartmentPattern bindOtherroom(final Room object) {
		parameters.put("otherroom", Objects.requireNonNull(object, "otherroom must not be null!"));
		return this;
	}
	
	/**
	 * Unbinds the node otherroom to the given object.
	 *
	 * @param object
	 *            the object to set
	 */
	public FindRoomInDepartmentPattern unbindOtherroom() {
		parameters.remove("otherroom");
		return this;
	}
	
	@Override
	public String toString() {
		String s = "pattern " + patternName + " {" + java.lang.System.lineSeparator();
		s += "	department --> " + parameters.get("department") + java.lang.System.lineSeparator();
		s += "	otherroom --> " + parameters.get("otherroom") + java.lang.System.lineSeparator();
		s += "}";
		return s;
	}
}
