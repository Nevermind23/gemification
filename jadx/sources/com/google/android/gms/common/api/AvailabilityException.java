package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import p156l6.C6931b;
import p182n6.C7264i;

public class AvailabilityException extends Exception {

    /* renamed from: d */
    private final ArrayMap f12247d;

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C6931b bVar : this.f12247d.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C7264i.m27902k((ConnectionResult) this.f12247d.get(bVar));
            z &= !connectionResult.mo11855f0();
            String b = bVar.mo21077b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
