package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.RateTypeUiModel */
public enum RateTypeUiModel implements Parcelable {
    PERCENTAGE("P"),
    AMOUNT(PensionStatusResult.STATUS_ACTIVE);
    
    public static final Parcelable.Creator<RateTypeUiModel> CREATOR = null;

    /* renamed from: d */
    private final String f56283d;

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.RateTypeUiModel$a */
    public static final class C20940a implements Parcelable.Creator {
        /* renamed from: a */
        public final RateTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return RateTypeUiModel.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final RateTypeUiModel[] newArray(int i) {
            return new RateTypeUiModel[i];
        }
    }

    static {
        CREATOR = new C20940a();
    }

    private RateTypeUiModel(String str) {
        this.f56283d = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(name());
    }
}
