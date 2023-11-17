package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C4325o0;
import com.google.android.gms.internal.measurement.C4359q0;
import java.util.ArrayList;
import java.util.List;
import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
public final class C4647g3 extends C4325o0 implements C8252f {
    C4647g3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: B1 */
    public final List mo14421B1(String str, String str2, String str3) {
        Parcel k = mo13411k();
        k.writeString((String) null);
        k.writeString(str2);
        k.writeString(str3);
        Parcel x = mo13412x(17, k);
        ArrayList<zzac> createTypedArrayList = x.createTypedArrayList(zzac.CREATOR);
        x.recycle();
        return createTypedArrayList;
    }

    /* renamed from: D0 */
    public final void mo14422D0(zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzq);
        mo13413y(20, k);
    }

    /* renamed from: F */
    public final void mo14423F(zzlj zzlj, zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzlj);
        C4359q0.m16487d(k, zzq);
        mo13413y(2, k);
    }

    /* renamed from: I0 */
    public final List mo14424I0(String str, String str2, boolean z, zzq zzq) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        int i = C4359q0.f13602b;
        k.writeInt(z ? 1 : 0);
        C4359q0.m16487d(k, zzq);
        Parcel x = mo13412x(14, k);
        ArrayList<zzlj> createTypedArrayList = x.createTypedArrayList(zzlj.CREATOR);
        x.recycle();
        return createTypedArrayList;
    }

    /* renamed from: N0 */
    public final void mo14425N0(zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzq);
        mo13413y(18, k);
    }

    /* renamed from: W1 */
    public final List mo14426W1(String str, String str2, zzq zzq) {
        Parcel k = mo13411k();
        k.writeString(str);
        k.writeString(str2);
        C4359q0.m16487d(k, zzq);
        Parcel x = mo13412x(16, k);
        ArrayList<zzac> createTypedArrayList = x.createTypedArrayList(zzac.CREATOR);
        x.recycle();
        return createTypedArrayList;
    }

    /* renamed from: i1 */
    public final void mo14427i1(zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzq);
        mo13413y(6, k);
    }

    /* renamed from: l1 */
    public final void mo14428l1(Bundle bundle, zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, bundle);
        C4359q0.m16487d(k, zzq);
        mo13413y(19, k);
    }

    /* renamed from: o0 */
    public final void mo14429o0(zzaw zzaw, zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzaw);
        C4359q0.m16487d(k, zzq);
        mo13413y(1, k);
    }

    /* renamed from: o1 */
    public final List mo14430o1(String str, String str2, String str3, boolean z) {
        Parcel k = mo13411k();
        k.writeString((String) null);
        k.writeString(str2);
        k.writeString(str3);
        int i = C4359q0.f13602b;
        k.writeInt(z ? 1 : 0);
        Parcel x = mo13412x(15, k);
        ArrayList<zzlj> createTypedArrayList = x.createTypedArrayList(zzlj.CREATOR);
        x.recycle();
        return createTypedArrayList;
    }

    /* renamed from: q0 */
    public final void mo14431q0(zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzq);
        mo13413y(4, k);
    }

    /* renamed from: q2 */
    public final void mo14432q2(zzac zzac, zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzac);
        C4359q0.m16487d(k, zzq);
        mo13413y(12, k);
    }

    /* renamed from: t1 */
    public final byte[] mo14433t1(zzaw zzaw, String str) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzaw);
        k.writeString(str);
        Parcel x = mo13412x(9, k);
        byte[] createByteArray = x.createByteArray();
        x.recycle();
        return createByteArray;
    }

    /* renamed from: v0 */
    public final void mo14434v0(long j, String str, String str2, String str3) {
        Parcel k = mo13411k();
        k.writeLong(j);
        k.writeString(str);
        k.writeString(str2);
        k.writeString(str3);
        mo13413y(10, k);
    }

    /* renamed from: w1 */
    public final String mo14435w1(zzq zzq) {
        Parcel k = mo13411k();
        C4359q0.m16487d(k, zzq);
        Parcel x = mo13412x(11, k);
        String readString = x.readString();
        x.recycle();
        return readString;
    }
}
