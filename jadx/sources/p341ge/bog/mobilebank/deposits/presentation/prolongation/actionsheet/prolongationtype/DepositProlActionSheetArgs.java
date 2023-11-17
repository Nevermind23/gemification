package p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype;

import android.os.Parcel;
import android.os.Parcelable;
import ic0.C25168f;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlActionSheetArgs */
public final class DepositProlActionSheetArgs implements Parcelable {
    public static final Parcelable.Creator<DepositProlActionSheetArgs> CREATOR = new C23251a();

    /* renamed from: d */
    private final C25168f f60849d;

    /* renamed from: e */
    private final String f60850e;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.prolongationtype.DepositProlActionSheetArgs$a */
    public static final class C23251a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositProlActionSheetArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositProlActionSheetArgs(C25168f.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final DepositProlActionSheetArgs[] newArray(int i) {
            return new DepositProlActionSheetArgs[i];
        }
    }

    public DepositProlActionSheetArgs(C25168f fVar, String str) {
        C41536l.m120489i(fVar, "type");
        C41536l.m120489i(str, "title");
        this.f60849d = fVar;
        this.f60850e = str;
    }

    /* renamed from: a */
    public final String mo58169a() {
        return this.f60850e;
    }

    /* renamed from: b */
    public final C25168f mo58170b() {
        return this.f60849d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlActionSheetArgs)) {
            return false;
        }
        DepositProlActionSheetArgs depositProlActionSheetArgs = (DepositProlActionSheetArgs) obj;
        return this.f60849d == depositProlActionSheetArgs.f60849d && C41536l.m120484d(this.f60850e, depositProlActionSheetArgs.f60850e);
    }

    public int hashCode() {
        return (this.f60849d.hashCode() * 31) + this.f60850e.hashCode();
    }

    public String toString() {
        C25168f fVar = this.f60849d;
        String str = this.f60850e;
        return "DepositProlActionSheetArgs(type=" + fVar + ", title=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60849d.name());
        parcel.writeString(this.f60850e);
    }
}
