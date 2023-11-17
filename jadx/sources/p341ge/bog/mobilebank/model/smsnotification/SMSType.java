package p341ge.bog.mobilebank.model.smsnotification;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ge.bog.mobilebank.model.smsnotification.SMSType */
public class SMSType {
    public long clientKey;
    public String dictionaryKey;
    public long dictionaryKeyId;
    public long futureProdId;
    public String isAdtTextValid;
    public int isAnyChildActive;
    public String isFutureProdActive;
    public String isFutureProdAdtTextActive;
    public String lookupValue;
    public long notifSetId;
    public String notifType;
    public long notifTypeId;
    public ArrayList<SMSNotification> notifications;
    public int orderNo;
    public String productGroup;

    public SMSType copy() {
        SMSType sMSType = new SMSType();
        sMSType.notifSetId = this.notifSetId;
        sMSType.clientKey = this.clientKey;
        sMSType.notifTypeId = this.notifTypeId;
        sMSType.futureProdId = this.futureProdId;
        sMSType.notifType = this.notifType;
        sMSType.productGroup = this.productGroup;
        sMSType.isAdtTextValid = this.isAdtTextValid;
        sMSType.isFutureProdActive = this.isFutureProdActive;
        sMSType.isFutureProdAdtTextActive = this.isFutureProdAdtTextActive;
        sMSType.isAnyChildActive = this.isAnyChildActive;
        sMSType.dictionaryKeyId = this.dictionaryKeyId;
        sMSType.lookupValue = this.lookupValue;
        sMSType.orderNo = this.orderNo;
        sMSType.dictionaryKey = this.dictionaryKey;
        sMSType.notifications = new ArrayList<>();
        ArrayList<SMSNotification> arrayList = this.notifications;
        if (arrayList != null) {
            Iterator<SMSNotification> it = arrayList.iterator();
            while (it.hasNext()) {
                sMSType.notifications.add(it.next().copy());
            }
        }
        return sMSType;
    }

    public SMSTypeToSave copyForSave() {
        SMSTypeToSave sMSTypeToSave = new SMSTypeToSave();
        sMSTypeToSave.futureProdId = this.futureProdId;
        sMSTypeToSave.isFutureProdActive = this.isFutureProdActive;
        ArrayList<SMSNotification> arrayList = this.notifications;
        if (arrayList != null) {
            Iterator<SMSNotification> it = arrayList.iterator();
            while (it.hasNext()) {
                sMSTypeToSave.notifications.add(it.next().copyForSave());
            }
        }
        return sMSTypeToSave;
    }

    public boolean hasChildren() {
        ArrayList<SMSNotification> arrayList = this.notifications;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    public boolean isAdtTextValid() {
        return "Y".equals(this.isAdtTextValid);
    }

    public boolean isFutureProdActive() {
        return "Y".equals(this.isFutureProdActive);
    }

    public boolean isFutureProdAdtTextActive() {
        return "Y".equals(this.isFutureProdAdtTextActive);
    }
}
