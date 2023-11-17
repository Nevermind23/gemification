package p341ge.bog.mobilebank.p2p.presentation.topup;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState */
public final class P2PTopUpViewModel$TopUpState implements Parcelable {
    public static final Parcelable.Creator<P2PTopUpViewModel$TopUpState> CREATOR = new C33559a();

    /* renamed from: d */
    private final Long f81840d;

    /* renamed from: e */
    private final Long f81841e;

    /* renamed from: f */
    private final Double f81842f;

    /* renamed from: g */
    private final String f81843g;

    /* renamed from: ge.bog.mobilebank.p2p.presentation.topup.P2PTopUpViewModel$TopUpState$a */
    public static final class C33559a implements Parcelable.Creator {
        /* renamed from: a */
        public final P2PTopUpViewModel$TopUpState createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Double d = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                d = Double.valueOf(parcel.readDouble());
            }
            return new P2PTopUpViewModel$TopUpState(valueOf, valueOf2, d, parcel.readString());
        }

        /* renamed from: b */
        public final P2PTopUpViewModel$TopUpState[] newArray(int i) {
            return new P2PTopUpViewModel$TopUpState[i];
        }
    }

    public P2PTopUpViewModel$TopUpState() {
        this((Long) null, (Long) null, (Double) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final Long mo79543a() {
        return this.f81841e;
    }

    /* renamed from: b */
    public final Double mo79544b() {
        return this.f81842f;
    }

    /* renamed from: d */
    public final Long mo79545d() {
        return this.f81840d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo79547e() {
        return this.f81843g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PTopUpViewModel$TopUpState)) {
            return false;
        }
        P2PTopUpViewModel$TopUpState p2PTopUpViewModel$TopUpState = (P2PTopUpViewModel$TopUpState) obj;
        return C41536l.m120484d(this.f81840d, p2PTopUpViewModel$TopUpState.f81840d) && C41536l.m120484d(this.f81841e, p2PTopUpViewModel$TopUpState.f81841e) && C41536l.m120484d(this.f81842f, p2PTopUpViewModel$TopUpState.f81842f) && C41536l.m120484d(this.f81843g, p2PTopUpViewModel$TopUpState.f81843g);
    }

    public int hashCode() {
        Long l = this.f81840d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f81841e;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.f81842f;
        if (d != null) {
            i = d.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f81843g.hashCode();
    }

    public String toString() {
        Long l = this.f81840d;
        Long l2 = this.f81841e;
        Double d = this.f81842f;
        String str = this.f81843g;
        return "TopUpState(cardId=" + l + ", acctKey=" + l2 + ", amount=" + d + ", ccy=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f81840d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f81841e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Double d = this.f81842f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f81843g);
    }

    public P2PTopUpViewModel$TopUpState(Long l, Long l2, Double d, String str) {
        C41536l.m120489i(str, "ccy");
        this.f81840d = l;
        this.f81841e = l2;
        this.f81842f = d;
        this.f81843g = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P2PTopUpViewModel$TopUpState(Long l, Long l2, Double d, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? "GEL" : str);
    }
}
