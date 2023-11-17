package p341ge.bog.mobilebank.depositapplication.presentation.application.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel */
public final class WithdrawalTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<WithdrawalTypeUiModel> CREATOR = new C22816a();

    /* renamed from: d */
    private final String f60148d;

    /* renamed from: e */
    private final String f60149e;

    /* renamed from: f */
    private final Boolean f60150f;

    /* renamed from: g */
    private final Boolean f60151g;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel$a */
    public static final class C22816a implements Parcelable.Creator {
        /* renamed from: a */
        public final WithdrawalTypeUiModel createFromParcel(Parcel parcel) {
            Boolean bool;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            Boolean bool2 = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new WithdrawalTypeUiModel(readString, readString2, bool, bool2);
        }

        /* renamed from: b */
        public final WithdrawalTypeUiModel[] newArray(int i) {
            return new WithdrawalTypeUiModel[i];
        }
    }

    public WithdrawalTypeUiModel(String str, String str2, Boolean bool, Boolean bool2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f60148d = str;
        this.f60149e = str2;
        this.f60150f = bool;
        this.f60151g = bool2;
    }

    /* renamed from: a */
    public final String mo56826a() {
        return this.f60149e;
    }

    /* renamed from: b */
    public final String mo56827b() {
        return this.f60148d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawalTypeUiModel)) {
            return false;
        }
        WithdrawalTypeUiModel withdrawalTypeUiModel = (WithdrawalTypeUiModel) obj;
        return C41536l.m120484d(this.f60148d, withdrawalTypeUiModel.f60148d) && C41536l.m120484d(this.f60149e, withdrawalTypeUiModel.f60149e) && C41536l.m120484d(this.f60150f, withdrawalTypeUiModel.f60150f) && C41536l.m120484d(this.f60151g, withdrawalTypeUiModel.f60151g);
    }

    public int hashCode() {
        int hashCode = this.f60148d.hashCode() * 31;
        String str = this.f60149e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f60150f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f60151g;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f60148d;
        String str2 = this.f60149e;
        Boolean bool = this.f60150f;
        Boolean bool2 = this.f60151g;
        return "WithdrawalTypeUiModel(value=" + str + ", dictionaryKey=" + str2 + ", hasPrimaryAccount=" + bool + ", hasInterestAccount=" + bool2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60148d);
        parcel.writeString(this.f60149e);
        Boolean bool = this.f60150f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f60151g;
        if (bool2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WithdrawalTypeUiModel(String str, String str2, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2);
    }
}
