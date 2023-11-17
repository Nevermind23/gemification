package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.PrloTicketWrapperUiModel */
public final class PrloTicketWrapperUiModel implements Parcelable {
    public static final Parcelable.Creator<PrloTicketWrapperUiModel> CREATOR = new C21149a();

    /* renamed from: d */
    private final long f56813d;

    /* renamed from: e */
    private final int f56814e;

    /* renamed from: f */
    private final List f56815f;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.PrloTicketWrapperUiModel$a */
    public static final class C21149a implements Parcelable.Creator {
        /* renamed from: a */
        public final PrloTicketWrapperUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(PrloTicketUiModel.CREATOR.createFromParcel(parcel));
            }
            return new PrloTicketWrapperUiModel(readLong, readInt, arrayList);
        }

        /* renamed from: b */
        public final PrloTicketWrapperUiModel[] newArray(int i) {
            return new PrloTicketWrapperUiModel[i];
        }
    }

    public PrloTicketWrapperUiModel(long j, int i, List list) {
        C41536l.m120489i(list, "tickets");
        this.f56813d = j;
        this.f56814e = i;
        this.f56815f = list;
    }

    /* renamed from: a */
    public final int mo52862a() {
        return this.f56814e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrloTicketWrapperUiModel)) {
            return false;
        }
        PrloTicketWrapperUiModel prloTicketWrapperUiModel = (PrloTicketWrapperUiModel) obj;
        return this.f56813d == prloTicketWrapperUiModel.f56813d && this.f56814e == prloTicketWrapperUiModel.f56814e && C41536l.m120484d(this.f56815f, prloTicketWrapperUiModel.f56815f);
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f56813d) * 31) + this.f56814e) * 31) + this.f56815f.hashCode();
    }

    public String toString() {
        long j = this.f56813d;
        int i = this.f56814e;
        List list = this.f56815f;
        return "PrloTicketWrapperUiModel(month=" + j + ", ticketCount=" + i + ", tickets=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56813d);
        parcel.writeInt(this.f56814e);
        List<PrloTicketUiModel> list = this.f56815f;
        parcel.writeInt(list.size());
        for (PrloTicketUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
