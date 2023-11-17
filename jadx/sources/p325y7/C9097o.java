package p325y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.google.android.gms.tapandpay.firstparty.zzt;

/* renamed from: y7.o */
public final class C9097o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        ContactlessSetupItem[] contactlessSetupItemArr = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                contactlessSetupItemArr = (ContactlessSetupItem[]) SafeParcelReader.m15148t(parcel, E, ContactlessSetupItem.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new zzt(contactlessSetupItemArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
