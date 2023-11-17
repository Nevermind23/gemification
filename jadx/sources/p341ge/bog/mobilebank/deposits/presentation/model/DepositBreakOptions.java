package p341ge.bog.mobilebank.deposits.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.DepositBreakOption;
import p341ge.bog.mobilebank.shared.helper.StringSource;

/* renamed from: ge.bog.mobilebank.deposits.presentation.model.DepositBreakOptions */
public final class DepositBreakOptions implements Parcelable {
    public static final Parcelable.Creator<DepositBreakOptions> CREATOR = new C23180a();

    /* renamed from: d */
    private final List f60699d;

    /* renamed from: e */
    private final long f60700e;

    /* renamed from: f */
    private final StringSource f60701f;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.model.DepositBreakOptions$a */
    public static final class C23180a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositBreakOptions createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (true) {
                Class<DepositBreakOptions> cls = DepositBreakOptions.class;
                if (i == readInt) {
                    return new DepositBreakOptions(arrayList, parcel.readLong(), (StringSource) parcel.readParcelable(cls.getClassLoader()));
                }
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                i++;
            }
        }

        /* renamed from: b */
        public final DepositBreakOptions[] newArray(int i) {
            return new DepositBreakOptions[i];
        }
    }

    public DepositBreakOptions(List list, long j, StringSource stringSource) {
        C41536l.m120489i(list, "options");
        this.f60699d = list;
        this.f60700e = j;
        this.f60701f = stringSource;
    }

    /* renamed from: a */
    public final boolean mo57849a() {
        return this.f60699d.contains(DepositBreakOption.BreakDeposit.f60812j);
    }

    /* renamed from: b */
    public final boolean mo57850b() {
        return this.f60699d.contains(DepositBreakOption.CashCoverLoan.f60813j);
    }

    /* renamed from: d */
    public final long mo57851d() {
        return this.f60700e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final StringSource mo57853e() {
        return this.f60701f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBreakOptions)) {
            return false;
        }
        DepositBreakOptions depositBreakOptions = (DepositBreakOptions) obj;
        return C41536l.m120484d(this.f60699d, depositBreakOptions.f60699d) && this.f60700e == depositBreakOptions.f60700e && C41536l.m120484d(this.f60701f, depositBreakOptions.f60701f);
    }

    /* renamed from: f */
    public final List mo57855f() {
        return this.f60699d;
    }

    public int hashCode() {
        int hashCode = ((this.f60699d.hashCode() * 31) + C7397t.m28148a(this.f60700e)) * 31;
        StringSource stringSource = this.f60701f;
        return hashCode + (stringSource == null ? 0 : stringSource.hashCode());
    }

    public String toString() {
        List list = this.f60699d;
        long j = this.f60700e;
        StringSource stringSource = this.f60701f;
        return "DepositBreakOptions(options=" + list + ", agreeKey=" + j + ", errorText=" + stringSource + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Parcelable> list = this.f60699d;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeLong(this.f60700e);
        parcel.writeParcelable(this.f60701f, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepositBreakOptions(List list, long j, StringSource stringSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j, (i & 4) != 0 ? null : stringSource);
    }
}
