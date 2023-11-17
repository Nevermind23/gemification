package p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile */
public final class TransferExternalFile implements Parcelable {
    public static final Parcelable.Creator<TransferExternalFile> CREATOR = new C21045a();

    /* renamed from: d */
    private final boolean f56539d;

    /* renamed from: e */
    private final String f56540e;

    /* renamed from: ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile$a */
    public static final class C21045a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransferExternalFile createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new TransferExternalFile(parcel.readInt() != 0, parcel.readString());
        }

        /* renamed from: b */
        public final TransferExternalFile[] newArray(int i) {
            return new TransferExternalFile[i];
        }
    }

    public TransferExternalFile(boolean z, String str) {
        this.f56539d = z;
        this.f56540e = str;
    }

    /* renamed from: a */
    public final String mo52204a() {
        return this.f56540e;
    }

    /* renamed from: b */
    public final boolean mo52205b() {
        return this.f56539d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferExternalFile)) {
            return false;
        }
        TransferExternalFile transferExternalFile = (TransferExternalFile) obj;
        return this.f56539d == transferExternalFile.f56539d && C41536l.m120484d(this.f56540e, transferExternalFile.f56540e);
    }

    public int hashCode() {
        boolean z = this.f56539d;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f56540e;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.f56539d;
        String str = this.f56540e;
        return "TransferExternalFile(isDark=" + z + ", fileUrl=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f56539d ? 1 : 0);
        parcel.writeString(this.f56540e);
    }
}
