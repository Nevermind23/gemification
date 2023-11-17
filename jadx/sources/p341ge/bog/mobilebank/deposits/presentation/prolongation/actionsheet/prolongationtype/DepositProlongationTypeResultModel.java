package p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype;

import android.os.Parcel;
import android.os.Parcelable;
import ic0.C25168f;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeResultModel */
public final class DepositProlongationTypeResultModel implements Parcelable {
    public static final Parcelable.Creator<DepositProlongationTypeResultModel> CREATOR = new C23252a();

    /* renamed from: d */
    private final C25168f f60851d;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlongationTypeResultModel$a */
    public static final class C23252a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositProlongationTypeResultModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositProlongationTypeResultModel(C25168f.valueOf(parcel.readString()));
        }

        /* renamed from: b */
        public final DepositProlongationTypeResultModel[] newArray(int i) {
            return new DepositProlongationTypeResultModel[i];
        }
    }

    public DepositProlongationTypeResultModel(C25168f fVar) {
        C41536l.m120489i(fVar, "type");
        this.f60851d = fVar;
    }

    /* renamed from: a */
    public final C25168f mo58180a() {
        return this.f60851d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DepositProlongationTypeResultModel) && this.f60851d == ((DepositProlongationTypeResultModel) obj).f60851d;
    }

    public int hashCode() {
        return this.f60851d.hashCode();
    }

    public String toString() {
        C25168f fVar = this.f60851d;
        return "DepositProlongationTypeResultModel(type=" + fVar + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60851d.name());
    }
}
