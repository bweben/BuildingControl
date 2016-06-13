package com.java.testing;

/**
 * Created by natha on 13.06.2016.
 */
public class FigurFileStubDAO implements FigurDAO {
    private String[] figuren = {
            "Rechteck;12;3;5;7",
            "Kreis;10;9;8",
            "Linie;20;25;20;35"
    };
    private int currentIndex = 0;

    @Override
    public String[] readNextFigurData() {
        if (currentIndex < figuren.length) {
            return figuren[currentIndex++].split(";");
        }
        return null;
    }
}
