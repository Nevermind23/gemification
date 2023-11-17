package p037c6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: c6.b */
public final class C2266b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int O = SafeParcelReader.m15126O(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < O) {
            int E = SafeParcelReader.m15116E(parcel);
            if (SafeParcelReader.m15151w(E) != 1) {
                SafeParcelReader.m15125N(parcel, E);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m15143o(parcel, E, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m15150v(parcel, O);
        return new SaveAccountLinkingTokenResult(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveAccountLinkingTokenResult[i];
    }
}
