package p847oq;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p817lq.C26057b;
import p817lq.C26058c;

/* renamed from: oq.b */
public final class C27057b {

    /* renamed from: a */
    private String f67982a;

    /* renamed from: b */
    private String f67983b;

    /* renamed from: c */
    private String f67984c;

    /* renamed from: d */
    private LookupUiModel f67985d;

    /* renamed from: e */
    private ServiceCenterUiModel f67986e;

    /* renamed from: f */
    private ServiceCenterUiModel f67987f;

    /* renamed from: g */
    private ServiceCenterUiModel f67988g;

    /* renamed from: h */
    private LookupUiModel f67989h;

    /* renamed from: i */
    private String f67990i;

    /* renamed from: j */
    private Boolean f67991j;

    /* renamed from: k */
    private Long f67992k;

    public C27057b(String str, String str2, String str3, LookupUiModel lookupUiModel, ServiceCenterUiModel serviceCenterUiModel, ServiceCenterUiModel serviceCenterUiModel2, ServiceCenterUiModel serviceCenterUiModel3, LookupUiModel lookupUiModel2, String str4, Boolean bool, Long l) {
        this.f67982a = str;
        this.f67983b = str2;
        this.f67984c = str3;
        this.f67985d = lookupUiModel;
        this.f67986e = serviceCenterUiModel;
        this.f67987f = serviceCenterUiModel2;
        this.f67988g = serviceCenterUiModel3;
        this.f67989h = lookupUiModel2;
        this.f67990i = str4;
        this.f67991j = bool;
        this.f67992k = l;
    }

