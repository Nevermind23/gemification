package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import p166m3.C7088h;
import p166m3.C7090j;
import p192o3.C7430c;

/* renamed from: com.bumptech.glide.load.resource.bitmap.e0 */
public final class C2500e0 implements C7090j {

    /* renamed from: a */
    private final C2548u f7934a;

    public C2500e0(C2548u uVar) {
        this.f7934a = uVar;
    }

    /* renamed from: e */
    private boolean m9676e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        if (("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public C7430c mo7972b(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C7088h hVar) {
        return this.f7934a.mo8041d(parcelFileDescriptor, i, i2, hVar);
    }

    /* renamed from: d */
    public boolean mo7971a(ParcelFileDescriptor parcelFileDescriptor, C7088h hVar) {
        return m9676e(parcelFileDescriptor) && this.f7934a.mo8044o(parcelFileDescriptor);
    }
}
