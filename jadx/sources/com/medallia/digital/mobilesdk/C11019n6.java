package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10749b8;
import com.medallia.digital.mobilesdk.C11089s6;
import java.util.UUID;

/* renamed from: com.medallia.digital.mobilesdk.n6 */
class C11019n6 {

    /* renamed from: a */
    private long f31674a = -1;

    C11019n6() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo28836a() {
        return this.f31674a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28839b() {
        C11089s6 b = C11089s6.m40668b();
        C11089s6.C11090a aVar = C11089s6.C11090a.PREVIOUS_SESSION_ID;
        C11089s6 b2 = C11089s6.m40668b();
        C11089s6.C11090a aVar2 = C11089s6.C11090a.SESSION_ID;
        b.mo28984b(aVar, b2.mo28975a(aVar2, (String) null));
        C11089s6.m40668b().mo28984b(aVar2, UUID.randomUUID().toString());
        C11089s6 b3 = C11089s6.m40668b();
        C11089s6.C11090a aVar3 = C11089s6.C11090a.SESSION_COUNTER;
        C11089s6.m40668b().mo28982b(aVar3, b3.mo28973a(aVar3, 0) + 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28840c() {
        CollectorsInfrastructure.getInstance().setSessionNumber(Integer.valueOf(C11089s6.m40668b().mo28973a(C11089s6.C11090a.SESSION_COUNTER, 0)));
        CollectorsInfrastructure.getInstance().setSessionId(C11089s6.m40668b().mo28975a(C11089s6.C11090a.SESSION_ID, (String) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28837a(ConfigurationContract configurationContract) {
        this.f31674a = (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue() <= 0) ? C10749b8.C10751b.f30743b : configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28838a(long j) {
        return j > this.f31674a;
    }
}
