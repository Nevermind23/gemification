package p567po;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p596rp.C17711b;
import p596rp.C17713d;

/* renamed from: po.a */
public final class C17455a {

    /* renamed from: a */
    private String f48870a;

    /* renamed from: b */
    private String f48871b;

    /* renamed from: c */
    private EmailUiModel f48872c;

    /* renamed from: d */
    private C17713d f48873d;

    /* renamed from: e */
    private List f48874e;

    /* renamed from: f */
    private C17711b f48875f;

    public C17455a(String str, String str2, EmailUiModel emailUiModel, C17713d dVar, List list, C17711b bVar) {
        C41536l.m120489i(str, "jobName");
        C41536l.m120489i(list, "requiredFields");
        this.f48870a = str;
        this.f48871b = str2;
        this.f48872c = emailUiModel;
        this.f48873d = dVar;
        this.f48874e = list;
        this.f48875f = bVar;
    }

    /* renamed from: a */
    public final EmailUiModel mo44948a() {
        return this.f48872c;
    }

    /* renamed from: b */
    public final C17713d mo44949b() {
        return this.f48873d;
    }

    /* renamed from: c */
    public final String mo44950c() {
        return this.f48870a;
    }

    /* renamed from: d */
    public final C17711b mo44951d() {
        return this.f48875f;
    }

    /* renamed from: e */
    public final String mo44952e() {
        return this.f48871b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17455a)) {
            return false;
        }
        C17455a aVar = (C17455a) obj;
        return C41536l.m120484d(this.f48870a, aVar.f48870a) && C41536l.m120484d(this.f48871b, aVar.f48871b) && C41536l.m120484d(this.f48872c, aVar.f48872c) && C41536l.m120484d(this.f48873d, aVar.f48873d) && C41536l.m120484d(this.f48874e, aVar.f48874e) && C41536l.m120484d(this.f48875f, aVar.f48875f);
    }

    /* renamed from: f */
    public final List mo44954f() {
        return this.f48874e;
    }

    /* renamed from: g */
    public final void mo44955g(EmailUiModel emailUiModel) {
        this.f48872c = emailUiModel;
    }

    /* renamed from: h */
    public final void mo44956h(C17713d dVar) {
        this.f48873d = dVar;
    }

    public int hashCode() {
        int hashCode = this.f48870a.hashCode() * 31;
        String str = this.f48871b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EmailUiModel emailUiModel = this.f48872c;
        int hashCode3 = (hashCode2 + (emailUiModel == null ? 0 : emailUiModel.hashCode())) * 31;
        C17713d dVar = this.f48873d;
        int hashCode4 = (((hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f48874e.hashCode()) * 31;
        C17711b bVar = this.f48875f;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final void mo44958i(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f48870a = str;
    }

    /* renamed from: j */
    public final void mo44959j(C17711b bVar) {
        this.f48875f = bVar;
    }

    /* renamed from: k */
    public final void mo44960k(String str) {
        this.f48871b = str;
    }

    /* renamed from: l */
    public final void mo44961l(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f48874e = list;
    }

    public String toString() {
        String str = this.f48870a;
        String str2 = this.f48871b;
        EmailUiModel emailUiModel = this.f48872c;
        C17713d dVar = this.f48873d;
        List list = this.f48874e;
        C17711b bVar = this.f48875f;
        return "ViewState(jobName=" + str + ", phoneNumber=" + str2 + ", email=" + emailUiModel + ", fee=" + dVar + ", requiredFields=" + list + ", packageItem=" + bVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C17455a(java.lang.String r5, java.lang.String r6, p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel r7, p596rp.C17713d r8, java.util.List r9, p596rp.C17711b r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.lang.String r5 = ""
        L_0x0006:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x000d
            r12 = r0
            goto L_0x000e
        L_0x000d:
            r12 = r6
        L_0x000e:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0024
            java.util.List r9 = ie1.C41341q.m119907j()
        L_0x0024:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = r10
        L_0x002b:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p567po.C17455a.<init>(java.lang.String, java.lang.String, ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel, rp.d, java.util.List, rp.b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
