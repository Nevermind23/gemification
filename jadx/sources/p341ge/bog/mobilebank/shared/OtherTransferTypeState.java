package p341ge.bog.mobilebank.shared;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.shared.OtherTransferTypeState */
public final class OtherTransferTypeState implements Parcelable {
    public static final Parcelable.Creator<OtherTransferTypeState> CREATOR = new C34613a();

    /* renamed from: d */
    private final long f83643d;

    /* renamed from: e */
    private final boolean f83644e;

    /* renamed from: f */
    private final boolean f83645f;

    /* renamed from: ge.bog.mobilebank.shared.OtherTransferTypeState$a */
    public static final class C34613a implements Parcelable.Creator {
        /* renamed from: a */
        public final OtherTransferTypeState createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new OtherTransferTypeState(readLong, z2, z);
        }

        /* renamed from: b */
        public final OtherTransferTypeState[] newArray(int i) {
            return new OtherTransferTypeState[i];
        }
    }

    public OtherTransferTypeState() {
        this(0, false, false, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final long mo84140a() {
        return this.f83643d;
    }

    /* renamed from: b */
    public final boolean mo84141b() {
        return this.f83644e;
    }

    /* renamed from: d */
    public final boolean mo84142d() {
        return this.f83645f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherTransferTypeState)) {
            return false;
        }
        OtherTransferTypeState otherTransferTypeState = (OtherTransferTypeState) obj;
        return this.f83643d == otherTransferTypeState.f83643d && this.f83644e == otherTransferTypeState.f83644e && this.f83645f == otherTransferTypeState.f83645f;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f83643d) * 31;
        boolean z = this.f83644e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f83645f;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        long j = this.f83643d;
        boolean z = this.f83644e;
        boolean z2 = this.f83645f;
        return "OtherTransferTypeState(acctKey=" + j + ", openedFromCardDetails=" + z + ", showP2p=" + z2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f83643d);
        parcel.writeInt(this.f83644e ? 1 : 0);
        parcel.writeInt(this.f83645f ? 1 : 0);
    }

    public OtherTransferTypeState(long j, boolean z, boolean z2) {
        this.f83643d = j;
        this.f83644e = z;
        this.f83645f = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtherTransferTypeState(long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }
}
