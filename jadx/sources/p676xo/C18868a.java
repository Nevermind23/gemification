package p676xo;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData;
import p596rp.C17711b;

/* renamed from: xo.a */
public final class C18868a {

    /* renamed from: a */
    private List f52801a;

    /* renamed from: b */
    private SelectedLoungeData f52802b;

    /* renamed from: c */
    private List f52803c;

    /* renamed from: d */
    private C17711b f52804d;

    /* renamed from: e */
    private List f52805e;

    public C18868a(List list, SelectedLoungeData selectedLoungeData, List list2, C17711b bVar, List list3) {
        C41536l.m120489i(list, "info");
        C41536l.m120489i(selectedLoungeData, "soloLounge");
        C41536l.m120489i(list2, "requiredFields");
        C41536l.m120489i(list3, "infoTypes");
        this.f52801a = list;
        this.f52802b = selectedLoungeData;
        this.f52803c = list2;
        this.f52804d = bVar;
        this.f52805e = list3;
    }

    /* renamed from: a */
    public final List mo46828a() {
        return this.f52801a;
    }

    /* renamed from: b */
    public final List mo46829b() {
        return this.f52805e;
    }

    /* renamed from: c */
    public final List mo46830c() {
        return this.f52803c;
    }

    /* renamed from: d */
    public final SelectedLoungeData mo46831d() {
        return this.f52802b;
    }

    /* renamed from: e */
    public final void mo46832e(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f52805e = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18868a)) {
            return false;
        }
        C18868a aVar = (C18868a) obj;
        return C41536l.m120484d(this.f52801a, aVar.f52801a) && C41536l.m120484d(this.f52802b, aVar.f52802b) && C41536l.m120484d(this.f52803c, aVar.f52803c) && C41536l.m120484d(this.f52804d, aVar.f52804d) && C41536l.m120484d(this.f52805e, aVar.f52805e);
    }

    /* renamed from: f */
    public final void mo46834f(C17711b bVar) {
        this.f52804d = bVar;
    }

    /* renamed from: g */
    public final void mo46835g(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f52803c = list;
    }

    /* renamed from: h */
    public final void mo46836h(SelectedLoungeData selectedLoungeData) {
        C41536l.m120489i(selectedLoungeData, "<set-?>");
        this.f52802b = selectedLoungeData;
    }

    public int hashCode() {
        int hashCode = ((((this.f52801a.hashCode() * 31) + this.f52802b.hashCode()) * 31) + this.f52803c.hashCode()) * 31;
        C17711b bVar = this.f52804d;
        return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f52805e.hashCode();
    }

    public String toString() {
        List list = this.f52801a;
        SelectedLoungeData selectedLoungeData = this.f52802b;
        List list2 = this.f52803c;
        C17711b bVar = this.f52804d;
        List list3 = this.f52805e;
        return "ViewState(info=" + list + ", soloLounge=" + selectedLoungeData + ", requiredFields=" + list2 + ", packageItem=" + bVar + ", infoTypes=" + list3 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C18868a(java.util.List r7, p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData r8, java.util.List r9, p596rp.C17711b r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0009
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0009:
            r13 = r12 & 2
            if (r13 == 0) goto L_0x0018
            ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData r8 = new ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 7
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0018:
            r13 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0021
            java.util.List r9 = ie1.C41341q.m119907j()
        L_0x0021:
            r0 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L_0x0027
            r10 = 0
        L_0x0027:
            r1 = r10
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0030
            java.util.List r11 = ie1.C41341q.m119907j()
        L_0x0030:
            r2 = r11
            r8 = r6
            r9 = r7
            r10 = r13
            r11 = r0
            r12 = r1
            r13 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p676xo.C18868a.<init>(java.util.List, ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SelectedLoungeData, java.util.List, rp.b, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
