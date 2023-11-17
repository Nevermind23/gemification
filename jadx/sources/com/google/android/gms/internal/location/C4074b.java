package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import p118i7.C6586a;
import p118i7.C6589b0;
import p118i7.C6596g;
import p118i7.C6597h;
import p118i7.C6599j;
import p118i7.C6601l;
import p156l6.C6937e;

/* renamed from: com.google.android.gms.internal.location.b */
public final class C4074b extends C6586a implements C6597h {
    C4074b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: B */
    public final void mo12783B(LastLocationRequest lastLocationRequest, C6599j jVar) {
        Parcel y = mo20583y();
        C6589b0.m25943c(y, lastLocationRequest);
        C6589b0.m25944d(y, jVar);
        mo20582x(82, y);
    }

    /* renamed from: F1 */
    public final void mo12784F1(PendingIntent pendingIntent, C6596g gVar, String str) {
        Parcel y = mo20583y();
        C6589b0.m25943c(y, pendingIntent);
        C6589b0.m25944d(y, gVar);
        y.writeString(str);
        mo20582x(2, y);
    }

    /* renamed from: Q0 */
    public final void mo12785Q0(boolean z) {
        Parcel y = mo20583y();
        C6589b0.m25942b(y, z);
        mo20582x(12, y);
    }

    /* renamed from: U */
    public final void mo12786U(zzj zzj) {
        Parcel y = mo20583y();
        C6589b0.m25943c(y, zzj);
        mo20582x(75, y);
    }

    /* renamed from: b */
    public final Location mo12787b() {
        Parcel k = mo20581k(7, mo20583y());
        Location location = (Location) C6589b0.m25941a(k, Location.CREATOR);
        k.recycle();
        return location;
    }

    /* renamed from: b0 */
    public final void mo12788b0(zzbh zzbh) {
        Parcel y = mo20583y();
        C6589b0.m25943c(y, zzbh);
        mo20582x(59, y);
    }

    /* renamed from: l2 */
    public final void mo12789l2(boolean z, C6937e eVar) {
        Parcel y = mo20583y();
        C6589b0.m25942b(y, z);
        C6589b0.m25944d(y, eVar);
        mo20582x(84, y);
    }

    /* renamed from: o2 */
    public final void mo12790o2(String[] strArr, C6596g gVar, String str) {
        Parcel y = mo20583y();
        y.writeStringArray(strArr);
        C6589b0.m25944d(y, gVar);
        y.writeString(str);
        mo20582x(3, y);
    }

    /* renamed from: q1 */
    public final void mo12791q1(LocationSettingsRequest locationSettingsRequest, C6601l lVar, String str) {
        Parcel y = mo20583y();
        C6589b0.m25943c(y, locationSettingsRequest);
        C6589b0.m25944d(y, lVar);
        y.writeString((String) null);
        mo20582x(63, y);
    }

    /* renamed from: w0 */
    public final void mo12792w0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C6596g gVar) {
        Parcel y = mo20583y();
        C6589b0.m25943c(y, geofencingRequest);
        C6589b0.m25943c(y, pendingIntent);
        C6589b0.m25944d(y, gVar);
        mo20582x(57, y);
    }
}
