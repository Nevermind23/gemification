package p183n7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p118i7.C6589b0;
import p118i7.C6602m;

/* renamed from: n7.y */
public abstract class C7338y extends C6602m implements C7339z {
    public C7338y() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: x */
    public static C7339z m27988x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof C7339z) {
            return (C7339z) queryLocalInterface;
        }
        return new C7337x(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20589k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo12795X1((LocationResult) C6589b0.m25941a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo12794E0((LocationAvailability) C6589b0.m25941a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
