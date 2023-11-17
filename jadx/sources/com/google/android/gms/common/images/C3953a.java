package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p182n6.C7247b;

/* renamed from: com.google.android.gms.common.images.a */
final class C3953a implements Runnable {

    /* renamed from: d */
    private final Uri f12598d;

    /* renamed from: e */
    private final ParcelFileDescriptor f12599e;

    public C3953a(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.f12598d = uri;
        this.f12599e = parcelFileDescriptor;
    }

    public final void run() {
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2;
        C7247b.m27853b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        ParcelFileDescriptor parcelFileDescriptor = this.f12599e;
        boolean z2 = false;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e) {
                Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(String.valueOf(this.f12598d)), e);
                z2 = true;
                bitmap2 = null;
            }
            try {
                this.f12599e.close();
            } catch (IOException e2) {
                Log.e("ImageManager", "closed failed", e2);
            }
            bitmap = bitmap2;
            z = z2;
        } else {
            z = false;
            bitmap = null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager.m14983b((ImageManager) null).post(new C3954b((ImageManager) null, this.f12598d, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Log.w("ImageManager", "Latch interrupted while posting ".concat(String.valueOf(this.f12598d)));
        }
    }
}
