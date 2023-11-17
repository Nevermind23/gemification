package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetSettingsQuery;

public final class GetSettingsQuery$GetSetting$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetSettingsQuery.GetSetting this$0;

    public GetSettingsQuery$GetSetting$marshaller$$inlined$invoke$1(GetSettingsQuery.GetSetting getSetting) {
        this.this$0 = getSetting;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetSettingsQuery.GetSetting.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetSettingsQuery.GetSetting.RESPONSE_FIELDS[1], this.this$0.getPropertyKey());
        pVar.mo23319d(GetSettingsQuery.GetSetting.RESPONSE_FIELDS[2], this.this$0.getPropertyValue());
    }
}
