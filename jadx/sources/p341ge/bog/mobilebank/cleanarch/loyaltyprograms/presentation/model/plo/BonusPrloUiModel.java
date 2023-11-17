package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel */
public final class BonusPrloUiModel implements Parcelable {
    public static final Parcelable.Creator<BonusPrloUiModel> CREATOR = new C21147a();

    /* renamed from: d */
    private final long f56806d;

    /* renamed from: e */
    private final List f56807e;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel$a */
    public static final class C21147a implements Parcelable.Creator {
        /* renamed from: a */
        public final BonusPrloUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PrloTicketWrapperUiModel.CREATOR.createFromParcel(parcel));
            }
            return new BonusPrloUiModel(readLong, arrayList);
        }

        /* renamed from: b */
        public final BonusPrloUiModel[] newArray(int i) {
            return new BonusPrloUiModel[i];
        }
    }

    public BonusPrloUiModel(long j, List list) {
        C41536l.m120489i(list, "tickets");
        this.f56806d = j;
        this.f56807e = list;
    }

    /* renamed from: a */
    public final int mo52843a() {
        int i = 0;
        for (PrloTicketWrapperUiModel a : this.f56807e) {
            i += a.mo52862a();
        }
        return i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusPrloUiModel)) {
            return false;
        }
        BonusPrloUiModel bonusPrloUiModel = (BonusPrloUiModel) obj;
        return this.f56806d == bonusPrloUiModel.f56806d && C41536l.m120484d(this.f56807e, bonusPrloUiModel.f56807e);
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f56806d) * 31) + this.f56807e.hashCode();
    }

    public String toString() {
        long j = this.f56806d;
        List list = this.f56807e;
        return "BonusPrloUiModel(nextDrawDate=" + j + ", tickets=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56806d);
        List<PrloTicketWrapperUiModel> list = this.f56807e;
        parcel.writeInt(list.size());
        for (PrloTicketWrapperUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
