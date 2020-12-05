package com.company;

import java.io.IOException;

public interface LeagueManager {
    void createClub() throws IOException;
    void deleteClub();
    void displayStatics();
    void displayTable();
    void save();
    void load();
    void quit();
}
