package com.example.ikesios;

import java.util.List;

public class User {

        public int ID;
        public String Email;
        public String Password;
        public UserInfo UserInfo;
        public com.example.ikesios.Demographic Demographic;
        public List<CovidStatus> CovidStatuses;
        public List<DiseaseStatement> DiseaseStatements;


    public int getID() {
        return ID;
    }

    public String getEmail(){
        return Email;

    }

    public UserInfo getUserInfo() {
        return UserInfo;
    }

    public List<CovidStatus> getCovidStatuses() {
        return CovidStatuses;
    }

    public List<DiseaseStatement> getDiseaseStatements() {
        return DiseaseStatements;
    }

    public String getPassword() {
        return Password;
    }

    public Demographic getDemographic() {
        return Demographic;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setUserInfo(UserInfo userInfo) {
        UserInfo = userInfo;
    }

    public void setDemographic(Demographic demographic) {
        Demographic = demographic;
    }

    public void setCovidStatuses(List<CovidStatus> covidStatuses) {
        CovidStatuses = covidStatuses;
    }

    public void setDiseaseStatements(List<DiseaseStatement> diseaseStatements) {
        DiseaseStatements = diseaseStatements;
    }
}
