package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData */
public final class TransactionsFilterData implements Parcelable {
    public static final Parcelable.Creator<TransactionsFilterData> CREATOR = new C23979a();

    /* renamed from: d */
    private final Long f62256d;

    /* renamed from: e */
    private final Long f62257e;

    /* renamed from: f */
    private final List f62258f;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.model.TransactionsFilterData$a */
    public static final class C23979a implements Parcelable.Creator {
        /* renamed from: a */
        public final TransactionsFilterData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Long l = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new TransactionsFilterData(valueOf, l, parcel.createStringArrayList());
        }

        /* renamed from: b */
        public final TransactionsFilterData[] newArray(int i) {
            return new TransactionsFilterData[i];
        }
    }

    public TransactionsFilterData() {
        this((Long) null, (Long) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final List mo60945a() {
        return this.f62258f;
    }

    /* renamed from: b */
    public final Long mo60946b() {
        return this.f62256d;
    }

    /* renamed from: d */
    public final Long mo60947d() {
        return this.f62257e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionsFilterData)) {
            return false;
        }
        TransactionsFilterData transactionsFilterData = (TransactionsFilterData) obj;
        return C41536l.m120484d(this.f62256d, transactionsFilterData.f62256d) && C41536l.m120484d(this.f62257e, transactionsFilterData.f62257e) && C41536l.m120484d(this.f62258f, transactionsFilterData.f62258f);
    }

    public int hashCode() {
        Long l = this.f62256d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f62257e;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.f62258f;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.f62256d;
        Long l2 = this.f62257e;
        List list = this.f62258f;
        return "TransactionsFilterData(fromDate=" + l + ", toDate=" + l2 + ", filterTypes=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f62256d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f62257e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeStringList(this.f62258f);
    }

    public TransactionsFilterData(Long l, Long l2, List list) {
        this.f62256d = l;
        this.f62257e = l2;
        this.f62258f = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransactionsFilterData(Long l, Long l2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : list);
    }
}
