package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.support.p013v4.media.session.C0125b;
import com.google.android.gms.common.images.ImageManager;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import p182n6.C7247b;

/* renamed from: com.google.android.gms.common.images.b */
final class C3954b implements Runnable {

    /* renamed from: d */
    private final Uri f12600d;

    /* renamed from: e */
    private final Bitmap f12601e;

    /* renamed from: f */
    private final CountDownLatch f12602f;

    public C3954b(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.f12600d = uri;
        this.f12601e = bitmap;
        this.f12602f = countDownLatch;
    }

    public final void run() {
        C7247b.m27852a("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f12601e;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) ImageManager.m14988g((ImageManager) null).remove(this.f12600d);
        if (imageReceiver != null) {
            ArrayList a = imageReceiver.f12593e;
            if (a.size() > 0) {
                C0125b.m366a(a.get(0));
                if (this.f12601e == null || bitmap == null) {
                    ImageManager.m14987f((ImageManager) null).put(this.f12600d, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager.m14982a((ImageManager) null);
                    ImageManager.m14984c((ImageManager) null);
                    throw null;
                }
                ImageManager.m14982a((ImageManager) null);
                throw null;
            }
        }
        this.f12602f.countDown();
        synchronized (ImageManager.f12590a) {
            ImageManager.f12591b.remove(this.f12600d);
        }
    }
}
