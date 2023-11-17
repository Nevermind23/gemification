package p341ge.bog.mobilebank.model.smsnotification;

/* renamed from: ge.bog.mobilebank.model.smsnotification.SMSNotification */
public class SMSNotification {
    public String isActive;
    public String isAdditionalTextActive;
    public String isAdditionalTextValid;
    public String message;
    public long notifId;
    public long notifSetId;
    public long notifTypeId;
    public String productGroup;
    public long productKey;
    public String productName;

    public SMSNotification copy() {
        SMSNotification sMSNotification = new SMSNotification();
        sMSNotification.notifId = this.notifId;
        sMSNotification.notifSetId = this.notifSetId;
        sMSNotification.notifTypeId = this.notifTypeId;
        sMSNotification.productGroup = this.productGroup;
        sMSNotification.productKey = this.productKey;
        sMSNotification.message = this.message;
        sMSNotification.isActive = this.isActive;
        sMSNotification.isAdditionalTextActive = this.isAdditionalTextActive;
        sMSNotification.isAdditionalTextValid = this.isAdditionalTextValid;
        sMSNotification.productName = this.productName;
        return sMSNotification;
    }

    public SMSNotificationToSave copyForSave() {
        SMSNotificationToSave sMSNotificationToSave = new SMSNotificationToSave();
        sMSNotificationToSave.notifId = this.notifId;
        sMSNotificationToSave.isActive = this.isActive;
        sMSNotificationToSave.isAdditionalTextActive = this.isAdditionalTextActive;
        return sMSNotificationToSave;
    }

    public boolean isActive() {
        return "Y".equals(this.isActive);
    }

    public boolean isAdditionalTextActive() {
        return "Y".equals(this.isAdditionalTextActive);
    }

    public boolean isAdditionalTextValid() {
        return "Y".equals(this.isAdditionalTextValid);
    }
}
