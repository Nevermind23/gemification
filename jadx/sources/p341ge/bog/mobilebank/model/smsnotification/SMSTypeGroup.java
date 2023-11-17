package p341ge.bog.mobilebank.model.smsnotification;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ge.bog.mobilebank.model.smsnotification.SMSTypeGroup */
public class SMSTypeGroup {
    public String groupName;
    public ArrayList<SMSType> types;

    public SMSTypeGroup copy() {
        SMSTypeGroup sMSTypeGroup = new SMSTypeGroup();
        sMSTypeGroup.groupName = this.groupName;
        sMSTypeGroup.types = new ArrayList<>();
        ArrayList<SMSType> arrayList = this.types;
        if (arrayList != null) {
            Iterator<SMSType> it = arrayList.iterator();
            while (it.hasNext()) {
                sMSTypeGroup.types.add(it.next().copy());
            }
        }
        return sMSTypeGroup;
    }

    public SMSTypeGroupToSave copyForSave() {
        SMSTypeGroupToSave sMSTypeGroupToSave = new SMSTypeGroupToSave();
        ArrayList<SMSType> arrayList = this.types;
        if (arrayList != null) {
            Iterator<SMSType> it = arrayList.iterator();
            while (it.hasNext()) {
                sMSTypeGroupToSave.types.add(it.next().copyForSave());
            }
        }
        return sMSTypeGroupToSave;
    }

    public boolean hasActiveChild() {
        ArrayList<SMSType> arrayList = this.types;
        if (arrayList == null) {
            return false;
        }
        Iterator<SMSType> it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<SMSNotification> arrayList2 = it.next().notifications;
            if (arrayList2 != null) {
                Iterator<SMSNotification> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isActive()) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public boolean hasChildren() {
        ArrayList<SMSType> arrayList = this.types;
        if (!(arrayList == null || arrayList.size() == 0)) {
            Iterator<SMSType> it = this.types.iterator();
            while (it.hasNext()) {
                ArrayList<SMSNotification> arrayList2 = it.next().notifications;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
