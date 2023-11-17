package p341ge.bog.mobilebank.cleanarch.domain.products.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile */
public final class CardExternalFile implements Parcelable {
    public static final Parcelable.Creator<CardExternalFile> CREATOR = new C21038a();
    private final String fileSubType;
    private final String fileUrl;
    private final boolean isDark;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile$a */
    public static final class C21038a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardExternalFile createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CardExternalFile(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final CardExternalFile[] newArray(int i) {
            return new CardExternalFile[i];
        }
    }

    public CardExternalFile(String str, boolean z, String str2) {
        C41536l.m120489i(str, "fileSubType");
        this.fileSubType = str;
        this.isDark = z;
        this.fileUrl = str2;
    }

    public static /* synthetic */ CardExternalFile copy$default(CardExternalFile cardExternalFile, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardExternalFile.fileSubType;
        }
        if ((i & 2) != 0) {
            z = cardExternalFile.isDark;
        }
        if ((i & 4) != 0) {
            str2 = cardExternalFile.fileUrl;
        }
        return cardExternalFile.copy(str, z, str2);
    }

    public final String component1() {
        return this.fileSubType;
    }

    public final boolean component2() {
        return this.isDark;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final CardExternalFile copy(String str, boolean z, String str2) {
        C41536l.m120489i(str, "fileSubType");
        return new CardExternalFile(str, z, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardExternalFile)) {
            return false;
        }
        CardExternalFile cardExternalFile = (CardExternalFile) obj;
        return C41536l.m120484d(this.fileSubType, cardExternalFile.fileSubType) && this.isDark == cardExternalFile.isDark && C41536l.m120484d(this.fileUrl, cardExternalFile.fileUrl);
    }

    public final String getFileSubType() {
        return this.fileSubType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public int hashCode() {
        int hashCode = this.fileSubType.hashCode() * 31;
        boolean z = this.isDark;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.fileUrl;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isDark() {
        return this.isDark;
    }

    public String toString() {
        String str = this.fileSubType;
        boolean z = this.isDark;
        String str2 = this.fileUrl;
        return "CardExternalFile(fileSubType=" + str + ", isDark=" + z + ", fileUrl=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.fileSubType);
        parcel.writeInt(this.isDark ? 1 : 0);
        parcel.writeString(this.fileUrl);
    }
}
