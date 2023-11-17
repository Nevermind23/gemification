package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import p182n6.C7258g;
import p182n6.C7264i;

public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new C4053v();

    /* renamed from: d */
    private final C4032a f12902d;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i) {
            super("Algorithm with COSE value " + i + " not supported");
        }
    }

    COSEAlgorithmIdentifier(C4032a aVar) {
        this.f12902d = (C4032a) C7264i.m27902k(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: y6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: y6.a[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: y6.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: y6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: y6.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: y6.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier m15323a(int r7) {
        /*
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier
            y6.b r1 = p324y6.C9065b.LEGACY_RS1
            int r1 = r1.mo12587a()
            if (r7 != r1) goto L_0x000d
            y6.b r7 = p324y6.C9065b.RS1
            goto L_0x0033
        L_0x000d:
            y6.b[] r1 = p324y6.C9065b.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x0023
            r5 = r1[r4]
            int r6 = r5.mo12587a()
            if (r6 != r7) goto L_0x0020
            r7 = r5
            goto L_0x0033
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x0023:
            y6.a[] r1 = p324y6.C9064a.values()
            int r2 = r1.length
        L_0x0028:
            if (r3 >= r2) goto L_0x003a
            r4 = r1[r3]
            int r5 = r4.mo12587a()
            if (r5 != r7) goto L_0x0037
            r7 = r4
        L_0x0033:
            r0.<init>(r7)
            return r0
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x003a:
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException r0 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.m15323a(int):com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier");
    }

    /* renamed from: b */
    public int mo12478b() {
        return this.f12902d.mo12587a();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof COSEAlgorithmIdentifier) && this.f12902d.mo12587a() == ((COSEAlgorithmIdentifier) obj).f12902d.mo12587a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f12902d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12902d.mo12587a());
    }
}
