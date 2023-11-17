package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.PrloTicketUiModel */
public final class PrloTicketUiModel implements Parcelable {
    public static final Parcelable.Creator<PrloTicketUiModel> CREATOR = new C21148a();

    /* renamed from: d */
    private final Long f56808d;

    /* renamed from: e */
    private final Long f56809e;

    /* renamed from: f */
    private final String f56810f;

    /* renamed from: g */
    private final String f56811g;

    /* renamed from: h */
    private final Long f56812h;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.PrloTicketUiModel$a */
    public static final class C21148a implements Parcelable.Creator {
        /* renamed from: a */
        public final PrloTicketUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PrloTicketUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* renamed from: b */
        public final PrloTicketUiModel[] newArray(int i) {
            return new PrloTicketUiModel[i];
        }
    }

    public PrloTicketUiModel(Long l, Long l2, String str, String str2, Long l3) {
        this.f56808d = l;
        this.f56809e = l2;
        this.f56810f = str;
        this.f56811g = str2;
        this.f56812h = l3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrloTicketUiModel)) {
            return false;
        }
        PrloTicketUiModel prloTicketUiModel = (PrloTicketUiModel) obj;
        return C41536l.m120484d(this.f56808d, prloTicketUiModel.f56808d) && C41536l.m120484d(this.f56809e, prloTicketUiModel.f56809e) && C41536l.m120484d(this.f56810f, prloTicketUiModel.f56810f) && C41536l.m120484d(this.f56811g, prloTicketUiModel.f56811g) && C41536l.m120484d(this.f56812h, prloTicketUiModel.f56812h);
    }

    public int hashCode() {
        Long l = this.f56808d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f56809e;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f56810f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56811g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.f56812h;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.f56808d;
        Long l2 = this.f56809e;
        String str = this.f56810f;
        String str2 = this.f56811g;
        Long l3 = this.f56812h;
        return "PrloTicketUiModel(id=" + l + ", clientKey=" + l2 + ", ticketNo=" + str + ", status=" + str2 + ", runDate=" + l3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f56808d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f56809e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.f56810f);
        parcel.writeString(this.f56811g);
        Long l3 = this.f56812h;
        if (l3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l3.longValue());
    }
}
