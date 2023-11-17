package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferModel;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepArgs */
public final class CombinedOfferFirstStepArgs implements Parcelable {
    public static final Parcelable.Creator<CombinedOfferFirstStepArgs> CREATOR = new C22863a();

    /* renamed from: d */
    private final CombinedOfferModel f60242d;

    /* renamed from: e */
    private final DepositTypeDetailsUiModel f60243e;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.firststep.CombinedOfferFirstStepArgs$a */
    public static final class C22863a implements Parcelable.Creator {
        /* renamed from: a */
        public final CombinedOfferFirstStepArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new CombinedOfferFirstStepArgs(parcel.readInt() == 0 ? null : CombinedOfferModel.CREATOR.createFromParcel(parcel), DepositTypeDetailsUiModel.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final CombinedOfferFirstStepArgs[] newArray(int i) {
            return new CombinedOfferFirstStepArgs[i];
        }
    }

    public CombinedOfferFirstStepArgs(CombinedOfferModel combinedOfferModel, DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
        C41536l.m120489i(depositTypeDetailsUiModel, "depositTypeModel");
        this.f60242d = combinedOfferModel;
        this.f60243e = depositTypeDetailsUiModel;
    }

    /* renamed from: a */
    public final CombinedOfferModel mo56990a() {
        return this.f60242d;
    }

    /* renamed from: b */
    public final DepositTypeDetailsUiModel mo56991b() {
        return this.f60243e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedOfferFirstStepArgs)) {
            return false;
        }
        CombinedOfferFirstStepArgs combinedOfferFirstStepArgs = (CombinedOfferFirstStepArgs) obj;
        return C41536l.m120484d(this.f60242d, combinedOfferFirstStepArgs.f60242d) && C41536l.m120484d(this.f60243e, combinedOfferFirstStepArgs.f60243e);
    }

    public int hashCode() {
        CombinedOfferModel combinedOfferModel = this.f60242d;
        return ((combinedOfferModel == null ? 0 : combinedOfferModel.hashCode()) * 31) + this.f60243e.hashCode();
    }

    public String toString() {
        CombinedOfferModel combinedOfferModel = this.f60242d;
        DepositTypeDetailsUiModel depositTypeDetailsUiModel = this.f60243e;
        return "CombinedOfferFirstStepArgs(combinedOfferModel=" + combinedOfferModel + ", depositTypeModel=" + depositTypeDetailsUiModel + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        CombinedOfferModel combinedOfferModel = this.f60242d;
        if (combinedOfferModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            combinedOfferModel.writeToParcel(parcel, i);
        }
        this.f60243e.writeToParcel(parcel, i);
    }
}
