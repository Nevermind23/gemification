package d71;

import j71.C36749b;
import j71.C36750c;
import j71.C36751d;
import j71.C36756i;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.transportcard.data.model.ActivePassApiModel;
import p341ge.bog.mobilebank.transportcard.data.model.ActivePassDeviceApiModel;

/* renamed from: d71.b */
public final class C31545b {
    /* renamed from: a */
    private final C36749b m93622a(ActivePassApiModel activePassApiModel) {
        return new C36749b(activePassApiModel.getPassId(), activePassApiModel.getTypeId(), new Date(activePassApiModel.getStartDate()), new Date(activePassApiModel.getEndDate()), activePassApiModel.getChargeAcctKey(), activePassApiModel.getTypeCode(), activePassApiModel.getPassTitle(), activePassApiModel.getPassDescription());
    }

    /* renamed from: b */
    private final C36750c m93623b(ActivePassDeviceApiModel activePassDeviceApiModel) {
        long cardId = activePassDeviceApiModel.getCardId();
        long expDate = activePassDeviceApiModel.getExpDate();
        String lastFour = activePassDeviceApiModel.getLastFour();
        String deviceType = activePassDeviceApiModel.getDeviceType();
        String deviceId = activePassDeviceApiModel.getDeviceId();
        String deviceName = activePassDeviceApiModel.getDeviceName();
        C36756i.C36757a aVar = C36756i.f88709e;
        C36756i a = aVar.mo89639a(activePassDeviceApiModel.getStatus());
        C36756i a2 = aVar.mo89639a(activePassDeviceApiModel.getDeviceStatus());
        boolean isPhysicalCard = activePassDeviceApiModel.isPhysicalCard();
        String deviceStatusDescription = activePassDeviceApiModel.getDeviceStatusDescription();
        C36751d dVar = new C36751d(activePassDeviceApiModel.getCardLargeBackground().getId(), activePassDeviceApiModel.getCardLargeBackground().getChannelCode(), activePassDeviceApiModel.getCardLargeBackground().getLanguageCode(), activePassDeviceApiModel.getCardLargeBackground().getFileType(), activePassDeviceApiModel.getCardLargeBackground().getFileSubType(), activePassDeviceApiModel.getCardLargeBackground().getExtFileId(), C41536l.m120484d(activePassDeviceApiModel.getCardLargeBackground().isDark(), "Y"), activePassDeviceApiModel.getCardLargeBackground().getFileUrl());
        C36751d dVar2 = new C36751d(activePassDeviceApiModel.getCardSmallBackground().getId(), activePassDeviceApiModel.getCardSmallBackground().getChannelCode(), activePassDeviceApiModel.getCardSmallBackground().getLanguageCode(), activePassDeviceApiModel.getCardSmallBackground().getFileType(), activePassDeviceApiModel.getCardSmallBackground().getFileSubType(), activePassDeviceApiModel.getCardSmallBackground().getExtFileId(), C41536l.m120484d(activePassDeviceApiModel.getCardSmallBackground().isDark(), "Y"), activePassDeviceApiModel.getCardSmallBackground().getFileUrl());
        List<ActivePassApiModel> activePass = activePassDeviceApiModel.getActivePass();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(activePass, 10));
        for (ActivePassApiModel a3 : activePass) {
            C36751d dVar3 = dVar2;
            arrayList.add(m93622a(a3));
            dVar2 = dVar3;
        }
        C36751d dVar4 = dVar2;
        return new C36750c(cardId, expDate, lastFour, deviceType, deviceId, deviceName, a, a2, isPhysicalCard, deviceStatusDescription, dVar, dVar4, arrayList);
    }

    /* renamed from: c */
    public final List mo71946c(List list) {
        C41536l.m120489i(list, "activePasses");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m93623b((ActivePassDeviceApiModel) it.next()));
        }
        return arrayList;
    }
}
