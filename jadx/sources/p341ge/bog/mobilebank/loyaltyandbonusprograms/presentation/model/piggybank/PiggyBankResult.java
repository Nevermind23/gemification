package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResult */
public final class PiggyBankResult implements Parcelable {
    public static final Parcelable.Creator<PiggyBankResult> CREATOR = new C33116a();

    /* renamed from: d */
    private final MoneyBoxTariffUiModel f81114d;

    /* renamed from: e */
    private final List f81115e;

    /* renamed from: f */
    private final long f81116f;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResult$a */
    public static final class C33116a implements Parcelable.Creator {
        /* renamed from: a */
        public final PiggyBankResult createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            MoneyBoxTariffUiModel createFromParcel = MoneyBoxTariffUiModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CasAccountUiModel.CREATOR.createFromParcel(parcel));
            }
            return new PiggyBankResult(createFromParcel, arrayList, parcel.readLong());
        }

        /* renamed from: b */
        public final PiggyBankResult[] newArray(int i) {
            return new PiggyBankResult[i];
        }
    }

    public PiggyBankResult(MoneyBoxTariffUiModel moneyBoxTariffUiModel, List list, long j) {
        C41536l.m120489i(moneyBoxTariffUiModel, "amount");
        C41536l.m120489i(list, "accounts");
        this.f81114d = moneyBoxTariffUiModel;
        this.f81115e = list;
        this.f81116f = j;
    }

    /* renamed from: a */
    public final List mo75193a() {
        return this.f81115e;
    }

    /* renamed from: b */
    public final MoneyBoxTariffUiModel mo75194b() {
        return this.f81114d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiggyBankResult)) {
            return false;
        }
        PiggyBankResult piggyBankResult = (PiggyBankResult) obj;
        return C41536l.m120484d(this.f81114d, piggyBankResult.f81114d) && C41536l.m120484d(this.f81115e, piggyBankResult.f81115e) && this.f81116f == piggyBankResult.f81116f;
    }

    public int hashCode() {
        return (((this.f81114d.hashCode() * 31) + this.f81115e.hashCode()) * 31) + C7397t.m28148a(this.f81116f);
    }

    public String toString() {
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = this.f81114d;
        List list = this.f81115e;
        long j = this.f81116f;
        return "PiggyBankResult(amount=" + moneyBoxTariffUiModel + ", accounts=" + list + ", piggyBankId=" + j + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f81114d.writeToParcel(parcel, i);
        List<CasAccountUiModel> list = this.f81115e;
        parcel.writeInt(list.size());
        for (CasAccountUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.f81116f);
    }
}
