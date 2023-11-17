package p341ge.bog.mobilebank.model.smsnotification;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.smsnotification.SMSContactToSave */
public class SMSContactToSave {
    public String contact;
    public String contactName;
    public String isActive;
    public String languageCode;
    public Long notifSetId;
    public String route;
    public ArrayList<SMSTypeGroupToSave> typeGroups = new ArrayList<>();
}
