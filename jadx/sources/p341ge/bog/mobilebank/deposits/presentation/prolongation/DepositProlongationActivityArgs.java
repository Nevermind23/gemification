package p341ge.bog.mobilebank.deposits.presentation.prolongation;

import android.os.Parcel;
import android.os.Parcelable;
import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivityArgs */
public final class DepositProlongationActivityArgs implements Parcelable {
    public static final Parcelable.Creator<DepositProlongationActivityArgs> CREATOR = new C23244a();

    /* renamed from: d */
    private final C25168f f60838d;

    /* renamed from: e */
    private final long f60839e;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivityArgs$a */
    public static final class C23244a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositProlongationActivityArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositProlongationActivityArgs(C25168f.valueOf(parcel.readString()), parcel.readLong());
        }

        /* renamed from: b */
        public final DepositProlongationActivityArgs[] newArray(int i) {
            return new DepositProlongationActivityArgs[i];
        }
    }

    public DepositProlongationActivityArgs(C25168f fVar, long j) {
        C41536l.m120489i(fVar, "type");
        this.f60838d = fVar;
        this.f60839e = j;
    }

    /* renamed from: a */
    public final long mo58124a() {
        return this.f60839e;
    }

    /* renamed from: b */
    public final C25168f mo58125b() {
        return this.f60838d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlongationActivityArgs)) {
            return false;
        }
        DepositProlongationActivityArgs depositProlongationActivityArgs = (DepositProlongationActivityArgs) obj;
        return this.f60838d == depositProlongationActivityArgs.f60838d && this.f60839e == depositProlongationActivityArgs.f60839e;
    }

    public int hashCode() {
        return (this.f60838d.hashCode() * 31) + C7397t.m28148a(this.f60839e);
    }

    public String toString() {
        C25168f fVar = this.f60838d;
        long j = this.f60839e;
        return "DepositProlongationActivityArgs(type=" + fVar + ", agreeKey=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60838d.name());
        parcel.writeLong(this.f60839e);
    }
}
