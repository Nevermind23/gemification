package p341ge.bog.mobilebank.shared2.network.models;

import java.io.IOException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.shared2.network.models.BffApiError */
public final class BffApiError extends IOException {

    /* renamed from: d */
    private final String f83831d;

    /* renamed from: e */
    private final String f83832e;

    /* renamed from: f */
    private final String f83833f;

    /* renamed from: g */
    private final String f83834g;

    /* renamed from: h */
    private final String f83835h;

    public BffApiError() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final String mo84715a() {
        return this.f83831d;
    }

    /* renamed from: b */
    public final String mo84716b() {
        return this.f83835h;
    }

    /* renamed from: c */
    public final String mo84717c() {
        return this.f83832e;
    }

    /* renamed from: d */
    public final String mo84718d() {
        return this.f83834g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffApiError)) {
            return false;
        }
        BffApiError bffApiError = (BffApiError) obj;
        return C41536l.m120484d(this.f83831d, bffApiError.f83831d) && C41536l.m120484d(this.f83832e, bffApiError.f83832e) && C41536l.m120484d(this.f83833f, bffApiError.f83833f) && C41536l.m120484d(this.f83834g, bffApiError.f83834g) && C41536l.m120484d(this.f83835h, bffApiError.f83835h);
    }

    public int hashCode() {
        String str = this.f83831d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83832e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83833f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f83834g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f83835h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f83831d;
        String str2 = this.f83832e;
        String str3 = this.f83833f;
        String str4 = this.f83834g;
        String str5 = this.f83835h;
        return "BffApiError(code=" + str + ", name=" + str2 + ", context=" + str3 + ", value=" + str4 + ", key=" + str5 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BffApiError(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared2.network.models.BffApiError.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public BffApiError(String str, String str2, String str3, String str4, String str5) {
        this.f83831d = str;
        this.f83832e = str2;
        this.f83833f = str3;
        this.f83834g = str4;
        this.f83835h = str5;
    }
}
