package p118i7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: i7.i */
public abstract class C6598i extends C6602m implements C6599j {
    public C6598i() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20589k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo20590O((Status) C6589b0.m25941a(parcel, Status.CREATOR), (Location) C6589b0.m25941a(parcel, Location.CREATOR));
        return true;
    }
}
