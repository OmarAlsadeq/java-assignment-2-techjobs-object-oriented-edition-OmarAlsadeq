package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testSettingJobId(){
        Job job3 =  new Job();
        Job job2 = new Job();
        assertNotEquals(job3.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue(job instanceof Job);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        assertEquals(job.toString().charAt(0), '\n');
        assertEquals(job.toString().charAt(job.toString().length()-1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String jobString = new String();
        jobString = '\n' + "ID: " + job.getId() + '\n' + "Name: " + job.getName() + '\n' + "Employer: " + job.getEmployer() + '\n' + "Location: " + job.getLocation() + '\n' + "Position Type: " + job.getPositionType() + '\n' + "Core Competency: " + job.getCoreCompetency() + '\n';
        assertEquals(job.toString(), jobString);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency(""));
        String job2String = new String();
        job2String = '\n' + "ID: " + job2.getId() + '\n' + "Name: " + job2.getName() + '\n' + "Employer: " + job2.getEmployer() + '\n' + "Location: " + job2.getLocation() + '\n' + "Position Type: " + "Data not available" + '\n' + "Core Competency: " + "Data not available" +'\n';
        assertEquals(job2String, job2.toString());
    }

    /*
    @Test
    public void testToStringHandlesJobWithIdOnly() {
        Job job3 = new Job();
        String job3String = new String("OOPS! This job does not seem to exist.");
        assertEquals(job3.toString(), job3String);
    }
     */

}
