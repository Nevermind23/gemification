package p341ge.bog.mobilebank.bnpl.presentation.details;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37614q;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13838d;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.h */
public abstract class C13869h {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final List m51688b(C13877l lVar) {
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, lVar.mo38271e());
        C37614q.m110615a(arrayList, lVar.mo38270d());
        C37614q.m110615a(arrayList, lVar.mo38269c());
        arrayList.add(C13838d.C13845g.f41130a);
        Boolean h = lVar.mo38275h();
        Boolean bool = Boolean.TRUE;
        if (C41536l.m120484d(h, bool)) {
            arrayList.add(C13838d.C13847i.f41135a);
        } else if (C41536l.m120484d(lVar.mo38273f(), bool)) {
            arrayList.add(C13838d.C13844f.f41129a);
        } else {
            Boolean h2 = lVar.mo38275h();
            Boolean bool2 = Boolean.FALSE;
            if (C41536l.m120484d(h2, bool2) && C41536l.m120484d(lVar.mo38273f(), bool2)) {
                arrayList.addAll(lVar.mo38274g());
                arrayList.add(C13838d.C13843e.f41128a);
            }
        }
        C37614q.m110615a(arrayList, lVar.mo38278j());
        return arrayList;
    }
}
