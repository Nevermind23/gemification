package p118i7;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: i7.k */
public abstract class C6600k extends C6602m implements C6601l {
    public C6600k() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20589k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12800X((LocationSettingsResult) C6589b0.m25941a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
