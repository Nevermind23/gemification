package p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragmentArgs */
public final class DepositProlongationResultFragmentArgs implements Parcelable {
    public static final Parcelable.Creator<DepositProlongationResultFragmentArgs> CREATOR = new C23291a();

    /* renamed from: d */
    private final String f60913d;

    /* renamed from: e */
    private final String f60914e;

    /* renamed from: f */
    private final LinkedHashMap f60915f;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragmentArgs$a */
    public static final class C23291a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositProlongationResultFragmentArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new DepositProlongationResultFragmentArgs(readString, readString2, linkedHashMap);
        }

        /* renamed from: b */
        public final DepositProlongationResultFragmentArgs[] newArray(int i) {
            return new DepositProlongationResultFragmentArgs[i];
        }
    }

    public DepositProlongationResultFragmentArgs(String str, String str2, LinkedHashMap linkedHashMap) {
        C41536l.m120489i(str, "mainText");
        C41536l.m120489i(linkedHashMap, "details");
        this.f60913d = str;
        this.f60914e = str2;
        this.f60915f = linkedHashMap;
    }

    /* renamed from: a */
    public final LinkedHashMap mo58249a() {
        return this.f60915f;
    }

    /* renamed from: b */
    public final String mo58250b() {
        return this.f60914e;
    }

    /* renamed from: d */
    public final String mo58251d() {
        return this.f60913d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlongationResultFragmentArgs)) {
            return false;
        }
        DepositProlongationResultFragmentArgs depositProlongationResultFragmentArgs = (DepositProlongationResultFragmentArgs) obj;
        return C41536l.m120484d(this.f60913d, depositProlongationResultFragmentArgs.f60913d) && C41536l.m120484d(this.f60914e, depositProlongationResultFragmentArgs.f60914e) && C41536l.m120484d(this.f60915f, depositProlongationResultFragmentArgs.f60915f);
    }

    public int hashCode() {
        int hashCode = this.f60913d.hashCode() * 31;
        String str = this.f60914e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f60915f.hashCode();
    }

    public String toString() {
        String str = this.f60913d;
        String str2 = this.f60914e;
        LinkedHashMap linkedHashMap = this.f60915f;
        return "DepositProlongationResultFragmentArgs(mainText=" + str + ", inlineFeedbackText=" + str2 + ", details=" + linkedHashMap + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60913d);
        parcel.writeString(this.f60914e);
        LinkedHashMap linkedHashMap = this.f60915f;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepositProlongationResultFragmentArgs(String str, String str2, LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, linkedHashMap);
    }
}
