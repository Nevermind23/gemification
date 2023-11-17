package p182n6;

import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* renamed from: n6.n0 */
public final class C7276n0 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15126O(r11)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r9 = r7
            r5 = r2
            r6 = r5
            r8 = r6
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0044
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15116E(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15151w(r1)
            switch(r2) {
                case 1: goto L_0x003a;
                case 2: goto L_0x0035;
                case 3: goto L_0x0030;
                case 4: goto L_0x002b;
                case 5: goto L_0x0026;
                case 6: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15125N(r11, r1)
            goto L_0x000c
        L_0x0021:
            int[] r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15139k(r11, r1)
            goto L_0x000c
        L_0x0026:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15118G(r11, r1)
            goto L_0x000c
        L_0x002b:
            int[] r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15139k(r11, r1)
            goto L_0x000c
        L_0x0030:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15152x(r11, r1)
            goto L_0x000c
        L_0x0035:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15152x(r11, r1)
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> r2 = com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15143o(r11, r1, r2)
            r4 = r1
            com.google.android.gms.common.internal.RootTelemetryConfiguration r4 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r4
            goto L_0x000c
        L_0x0044:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15150v(r11, r0)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p182n6.C7276n0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
