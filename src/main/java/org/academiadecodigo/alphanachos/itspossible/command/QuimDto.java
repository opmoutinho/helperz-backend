package org.academiadecodigo.alphanachos.itspossible.command;

import org.academiadecodigo.alphanachos.itspossible.persistence.model.Location;
import org.academiadecodigo.alphanachos.itspossible.persistence.model.Skill;

import java.util.Set;

public class QuimDto {

    private Integer id;
    private String email;
    private String phone;
    private String name;
    private String aboutMe;
    private Location location;
    private Set<Skill> skills;
    private MissionDto missionToExecute;
    private MissionDto missionRequest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public MissionDto getMissionToExecute() {
        return missionToExecute;
    }

    public void setMissionToExecute(MissionDto missionToExecute) {
        this.missionToExecute = missionToExecute;
    }

    public MissionDto getMissionRequest() {
        return missionRequest;
    }

    public void setMissionRequest(MissionDto missionDto) {
        this.missionRequest = missionDto;
    }
}
