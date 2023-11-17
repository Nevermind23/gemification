package p341ge.bog.mobilebank.eventbus.events;

import g91.C32359z0;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.smsnotification.SMSContact;
import p341ge.bog.mobilebank.model.smsnotification.SMSContactToSave;

/* renamed from: ge.bog.mobilebank.eventbus.events.SMSNotifListEvent */
public class SMSNotifListEvent extends RootEvent {
    public ArrayList<SMSContact> copiedPushContacts;
    public ArrayList<SMSContact> copiedSmsContacts;
    public ArrayList<SMSContact> pushContacts;
    public ArrayList<SMSContact> smsContacts;

    public SMSContact getContactByTag(String str) {
        ArrayList<SMSContact> arrayList = this.smsContacts;
        if (arrayList != null) {
            Iterator<SMSContact> it = arrayList.iterator();
            while (it.hasNext()) {
                SMSContact next = it.next();
                if (C32359z0.m95598z(next.getUniqueTag(), str)) {
                    return next;
                }
            }
        }
        ArrayList<SMSContact> arrayList2 = this.pushContacts;
        if (arrayList2 == null) {
            return null;
        }
        Iterator<SMSContact> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            SMSContact next2 = it2.next();
            if (C32359z0.m95598z(next2.getUniqueTag(), str)) {
                return next2;
            }
        }
        return null;
    }

    public ArrayList<SMSContactToSave> getContactsToSave() {
        ArrayList<SMSContactToSave> arrayList = new ArrayList<>();
        if (this.smsContacts != null) {
            for (int i = 0; i < this.smsContacts.size(); i++) {
                if (!this.smsContacts.get(i).equals(this.copiedSmsContacts.get(i))) {
                    arrayList.add(this.smsContacts.get(i).copyForSave());
                }
            }
        }
        if (this.pushContacts != null) {
            for (int i2 = 0; i2 < this.pushContacts.size(); i2++) {
                if (!this.pushContacts.get(i2).equals(this.copiedPushContacts.get(i2))) {
                    arrayList.add(this.pushContacts.get(i2).copyForSave());
                }
            }
        }
        return arrayList;
    }

    public boolean hasUnsavedData() {
        int i = 0;
        while (i < 2) {
            try {
                ArrayList<SMSContact> arrayList = this.smsContacts;
                ArrayList<SMSContact> arrayList2 = this.copiedSmsContacts;
                if (i == 1) {
                    arrayList = this.pushContacts;
                    arrayList2 = this.copiedPushContacts;
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!arrayList.get(i2).equals(arrayList2.get(i2))) {
                        return true;
                    }
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void restoreInitialData() {
        this.smsContacts = new ArrayList<>();
        ArrayList<SMSContact> arrayList = this.copiedSmsContacts;
        if (arrayList != null) {
            Iterator<SMSContact> it = arrayList.iterator();
            while (it.hasNext()) {
                this.smsContacts.add(it.next().copy());
            }
        }
        this.pushContacts = new ArrayList<>();
        ArrayList<SMSContact> arrayList2 = this.copiedPushContacts;
        if (arrayList2 != null) {
            Iterator<SMSContact> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                this.pushContacts.add(it2.next().copy());
            }
        }
    }
}
