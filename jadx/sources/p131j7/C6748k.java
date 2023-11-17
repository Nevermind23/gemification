package p131j7;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import p299w6.C8859b;

/* renamed from: j7.k */
public final class C6748k extends C6738a implements C6750m {
    C6748k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: J0 */
    public final C8859b mo20771J0(int i) {
        Parcel x = mo20749x();
        x.writeInt(i);
        Parcel k = mo20748k(1, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }

    /* renamed from: Y */
    public final C8859b mo20772Y(Bitmap bitmap) {
        Parcel x = mo20749x();
        C6747j.m26284d(x, bitmap);
        Parcel k = mo20748k(6, x);
        C8859b x2 = C8859b.C8860a.m32974x(k.readStrongBinder());
        k.recycle();
        return x2;
    }
}
