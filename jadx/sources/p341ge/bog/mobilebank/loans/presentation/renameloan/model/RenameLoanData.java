package p341ge.bog.mobilebank.loans.presentation.renameloan.model;

import android.os.Parcel;
import android.os.Parcelable;
import js0.C36787a;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData */
public final class RenameLoanData implements Parcelable {
    public static final Parcelable.Creator<RenameLoanData> CREATOR = new C32720a();

    /* renamed from: d */
    private final long f80511d;

    /* renamed from: e */
    private final C36787a f80512e;

    /* renamed from: ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData$a */
    public static final class C32720a implements Parcelable.Creator {
        /* renamed from: a */
        public final RenameLoanData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RenameLoanData(parcel.readLong(), C36787a.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final RenameLoanData[] newArray(int i) {
            return new RenameLoanData[i];
        }
    }

    public RenameLoanData(long j, C36787a aVar) {
        C41536l.m120489i(aVar, "prodType");
        this.f80511d = j;
        this.f80512e = aVar;
    }

    /* renamed from: a */
    public final long mo74396a() {
        return this.f80511d;
    }

    /* renamed from: b */
    public final C36787a mo74397b() {
        return this.f80512e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenameLoanData)) {
            return false;
        }
        RenameLoanData renameLoanData = (RenameLoanData) obj;
        return this.f80511d == renameLoanData.f80511d && this.f80512e == renameLoanData.f80512e;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f80511d) * 31) + this.f80512e.hashCode();
    }

    public String toString() {
        long j = this.f80511d;
        C36787a aVar = this.f80512e;
        return "RenameLoanData(loanKey=" + j + ", prodType=" + aVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f80511d);
        parcel.writeString(this.f80512e.name());
    }
}
