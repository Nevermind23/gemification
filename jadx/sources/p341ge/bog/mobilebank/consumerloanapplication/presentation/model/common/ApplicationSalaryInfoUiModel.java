package p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ApplicationSalaryInfoUiModel */
public final class ApplicationSalaryInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ApplicationSalaryInfoUiModel> CREATOR = new C22677a();

    /* renamed from: d */
    private final String f59860d;

    /* renamed from: e */
    private final String f59861e;

    /* renamed from: f */
    private final String f59862f;

    /* renamed from: g */
    private final String f59863g;

    /* renamed from: h */
    private final String f59864h;

    /* renamed from: i */
    private final String f59865i;

    /* renamed from: j */
    private final String f59866j;

    /* renamed from: k */
    private final String f59867k;

    /* renamed from: l */
    private final String f59868l;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ApplicationSalaryInfoUiModel$a */
    public static final class C22677a implements Parcelable.Creator {
        /* renamed from: a */
        public final ApplicationSalaryInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ApplicationSalaryInfoUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ApplicationSalaryInfoUiModel[] newArray(int i) {
            return new ApplicationSalaryInfoUiModel[i];
        }
    }

    public ApplicationSalaryInfoUiModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final String mo56171a() {
        return this.f59861e;
    }

    /* renamed from: b */
    public final String mo56172b() {
        return this.f59867k;
    }

    /* renamed from: d */
    public final String mo56173d() {
        return this.f59862f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56175e() {
        return this.f59863g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationSalaryInfoUiModel)) {
            return false;
        }
        ApplicationSalaryInfoUiModel applicationSalaryInfoUiModel = (ApplicationSalaryInfoUiModel) obj;
        return C41536l.m120484d(this.f59860d, applicationSalaryInfoUiModel.f59860d) && C41536l.m120484d(this.f59861e, applicationSalaryInfoUiModel.f59861e) && C41536l.m120484d(this.f59862f, applicationSalaryInfoUiModel.f59862f) && C41536l.m120484d(this.f59863g, applicationSalaryInfoUiModel.f59863g) && C41536l.m120484d(this.f59864h, applicationSalaryInfoUiModel.f59864h) && C41536l.m120484d(this.f59865i, applicationSalaryInfoUiModel.f59865i) && C41536l.m120484d(this.f59866j, applicationSalaryInfoUiModel.f59866j) && C41536l.m120484d(this.f59867k, applicationSalaryInfoUiModel.f59867k) && C41536l.m120484d(this.f59868l, applicationSalaryInfoUiModel.f59868l);
    }

    /* renamed from: f */
    public final String mo56177f() {
        return this.f59866j;
    }

    /* renamed from: g */
    public final String mo56178g() {
        return this.f59868l;
    }

    public int hashCode() {
        String str = this.f59860d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59861e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59862f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59863g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59864h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59865i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59866j;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f59867k;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f59868l;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        String str = this.f59860d;
        String str2 = this.f59861e;
        String str3 = this.f59862f;
        String str4 = this.f59863g;
        String str5 = this.f59864h;
        String str6 = this.f59865i;
        String str7 = this.f59866j;
        String str8 = this.f59867k;
        String str9 = this.f59868l;
        return "ApplicationSalaryInfoUiModel(sourceOfIncome=" + str + ", amount=" + str2 + ", currency=" + str3 + ", organization=" + str4 + ", organizationInn=" + str5 + ", organizationAddress=" + str6 + ", position=" + str7 + ", comment=" + str8 + ", sourceOfIncomeDictionaryKey=" + str9 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f59860d);
        parcel.writeString(this.f59861e);
        parcel.writeString(this.f59862f);
        parcel.writeString(this.f59863g);
        parcel.writeString(this.f59864h);
        parcel.writeString(this.f59865i);
        parcel.writeString(this.f59866j);
        parcel.writeString(this.f59867k);
        parcel.writeString(this.f59868l);
    }

    public ApplicationSalaryInfoUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f59860d = str;
        this.f59861e = str2;
        this.f59862f = str3;
        this.f59863g = str4;
        this.f59864h = str5;
        this.f59865i = str6;
        this.f59866j = str7;
        this.f59867k = str8;
        this.f59868l = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplicationSalaryInfoUiModel(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.presentation.model.common.ApplicationSalaryInfoUiModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
