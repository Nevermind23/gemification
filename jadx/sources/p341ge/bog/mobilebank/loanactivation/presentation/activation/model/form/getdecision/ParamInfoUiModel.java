package p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.ParamInfoUiModel */
public final class ParamInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ParamInfoUiModel> CREATOR = new C32484a();

    /* renamed from: d */
    private final String f80050d;

    /* renamed from: e */
    private final String f80051e;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.ParamInfoUiModel$a */
    public static final class C32484a implements Parcelable.Creator {
        /* renamed from: a */
        public final ParamInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ParamInfoUiModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ParamInfoUiModel[] newArray(int i) {
            return new ParamInfoUiModel[i];
        }
    }

    public ParamInfoUiModel(String str, String str2) {
        this.f80050d = str;
        this.f80051e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParamInfoUiModel)) {
            return false;
        }
        ParamInfoUiModel paramInfoUiModel = (ParamInfoUiModel) obj;
        return C41536l.m120484d(this.f80050d, paramInfoUiModel.f80050d) && C41536l.m120484d(this.f80051e, paramInfoUiModel.f80051e);
    }

    public int hashCode() {
        String str = this.f80050d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f80051e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f80050d;
        String str2 = this.f80051e;
        return "ParamInfoUiModel(parameterCode=" + str + ", parameterValue=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80050d);
        parcel.writeString(this.f80051e);
    }
}
