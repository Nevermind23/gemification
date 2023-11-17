package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegisterResultUiModel */
public final class DebitCardRegisterResultUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardRegisterResultUiModel> CREATOR = new C14220a();

    /* renamed from: d */
    private final Long f41713d;

    /* renamed from: e */
    private final Long f41714e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegisterResultUiModel$a */
    public static final class C14220a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardRegisterResultUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Long l = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new DebitCardRegisterResultUiModel(valueOf, l);
        }

        /* renamed from: b */
        public final DebitCardRegisterResultUiModel[] newArray(int i) {
            return new DebitCardRegisterResultUiModel[i];
        }
    }

    public DebitCardRegisterResultUiModel(Long l, Long l2) {
        this.f41713d = l;
        this.f41714e = l2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardRegisterResultUiModel)) {
            return false;
        }
        DebitCardRegisterResultUiModel debitCardRegisterResultUiModel = (DebitCardRegisterResultUiModel) obj;
        return C41536l.m120484d(this.f41713d, debitCardRegisterResultUiModel.f41713d) && C41536l.m120484d(this.f41714e, debitCardRegisterResultUiModel.f41714e);
    }

    public int hashCode() {
        Long l = this.f41713d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f41714e;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        Long l = this.f41713d;
        Long l2 = this.f41714e;
        return "DebitCardRegisterResultUiModel(cardId=" + l + ", registerCardResultCode=" + l2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f41713d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.f41714e;
        if (l2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l2.longValue());
    }
}
