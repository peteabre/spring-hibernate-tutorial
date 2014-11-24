package no.ciber.tutorial.spring_hibernate.mapping;

import no.ciber.tutorial.spring_hibernate.domain.Kjoretoy;
import no.ciber.tutorial.spring_hibernate.model.KjoretoyModel;

import java.util.ArrayList;
import java.util.List;

import static no.ciber.tutorial.spring_hibernate.mapping.PersonMapper.fromPersonModel;
import static no.ciber.tutorial.spring_hibernate.mapping.PersonMapper.toPersonModel;

public final class KjoretoyMapper {
    private KjoretoyMapper(){};

    public static Kjoretoy fromKjoretoyModel(KjoretoyModel model){
        Kjoretoy kjoretoy = new Kjoretoy();
        kjoretoy.setUnderstellsnummer(model.getUnderstellsnummer());
        kjoretoy.setMerke(model.getMerke());
        kjoretoy.setModell(model.getModell());
        kjoretoy.setUnderstellsnummer(model.getRegistreringsnummer());
        kjoretoy.setRegistreringsaar(model.getRegistreringsaar());
        kjoretoy.setEier(fromPersonModel(model.getEier()));
        return kjoretoy;
    }

    public static List<Kjoretoy> fromKjoretoyModels(List<KjoretoyModel> modelList){
        List<Kjoretoy> kjoretoy = new ArrayList<>();
        modelList.forEach(model -> kjoretoy.add(fromKjoretoyModel(model)));
        return kjoretoy;
    }

    public static KjoretoyModel toKjoretoyModel(Kjoretoy kjoretoy){
        KjoretoyModel model = new KjoretoyModel();
        model.setUnderstellsnummer(kjoretoy.getUnderstellsnummer());
        model.setMerke(kjoretoy.getMerke());
        model.setModell(kjoretoy.getModell());
        model.setRegistreringsnummer(kjoretoy.getRegistreringsnummer());
        model.setRegistreringsaar(kjoretoy.getRegistreringsaar());
        model.setEier(toPersonModel(kjoretoy.getEier()));
        return model;
    }

    public static List<KjoretoyModel> toKjoretoyModels(List<Kjoretoy> kjoretoyList){
        List<KjoretoyModel> models = new ArrayList<>();
        kjoretoyList.forEach(kjoretoy -> models.add(toKjoretoyModel(kjoretoy)));
        return models;
    }
}