    /* renamed from: a */
    public final C27057b mo66285a() {
        return new C27057b(this.f67982a, this.f67983b, this.f67984c, this.f67985d, this.f67986e, this.f67987f, this.f67988g, this.f67989h, (String) null, (Boolean) null, (Long) null, 1792, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public final String mo66286b() {
        return this.f67982a;
    }

    /* renamed from: c */
    public final Long mo66287c() {
        return this.f67992k;
    }

    /* renamed from: d */
    public final String mo66288d() {
        return this.f67983b;
    }

    /* renamed from: e */
    public final Boolean mo66289e() {
        return this.f67991j;
    }

    /* renamed from: f */
    public final LookupUiModel mo66290f() {
        return this.f67985d;
    }

    /* renamed from: g */
    public final LookupUiModel mo66291g() {
        return this.f67989h;
    }

    /* renamed from: h */
    public final String mo66292h() {
        String str;
        String str2;
        ServiceCenterUiModel serviceCenterUiModel = this.f67986e;
        if (serviceCenterUiModel == null || this.f67987f == null || this.f67988g == null) {
            return "";
        }
        String str3 = null;
        if (serviceCenterUiModel != null) {
            str = serviceCenterUiModel.mo49705d();
        } else {
            str = null;
        }
        ServiceCenterUiModel serviceCenterUiModel2 = this.f67987f;
        if (serviceCenterUiModel2 != null) {
            str2 = serviceCenterUiModel2.mo49705d();
        } else {
            str2 = null;
        }
        ServiceCenterUiModel serviceCenterUiModel3 = this.f67988g;
        if (serviceCenterUiModel3 != null) {
            str3 = serviceCenterUiModel3.mo49705d();
        }
        return str + ", " + str2 + ", " + str3;
    }

    /* renamed from: i */
    public final ServiceCenterUiModel mo66293i() {
        return this.f67988g;
    }

    /* renamed from: j */
    public final ServiceCenterUiModel mo66294j() {
        return this.f67986e;
    }

    /* renamed from: k */
    public final ServiceCenterUiModel mo66295k() {
        return this.f67987f;
    }

    /* renamed from: l */
    public final String mo66296l() {
        return this.f67984c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d(r4.f67991j, java.lang.Boolean.TRUE) == false) goto L_0x0054;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66297m() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f67982a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = cf1.C40439w.m117118v(r0)
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = r1
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = r4.f67983b
            if (r0 == 0) goto L_0x001f
            boolean r0 = cf1.C40439w.m117118v(r0)
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = r4.f67984c
            if (r0 == 0) goto L_0x002f
            boolean r0 = cf1.C40439w.m117118v(r0)
            if (r0 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = r1
            goto L_0x0030
        L_0x002f:
            r0 = r2
        L_0x0030:
            if (r0 != 0) goto L_0x0050
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r0 = r4.f67985d
            if (r0 == 0) goto L_0x0050
            ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r0 = r4.f67986e
            if (r0 == 0) goto L_0x0050
            ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r0 = r4.f67987f
            if (r0 == 0) goto L_0x0050
            ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r0 = r4.f67988g
            if (r0 == 0) goto L_0x0050
            ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r0 = r4.f67989h
            if (r0 == 0) goto L_0x0050
            java.lang.Boolean r0 = r4.f67991j
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r3)
            if (r0 == 0) goto L_0x0054
        L_0x0050:
            java.lang.Long r0 = r4.f67992k
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r1 = r2
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p847oq.C27057b.mo66297m():boolean");
    }

    /* renamed from: n */
    public final void mo66298n(String str) {
        this.f67982a = str;
    }

    /* renamed from: o */
    public final void mo66299o(String str) {
        this.f67990i = str;
    }

    /* renamed from: p */
    public final void mo66300p(Long l) {
        this.f67992k = l;
    }

    /* renamed from: q */
    public final void mo66301q(String str) {
        this.f67983b = str;
    }

    /* renamed from: r */
    public final void mo66302r(Boolean bool) {
        this.f67991j = bool;
    }

    /* renamed from: s */
    public final void mo66303s(LookupUiModel lookupUiModel) {
        this.f67985d = lookupUiModel;
    }

    /* renamed from: t */
    public final void mo66304t(LookupUiModel lookupUiModel) {
        this.f67989h = lookupUiModel;
    }

    /* renamed from: u */
    public final void mo66305u(ServiceCenterUiModel serviceCenterUiModel) {
        this.f67988g = serviceCenterUiModel;
    }

    /* renamed from: v */
    public final void mo66306v(ServiceCenterUiModel serviceCenterUiModel) {
        this.f67986e = serviceCenterUiModel;
    }

    /* renamed from: w */
    public final void mo66307w(ServiceCenterUiModel serviceCenterUiModel) {
        this.f67987f = serviceCenterUiModel;
    }

    /* renamed from: x */
    public final void mo66308x(String str) {
        this.f67984c = str;
    }

    /* renamed from: y */
    public final C26057b mo66309y() {
        String str = this.f67982a;
        C41536l.m120486f(str);
        String str2 = this.f67983b;
        C41536l.m120486f(str2);
        String str3 = this.f67984c;
        C41536l.m120486f(str3);
        LookupUiModel lookupUiModel = this.f67985d;
        C41536l.m120486f(lookupUiModel);
        ServiceCenterUiModel serviceCenterUiModel = this.f67986e;
        C41536l.m120486f(serviceCenterUiModel);
        ServiceCenterUiModel serviceCenterUiModel2 = this.f67987f;
        C41536l.m120486f(serviceCenterUiModel2);
        ServiceCenterUiModel serviceCenterUiModel3 = this.f67988g;
        C41536l.m120486f(serviceCenterUiModel3);
        LookupUiModel lookupUiModel2 = this.f67989h;
        C41536l.m120486f(lookupUiModel2);
        String str4 = this.f67990i;
        if (str4 == null) {
            str4 = "";
        }
        return new C26057b(str, str2, str3, lookupUiModel, serviceCenterUiModel, serviceCenterUiModel2, serviceCenterUiModel3, lookupUiModel2, str4, C26058c.f66164d, this.f67992k);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C27057b(java.lang.String r13, java.lang.String r14, java.lang.String r15, p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r16, p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r17, p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r18, p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel r19, p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r20, java.lang.String r21, java.lang.Boolean r22, java.lang.Long r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p847oq.C27057b.<init>(java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel, ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel, ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel, ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel, ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel, java.lang.String, java.lang.Boolean, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
