package p341ge.bog.mobilebank.payments.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.payments.domain.model.CardImage */
public final class CardImage implements Parcelable {
    public static final Parcelable.Creator<CardImage> CREATOR = new C33627a();

    /* renamed from: d */
    private final Long f81976d;

    /* renamed from: e */
    private final String f81977e;

    /* renamed from: f */
    private final String f81978f;

    /* renamed from: g */
    private final String f81979g;

    /* renamed from: h */
    private final String f81980h;

    /* renamed from: i */
    private final String f81981i;

    /* renamed from: j */
    private final boolean f81982j;

    /* renamed from: k */
    private final String f81983k;

    /* renamed from: l */
    private final String f81984l;

    /* renamed from: m */
    private final String f81985m;

    /* renamed from: ge.bog.mobilebank.payments.domain.model.CardImage$a */
    public static final class C33627a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardImage createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardImage(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CardImage[] newArray(int i) {
            return new CardImage[i];
        }
    }

    public CardImage(Long l, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8) {
        this.f81976d = l;
        this.f81977e = str;
        this.f81978f = str2;
        this.f81979g = str3;
        this.f81980h = str4;
        this.f81981i = str5;
        this.f81982j = z;
        this.f81983k = str6;
        this.f81984l = str7;
        this.f81985m = str8;
    }

    /* renamed from: a */
    public final String mo80115a() {
        return this.f81985m;
    }

    /* renamed from: b */
    public final boolean mo80116b() {
        return this.f81982j;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardImage)) {
            return false;
        }
        CardImage cardImage = (CardImage) obj;
        return C41536l.m120484d(this.f81976d, cardImage.f81976d) && C41536l.m120484d(this.f81977e, cardImage.f81977e) && C41536l.m120484d(this.f81978f, cardImage.f81978f) && C41536l.m120484d(this.f81979g, cardImage.f81979g) && C41536l.m120484d(this.f81980h, cardImage.f81980h) && C41536l.m120484d(this.f81981i, cardImage.f81981i) && this.f81982j == cardImage.f81982j && C41536l.m120484d(this.f81983k, cardImage.f81983k) && C41536l.m120484d(this.f81984l, cardImage.f81984l) && C41536l.m120484d(this.f81985m, cardImage.f81985m);
    }

    public int hashCode() {
        Long l = this.f81976d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f81977e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81978f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81979g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81980h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f81981i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.f81982j;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str6 = this.f81983k;
        int hashCode7 = (i2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f81984l;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f81985m;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Long l = this.f81976d;
        String str = this.f81977e;
        String str2 = this.f81978f;
        String str3 = this.f81979g;
        String str4 = this.f81980h;
        String str5 = this.f81981i;
        boolean z = this.f81982j;
        String str6 = this.f81983k;
        String str7 = this.f81984l;
        String str8 = this.f81985m;
        return "CardImage(id=" + l + ", channelCode=" + str + ", languageCode=" + str2 + ", fileType=" + str3 + ", fileSubType=" + str4 + ", extFileId=" + str5 + ", isDark=" + z + ", customerType=" + str6 + ", darkMode=" + str7 + ", fileUrl=" + str8 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f81976d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f81977e);
        parcel.writeString(this.f81978f);
        parcel.writeString(this.f81979g);
        parcel.writeString(this.f81980h);
        parcel.writeString(this.f81981i);
        parcel.writeInt(this.f81982j ? 1 : 0);
        parcel.writeString(this.f81983k);
        parcel.writeString(this.f81984l);
        parcel.writeString(this.f81985m);
    }
}
