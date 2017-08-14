package me.jerilynmensah.daveslist.models;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class DavesList {

    @NotNull
    @Size(min=4,max=20)
    private long id;
    @NotNull
    @Size(min=4,max=20)
    private String description;
    @NotNull
    @Size(min=4,max=20)
    private String rules;
    @NotNull
    @Size(min=4,max=20)
    private String wifi;
    @NotNull
    @Size(min=4,max=20)
    private String cable;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(String privateBathroom) {
        this.privateBathroom = privateBathroom;
    }

    @NotNull
    @Size(min=4,max=20)

    private String privateBathroom;
}
