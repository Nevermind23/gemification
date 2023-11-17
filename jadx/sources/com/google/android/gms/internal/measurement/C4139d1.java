package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p299w6.C8859b;

/* renamed from: com.google.android.gms.internal.measurement.d1 */
public final class C4139d1 extends C4325o0 implements C4173f1 {
    C4139d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeLong(j);
        mo13413y(23, k);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        C4359q0.m16487d(k, bundle);
        mo13413y(9, k);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeLong(j);
        mo13413y(24, k);
    }

    public final void generateEventId(C4224i1 i1Var) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, i1Var);
        mo13413y(22, k);
    }

    public final void getCachedAppInstanceId(C4224i1 i1Var) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, i1Var);
        mo13413y(19, k);
    }

    public final void getConditionalUserProperties(String str, String str2, C4224i1 i1Var) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        C4359q0.m16488e(k, i1Var);
        mo13413y(10, k);
    }

    public final void getCurrentScreenClass(C4224i1 i1Var) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, i1Var);
        mo13413y(17, k);
    }

    public final void getCurrentScreenName(C4224i1 i1Var) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, i1Var);
        mo13413y(16, k);
    }

    public final void getGmpAppId(C4224i1 i1Var) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, i1Var);
        mo13413y(21, k);
    }

    public final void getMaxUserProperties(String str, C4224i1 i1Var) {
        Parcel k = mo13411k();
        k.writeString(str);
        C4359q0.m16488e(k, i1Var);
        mo13413y(6, k);
    }

    public final void getUserProperties(String str, String str2, boolean z, C4224i1 i1Var) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        int i = C4359q0.f13602b;
        k.writeInt(z ? 1 : 0);
        C4359q0.m16488e(k, i1Var);
        mo13413y(5, k);
    }

    public final void initialize(C8859b bVar, zzcl zzcl, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        C4359q0.m16487d(k, zzcl);
        k.writeLong(j);
        mo13413y(1, k);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        C4359q0.m16487d(k, bundle);
        k.writeInt(z ? 1 : 0);
        k.writeInt(z2 ? 1 : 0);
        k.writeLong(j);
        mo13413y(2, k);
    }

    public final void logHealthData(int i, String str, C8859b bVar, C8859b bVar2, C8859b bVar3) {
        Parcel k = mo13411k();
        k.writeInt(5);
        k.writeString(str);
        C4359q0.m16488e(k, bVar);
        C4359q0.m16488e(k, bVar2);
        C4359q0.m16488e(k, bVar3);
        mo13413y(33, k);
    }

    public final void onActivityCreated(C8859b bVar, Bundle bundle, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        C4359q0.m16487d(k, bundle);
        k.writeLong(j);
        mo13413y(27, k);
    }

    public final void onActivityDestroyed(C8859b bVar, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        k.writeLong(j);
        mo13413y(28, k);
    }

    public final void onActivityPaused(C8859b bVar, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        k.writeLong(j);
        mo13413y(29, k);
    }

    public final void onActivityResumed(C8859b bVar, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        k.writeLong(j);
        mo13413y(30, k);
    }

    public final void onActivitySaveInstanceState(C8859b bVar, C4224i1 i1Var, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        C4359q0.m16488e(k, i1Var);
        k.writeLong(j);
        mo13413y(31, k);
    }

    public final void onActivityStarted(C8859b bVar, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        k.writeLong(j);
        mo13413y(25, k);
    }

    public final void onActivityStopped(C8859b bVar, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        k.writeLong(j);
        mo13413y(26, k);
    }

    public final void registerOnMeasurementEventListener(C4275l1 l1Var) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, l1Var);
        mo13413y(35, k);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, bundle);
        k.writeLong(j);
        mo13413y(8, k);
    }

    public final void setCurrentScreen(C8859b bVar, String str, String str2, long j) {
        Parcel k = mo13411k();
        C4359q0.m16488e(k, bVar);
        k.writeString(str);
        k.writeString(str2);
        k.writeLong(j);
        mo13413y(15, k);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel k = mo13411k();
        int i = C4359q0.f13602b;
        k.writeInt(z ? 1 : 0);
        mo13413y(39, k);
    }

    public final void setUserId(String str, long j) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeLong(j);
        mo13413y(7, k);
    }

    public final void setUserProperty(String str, String str2, C8859b bVar, boolean z, long j) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        C4359q0.m16488e(k, bVar);
        k.writeInt(z ? 1 : 0);
        k.writeLong(j);
        mo13413y(4, k);
    }
}
