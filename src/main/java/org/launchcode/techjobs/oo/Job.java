package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer , Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String reply = new String();
        String replyId = new String('\n' + "ID: " + id);
        String replyName = new String( '\n' + "Name: " + name);
        String replyEmployer = new String( '\n' + "Employer: " + employer);
        String replyLocation = new String( '\n' + "Location: " + location);
        String replyPositionType = new String( '\n' + "Position Type: " + positionType);
        String replyCoreCompetency = new String( '\n' + "Core Competency: " + coreCompetency + '\n');

        if(employer.toString() == "" && location.toString() == "" && positionType.toString() == "" && coreCompetency.toString() == "") {
            reply = "OOPS! This job does not seem to exist.";
        } else {

            if(employer.toString() == ""){
                replyEmployer = '\n' + "Employer: Data not available";
            }
            if(location.toString() == ""){
                replyLocation = '\n' + "Location: Data not available";
            }
            if(positionType.toString() == ""){
                replyPositionType = '\n' + "Position Type: Data not available";
            }
            if(coreCompetency.toString() == ""){
                replyCoreCompetency = '\n' + "Core Comppetency: Data not available" + '\n';
            }
            reply = replyId + replyName + replyEmployer + replyLocation + replyPositionType + replyCoreCompetency;
        }
        return reply;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
