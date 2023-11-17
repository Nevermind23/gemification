package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p066e7.C6041e;

public abstract class ImageManager {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f12590a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static HashSet f12591b = new HashSet();

    @KeepName
    private final class ImageReceiver extends ResultReceiver {

        /* renamed from: d */
        private final Uri f12592d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final ArrayList f12593e;

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.m14989h((ImageManager) null).execute(new C3953a((ImageManager) null, this.f12592d, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Context m14982a(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ Handler m14983b(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ C6041e m14984c(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: f */
    static /* bridge */ /* synthetic */ Map m14987f(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ Map m14988g(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ ExecutorService m14989h(ImageManager imageManager) {
        throw null;
    }
}
