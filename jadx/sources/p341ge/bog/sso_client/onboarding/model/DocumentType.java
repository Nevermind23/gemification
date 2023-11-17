package p341ge.bog.sso_client.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.onboarding.model.DocumentType */
public final class DocumentType implements Parcelable {
    public static final Parcelable.Creator<DocumentType> CREATOR = new C35985a();

    /* renamed from: d */
    private final Integer f87056d;

    /* renamed from: e */
    private final String f87057e;

    /* renamed from: f */
    private final String f87058f;

    /* renamed from: g */
    private final String f87059g;

    /* renamed from: h */
    private final String f87060h;

    /* renamed from: i */
    private final List f87061i;

    /* renamed from: j */
    private final String f87062j;

    /* renamed from: k */
    private final String f87063k;

    /* renamed from: l */
    private final String f87064l;

    /* renamed from: m */
    private final String f87065m;

    /* renamed from: n */
    private final String f87066n;

    /* renamed from: o */
    private final String f87067o;

    /* renamed from: p */
    private final String f87068p;

    /* renamed from: q */
    private final String f87069q;

    /* renamed from: r */
    private final String f87070r;

    /* renamed from: ge.bog.sso_client.onboarding.model.DocumentType$a */
    public static final class C35985a implements Parcelable.Creator {
        /* renamed from: a */
        public final DocumentType createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DocumentType(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DocumentType[] newArray(int i) {
            return new DocumentType[i];
        }
    }

    public DocumentType(Integer num, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        C41536l.m120489i(str, "dctKey");
        C41536l.m120489i(list, "processFlow");
        this.f87056d = num;
        this.f87057e = str;
        this.f87058f = str2;
        this.f87059g = str3;
        this.f87060h = str4;
        this.f87061i = list;
        this.f87062j = str5;
        this.f87063k = str6;
        this.f87064l = str7;
        this.f87065m = str8;
        this.f87066n = str9;
        this.f87067o = str10;
        this.f87068p = str11;
        this.f87069q = str12;
        this.f87070r = str13;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentType)) {
            return false;
        }
        DocumentType documentType = (DocumentType) obj;
        return C41536l.m120484d(this.f87056d, documentType.f87056d) && C41536l.m120484d(this.f87057e, documentType.f87057e) && C41536l.m120484d(this.f87058f, documentType.f87058f) && C41536l.m120484d(this.f87059g, documentType.f87059g) && C41536l.m120484d(this.f87060h, documentType.f87060h) && C41536l.m120484d(this.f87061i, documentType.f87061i) && C41536l.m120484d(this.f87062j, documentType.f87062j) && C41536l.m120484d(this.f87063k, documentType.f87063k) && C41536l.m120484d(this.f87064l, documentType.f87064l) && C41536l.m120484d(this.f87065m, documentType.f87065m) && C41536l.m120484d(this.f87066n, documentType.f87066n) && C41536l.m120484d(this.f87067o, documentType.f87067o) && C41536l.m120484d(this.f87068p, documentType.f87068p) && C41536l.m120484d(this.f87069q, documentType.f87069q) && C41536l.m120484d(this.f87070r, documentType.f87070r);
    }

    public int hashCode() {
        Integer num = this.f87056d;
        int i = 0;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.f87057e.hashCode()) * 31;
        String str = this.f87058f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f87059g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f87060h;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f87061i.hashCode()) * 31;
        String str4 = this.f87062j;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f87063k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f87064l;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f87065m;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f87066n;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f87067o;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f87068p;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f87069q;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f87070r;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        return "DocumentType(id=" + this.f87056d + ", dctKey=" + this.f87057e + ", orderNo=" + this.f87058f + ", docType=" + this.f87059g + ", docType2=" + this.f87060h + ", processFlow=" + this.f87061i + ", frontFaceExplanationImageURL=" + this.f87062j + ", backFaceExplanationImageURL=" + this.f87063k + ", selfieExplanationImageURL=" + this.f87064l + ", frontFaceHeaderTextDctKey=" + this.f87065m + ", frontFaceBodyTextDctKey=" + this.f87066n + ", backFaceHeaderTextDctKey=" + this.f87067o + ", backFaceBodyTextDctKey=" + this.f87068p + ", selfieHeaderTextDctKey=" + this.f87069q + ", selfieBodyTextDctKey=" + this.f87070r + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        Integer num = this.f87056d;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f87057e);
        parcel.writeString(this.f87058f);
        parcel.writeString(this.f87059g);
        parcel.writeString(this.f87060h);
        parcel.writeStringList(this.f87061i);
        parcel.writeString(this.f87062j);
        parcel.writeString(this.f87063k);
        parcel.writeString(this.f87064l);
        parcel.writeString(this.f87065m);
        parcel.writeString(this.f87066n);
        parcel.writeString(this.f87067o);
        parcel.writeString(this.f87068p);
        parcel.writeString(this.f87069q);
        parcel.writeString(this.f87070r);
    }
}
