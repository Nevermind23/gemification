package p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.common.presentation.model.ServiceCenterUiModel;

/* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel */
public final class BecomeSoloApplicationDataUiModel implements Parcelable {
    public static final Parcelable.Creator<BecomeSoloApplicationDataUiModel> CREATOR = new C20841a();

    /* renamed from: d */
    private final BecomeSoloDropdownValuesUiModel f56108d;

    /* renamed from: e */
    private final ServiceCenterUiModel f56109e;

    /* renamed from: f */
    private final String f56110f;

    /* renamed from: g */
    private final String f56111g;

    /* renamed from: ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel$a */
    public static final class C20841a implements Parcelable.Creator {
        /* renamed from: a */
        public final BecomeSoloApplicationDataUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BecomeSoloApplicationDataUiModel(BecomeSoloDropdownValuesUiModel.CREATOR.createFromParcel(parcel), ServiceCenterUiModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BecomeSoloApplicationDataUiModel[] newArray(int i) {
            return new BecomeSoloApplicationDataUiModel[i];
        }
    }

    public BecomeSoloApplicationDataUiModel(BecomeSoloDropdownValuesUiModel becomeSoloDropdownValuesUiModel, ServiceCenterUiModel serviceCenterUiModel, String str, String str2) {
        C41536l.m120489i(becomeSoloDropdownValuesUiModel, "dropdownValues");
        C41536l.m120489i(serviceCenterUiModel, "serviceCenters");
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(str2, "contactEmail");
        this.f56108d = becomeSoloDropdownValuesUiModel;
        this.f56109e = serviceCenterUiModel;
        this.f56110f = str;
        this.f56111g = str2;
    }

    /* renamed from: a */
    public final String mo49592a() {
        return this.f56111g;
    }

    /* renamed from: b */
    public final BecomeSoloDropdownValuesUiModel mo49593b() {
        return this.f56108d;
    }

    /* renamed from: d */
    public final String mo49594d() {
        return this.f56110f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final ServiceCenterUiModel mo49596e() {
        return this.f56109e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f56108d.writeToParcel(parcel, i);
        this.f56109e.writeToParcel(parcel, i);
        parcel.writeString(this.f56110f);
        parcel.writeString(this.f56111g);
    }
}
