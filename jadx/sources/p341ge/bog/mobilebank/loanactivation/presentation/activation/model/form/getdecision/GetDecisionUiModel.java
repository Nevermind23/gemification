package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;
import qq0.C38234a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel */
public final class GetDecisionUiModel implements Parcelable {
    public static final Parcelable.Creator<GetDecisionUiModel> CREATOR = new C32483a();

    /* renamed from: d */
    private final GetDecisionDetailsUiModel f80043d;

    /* renamed from: e */
    private final SummaryUiModel f80044e;

    /* renamed from: f */
    private final List f80045f;

    /* renamed from: g */
    private final List f80046g;

    /* renamed from: h */
    private final C38234a f80047h;

    /* renamed from: i */
    private final List f80048i;

    /* renamed from: j */
    private final List f80049j;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel$a */
    public static final class C32483a implements Parcelable.Creator {
        /* renamed from: a */
        public final GetDecisionUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            GetDecisionDetailsUiModel createFromParcel = GetDecisionDetailsUiModel.CREATOR.createFromParcel(parcel);
            SummaryUiModel createFromParcel2 = SummaryUiModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Double.valueOf(parcel.readDouble()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(RefinanceInfoUiModel.CREATOR.createFromParcel(parcel));
            }
            C38234a valueOf = C38234a.valueOf(parcel.readString());
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt3);
            for (int i3 = 0; i3 != readInt3; i3++) {
                arrayList3.add(ScheduleInfoUiModel.CREATOR.createFromParcel(parcel));
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(readInt4);
            for (int i4 = 0; i4 != readInt4; i4++) {
                arrayList4.add(ProviderInfoUiModel.CREATOR.createFromParcel(parcel));
            }
            return new GetDecisionUiModel(createFromParcel, createFromParcel2, arrayList, arrayList2, valueOf, arrayList3, arrayList4);
        }

        /* renamed from: b */
        public final GetDecisionUiModel[] newArray(int i) {
            return new GetDecisionUiModel[i];
        }
    }

    public GetDecisionUiModel(GetDecisionDetailsUiModel getDecisionDetailsUiModel, SummaryUiModel summaryUiModel, List list, List list2, C38234a aVar, List list3, List list4) {
        C41536l.m120489i(getDecisionDetailsUiModel, "details");
        C41536l.m120489i(summaryUiModel, "summary");
        C41536l.m120489i(list, "loanAmounts");
        C41536l.m120489i(list2, "refinanceInfo");
        C41536l.m120489i(aVar, "extraCode");
        C41536l.m120489i(list3, "scheduleInfo");
        C41536l.m120489i(list4, "providerInfo");
        this.f80043d = getDecisionDetailsUiModel;
        this.f80044e = summaryUiModel;
        this.f80045f = list;
        this.f80046g = list2;
        this.f80047h = aVar;
        this.f80048i = list3;
        this.f80049j = list4;
    }

    /* renamed from: a */
    public final GetDecisionDetailsUiModel mo73432a() {
        return this.f80043d;
    }

    /* renamed from: b */
    public final C38234a mo73433b() {
        return this.f80047h;
    }

    /* renamed from: d */
    public final List mo73434d() {
        return this.f80049j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo73436e() {
        return this.f80046g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetDecisionUiModel)) {
            return false;
        }
        GetDecisionUiModel getDecisionUiModel = (GetDecisionUiModel) obj;
        return C41536l.m120484d(this.f80043d, getDecisionUiModel.f80043d) && C41536l.m120484d(this.f80044e, getDecisionUiModel.f80044e) && C41536l.m120484d(this.f80045f, getDecisionUiModel.f80045f) && C41536l.m120484d(this.f80046g, getDecisionUiModel.f80046g) && this.f80047h == getDecisionUiModel.f80047h && C41536l.m120484d(this.f80048i, getDecisionUiModel.f80048i) && C41536l.m120484d(this.f80049j, getDecisionUiModel.f80049j);
    }

    public int hashCode() {
        return (((((((((((this.f80043d.hashCode() * 31) + this.f80044e.hashCode()) * 31) + this.f80045f.hashCode()) * 31) + this.f80046g.hashCode()) * 31) + this.f80047h.hashCode()) * 31) + this.f80048i.hashCode()) * 31) + this.f80049j.hashCode();
    }

    public String toString() {
        GetDecisionDetailsUiModel getDecisionDetailsUiModel = this.f80043d;
        SummaryUiModel summaryUiModel = this.f80044e;
        List list = this.f80045f;
        List list2 = this.f80046g;
        C38234a aVar = this.f80047h;
        List list3 = this.f80048i;
        List list4 = this.f80049j;
        return "GetDecisionUiModel(details=" + getDecisionDetailsUiModel + ", summary=" + summaryUiModel + ", loanAmounts=" + list + ", refinanceInfo=" + list2 + ", extraCode=" + aVar + ", scheduleInfo=" + list3 + ", providerInfo=" + list4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f80043d.writeToParcel(parcel, i);
        this.f80044e.writeToParcel(parcel, i);
        List<Number> list = this.f80045f;
        parcel.writeInt(list.size());
        for (Number doubleValue : list) {
            parcel.writeDouble(doubleValue.doubleValue());
        }
        List<RefinanceInfoUiModel> list2 = this.f80046g;
        parcel.writeInt(list2.size());
        for (RefinanceInfoUiModel writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f80047h.name());
        List<ScheduleInfoUiModel> list3 = this.f80048i;
        parcel.writeInt(list3.size());
        for (ScheduleInfoUiModel writeToParcel2 : list3) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        List<ProviderInfoUiModel> list4 = this.f80049j;
        parcel.writeInt(list4.size());
        for (ProviderInfoUiModel writeToParcel3 : list4) {
            writeToParcel3.writeToParcel(parcel, i);
        }
    }
}
