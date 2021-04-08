package org.academiadecodigo.alphanachos.itspossible.services;

import org.academiadecodigo.alphanachos.itspossible.persistence.dao.MissionDao;
import org.academiadecodigo.alphanachos.itspossible.persistence.model.Location;
import org.academiadecodigo.alphanachos.itspossible.persistence.model.Mission;
import org.academiadecodigo.alphanachos.itspossible.persistence.model.Quim;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface QuimServiceInterface {

    void createMission (Mission mission, Integer id);

    void requestMission (Integer mid, Integer qid);

    void executeMission (Integer id);

   List<Mission> listActiveMissions();

   List<Mission> listQuimHelpedMissions(Integer id);

   List <Mission> listQuimRequestedMissions(Integer id);

   List <Mission> listActiveMissionsByLocation(Location location);

   List<Quim> list();

    public Quim getQuimByID (Integer id);

}
