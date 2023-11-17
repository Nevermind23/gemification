package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel */
public final class PiggyBankResourcesUiModel implements Parcelable {
    public static final Parcelable.Creator<PiggyBankResourcesUiModel> CREATOR = new C33115a();

    /* renamed from: d */
    private final List f81112d;

    /* renamed from: e */
    private final List f81113e;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel$a */
    public static final class C33115a implements Parcelable.Creator {
        /* renamed from: a */
        public final PiggyBankResourcesUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CasAccountUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(MoneyBoxTariffUiModel.CREATOR.createFromParcel(parcel));
            }
            return new PiggyBankResourcesUiModel(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final PiggyBankResourcesUiModel[] newArray(int i) {
            return new PiggyBankResourcesUiModel[i];
        }
    }

    public PiggyBankResourcesUiModel(List list, List list2) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "tariffs");
        this.f81112d = list;
        this.f81113e = list2;
    }

    /* renamed from: a */
    public final List mo75182a() {
        return this.f81112d;
    }

    /* renamed from: b */
    public final List mo75183b() {
        return this.f81113e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PiggyBankResourcesUiModel)) {
            return false;
        }
        PiggyBankResourcesUiModel piggyBankResourcesUiModel = (PiggyBankResourcesUiModel) obj;
        return C41536l.m120484d(this.f81112d, piggyBankResourcesUiModel.f81112d) && C41536l.m120484d(this.f81113e, piggyBankResourcesUiModel.f81113e);
    }

    public int hashCode() {
        return (this.f81112d.hashCode() * 31) + this.f81113e.hashCode();
    }

    public String toString() {
        List list = this.f81112d;
        List list2 = this.f81113e;
        return "PiggyBankResourcesUiModel(accounts=" + list + ", tariffs=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<CasAccountUiModel> list = this.f81112d;
        parcel.writeInt(list.size());
        for (CasAccountUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<MoneyBoxTariffUiModel> list2 = this.f81113e;
        parcel.writeInt(list2.size());
        for (MoneyBoxTariffUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
