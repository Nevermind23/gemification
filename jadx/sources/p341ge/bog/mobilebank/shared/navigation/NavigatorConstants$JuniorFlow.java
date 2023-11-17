package p341ge.bog.mobilebank.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow */
public enum NavigatorConstants$JuniorFlow implements Parcelable {
    ACTIVATION,
    FINANCIAL_NUMBER;
    
    public static final Parcelable.Creator<NavigatorConstants$JuniorFlow> CREATOR = null;

    /* renamed from: ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow$a */
    public static final class C34647a implements Parcelable.Creator {
        /* renamed from: a */
        public final NavigatorConstants$JuniorFlow createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return NavigatorConstants$JuniorFlow.valueOf(parcel.readString());
        }

        /* renamed from: b */
        public final NavigatorConstants$JuniorFlow[] newArray(int i) {
            return new NavigatorConstants$JuniorFlow[i];
        }
    }

    static {
        CREATOR = new C34647a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(name());
    }
}
