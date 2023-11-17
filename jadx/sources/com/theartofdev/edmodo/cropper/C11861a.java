package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.C11865c;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.a */
final class C11861a extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f34592a;

    /* renamed from: b */
    private final Bitmap f34593b;

    /* renamed from: c */
    private final Uri f34594c;

    /* renamed from: d */
    private final Context f34595d;

    /* renamed from: e */
    private final float[] f34596e;

    /* renamed from: f */
    private final int f34597f;

    /* renamed from: g */
    private final int f34598g;

    /* renamed from: h */
    private final int f34599h;

    /* renamed from: i */
    private final boolean f34600i;

    /* renamed from: j */
    private final int f34601j;

    /* renamed from: k */
    private final int f34602k;

    /* renamed from: l */
    private final int f34603l;

    /* renamed from: m */
    private final int f34604m;

    /* renamed from: n */
    private final boolean f34605n;

    /* renamed from: o */
    private final boolean f34606o;

    /* renamed from: p */
    private final CropImageView.C11856j f34607p;

    /* renamed from: q */
    private final Uri f34608q;

    /* renamed from: r */
    private final Bitmap.CompressFormat f34609r;

    /* renamed from: s */
    private final int f34610s;

    C11861a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, int i4, int i5, boolean z2, boolean z3, CropImageView.C11856j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i6) {
        CropImageView cropImageView2 = cropImageView;
        this.f34592a = new WeakReference(cropImageView);
        this.f34595d = cropImageView.getContext();
        this.f34593b = bitmap;
        this.f34596e = fArr;
        this.f34594c = null;
        this.f34597f = i;
        this.f34600i = z;
        this.f34601j = i2;
        this.f34602k = i3;
        this.f34603l = i4;
        this.f34604m = i5;
        this.f34605n = z2;
        this.f34606o = z3;
        this.f34607p = jVar;
        this.f34608q = uri;
        this.f34609r = compressFormat;
        this.f34610s = i6;
        this.f34598g = 0;
        this.f34599h = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11862a doInBackground(Void... voidArr) {
        C11865c.C11866a aVar;
        boolean z = true;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.f34594c;
            if (uri != null) {
                aVar = C11865c.m43454d(this.f34595d, uri, this.f34596e, this.f34597f, this.f34598g, this.f34599h, this.f34600i, this.f34601j, this.f34602k, this.f34603l, this.f34604m, this.f34605n, this.f34606o);
            } else {
                Bitmap bitmap = this.f34593b;
                if (bitmap == null) {
                    return new C11862a((Bitmap) null, 1);
                }
                aVar = C11865c.m43457g(bitmap, this.f34596e, this.f34597f, this.f34600i, this.f34601j, this.f34602k, this.f34605n, this.f34606o);
            }
            Bitmap y = C11865c.m43475y(aVar.f34633a, this.f34603l, this.f34604m, this.f34607p);
            Uri uri2 = this.f34608q;
            if (uri2 == null) {
                return new C11862a(y, aVar.f34634b);
            }
            C11865c.m43449C(this.f34595d, y, uri2, this.f34609r, this.f34610s);
            if (y != null) {
                y.recycle();
            }
            return new C11862a(this.f34608q, aVar.f34634b);
        } catch (Exception e) {
            if (this.f34608q == null) {
                z = false;
            }
            return new C11862a(e, z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(C11862a aVar) {
        boolean z;
        Bitmap bitmap;
        CropImageView cropImageView;
        if (aVar != null) {
            if (isCancelled() || (cropImageView = (CropImageView) this.f34592a.get()) == null) {
                z = false;
            } else {
                cropImageView.mo31786n(aVar);
                z = true;
            }
            if (!z && (bitmap = aVar.f34611a) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.a$a */
    static final class C11862a {

        /* renamed from: a */
        public final Bitmap f34611a;

        /* renamed from: b */
        public final Uri f34612b;

        /* renamed from: c */
        final Exception f34613c;

        /* renamed from: d */
        final boolean f34614d;

        /* renamed from: e */
        final int f34615e;

        C11862a(Bitmap bitmap, int i) {
            this.f34611a = bitmap;
            this.f34612b = null;
            this.f34613c = null;
            this.f34614d = false;
            this.f34615e = i;
        }

        C11862a(Uri uri, int i) {
            this.f34611a = null;
            this.f34612b = uri;
            this.f34613c = null;
            this.f34614d = true;
            this.f34615e = i;
        }

        C11862a(Exception exc, boolean z) {
            this.f34611a = null;
            this.f34612b = null;
            this.f34613c = exc;
            this.f34614d = z;
            this.f34615e = 1;
        }
    }

    C11861a(CropImageView cropImageView, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3, CropImageView.C11856j jVar, Uri uri2, Bitmap.CompressFormat compressFormat, int i8) {
        CropImageView cropImageView2 = cropImageView;
        this.f34592a = new WeakReference(cropImageView);
        this.f34595d = cropImageView.getContext();
        this.f34594c = uri;
        this.f34596e = fArr;
        this.f34597f = i;
        this.f34600i = z;
        this.f34601j = i4;
        this.f34602k = i5;
        this.f34598g = i2;
        this.f34599h = i3;
        this.f34603l = i6;
        this.f34604m = i7;
        this.f34605n = z2;
        this.f34606o = z3;
        this.f34607p = jVar;
        this.f34608q = uri2;
        this.f34609r = compressFormat;
        this.f34610s = i8;
        this.f34593b = null;
    }
}
