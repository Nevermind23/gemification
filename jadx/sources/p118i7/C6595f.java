package p118i7;

import android.app.PendingIntent;
import android.os.Parcel;

/* renamed from: i7.f */
public abstract class C6595f extends C6602m implements C6596g {
    public C6595f() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo20589k(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo12799y2(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            mo12798a0(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            mo12797H0(parcel.readInt(), (PendingIntent) C6589b0.m25941a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
