package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Eugene L";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "eugeneLim628";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-03");
        team.addMember("Chloe");
        team.addMember("Christopher C");
        team.addMember("Eugene L");
        team.addMember("Bharat");
        team.addMember("Priyanka");
        team.addMember("Sameer");
        return team;
    }
}
