package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team test1;
    Team test2;
    Team test3;  
    Team t; 

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
        test1 = new Team("test-team");
        test2 = new Team("test-team"); 
        test3 = new Team("team3");
        test2.addMember("Eugene Lim");
        t = new Team("test");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_correct_bool(){
        assertEquals(true, team.equals(team));
        assertEquals(false, team.equals(8));
        assertEquals(true, team.equals(test1));
        assertEquals(false, team.equals(test2));
        assertEquals(false, team.equals(test3));
    }

    @Test 
    public void hash_returns_correct_value(){
        int result = t.hashCode();
        int expectedResult = 3556499;
        assertEquals(expectedResult, result);
    }
}
