package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14557h;
import p455ho.C15547a;
import p676xo.C18868a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.i */
public final class C14562i {

    /* renamed from: a */
    public static final C14562i f42424a = new C14562i();

    private C14562i() {
    }

    /* renamed from: a */
    public final List mo40835a(C18868a aVar) {
        C41536l.m120489i(aVar, "<this>");
        ArrayList arrayList = new ArrayList();
        if (aVar.mo46830c().contains(C15547a.FINANCIAL_INFO)) {
            arrayList.add(new C14557h.C14559b("packages.application.II.financial.info.header", (String) null, 2, (DefaultConstructorMarker) null));
            arrayList.add(new C14557h.C14558a(C41358y.m120036z0(aVar.mo46828a()), false, 2, (DefaultConstructorMarker) null));
        }
        if (aVar.mo46830c().contains(C15547a.SOLO_LOUNGE)) {
            arrayList.add(new C14557h.C14559b("packages.application.II.solo.lounge.header", (String) null, 2, (DefaultConstructorMarker) null));
            arrayList.add(new C14557h.C14560c((String) null, 1, (DefaultConstructorMarker) null));
        }
        return arrayList;
    }
}
