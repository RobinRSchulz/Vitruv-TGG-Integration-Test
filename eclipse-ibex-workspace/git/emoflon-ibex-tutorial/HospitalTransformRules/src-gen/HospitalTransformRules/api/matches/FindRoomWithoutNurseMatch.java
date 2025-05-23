package HospitalTransformRules.api.matches;

import HospitalExample.Room;
import HospitalTransformRules.api.rules.FindRoomWithoutNursePattern;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;

/**
 * A match for the pattern <code>findRoomWithoutNurse()</code>.
 */
public class FindRoomWithoutNurseMatch extends GraphTransformationMatch<FindRoomWithoutNurseMatch, FindRoomWithoutNursePattern> {
	private Room varRoom;

	/**
	 * Creates a new match for the pattern <code>findRoomWithoutNurse()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public FindRoomWithoutNurseMatch(final FindRoomWithoutNursePattern pattern, final IMatch match) {
		super(pattern, match);
		varRoom = (Room) match.get("room");
	}

	/**
	 * Returns the room.
	 *
	 * @return the room
	 */
	public Room getRoom() {
		return varRoom;
	}

	@Override
	public String toString() {
		String s = "match {" + java.lang.System.lineSeparator();
		s += "	room --> " + varRoom + java.lang.System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}
