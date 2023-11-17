package p341ge.bog.mobilebank.qrwithdrawal.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData */
public final class CardExternalFileData implements Parcelable {
    public static final Parcelable.Creator<CardExternalFileData> CREATOR = new C34428a();

    /* renamed from: d */
    private final String f83427d;

    /* renamed from: e */
    private final boolean f83428e;

    /* renamed from: f */
    private final String f83429f;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData$a */
    public static final class C34428a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardExternalFileData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardExternalFileData(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final CardExternalFileData[] newArray(int i) {
            return new CardExternalFileData[i];
        }
    }

    public CardExternalFileData(String str, boolean z, String str2) {
        this.f83427d = str;
        this.f83428e = z;
        this.f83429f = str2;
    }

    /* renamed from: a */
    public final String mo82971a() {
        return this.f83429f;
    }

    /* renamed from: b */
    public final boolean mo82972b() {
        return this.f83428e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExternalFileData)) {
            return false;
        }
        CardExternalFileData cardExternalFileData = (CardExternalFileData) obj;
        return C41536l.m120484d(this.f83427d, cardExternalFileData.f83427d) && this.f83428e == cardExternalFileData.f83428e && C41536l.m120484d(this.f83429f, cardExternalFileData.f83429f);
    }

    public int hashCode() {
        String str = this.f83427d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f83428e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.f83429f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.f83427d;
        boolean z = this.f83428e;
        String str2 = this.f83429f;
        return "CardExternalFileData(fileType=" + str + ", isDark=" + z + ", fileUrl=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83427d);
        parcel.writeInt(this.f83428e ? 1 : 0);
        parcel.writeString(this.f83429f);
    }
}
