package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.C0860g;
import androidx.core.util.C1008h;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.provider.g */
public abstract class C0953g {

    /* renamed from: androidx.core.provider.g$a */
    public static class C0954a {

        /* renamed from: a */
        private final int f3586a;

        /* renamed from: b */
        private final C0955b[] f3587b;

        public C0954a(int i, C0955b[] bVarArr) {
            this.f3586a = i;
            this.f3587b = bVarArr;
        }

        /* renamed from: a */
        static C0954a m3421a(int i, C0955b[] bVarArr) {
            return new C0954a(i, bVarArr);
        }

        /* renamed from: b */
        public C0955b[] mo3400b() {
            return this.f3587b;
        }

        /* renamed from: c */
        public int mo3401c() {
            return this.f3586a;
        }
    }

    /* renamed from: androidx.core.provider.g$b */
    public static class C0955b {

        /* renamed from: a */
        private final Uri f3588a;

        /* renamed from: b */
        private final int f3589b;

        /* renamed from: c */
        private final int f3590c;

        /* renamed from: d */
        private final boolean f3591d;

        /* renamed from: e */
        private final int f3592e;

        public C0955b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f3588a = (Uri) C1008h.m3530g(uri);
            this.f3589b = i;
            this.f3590c = i2;
            this.f3591d = z;
            this.f3592e = i3;
        }

        /* renamed from: a */
        static C0955b m3424a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C0955b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int mo3402b() {
            return this.f3592e;
        }

        /* renamed from: c */
        public int mo3403c() {
            return this.f3589b;
        }

        /* renamed from: d */
        public Uri mo3404d() {
            return this.f3588a;
        }

        /* renamed from: e */
        public int mo3405e() {
            return this.f3590c;
        }

        /* renamed from: f */
        public boolean mo3406f() {
            return this.f3591d;
        }
    }

    /* renamed from: androidx.core.provider.g$c */
    public static class C0956c {
        /* renamed from: a */
        public abstract void mo3329a(int i);

        /* renamed from: b */
        public abstract void mo3330b(Typeface typeface);
    }

    /* renamed from: a */
    public static Typeface m3418a(Context context, CancellationSignal cancellationSignal, C0955b[] bVarArr) {
        return C0860g.m3212b(context, cancellationSignal, bVarArr, 0);
    }

    /* renamed from: b */
    public static C0954a m3419b(Context context, CancellationSignal cancellationSignal, C0946e eVar) {
        return C0944d.m3396e(context, eVar, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m3420c(Context context, C0946e eVar, int i, boolean z, int i2, Handler handler, C0956c cVar) {
        C0939a aVar = new C0939a(cVar, handler);
        if (z) {
            return C0947f.m3412e(context, eVar, aVar, i, i2);
        }
        return C0947f.m3411d(context, eVar, i, (Executor) null, aVar);
    }
}
