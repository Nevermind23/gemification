package p143k6;

import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import p156l6.C6954m;
import p182n6.C7264i;

/* renamed from: k6.c */
public abstract class C6821c {
    /* renamed from: a */
    public static C6819b m26555a(C6823e eVar, C3860c cVar) {
        C7264i.m27903l(eVar, "Result must not be null");
        C7264i.m27893b(!eVar.getStatus().mo11905q0(), "Status code must not be SUCCESS");
        C6826h hVar = new C6826h(cVar, eVar);
        hVar.mo11977i(eVar);
        return hVar;
    }

    /* renamed from: b */
    public static C6819b m26556b(Status status, C3860c cVar) {
        C7264i.m27903l(status, "Result must not be null");
        C6954m mVar = new C6954m(cVar);
        mVar.mo11977i(status);
        return mVar;
    }
}
