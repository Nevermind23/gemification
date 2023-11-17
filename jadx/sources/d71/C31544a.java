package d71;

import j71.C36748a;
import j71.C36751d;
import j71.C36753f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transportcard.data.model.ActiveCardApiModel;
import p341ge.bog.mobilebank.transportcard.data.model.PassDeviceApiModel;

/* renamed from: d71.a */
public final class C31544a {
    /* renamed from: a */
    public final List mo71945a(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "cards");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActiveCardApiModel activeCardApiModel = (ActiveCardApiModel) it.next();
            long clientKey = activeCardApiModel.getClientKey();
            long cardId = activeCardApiModel.getCardId();
            String cardClassCode = activeCardApiModel.getCardClassCode();
            String cardClass = activeCardApiModel.getCardClass();
            String lastFour = activeCardApiModel.getLastFour();
            String subProductCode = activeCardApiModel.getSubProductCode();
            long expDate = activeCardApiModel.getExpDate();
            String cardName = activeCardApiModel.getCardName();
            String cardNameDictionaryKey = activeCardApiModel.getCardNameDictionaryKey();
            C36751d dVar = new C36751d(activeCardApiModel.getCardLargeBackground().getId(), activeCardApiModel.getCardLargeBackground().getChannelCode(), activeCardApiModel.getCardLargeBackground().getLanguageCode(), activeCardApiModel.getCardLargeBackground().getFileType(), activeCardApiModel.getCardLargeBackground().getFileSubType(), activeCardApiModel.getCardLargeBackground().getExtFileId(), C41536l.m120484d(activeCardApiModel.getCardLargeBackground().isDark(), "Y"), activeCardApiModel.getCardLargeBackground().getFileUrl());
            List<PassDeviceApiModel> passDevices = activeCardApiModel.getPassDevices();
            Iterator it2 = it;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(passDevices, 10));
            Iterator<T> it3 = passDevices.iterator();
            while (it3.hasNext()) {
                PassDeviceApiModel passDeviceApiModel = (PassDeviceApiModel) it3.next();
                arrayList2.add(new C36753f(passDeviceApiModel.getDeviceId(), passDeviceApiModel.getDeviceType(), passDeviceApiModel.getDeviceName(), passDeviceApiModel.isPhysicalDevice(), new Date(passDeviceApiModel.getDeviceRegDate())));
                it3 = it3;
                arrayList = arrayList;
            }
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new C36748a(clientKey, cardId, cardClassCode, cardClass, lastFour, subProductCode, expDate, cardName, cardNameDictionaryKey, dVar, arrayList2));
            it = it2;
            arrayList = arrayList3;
        }
        return arrayList;
    }
}
