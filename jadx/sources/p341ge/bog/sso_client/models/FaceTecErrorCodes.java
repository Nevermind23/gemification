package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.models.FaceTecErrorCodes */
public final class FaceTecErrorCodes implements Parcelable {
    public static final Parcelable.Creator<FaceTecErrorCodes> CREATOR = new C35925a();
    private final List<Integer> retryFaceScanErrors;
    private final List<Integer> retryIDScanErrors;

    /* renamed from: ge.bog.sso_client.models.FaceTecErrorCodes$a */
    public static final class C35925a implements Parcelable.Creator {
        /* renamed from: a */
        public final FaceTecErrorCodes createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Integer.valueOf(parcel.readInt()));
            }
            return new FaceTecErrorCodes(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final FaceTecErrorCodes[] newArray(int i) {
            return new FaceTecErrorCodes[i];
        }
    }

    public FaceTecErrorCodes(List<Integer> list, List<Integer> list2) {
        C41536l.m120489i(list, "retryFaceScanErrors");
        C41536l.m120489i(list2, "retryIDScanErrors");
        this.retryFaceScanErrors = list;
        this.retryIDScanErrors = list2;
    }

    public static /* synthetic */ FaceTecErrorCodes copy$default(FaceTecErrorCodes faceTecErrorCodes, List<Integer> list, List<Integer> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = faceTecErrorCodes.retryFaceScanErrors;
        }
        if ((i & 2) != 0) {
            list2 = faceTecErrorCodes.retryIDScanErrors;
        }
        return faceTecErrorCodes.copy(list, list2);
    }

    public final List<Integer> component1() {
        return this.retryFaceScanErrors;
    }

    public final List<Integer> component2() {
        return this.retryIDScanErrors;
    }

    public final FaceTecErrorCodes copy(List<Integer> list, List<Integer> list2) {
        C41536l.m120489i(list, "retryFaceScanErrors");
        C41536l.m120489i(list2, "retryIDScanErrors");
        return new FaceTecErrorCodes(list, list2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceTecErrorCodes)) {
            return false;
        }
        FaceTecErrorCodes faceTecErrorCodes = (FaceTecErrorCodes) obj;
        return C41536l.m120484d(this.retryFaceScanErrors, faceTecErrorCodes.retryFaceScanErrors) && C41536l.m120484d(this.retryIDScanErrors, faceTecErrorCodes.retryIDScanErrors);
    }

    public final List<Integer> getRetryFaceScanErrors() {
        return this.retryFaceScanErrors;
    }

    public final List<Integer> getRetryIDScanErrors() {
        return this.retryIDScanErrors;
    }

    public int hashCode() {
        return (this.retryFaceScanErrors.hashCode() * 31) + this.retryIDScanErrors.hashCode();
    }

    public String toString() {
        return "FaceTecErrorCodes(retryFaceScanErrors=" + this.retryFaceScanErrors + ", retryIDScanErrors=" + this.retryIDScanErrors + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Integer> list = this.retryFaceScanErrors;
        parcel.writeInt(list.size());
        for (Integer intValue : list) {
            parcel.writeInt(intValue.intValue());
        }
        List<Integer> list2 = this.retryIDScanErrors;
        parcel.writeInt(list2.size());
        for (Integer intValue2 : list2) {
            parcel.writeInt(intValue2.intValue());
        }
    }
}
