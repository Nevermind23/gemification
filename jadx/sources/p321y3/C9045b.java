package p321y3;

import android.graphics.Bitmap;
import p153l3.C6874a;
import p205p3.C7674b;
import p205p3.C7676d;

/* renamed from: y3.b */
public final class C9045b implements C6874a.C6875a {

    /* renamed from: a */
    private final C7676d f25196a;

    /* renamed from: b */
    private final C7674b f25197b;

    public C9045b(C7676d dVar, C7674b bVar) {
        this.f25196a = dVar;
        this.f25197b = bVar;
    }

    /* renamed from: a */
    public void mo20958a(Bitmap bitmap) {
        this.f25196a.mo8047c(bitmap);
    }

    /* renamed from: b */
    public byte[] mo20959b(int i) {
        C7674b bVar = this.f25197b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo22387c(i, byte[].class);
    }

    /* renamed from: c */
    public Bitmap mo20960c(int i, int i2, Bitmap.Config config) {
        return this.f25196a.mo22396e(i, i2, config);
    }

    /* renamed from: d */
    public int[] mo20961d(int i) {
        C7674b bVar = this.f25197b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo22387c(i, int[].class);
    }

    /* renamed from: e */
    public void mo20962e(byte[] bArr) {
        C7674b bVar = this.f25197b;
        if (bVar != null) {
            bVar.mo22389e(bArr);
        }
    }

    /* renamed from: f */
    public void mo20963f(int[] iArr) {
        C7674b bVar = this.f25197b;
        if (bVar != null) {
            bVar.mo22389e(iArr);
        }
    }
}
