package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel */
public final class MoneyBoxDataUiModel implements Parcelable {
    public static final Parcelable.Creator<MoneyBoxDataUiModel> CREATOR = new C33109a();

    /* renamed from: d */
    private final BonusWrapperUiModel f81078d;

    /* renamed from: e */
    private final List f81079e;

    /* renamed from: f */
    private final List f81080f;

    /* renamed from: g */
    private final List f81081g;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxDataUiModel$a */
    public static final class C33109a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyBoxDataUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Class<MoneyBoxDataUiModel> cls = MoneyBoxDataUiModel.class;
            BonusWrapperUiModel bonusWrapperUiModel = (BonusWrapperUiModel) parcel.readParcelable(cls.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(cls.getClassLoader()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(CasAccountUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(MoneyBoxTariffUiModel.CREATOR.createFromParcel(parcel));
            }
            return new MoneyBoxDataUiModel(bonusWrapperUiModel, arrayList, arrayList2, arrayList3);
        }

        /* renamed from: b */
        public final MoneyBoxDataUiModel[] newArray(int i) {
            return new MoneyBoxDataUiModel[i];
        }
    }

    public MoneyBoxDataUiModel(BonusWrapperUiModel bonusWrapperUiModel, List list, List list2, List list3) {
        C41536l.m120489i(bonusWrapperUiModel, "bonuses");
        C41536l.m120489i(list, "deposits");
        C41536l.m120489i(list2, "accounts");
        C41536l.m120489i(list3, "tariffs");
        this.f81078d = bonusWrapperUiModel;
        this.f81079e = list;
        this.f81080f = list2;
        this.f81081g = list3;
    }

    /* renamed from: b */
    public static /* synthetic */ MoneyBoxDataUiModel m97560b(MoneyBoxDataUiModel moneyBoxDataUiModel, BonusWrapperUiModel bonusWrapperUiModel, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            bonusWrapperUiModel = moneyBoxDataUiModel.f81078d;
        }
        if ((i & 2) != 0) {
            list = moneyBoxDataUiModel.f81079e;
        }
        if ((i & 4) != 0) {
            list2 = moneyBoxDataUiModel.f81080f;
        }
        if ((i & 8) != 0) {
            list3 = moneyBoxDataUiModel.f81081g;
        }
        return moneyBoxDataUiModel.mo75095a(bonusWrapperUiModel, list, list2, list3);
    }

    /* renamed from: a */
    public final MoneyBoxDataUiModel mo75095a(BonusWrapperUiModel bonusWrapperUiModel, List list, List list2, List list3) {
        C41536l.m120489i(bonusWrapperUiModel, "bonuses");
        C41536l.m120489i(list, "deposits");
        C41536l.m120489i(list2, "accounts");
        C41536l.m120489i(list3, "tariffs");
        return new MoneyBoxDataUiModel(bonusWrapperUiModel, list, list2, list3);
    }

    /* renamed from: d */
    public final List mo75096d() {
        return this.f81080f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final BonusWrapperUiModel mo75098e() {
        return this.f81078d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyBoxDataUiModel)) {
            return false;
        }
        MoneyBoxDataUiModel moneyBoxDataUiModel = (MoneyBoxDataUiModel) obj;
        return C41536l.m120484d(this.f81078d, moneyBoxDataUiModel.f81078d) && C41536l.m120484d(this.f81079e, moneyBoxDataUiModel.f81079e) && C41536l.m120484d(this.f81080f, moneyBoxDataUiModel.f81080f) && C41536l.m120484d(this.f81081g, moneyBoxDataUiModel.f81081g);
    }

    /* renamed from: f */
    public final List mo75100f() {
        return this.f81079e;
    }

    /* renamed from: g */
    public final List mo75101g() {
        return this.f81081g;
    }

    public int hashCode() {
        return (((((this.f81078d.hashCode() * 31) + this.f81079e.hashCode()) * 31) + this.f81080f.hashCode()) * 31) + this.f81081g.hashCode();
    }

    public String toString() {
        BonusWrapperUiModel bonusWrapperUiModel = this.f81078d;
        List list = this.f81079e;
        List list2 = this.f81080f;
        List list3 = this.f81081g;
        return "MoneyBoxDataUiModel(bonuses=" + bonusWrapperUiModel + ", deposits=" + list + ", accounts=" + list2 + ", tariffs=" + list3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeParcelable(this.f81078d, i);
        List<Parcelable> list = this.f81079e;
        parcel.writeInt(list.size());
        for (Parcelable writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        List<CasAccountUiModel> list2 = this.f81080f;
        parcel.writeInt(list2.size());
        for (CasAccountUiModel writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<MoneyBoxTariffUiModel> list3 = this.f81081g;
        parcel.writeInt(list3.size());
        for (MoneyBoxTariffUiModel writeToParcel2 : list3) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
