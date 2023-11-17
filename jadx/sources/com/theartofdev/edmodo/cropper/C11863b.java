package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.theartofdev.edmodo.cropper.C11865c;
import java.lang.ref.WeakReference;

/* renamed from: com.theartofdev.edmodo.cropper.b */
final class C11863b extends AsyncTask {

    /* renamed from: a */
    private final WeakReference f34616a;

    /* renamed from: b */
    private final Uri f34617b;

    /* renamed from: c */
    private final Context f34618c;

    /* renamed from: d */
    private final int f34619d;

    /* renamed from: e */
    private final int f34620e;

    public C11863b(CropImageView cropImageView, Uri uri) {
        double d;
        this.f34617b = uri;
        this.f34616a = new WeakReference(cropImageView);
        this.f34618c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        if (f > 1.0f) {
            d = (double) (1.0f / f);
        } else {
            d = 1.0d;
        }
        this.f34619d = (int) (((double) displayMetrics.widthPixels) * d);
        this.f34620e = (int) (((double) displayMetrics.heightPixels) * d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11864a doInBackground(Void... voidArr) {
        try {
            if (isCancelled()) {
                return null;
            }
            C11865c.C11866a l = C11865c.m43462l(this.f34618c, this.f34617b, this.f34619d, this.f34620e);
            if (isCancelled()) {
                return null;
            }
            C11865c.C11867b A = C11865c.m43447A(l.f34633a, this.f34618c, this.f34617b);
            return new C11864a(this.f34617b, A.f34635a, l.f34634b, A.f34636b);
        } catch (Exception e) {
            return new C11864a(this.f34617b, e);
        }
    }

    /* renamed from: b */
    public Uri mo31860b() {
        return this.f34617b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(C11864a aVar) {
        boolean z;
        Bitmap bitmap;
        CropImageView cropImageView;
        if (aVar != null) {
            if (isCancelled() || (cropImageView = (CropImageView) this.f34616a.get()) == null) {
                z = false;
            } else {
                cropImageView.mo31787o(aVar);
                z = true;
            }
            if (!z && (bitmap = aVar.f34622b) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.b$a */
    public static final class C11864a {

        /* renamed from: a */
        public final Uri f34621a;

        /* renamed from: b */
        public final Bitmap f34622b;

        /* renamed from: c */
        public final int f34623c;

        /* renamed from: d */
        public final int f34624d;

        /* renamed from: e */
        public final Exception f34625e;

        C11864a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.f34621a = uri;
            this.f34622b = bitmap;
            this.f34623c = i;
            this.f34624d = i2;
            this.f34625e = null;
        }

        C11864a(Uri uri, Exception exc) {
            this.f34621a = uri;
            this.f34622b = null;
            this.f34623c = 0;
            this.f34624d = 0;
            this.f34625e = exc;
        }
    }
}
