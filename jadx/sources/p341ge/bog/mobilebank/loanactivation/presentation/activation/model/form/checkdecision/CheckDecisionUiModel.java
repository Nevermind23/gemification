package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;
import pq0.C37941a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionUiModel */
public final class CheckDecisionUiModel implements Parcelable, C37941a {
    public static final Parcelable.Creator<CheckDecisionUiModel> CREATOR = new C32480a();

    /* renamed from: d */
    private final CheckDecisionDetailsUiModel f80018d;

    /* renamed from: e */
    private final List f80019e;

    /* renamed from: f */
    private final List f80020f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionUiModel$a */
    public static final class C32480a implements Parcelable.Creator {
        /* renamed from: a */
        public final CheckDecisionUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            CheckDecisionDetailsUiModel createFromParcel = CheckDecisionDetailsUiModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RefinanceInfoUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(ProviderInfoUiModel.CREATOR.createFromParcel(parcel));
            }
            return new CheckDecisionUiModel(createFromParcel, arrayList, arrayList2);
        }

        /* renamed from: b */
        public final CheckDecisionUiModel[] newArray(int i) {
            return new CheckDecisionUiModel[i];
        }
    }

    public CheckDecisionUiModel(CheckDecisionDetailsUiModel checkDecisionDetailsUiModel, List list, List list2) {
        C41536l.m120489i(checkDecisionDetailsUiModel, "details");
        C41536l.m120489i(list, "refinanceInfo");
        C41536l.m120489i(list2, "providerInfo");
        this.f80018d = checkDecisionDetailsUiModel;
        this.f80019e = list;
        this.f80020f = list2;
    }

    /* renamed from: a */
    public final CheckDecisionDetailsUiModel mo73384a() {
        return this.f80018d;
    }

    /* renamed from: b */
    public final List mo73385b() {
        return this.f80020f;
    }

    /* renamed from: d */
    public final List mo73386d() {
        return this.f80019e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDecisionUiModel)) {
            return false;
        }
        CheckDecisionUiModel checkDecisionUiModel = (CheckDecisionUiModel) obj;
        return C41536l.m120484d(this.f80018d, checkDecisionUiModel.f80018d) && C41536l.m120484d(this.f80019e, checkDecisionUiModel.f80019e) && C41536l.m120484d(this.f80020f, checkDecisionUiModel.f80020f);
    }

    public int hashCode() {
        return (((this.f80018d.hashCode() * 31) + this.f80019e.hashCode()) * 31) + this.f80020f.hashCode();
    }

    public String toString() {
        CheckDecisionDetailsUiModel checkDecisionDetailsUiModel = this.f80018d;
        List list = this.f80019e;
        List list2 = this.f80020f;
        return "CheckDecisionUiModel(details=" + checkDecisionDetailsUiModel + ", refinanceInfo=" + list + ", providerInfo=" + list2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f80018d.writeToParcel(parcel, i);
        List<RefinanceInfoUiModel> list = this.f80019e;
        parcel.writeInt(list.size());
        for (RefinanceInfoUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<ProviderInfoUiModel> list2 = this.f80020f;
        parcel.writeInt(list2.size());
        for (ProviderInfoUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
