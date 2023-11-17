package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p195o6.C7461a;

/* renamed from: com.google.android.gms.common.internal.v */
public final class C3984v implements Parcelable.Creator {
    /* renamed from: a */
    static void m15155a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28383o(parcel, 1, getServiceRequest.f12616d);
        C7461a.m28383o(parcel, 2, getServiceRequest.f12617e);
        C7461a.m28383o(parcel, 3, getServiceRequest.f12618f);
        C7461a.m28392x(parcel, 4, getServiceRequest.f12619g, false);
        C7461a.m28382n(parcel, 5, getServiceRequest.f12620h, false);
        C7461a.m28363B(parcel, 6, getServiceRequest.f12621i, i, false);
        C7461a.m28374f(parcel, 7, getServiceRequest.f12622j, false);
        C7461a.m28390v(parcel, 8, getServiceRequest.f12623k, i, false);
        C7461a.m28363B(parcel, 10, getServiceRequest.f12624l, i, false);
        C7461a.m28363B(parcel, 11, getServiceRequest.f12625m, i, false);
        C7461a.m28372d(parcel, 12, getServiceRequest.f12626n);
        C7461a.m28383o(parcel, 13, getServiceRequest.f12627o);
        C7461a.m28372d(parcel, 14, getServiceRequest.f12628p);
        C7461a.m28392x(parcel, 15, getServiceRequest.mo12202v(), false);
        C7461a.m28370b(parcel, a);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r23) {
        /*
            r22 = this;
            r0 = r23
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15126O(r23)
            com.google.android.gms.common.api.Scope[] r2 = com.google.android.gms.common.internal.GetServiceRequest.f12614r
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.google.android.gms.common.Feature[] r4 = com.google.android.gms.common.internal.GetServiceRequest.f12615s
            r5 = 0
            r6 = 0
            r13 = r2
            r14 = r3
            r16 = r4
            r17 = r16
            r11 = r5
            r12 = r11
            r15 = r12
            r21 = r15
            r8 = r6
            r9 = r8
            r10 = r9
            r18 = r10
            r19 = r18
            r20 = r19
        L_0x0025:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L_0x0096
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15116E(r23)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15151w(r2)
            switch(r3) {
                case 1: goto L_0x0091;
                case 2: goto L_0x008c;
                case 3: goto L_0x0087;
                case 4: goto L_0x0082;
                case 5: goto L_0x007d;
                case 6: goto L_0x0073;
                case 7: goto L_0x006e;
                case 8: goto L_0x0064;
                case 9: goto L_0x0036;
                case 10: goto L_0x0059;
                case 11: goto L_0x004e;
                case 12: goto L_0x0049;
                case 13: goto L_0x0044;
                case 14: goto L_0x003f;
                case 15: goto L_0x003a;
                default: goto L_0x0036;
            }
        L_0x0036:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15125N(r0, r2)
            goto L_0x0025
        L_0x003a:
            java.lang.String r21 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15144p(r0, r2)
            goto L_0x0025
        L_0x003f:
            boolean r20 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15152x(r0, r2)
            goto L_0x0025
        L_0x0044:
            int r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15118G(r0, r2)
            goto L_0x0025
        L_0x0049:
            boolean r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15152x(r0, r2)
            goto L_0x0025
        L_0x004e:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15148t(r0, r2, r3)
            r17 = r2
            com.google.android.gms.common.Feature[] r17 = (com.google.android.gms.common.Feature[]) r17
            goto L_0x0025
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.common.Feature> r3 = com.google.android.gms.common.Feature.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15148t(r0, r2, r3)
            r16 = r2
            com.google.android.gms.common.Feature[] r16 = (com.google.android.gms.common.Feature[]) r16
            goto L_0x0025
        L_0x0064:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15143o(r0, r2, r3)
            r15 = r2
            android.accounts.Account r15 = (android.accounts.Account) r15
            goto L_0x0025
        L_0x006e:
            android.os.Bundle r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15134f(r0, r2)
            goto L_0x0025
        L_0x0073:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15148t(r0, r2, r3)
            r13 = r2
            com.google.android.gms.common.api.Scope[] r13 = (com.google.android.gms.common.api.Scope[]) r13
            goto L_0x0025
        L_0x007d:
            android.os.IBinder r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15117F(r0, r2)
            goto L_0x0025
        L_0x0082:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15144p(r0, r2)
            goto L_0x0025
        L_0x0087:
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15118G(r0, r2)
            goto L_0x0025
        L_0x008c:
            int r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15118G(r0, r2)
            goto L_0x0025
        L_0x0091:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15118G(r0, r2)
            goto L_0x0025
        L_0x0096:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m15150v(r0, r1)
            com.google.android.gms.common.internal.GetServiceRequest r0 = new com.google.android.gms.common.internal.GetServiceRequest
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3984v.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
