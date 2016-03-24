package com.java.model;

import com.java.interfaces.Observer;
import com.java.view.BuildingsPanel;

/**
 * Created by Nathanael on 24.03.2016.
 */
public class BuildingsPanelObserver extends Observer {
    public BuildingsPanelObserver(BuildingsPanel buildingsPanel) {
        buildingsPanel.attach(this);
        this.subject = buildingsPanel;
        Game.getGameInstance().attach(this);
    }

    @Override
    public void update() {
        BuildingsPanel panel = (BuildingsPanel) this.subject;
        panel.refresh();
    }
}
