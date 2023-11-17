package p118i7;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import p156l6.C6937e;

/* renamed from: i7.h */
public interface C6597h extends IInterface {
    /* renamed from: B */
    void mo12783B(LastLocationRequest lastLocationRequest, C6599j jVar);

    /* renamed from: F1 */
    void mo12784F1(PendingIntent pendingIntent, C6596g gVar, String str);

    /* renamed from: Q0 */
    void mo12785Q0(boolean z);

    /* renamed from: U */
    void mo12786U(zzj zzj);

    /* renamed from: b */
    Location mo12787b();

    /* renamed from: b0 */
    void mo12788b0(zzbh zzbh);

    /* renamed from: l2 */
    void mo12789l2(boolean z, C6937e eVar);

    /* renamed from: o2 */
    void mo12790o2(String[] strArr, C6596g gVar, String str);

    /* renamed from: q1 */
    void mo12791q1(LocationSettingsRequest locationSettingsRequest, C6601l lVar, String str);

    /* renamed from: w0 */
    void mo12792w0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C6596g gVar);
}
