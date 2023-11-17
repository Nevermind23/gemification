package sa1;

import ed1.C40762x;
import hb1.C36175k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p217q2.C7843j;
import p341ge.bog.sso_client.models.C35934b;
import sso.queery.GetSettingsQuery;
import ue1.C43075l;

/* renamed from: sa1.j */
public final class C28183j implements C28181h {

    /* renamed from: a */
    private final C36175k f71530a;

    public C28183j(C36175k kVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        this.f71530a = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m86639c(C7843j jVar) {
        GetSettingsQuery.CommonServices commonServices;
        List<GetSettingsQuery.GetSetting> getSettings;
        String str;
        C41536l.m120489i(jVar, "it");
        GetSettingsQuery.Data data = (GetSettingsQuery.Data) jVar.mo22784b();
        if (data == null || (commonServices = data.getCommonServices()) == null || (getSettings = commonServices.getGetSettings()) == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(getSettings, 10));
        for (GetSettingsQuery.GetSetting getSetting : getSettings) {
            String str2 = null;
            if (getSetting != null) {
                str = getSetting.getPropertyKey();
            } else {
                str = null;
            }
            if (getSetting != null) {
                str2 = getSetting.getPropertyValue();
            }
            arrayList.add(new C35934b(str, str2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C40762x mo67681a() {
        C40762x A = C36175k.m107584j(this.f71530a, new GetSettingsQuery(), false, (C43075l) null, 6, (Object) null).mo95062A(new C28182i());
        C41536l.m120488h(A, "apolloRxFactory.createSi…emptyList()\n            }");
        return A;
    }
}
