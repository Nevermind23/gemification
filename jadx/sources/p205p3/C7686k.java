package p205p3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: p3.k */
public class C7686k implements C7676d {

    /* renamed from: k */
    private static final Bitmap.Config f22343k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C7689l f22344a;

    /* renamed from: b */
    private final Set f22345b;

    /* renamed from: c */
    private final long f22346c;

    /* renamed from: d */
    private final C7687a f22347d;

    /* renamed from: e */
    private long f22348e;

    /* renamed from: f */
    private long f22349f;

    /* renamed from: g */
    private int f22350g;

    /* renamed from: h */
    private int f22351h;

    /* renamed from: i */
    private int f22352i;

    /* renamed from: j */
    private int f22353j;

    /* renamed from: p3.k$a */
    private interface C7687a {
        /* renamed from: a */
        void mo22416a(Bitmap bitmap);

        /* renamed from: b */
        void mo22417b(Bitmap bitmap);
    }

    /* renamed from: p3.k$b */
    private static final class C7688b implements C7687a {
        C7688b() {
        }

        /* renamed from: a */
        public void mo22416a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo22417b(Bitmap bitmap) {
        }
    }

    C7686k(long j, C7689l lVar, Set set) {
        this.f22346c = j;
        this.f22348e = j;
        this.f22344a = lVar;
        this.f22345b = set;
        this.f22347d = new C7688b();
    }

    /* renamed from: f */
    private static void m29191f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m29192g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f22343k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m29193h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m29194i();
        }
    }

    /* renamed from: i */
    private void m29194i() {
        Log.v("LruBitmapPool", "Hits=" + this.f22350g + ", misses=" + this.f22351h + ", puts=" + this.f22352i + ", evictions=" + this.f22353j + ", currentSize=" + this.f22349f + ", maxSize=" + this.f22348e + "\nStrategy=" + this.f22344a);
    }

    /* renamed from: j */
    private void m29195j() {
        m29201q(this.f22348e);
    }

    /* renamed from: k */
    private static Set m29196k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static C7689l m29197l() {
        return new C7692o();
    }

    /* renamed from: m */
    private synchronized Bitmap m29198m(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap d;
        m29191f(config);
        C7689l lVar = this.f22344a;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f22343k;
        }
        d = lVar.mo22421d(i, i2, config2);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f22344a.mo22419b(i, i2, config));
            }
            this.f22351h++;
        } else {
            this.f22350g++;
            this.f22349f -= (long) this.f22344a.mo22422e(d);
            this.f22347d.mo22416a(d);
            m29200p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f22344a.mo22419b(i, i2, config));
        }
        m29193h();
        return d;
    }

    /* renamed from: o */
    private static void m29199o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    private static void m29200p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m29199o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m29201q(long j) {
        while (this.f22349f > j) {
            Bitmap removeLast = this.f22344a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m29194i();
                }
                this.f22349f = 0;
                return;
            }
            this.f22347d.mo22416a(removeLast);
            this.f22349f -= (long) this.f22344a.mo22422e(removeLast);
            this.f22353j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f22344a.mo22418a(removeLast));
            }
            m29193h();
            removeLast.recycle();
        }
    }

    /* renamed from: a */
    public void mo22393a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo22394b();
        } else if (i >= 20 || i == 15) {
            m29201q(mo22415n() / 2);
        }
    }

    /* renamed from: b */
    public void mo22394b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m29201q(0);
    }

    /* renamed from: c */
    public synchronized void mo8047c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f22344a.mo22422e(bitmap)) <= this.f22348e) {
                        if (this.f22345b.contains(bitmap.getConfig())) {
                            int e = this.f22344a.mo22422e(bitmap);
                            this.f22344a.mo22420c(bitmap);
                            this.f22347d.mo22417b(bitmap);
                            this.f22352i++;
                            this.f22349f += (long) e;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f22344a.mo22418a(bitmap));
                            }
                            m29193h();
                            m29195j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f22344a.mo22418a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f22345b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: d */
    public Bitmap mo22395d(int i, int i2, Bitmap.Config config) {
        Bitmap m = m29198m(i, i2, config);
        if (m == null) {
            return m29192g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    /* renamed from: e */
    public Bitmap mo22396e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m29198m(i, i2, config);
        if (m == null) {
            return m29192g(i, i2, config);
        }
        return m;
    }

    /* renamed from: n */
    public long mo22415n() {
        return this.f22348e;
    }

    public C7686k(long j) {
        this(j, m29197l(), m29196k());
    }
}
