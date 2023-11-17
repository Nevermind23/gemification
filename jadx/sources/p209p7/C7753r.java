package p209p7;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.VisibleRegion;
import p131j7.C6738a;
import p131j7.C6747j;

/* renamed from: p7.r */
public final class C7753r extends C6738a implements C7735d {
    C7753r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: g0 */
    public final VisibleRegion mo22510g0() {
        Parcel k = mo20748k(3, mo20749x());
        VisibleRegion visibleRegion = (VisibleRegion) C6747j.m26281a(k, VisibleRegion.CREATOR);
        k.recycle();
        return visibleRegion;
    }
}
