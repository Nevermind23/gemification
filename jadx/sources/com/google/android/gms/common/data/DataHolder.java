package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p169m6.C7139a;
import p182n6.C7264i;
import p195o6.C7461a;

@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C3947c();

    /* renamed from: n */
    private static final C3944a f12568n = new C3946b(new String[0], (String) null);

    /* renamed from: d */
    final int f12569d;

    /* renamed from: e */
    private final String[] f12570e;

    /* renamed from: f */
    Bundle f12571f;

    /* renamed from: g */
    private final CursorWindow[] f12572g;

    /* renamed from: h */
    private final int f12573h;

    /* renamed from: i */
    private final Bundle f12574i;

    /* renamed from: j */
    int[] f12575j;

    /* renamed from: k */
    int f12576k;

    /* renamed from: l */
    boolean f12577l = false;

    /* renamed from: m */
    private boolean f12578m = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C3944a {

        /* renamed from: a */
        private final String[] f12579a;

        /* renamed from: b */
        private final ArrayList f12580b = new ArrayList();

        /* renamed from: c */
        private final HashMap f12581c = new HashMap();

        /* synthetic */ C3944a(String[] strArr, String str, C7139a aVar) {
            this.f12579a = (String[]) C7264i.m27902k(strArr);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f12569d = i;
        this.f12570e = strArr;
        this.f12572g = cursorWindowArr;
        this.f12573h = i2;
        this.f12574i = bundle;
    }

    public void close() {
        synchronized (this) {
            if (!this.f12577l) {
                this.f12577l = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f12572g;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f12578m && this.f12572g.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f12577l;
        }
        return z;
    }

    /* renamed from: v */
    public Bundle mo12163v() {
        return this.f12574i;
    }

    /* renamed from: w */
    public int mo12164w() {
        return this.f12573h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C7461a.m28369a(parcel);
        C7461a.m28393y(parcel, 1, this.f12570e, false);
        C7461a.m28363B(parcel, 2, this.f12572g, i, false);
        C7461a.m28383o(parcel, 3, mo12164w());
        C7461a.m28374f(parcel, 4, mo12163v(), false);
        C7461a.m28383o(parcel, 1000, this.f12569d);
        C7461a.m28370b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* renamed from: x */
    public final void mo12166x() {
        this.f12571f = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f12570e;
            if (i2 >= strArr.length) {
                break;
            }
            this.f12571f.putInt(strArr[i2], i2);
            i2++;
        }
        this.f12575j = new int[this.f12572g.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f12572g;
            if (i < cursorWindowArr.length) {
                this.f12575j[i] = i3;
                i3 += this.f12572g[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f12576k = i3;
                return;
            }
        }
    }
}
