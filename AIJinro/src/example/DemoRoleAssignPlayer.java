package example;

import org.aiwolf.sample.lib.AbstractRoleAssignPlayer;
import org.aiwolf.sample.player.*;

public class DemoRoleAssignPlayer extends AbstractRoleAssignPlayer {

	public DemoRoleAssignPlayer() {
		setVillagerPlayer(new DemoVillager());
		setBodyguardPlayer(new DemoBodyguard());
		setMediumPlayer(new DemoMedium());
		setSeerPlayer(new DemoSeer());
		setPossessedPlayer(new DemoPossessed());
		setWerewolfPlayer(new DemoWerewolf());
	}

	public String getName() {
		return "DemoRoleAssignPlayer";
	}

}
