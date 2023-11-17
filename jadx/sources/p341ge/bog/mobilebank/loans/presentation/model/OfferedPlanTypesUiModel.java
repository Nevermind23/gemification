package p341ge.bog.mobilebank.loans.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import fs0.C32003c;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel */
public final class OfferedPlanTypesUiModel implements Parcelable {
    public static final Parcelable.Creator<OfferedPlanTypesUiModel> CREATOR = new C32684a();

    /* renamed from: d */
    private final C32003c f80450d;

    /* renamed from: e */
    private final String f80451e;

    /* renamed from: f */
    private final String f80452f;

    /* renamed from: ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel$a */
    public static final class C32684a implements Parcelable.Creator {
        /* renamed from: a */
        public final OfferedPlanTypesUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new OfferedPlanTypesUiModel(C32003c.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final OfferedPlanTypesUiModel[] newArray(int i) {
            return new OfferedPlanTypesUiModel[i];
        }
    }

    public OfferedPlanTypesUiModel(C32003c cVar, String str, String str2) {
        C41536l.m120489i(cVar, "planType");
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "description");
        this.f80450d = cVar;
        this.f80451e = str;
        this.f80452f = str2;
    }

    /* renamed from: a */
    public final String mo74332a() {
        return this.f80452f;
    }

    /* renamed from: b */
    public final C32003c mo74333b() {
        return this.f80450d;
    }

    /* renamed from: d */
    public final String mo74334d() {
        return this.f80451e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferedPlanTypesUiModel)) {
            return false;
        }
        OfferedPlanTypesUiModel offeredPlanTypesUiModel = (OfferedPlanTypesUiModel) obj;
        return this.f80450d == offeredPlanTypesUiModel.f80450d && C41536l.m120484d(this.f80451e, offeredPlanTypesUiModel.f80451e) && C41536l.m120484d(this.f80452f, offeredPlanTypesUiModel.f80452f);
    }

    public int hashCode() {
        return (((this.f80450d.hashCode() * 31) + this.f80451e.hashCode()) * 31) + this.f80452f.hashCode();
    }

    public String toString() {
        C32003c cVar = this.f80450d;
        String str = this.f80451e;
        String str2 = this.f80452f;
        return "OfferedPlanTypesUiModel(planType=" + cVar + ", title=" + str + ", description=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80450d.name());
        parcel.writeString(this.f80451e);
        parcel.writeString(this.f80452f);
    }
}
