package p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits;

import android.os.Parcel;
import android.os.Parcelable;
import fu0.C32012b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.StatusBenefitsUiModel */
public final class StatusBenefitsUiModel implements Parcelable {
    public static final Parcelable.Creator<StatusBenefitsUiModel> CREATOR = new C33173a();

    /* renamed from: d */
    private final C32012b f81260d;

    /* renamed from: e */
    private final String f81261e;

    /* renamed from: f */
    private final int f81262f;

    /* renamed from: g */
    private final int f81263g;

    /* renamed from: h */
    private final List f81264h;

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.StatusBenefitsUiModel$a */
    public static final class C33173a implements Parcelable.Creator {
        /* renamed from: a */
        public final StatusBenefitsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            C32012b valueOf = parcel.readInt() == 0 ? null : C32012b.valueOf(parcel.readString());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i != readInt3; i++) {
                arrayList.add(BenefitUiModel.CREATOR.createFromParcel(parcel));
            }
            return new StatusBenefitsUiModel(valueOf, readString, readInt, readInt2, arrayList);
        }

        /* renamed from: b */
        public final StatusBenefitsUiModel[] newArray(int i) {
            return new StatusBenefitsUiModel[i];
        }
    }

    public StatusBenefitsUiModel(C32012b bVar, String str, int i, int i2, List list) {
        C41536l.m120489i(str, "labelDesc");
        C41536l.m120489i(list, "plusBenefitList");
        this.f81260d = bVar;
        this.f81261e = str;
        this.f81262f = i;
        this.f81263g = i2;
        this.f81264h = list;
    }

    /* renamed from: a */
    public final C32012b mo75442a() {
        return this.f81260d;
    }

    /* renamed from: b */
    public final String mo75443b() {
        return this.f81261e;
    }

    /* renamed from: d */
    public final int mo75444d() {
        return this.f81262f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo75446e() {
        return this.f81264h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusBenefitsUiModel)) {
            return false;
        }
        StatusBenefitsUiModel statusBenefitsUiModel = (StatusBenefitsUiModel) obj;
        return this.f81260d == statusBenefitsUiModel.f81260d && C41536l.m120484d(this.f81261e, statusBenefitsUiModel.f81261e) && this.f81262f == statusBenefitsUiModel.f81262f && this.f81263g == statusBenefitsUiModel.f81263g && C41536l.m120484d(this.f81264h, statusBenefitsUiModel.f81264h);
    }

    public int hashCode() {
        C32012b bVar = this.f81260d;
        return ((((((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.f81261e.hashCode()) * 31) + this.f81262f) * 31) + this.f81263g) * 31) + this.f81264h.hashCode();
    }

    public String toString() {
        C32012b bVar = this.f81260d;
        String str = this.f81261e;
        int i = this.f81262f;
        int i2 = this.f81263g;
        List list = this.f81264h;
        return "StatusBenefitsUiModel(benefitStatus=" + bVar + ", labelDesc=" + str + ", labelEntryScore=" + i + ", orderId=" + i2 + ", plusBenefitList=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        C32012b bVar = this.f81260d;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        parcel.writeString(this.f81261e);
        parcel.writeInt(this.f81262f);
        parcel.writeInt(this.f81263g);
        List<BenefitUiModel> list = this.f81264h;
        parcel.writeInt(list.size());
        for (BenefitUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
