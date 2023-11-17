package p341ge.bog.mobilebank.model.smsnotification;

import g91.C32359z0;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: ge.bog.mobilebank.model.smsnotification.SMSContact */
public class SMSContact {
    public long clientKey;
    public String contact;
    public String contactName;
    public String isActive;
    public String isAddressForeign;
    public int isAnyChildInactive;
    public String isDefault;
    public String isElvaActive;
    public boolean isServiceActivated;
    public String languageCode;
    public String notifName;
    public Long notifSetId;
    public String route;
    public ArrayList<SMSTypeGroup> typeGroups;

    public SMSContact copy() {
        SMSContact sMSContact = new SMSContact();
        sMSContact.notifSetId = this.notifSetId;
        sMSContact.clientKey = this.clientKey;
        sMSContact.notifName = this.notifName;
        sMSContact.contact = this.contact;
        sMSContact.languageCode = this.languageCode;
        sMSContact.isDefault = this.isDefault;
        sMSContact.isActive = this.isActive;
        sMSContact.isElvaActive = this.isElvaActive;
        sMSContact.isAddressForeign = this.isAddressForeign;
        sMSContact.isAnyChildInactive = this.isAnyChildInactive;
        sMSContact.isServiceActivated = this.isServiceActivated;
        sMSContact.route = this.route;
        sMSContact.contactName = this.contactName;
        sMSContact.typeGroups = new ArrayList<>();
        ArrayList<SMSTypeGroup> arrayList = this.typeGroups;
        if (arrayList != null) {
            Iterator<SMSTypeGroup> it = arrayList.iterator();
            while (it.hasNext()) {
                sMSContact.typeGroups.add(it.next().copy());
            }
        }
        return sMSContact;
    }

    public SMSContactToSave copyForSave() {
        SMSContactToSave sMSContactToSave = new SMSContactToSave();
        sMSContactToSave.notifSetId = this.notifSetId;
        sMSContactToSave.isActive = this.isActive;
        sMSContactToSave.contact = this.contact;
        sMSContactToSave.contactName = this.contactName;
        String str = this.route;
        sMSContactToSave.route = str;
        if ("DEVICE".equals(str)) {
            sMSContactToSave.languageCode = PreferencesApiManager.getInstance().getLanguage().mo90433b();
        } else {
            sMSContactToSave.languageCode = this.languageCode;
        }
        ArrayList<SMSTypeGroup> arrayList = this.typeGroups;
        if (!(arrayList == null || arrayList == null)) {
            Iterator<SMSTypeGroup> it = arrayList.iterator();
            while (it.hasNext()) {
                sMSContactToSave.typeGroups.add(it.next().copyForSave());
            }
        }
        return sMSContactToSave;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SMSContact sMSContact = (SMSContact) obj;
        if (isActive() != sMSContact.isActive() || !C32359z0.m95598z(this.languageCode, sMSContact.languageCode)) {
            return false;
        }
        int i = 0;
        while (i < this.typeGroups.size()) {
            try {
                for (int i2 = 0; i2 < this.typeGroups.get(i).types.size(); i2++) {
                    for (int i3 = 0; i3 < this.typeGroups.get(i).types.get(i2).notifications.size(); i3++) {
                        if (!C32359z0.m95598z(this.typeGroups.get(i).types.get(i2).notifications.get(i3).isActive, sMSContact.typeGroups.get(i).types.get(i2).notifications.get(i3).isActive) || !C32359z0.m95598z(this.typeGroups.get(i).types.get(i2).notifications.get(i3).isAdditionalTextActive, sMSContact.typeGroups.get(i).types.get(i2).notifications.get(i3).isAdditionalTextActive)) {
                            return false;
                        }
                    }
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public String getUniqueTag() {
        return this.route + this.contact;
    }

    public boolean isActive() {
        return "Y".equals(this.isActive);
    }

    public boolean isAddressForeign() {
        return "Y".endsWith(this.isAddressForeign);
    }

    public boolean isAnyChildInactive() {
        return this.isAnyChildInactive > 0;
    }

    public boolean isDefault() {
        return "Y".equals(this.isDefault);
    }

    public boolean isElvaActive() {
        return "Y".equals(this.isElvaActive);
    }
}
