package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcelable;

/* renamed from: com.google.android.gms.fido.u2f.api.common.h */
public final class C4064h implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15126O(r11)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0052
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15116E(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15151w(r1)
            switch(r2) {
                case 2: goto L_0x004d;
                case 3: goto L_0x0048;
                case 4: goto L_0x003e;
                case 5: goto L_0x0037;
                case 6: goto L_0x0030;
                case 7: goto L_0x0026;
                case 8: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15125N(r11, r1)
            goto L_0x000c
        L_0x0021:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15144p(r11, r1)
            goto L_0x000c
        L_0x0026:
            android.os.Parcelable$Creator<com.google.android.gms.fido.u2f.api.common.ChannelIdValue> r2 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15143o(r11, r1, r2)
            r8 = r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r8
            goto L_0x000c
        L_0x0030:
            android.os.Parcelable$Creator<com.google.android.gms.fido.u2f.api.common.RegisteredKey> r2 = com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR
            java.util.ArrayList r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15149u(r11, r1, r2)
            goto L_0x000c
        L_0x0037:
            android.os.Parcelable$Creator<com.google.android.gms.fido.u2f.api.common.RegisterRequest> r2 = com.google.android.gms.fido.u2f.api.common.RegisterRequest.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15149u(r11, r1, r2)
            goto L_0x000c
        L_0x003e:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15143o(r11, r1, r2)
            r5 = r1
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x000c
        L_0x0048:
            java.lang.Double r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15113B(r11, r1)
            goto L_0x000c
        L_0x004d:
            java.lang.Integer r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15119H(r11, r1)
            goto L_0x000c
        L_0x0052:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15150v(r11, r0)
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r11 = new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.C4064h.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequestParams[i];
    }
}
