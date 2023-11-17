package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel */
public final class ScoolCardOwnerUiModel implements Parcelable {
    public static final Parcelable.Creator<ScoolCardOwnerUiModel> CREATOR = new C14233a();

    /* renamed from: d */
    private final long f41793d;

    /* renamed from: e */
    private final String f41794e;

    /* renamed from: f */
    private final String f41795f;

    /* renamed from: g */
    private final String f41796g;

    /* renamed from: h */
    private final String f41797h;

    /* renamed from: i */
    private final long f41798i;

    /* renamed from: j */
    private final String f41799j;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel$a */
    public static final class C14233a implements Parcelable.Creator {
        /* renamed from: a */
        public final ScoolCardOwnerUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ScoolCardOwnerUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* renamed from: b */
        public final ScoolCardOwnerUiModel[] newArray(int i) {
            return new ScoolCardOwnerUiModel[i];
        }
    }

    public ScoolCardOwnerUiModel(long j, String str, String str2, String str3, String str4, long j2, String str5) {
        C41536l.m120489i(str, "firstName");
        C41536l.m120489i(str2, "lastName");
        C41536l.m120489i(str3, "firstNameInt");
        C41536l.m120489i(str4, "lastNameInt");
        C41536l.m120489i(str5, "pin");
        this.f41793d = j;
        this.f41794e = str;
        this.f41795f = str2;
        this.f41796g = str3;
        this.f41797h = str4;
        this.f41798i = j2;
        this.f41799j = str5;
    }

    /* renamed from: a */
    public final long mo39856a() {
        return this.f41793d;
    }

    /* renamed from: b */
    public final String mo39857b() {
        return this.f41796g;
    }

    /* renamed from: d */
    public final String mo39858d() {
        return this.f41797h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo39860e() {
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)) {
            String str = this.f41794e;
            String str2 = this.f41795f;
            return str + " " + str2;
        }
        String str3 = this.f41796g;
        String str4 = this.f41797h;
        return str3 + " " + str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoolCardOwnerUiModel)) {
            return false;
        }
        ScoolCardOwnerUiModel scoolCardOwnerUiModel = (ScoolCardOwnerUiModel) obj;
        return this.f41793d == scoolCardOwnerUiModel.f41793d && C41536l.m120484d(this.f41794e, scoolCardOwnerUiModel.f41794e) && C41536l.m120484d(this.f41795f, scoolCardOwnerUiModel.f41795f) && C41536l.m120484d(this.f41796g, scoolCardOwnerUiModel.f41796g) && C41536l.m120484d(this.f41797h, scoolCardOwnerUiModel.f41797h) && this.f41798i == scoolCardOwnerUiModel.f41798i && C41536l.m120484d(this.f41799j, scoolCardOwnerUiModel.f41799j);
    }

    public int hashCode() {
        return (((((((((((C7397t.m28148a(this.f41793d) * 31) + this.f41794e.hashCode()) * 31) + this.f41795f.hashCode()) * 31) + this.f41796g.hashCode()) * 31) + this.f41797h.hashCode()) * 31) + C7397t.m28148a(this.f41798i)) * 31) + this.f41799j.hashCode();
    }

    public String toString() {
        long j = this.f41793d;
        String str = this.f41794e;
        String str2 = this.f41795f;
        String str3 = this.f41796g;
        String str4 = this.f41797h;
        long j2 = this.f41798i;
        String str5 = this.f41799j;
        return "ScoolCardOwnerUiModel(childClientKey=" + j + ", firstName=" + str + ", lastName=" + str2 + ", firstNameInt=" + str3 + ", lastNameInt=" + str4 + ", birthDate=" + j2 + ", pin=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41793d);
        parcel.writeString(this.f41794e);
        parcel.writeString(this.f41795f);
        parcel.writeString(this.f41796g);
        parcel.writeString(this.f41797h);
        parcel.writeLong(this.f41798i);
        parcel.writeString(this.f41799j);
    }
}
