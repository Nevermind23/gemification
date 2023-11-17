package p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTMergerRequisition */
public final class GTMergerRequisition implements Parcelable {
    public static final Parcelable.Creator<GTMergerRequisition> CREATOR = new C23391a();

    /* renamed from: d */
    private final String f61154d;

    /* renamed from: e */
    private final GTAcquire f61155e;

    /* renamed from: f */
    private final GTAcquire f61156f;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTMergerRequisition$a */
    public static final class C23391a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTMergerRequisition createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            GTAcquire gTAcquire = null;
            GTAcquire createFromParcel = parcel.readInt() == 0 ? null : GTAcquire.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                gTAcquire = GTAcquire.CREATOR.createFromParcel(parcel);
            }
            return new GTMergerRequisition(readString, createFromParcel, gTAcquire);
        }

        /* renamed from: b */
        public final GTMergerRequisition[] newArray(int i) {
            return new GTMergerRequisition[i];
        }
    }

    public GTMergerRequisition(String str, GTAcquire gTAcquire, GTAcquire gTAcquire2) {
        this.f61154d = str;
        this.f61155e = gTAcquire;
        this.f61156f = gTAcquire2;
    }

    /* renamed from: a */
    public final GTAcquire mo60139a() {
        return this.f61156f;
    }

    /* renamed from: b */
    public final GTAcquire mo60140b() {
        return this.f61155e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTMergerRequisition)) {
            return false;
        }
        GTMergerRequisition gTMergerRequisition = (GTMergerRequisition) obj;
        return C41536l.m120484d(this.f61154d, gTMergerRequisition.f61154d) && C41536l.m120484d(this.f61155e, gTMergerRequisition.f61155e) && C41536l.m120484d(this.f61156f, gTMergerRequisition.f61156f);
    }

    public int hashCode() {
        String str = this.f61154d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        GTAcquire gTAcquire = this.f61155e;
        int hashCode2 = (hashCode + (gTAcquire == null ? 0 : gTAcquire.hashCode())) * 31;
        GTAcquire gTAcquire2 = this.f61156f;
        if (gTAcquire2 != null) {
            i = gTAcquire2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f61154d;
        GTAcquire gTAcquire = this.f61155e;
        GTAcquire gTAcquire2 = this.f61156f;
        return "GTMergerRequisition(type=" + str + ", acquirer=" + gTAcquire + ", acquiree=" + gTAcquire2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61154d);
        GTAcquire gTAcquire = this.f61155e;
        if (gTAcquire == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gTAcquire.writeToParcel(parcel, i);
        }
        GTAcquire gTAcquire2 = this.f61156f;
        if (gTAcquire2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        gTAcquire2.writeToParcel(parcel, i);
    }
}
