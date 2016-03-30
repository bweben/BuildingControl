package com.java.model;

import com.java.interfaces.Observer;
import com.java.view.BuildingsPanel;
import com.java.view.DetailsPanel;

/**
 * Created by natha on 29.03.2016.
 */
public class DetailsPanelObserver extends Observer {
    private Building building;

    public DetailsPanelObserver(DetailsPanel detailsPanel,Building building) {
        this.building = building;
        detailsPanel.attach(this);
        this.subject = detailsPanel;
    }

    @Override
    public void update() {
        DetailsPanel panel = (DetailsPanel) this.subject;
        panel.changeBuilding(building);
    }

    public void update(Building building) {
        this.building = building;
        update();
    }
}
