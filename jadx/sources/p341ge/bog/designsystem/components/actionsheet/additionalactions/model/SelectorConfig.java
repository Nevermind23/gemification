package p341ge.bog.designsystem.components.actionsheet.additionalactions.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig */
public final class SelectorConfig implements Parcelable {
    public static final Parcelable.Creator<SelectorConfig> CREATOR = new C13158a();

    /* renamed from: d */
    private final String f38763d;

    /* renamed from: e */
    private final boolean f38764e;

    /* renamed from: f */
    private final String f38765f;

    /* renamed from: g */
    private final boolean f38766g;

    /* renamed from: h */
    private final boolean f38767h;

    /* renamed from: i */
    private final String f38768i;

    /* renamed from: j */
    private final String f38769j;

    /* renamed from: k */
    private final boolean f38770k;

    /* renamed from: l */
    private final boolean f38771l;

    /* renamed from: ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig$a */
    public static final class C13158a implements Parcelable.Creator {
        /* renamed from: a */
        public final SelectorConfig createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SelectorConfig(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final SelectorConfig[] newArray(int i) {
            return new SelectorConfig[i];
        }
    }

    public SelectorConfig(String str, boolean z, String str2, boolean z2, boolean z3, String str3, String str4, boolean z4, boolean z5) {
        C41536l.m120489i(str4, "requestKey");
        this.f38763d = str;
        this.f38764e = z;
        this.f38765f = str2;
        this.f38766g = z2;
        this.f38767h = z3;
        this.f38768i = str3;
        this.f38769j = str4;
        this.f38770k = z4;
        this.f38771l = z5;
    }

    /* renamed from: a */
    public final String mo34784a() {
        return this.f38768i;
    }

    /* renamed from: b */
    public final boolean mo34785b() {
        return this.f38771l;
    }

    /* renamed from: d */
    public final String mo34786d() {
        return this.f38765f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo34788e() {
        return this.f38770k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectorConfig)) {
            return false;
        }
        SelectorConfig selectorConfig = (SelectorConfig) obj;
        return C41536l.m120484d(this.f38763d, selectorConfig.f38763d) && this.f38764e == selectorConfig.f38764e && C41536l.m120484d(this.f38765f, selectorConfig.f38765f) && this.f38766g == selectorConfig.f38766g && this.f38767h == selectorConfig.f38767h && C41536l.m120484d(this.f38768i, selectorConfig.f38768i) && C41536l.m120484d(this.f38769j, selectorConfig.f38769j) && this.f38770k == selectorConfig.f38770k && this.f38771l == selectorConfig.f38771l;
    }

    /* renamed from: f */
    public final boolean mo34790f() {
        return this.f38766g;
    }

    /* renamed from: g */
    public final String mo34791g() {
        return this.f38769j;
    }

    /* renamed from: h */
    public final String mo34792h() {
        return this.f38763d;
    }

    public int hashCode() {
        String str = this.f38763d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f38764e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f38765f;
        int hashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z3 = this.f38766g;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f38767h;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        String str3 = this.f38768i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int hashCode3 = (((i4 + i) * 31) + this.f38769j.hashCode()) * 31;
        boolean z5 = this.f38770k;
        if (z5) {
            z5 = true;
        }
        int i5 = (hashCode3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f38771l;
        if (!z6) {
            z2 = z6;
        }
        return i5 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo34794i() {
        return this.f38764e;
    }

    /* renamed from: j */
    public final boolean mo34795j() {
        return this.f38767h || this.f38766g;
    }

    public String toString() {
        String str = this.f38763d;
        boolean z = this.f38764e;
        String str2 = this.f38765f;
        boolean z2 = this.f38766g;
        boolean z3 = this.f38767h;
        String str3 = this.f38768i;
        String str4 = this.f38769j;
        boolean z4 = this.f38770k;
        boolean z5 = this.f38771l;
        return "SelectorConfig(title=" + str + ", withSearch=" + z + ", hintText=" + str2 + ", multipleChoice=" + z2 + ", withConfirmButton=" + z3 + ", confirmButtonText=" + str3 + ", requestKey=" + str4 + ", multilineText=" + z4 + ", hasDivider=" + z5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f38763d);
        parcel.writeInt(this.f38764e ? 1 : 0);
        parcel.writeString(this.f38765f);
        parcel.writeInt(this.f38766g ? 1 : 0);
        parcel.writeInt(this.f38767h ? 1 : 0);
        parcel.writeString(this.f38768i);
        parcel.writeString(this.f38769j);
        parcel.writeInt(this.f38770k ? 1 : 0);
        parcel.writeInt(this.f38771l ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SelectorConfig(java.lang.String r10, boolean r11, java.lang.String r12, boolean r13, boolean r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0011
            r3 = r4
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0018
            r5 = r2
            goto L_0x0019
        L_0x0018:
            r5 = r13
        L_0x0019:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x001f
            r6 = r2
            goto L_0x0020
        L_0x001f:
            r6 = r14
        L_0x0020:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = r15
        L_0x0026:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x002d
            java.lang.String r7 = "SELECTOR_REQUEST_KEY"
            goto L_0x002f
        L_0x002d:
            r7 = r16
        L_0x002f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r17
        L_0x0037:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = r18
        L_0x003e:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r3
            r15 = r5
            r16 = r6
            r17 = r4
            r18 = r7
            r19 = r8
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig.<init>(java.lang.String, boolean, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
