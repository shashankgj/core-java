class TeamAlpha {
    static int teamScore = 10, teamRank = 20, teamMembers = 30, matchesPlayed = 40, trophiesWon = 50;

    static void displayTeamStats() {
        System.out.println("Alpha Team Stats → Score: " + teamScore + ", Rank: " + teamRank +
                           ", Members: " + teamMembers + ", Matches: " + matchesPlayed + ", Trophies: " + trophiesWon);
    }

    void displayPersonalStats() {
        int personalScore = 1, personalRank = 2, gamesPlayed = 3, assists = 4, goals = 5;
        System.out.println("Alpha Member Stats → Score: " + personalScore + ", Rank: " + personalRank +
                           ", Games: " + gamesPlayed + ", Assists: " + assists + ", Goals: " + goals);
    }
}

// Class 2: Handles data for Team Beta
class TeamBeta {
    static int teamScore = 11, teamRank = 21, teamMembers = 31, matchesPlayed = 41, trophiesWon = 51;

    static void displayTeamStats() {
        System.out.println("Beta Team Stats → Score: " + teamScore + ", Rank: " + teamRank +
                           ", Members: " + teamMembers + ", Matches: " + matchesPlayed + ", Trophies: " + trophiesWon);
    }

    void displayPersonalStats() {
        int personalScore = 6, personalRank = 7, gamesPlayed = 8, assists = 9, goals = 10;
        System.out.println("Beta Member Stats → Score: " + personalScore + ", Rank: " + personalRank +
                           ", Games: " + gamesPlayed + ", Assists: " + assists + ", Goals: " + goals);
    }
}

// Class 3: Handles data for Team Gamma
class TeamGamma {
    static int teamScore = 12, teamRank = 22, teamMembers = 32, matchesPlayed = 42, trophiesWon = 52;

    static void displayTeamStats() {
        System.out.println("Gamma Team Stats → Score: " + teamScore + ", Rank: " + teamRank +
                           ", Members: " + teamMembers + ", Matches: " + matchesPlayed + ", Trophies: " + trophiesWon);
    }

    void displayPersonalStats() {
        int personalScore = 11, personalRank = 12, gamesPlayed = 13, assists = 14, goals = 15;
        System.out.println("Gamma Member Stats → Score: " + personalScore + ", Rank: " + personalRank +
                           ", Games: " + gamesPlayed + ", Assists: " + assists + ", Goals: " + goals);
    }
}

// Class 4: Handles data for Team Delta
class TeamDelta {
    static int teamScore = 13, teamRank = 23, teamMembers = 33, matchesPlayed = 43, trophiesWon = 53;

    static void displayTeamStats() {
        System.out.println("Delta Team Stats → Score: " + teamScore + ", Rank: " + teamRank +
                           ", Members: " + teamMembers + ", Matches: " + matchesPlayed + ", Trophies: " + trophiesWon);
    }

    void displayPersonalStats() {
        int personalScore = 16, personalRank = 17, gamesPlayed = 18, assists = 19, goals = 20;
        System.out.println("Delta Member Stats → Score: " + personalScore + ", Rank: " + personalRank +
                           ", Games: " + gamesPlayed + ", Assists: " + assists + ", Goals: " + goals);
    }
}

// Class 5: Handles data for Team Epsilon
class TeamEpsilon {
    static int teamScore = 14, teamRank = 24, teamMembers = 34, matchesPlayed = 44, trophiesWon = 54;

    static void displayTeamStats() {
        System.out.println("Epsilon Team Stats → Score: " + teamScore + ", Rank: " + teamRank +
                           ", Members: " + teamMembers + ", Matches: " + matchesPlayed + ", Trophies: " + trophiesWon);
    }

    void displayPersonalStats() {
        int personalScore = 21, personalRank = 22, gamesPlayed = 23, assists = 24, goals = 25;
        System.out.println("Epsilon Member Stats → Score: " + personalScore + ", Rank: " + personalRank +
                           ", Games: " + gamesPlayed + ", Assists: " + assists + ", Goals: " + goals);
    }
}

// Main class to run the show
public class SportsLeague {
    public static void main(String[] args) {
        // Instantiating and displaying personal stats
        new TeamAlpha().displayPersonalStats();
        TeamAlpha.displayTeamStats();

        new TeamBeta().displayPersonalStats();
        TeamBeta.displayTeamStats();

        new TeamGamma().displayPersonalStats();
        TeamGamma.displayTeamStats();

        new TeamDelta().displayPersonalStats();
        TeamDelta.displayTeamStats();

        new TeamEpsilon().displayPersonalStats();
        TeamEpsilon.displayTeamStats();
    }
}
