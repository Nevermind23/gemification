package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes;

import android.os.Parcel;
import android.os.Parcelable;
import g90.C20781c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData */
public final class FormData implements Parcelable {
    public static final Parcelable.Creator<FormData> CREATOR = new C22668a();

    /* renamed from: d */
    private final String f59819d;

    /* renamed from: e */
    private final String f59820e;

    /* renamed from: f */
    private final C20781c f59821f;

    /* renamed from: g */
    private final boolean f59822g;

    /* renamed from: h */
    private final IncomeType f59823h;

    /* renamed from: i */
    private final LookupUiModel f59824i;

    /* renamed from: j */
    private String f59825j;

    /* renamed from: k */
    private String f59826k;

    /* renamed from: l */
    private String f59827l;

    /* renamed from: m */
    private String f59828m;

    /* renamed from: n */
    private String f59829n;

    /* renamed from: o */
    private LookupUiModel f59830o;

    /* renamed from: p */
    private String f59831p;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData$a */
    public static final class C22668a implements Parcelable.Creator {
        /* renamed from: a */
        public final FormData createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            Class<FormData> cls = FormData.class;
            return new FormData(parcel.readString(), parcel.readString(), C20781c.valueOf(parcel.readString()), parcel.readInt() != 0, (IncomeType) parcel2.readParcelable(cls.getClassLoader()), (LookupUiModel) parcel2.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LookupUiModel) parcel2.readParcelable(cls.getClassLoader()), parcel.readString());
        }

        /* renamed from: b */
        public final FormData[] newArray(int i) {
            return new FormData[i];
        }
    }

    public FormData(String str, String str2, C20781c cVar, boolean z, IncomeType incomeType, LookupUiModel lookupUiModel, String str3, String str4, String str5, String str6, String str7, LookupUiModel lookupUiModel2, String str8) {
        C41536l.m120489i(str2, "localId");
        C41536l.m120489i(cVar, "editMode");
        this.f59819d = str;
        this.f59820e = str2;
        this.f59821f = cVar;
        this.f59822g = z;
        this.f59823h = incomeType;
        this.f59824i = lookupUiModel;
        this.f59825j = str3;
        this.f59826k = str4;
        this.f59827l = str5;
        this.f59828m = str6;
        this.f59829n = str7;
        this.f59830o = lookupUiModel2;
        this.f59831p = str8;
    }

    /* renamed from: a */
    public final String mo56084a() {
        return this.f59825j;
    }

    /* renamed from: b */
    public final String mo56085b() {
        return this.f59831p;
    }

    /* renamed from: d */
    public final String mo56086d() {
        return this.f59819d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56088e() {
        return this.f59826k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormData)) {
            return false;
        }
        FormData formData = (FormData) obj;
        return C41536l.m120484d(this.f59819d, formData.f59819d) && C41536l.m120484d(this.f59820e, formData.f59820e) && this.f59821f == formData.f59821f && this.f59822g == formData.f59822g && C41536l.m120484d(this.f59823h, formData.f59823h) && C41536l.m120484d(this.f59824i, formData.f59824i) && C41536l.m120484d(this.f59825j, formData.f59825j) && C41536l.m120484d(this.f59826k, formData.f59826k) && C41536l.m120484d(this.f59827l, formData.f59827l) && C41536l.m120484d(this.f59828m, formData.f59828m) && C41536l.m120484d(this.f59829n, formData.f59829n) && C41536l.m120484d(this.f59830o, formData.f59830o) && C41536l.m120484d(this.f59831p, formData.f59831p);
    }

    /* renamed from: f */
    public final C20781c mo56090f() {
        return this.f59821f;
    }

    /* renamed from: g */
    public final IncomeType mo56091g() {
        return this.f59823h;
    }

    /* renamed from: h */
    public final LookupUiModel mo56092h() {
        return this.f59824i;
    }

    public int hashCode() {
        String str = this.f59819d;
        int i = 0;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.f59820e.hashCode()) * 31) + this.f59821f.hashCode()) * 31;
        boolean z = this.f59822g;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        IncomeType incomeType = this.f59823h;
        int hashCode2 = (i2 + (incomeType == null ? 0 : incomeType.hashCode())) * 31;
        LookupUiModel lookupUiModel = this.f59824i;
        int hashCode3 = (hashCode2 + (lookupUiModel == null ? 0 : lookupUiModel.hashCode())) * 31;
        String str2 = this.f59825j;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59826k;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59827l;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59828m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59829n;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LookupUiModel lookupUiModel2 = this.f59830o;
        int hashCode9 = (hashCode8 + (lookupUiModel2 == null ? 0 : lookupUiModel2.hashCode())) * 31;
        String str7 = this.f59831p;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final LookupUiModel mo56094i() {
        return this.f59830o;
    }

    /* renamed from: j */
    public final String mo56095j() {
        return this.f59820e;
    }

    /* renamed from: k */
    public final String mo56096k() {
        return this.f59829n;
    }

    /* renamed from: l */
    public final String mo56097l() {
        return this.f59828m;
    }

    /* renamed from: m */
    public final String mo56098m() {
        return this.f59827l;
    }

    /* renamed from: p */
    public final boolean mo56099p() {
        return this.f59822g;
    }

    /* renamed from: q */
    public final void mo56100q(String str) {
        this.f59825j = str;
    }

    /* renamed from: r */
    public final void mo56101r(String str) {
        this.f59831p = str;
    }

    /* renamed from: s */
    public final void mo56102s(String str) {
        this.f59826k = str;
    }

    /* renamed from: t */
    public final void mo56103t(LookupUiModel lookupUiModel) {
        this.f59830o = lookupUiModel;
    }

    public String toString() {
        String str = this.f59819d;
        String str2 = this.f59820e;
        C20781c cVar = this.f59821f;
        boolean z = this.f59822g;
        IncomeType incomeType = this.f59823h;
        LookupUiModel lookupUiModel = this.f59824i;
        String str3 = this.f59825j;
        String str4 = this.f59826k;
        String str5 = this.f59827l;
        String str6 = this.f59828m;
        String str7 = this.f59829n;
        LookupUiModel lookupUiModel2 = this.f59830o;
        String str8 = this.f59831p;
        return "FormData(criId=" + str + ", localId=" + str2 + ", editMode=" + cVar + ", isRemovable=" + z + ", incomeType=" + incomeType + ", incomeTypeLookup=" + lookupUiModel + ", amount=" + str3 + ", currency=" + str4 + ", organizationName=" + str5 + ", organizationIdentificationCode=" + str6 + ", organizationAddress=" + str7 + ", jobPosition=" + lookupUiModel2 + ", country=" + str8 + ")";
    }

    /* renamed from: u */
    public final void mo56105u(String str) {
        this.f59829n = str;
    }

    /* renamed from: v */
    public final void mo56106v(String str) {
        this.f59828m = str;
    }

    /* renamed from: w */
    public final void mo56107w(String str) {
        this.f59827l = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f59819d);
        parcel.writeString(this.f59820e);
        parcel.writeString(this.f59821f.name());
        parcel.writeInt(this.f59822g ? 1 : 0);
        parcel.writeParcelable(this.f59823h, i);
        parcel.writeParcelable(this.f59824i, i);
        parcel.writeString(this.f59825j);
        parcel.writeString(this.f59826k);
        parcel.writeString(this.f59827l);
        parcel.writeString(this.f59828m);
        parcel.writeString(this.f59829n);
        parcel.writeParcelable(this.f59830o, i);
        parcel.writeString(this.f59831p);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FormData(java.lang.String r18, java.lang.String r19, g90.C20781c r20, boolean r21, p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType r22, p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r18
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0012
            r1 = 1
            r7 = r1
            goto L_0x0014
        L_0x0012:
            r7 = r21
        L_0x0014:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            r8 = r2
            goto L_0x001c
        L_0x001a:
            r8 = r22
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r9 = r2
            goto L_0x0024
        L_0x0022:
            r9 = r23
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r10 = r2
            goto L_0x002c
        L_0x002a:
            r10 = r24
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0032
            r11 = r2
            goto L_0x0034
        L_0x0032:
            r11 = r25
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r12 = r2
            goto L_0x003c
        L_0x003a:
            r12 = r26
        L_0x003c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r13 = r2
            goto L_0x0044
        L_0x0042:
            r13 = r27
        L_0x0044:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004a
            r14 = r2
            goto L_0x004c
        L_0x004a:
            r14 = r28
        L_0x004c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r15 = r2
            goto L_0x0054
        L_0x0052:
            r15 = r29
        L_0x0054:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x005b
            r16 = r2
            goto L_0x005d
        L_0x005b:
            r16 = r30
        L_0x005d:
            r3 = r17
            r5 = r19
            r6 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData.<init>(java.lang.String, java.lang.String, g90.c, boolean, ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType, ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
