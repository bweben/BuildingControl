package com.java.model;

import com.java.view.BuildingsPanel;
import com.java.view.DetailsPanel;

/**
 * Created by natha on 29.03.2016.
 */
public interface DetailsPanelObserver {
    public DetailsPanelObserver(DetailsPanel detailsPanel) {
        detailsPanel.attach(this);
        this.subject = detailsPanel;
        Game.getGameInstance().attach(this);
    }

    @Override
    public void update() {
        DetailsPanel panel = (DetailsPanel) this.subject;
        panel.changeHouse();
    }
}
