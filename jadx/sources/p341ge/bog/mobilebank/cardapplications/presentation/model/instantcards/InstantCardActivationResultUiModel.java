package p341ge.bog.mobilebank.cardapplications.presentation.model.instantcards;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.instantcards.InstantCardActivationResultUiModel */
public final class InstantCardActivationResultUiModel implements Parcelable {
    public static final Parcelable.Creator<InstantCardActivationResultUiModel> CREATOR = new C14239a();

    /* renamed from: d */
    private final long f41837d;

    /* renamed from: e */
    private final List f41838e;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.instantcards.InstantCardActivationResultUiModel$a */
    public static final class C14239a implements Parcelable.Creator {
        /* renamed from: a */
        public final InstantCardActivationResultUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readSerializable());
            }
            return new InstantCardActivationResultUiModel(readLong, arrayList);
        }

        /* renamed from: b */
        public final InstantCardActivationResultUiModel[] newArray(int i) {
            return new InstantCardActivationResultUiModel[i];
        }
    }

    public InstantCardActivationResultUiModel(long j, List list) {
        C41536l.m120489i(list, "cardDetails");
        this.f41837d = j;
        this.f41838e = list;
    }

    /* renamed from: a */
    public final long mo39937a() {
        return this.f41837d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstantCardActivationResultUiModel)) {
            return false;
        }
        InstantCardActivationResultUiModel instantCardActivationResultUiModel = (InstantCardActivationResultUiModel) obj;
        return this.f41837d == instantCardActivationResultUiModel.f41837d && C41536l.m120484d(this.f41838e, instantCardActivationResultUiModel.f41838e);
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f41837d) * 31) + this.f41838e.hashCode();
    }

    public String toString() {
        long j = this.f41837d;
        List list = this.f41838e;
        return "InstantCardActivationResultUiModel(cardId=" + j + ", cardDetails=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41837d);
        List<Serializable> list = this.f41838e;
        parcel.writeInt(list.size());
        for (Serializable writeSerializable : list) {
            parcel.writeSerializable(writeSerializable);
        }
    }
}
