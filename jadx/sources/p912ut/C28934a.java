package p912ut;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.smstopush.entitiy.SmsNotificationEntity;
import p341ge.bog.mobilebank.cleanarch.domain.smstopush.model.SmsNotification;

/* renamed from: ut.a */
public final class C28934a {
    /* renamed from: a */
    public final List mo68688a(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SmsNotificationEntity smsNotificationEntity = (SmsNotificationEntity) it.next();
            arrayList.add(new SmsNotification(smsNotificationEntity.getNotifSetId(), smsNotificationEntity.getContact(), "Y".equals(smsNotificationEntity.isActive()), smsNotificationEntity.getMessageMode()));
        }
        return arrayList;
    }
}
