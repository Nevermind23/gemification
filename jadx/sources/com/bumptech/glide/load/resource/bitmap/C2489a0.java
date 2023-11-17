package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a0 */
public final class C2489a0 {

    /* renamed from: g */
    public static final boolean f7906g;

    /* renamed from: h */
    public static final boolean f7907h;

    /* renamed from: i */
    private static final File f7908i = new File("/proc/self/fd");

    /* renamed from: j */
    private static volatile C2489a0 f7909j;

    /* renamed from: k */
    private static volatile int f7910k = -1;

    /* renamed from: a */
    private final boolean f7911a = m9636f();

    /* renamed from: b */
    private final int f7912b;

    /* renamed from: c */
    private final int f7913c;

    /* renamed from: d */
    private int f7914d;

    /* renamed from: e */
    private boolean f7915e = true;

    /* renamed from: f */
    private final AtomicBoolean f7916f = new AtomicBoolean(false);

    static {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i < 29) {
            z = true;
        } else {
            z = false;
        }
        f7906g = z;
        if (i < 26) {
            z2 = false;
        }
        f7907h = z2;
    }

    C2489a0() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7912b = 20000;
            this.f7913c = 0;
            return;
        }
        this.f7912b = 700;
        this.f7913c = 128;
    }

    /* renamed from: a */
    private boolean m9632a() {
        if (!f7906g || this.f7916f.get()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static C2489a0 m9633b() {
        if (f7909j == null) {
            synchronized (C2489a0.class) {
                if (f7909j == null) {
                    f7909j = new C2489a0();
                }
            }
        }
        return f7909j;
    }

    /* renamed from: c */
    private int m9634c() {
        if (f7910k != -1) {
            return f7910k;
        }
        return this.f7912b;
    }

    /* renamed from: d */
    private synchronized boolean m9635d() {
        boolean z = true;
        int i = this.f7914d + 1;
        this.f7914d = i;
        if (i >= 50) {
            this.f7914d = 0;
            int length = f7908i.list().length;
            long c = (long) m9634c();
            if (((long) length) >= c) {
                z = false;
            }
            this.f7915e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c);
            }
        }
        return this.f7915e;
    }

    /* renamed from: f */
    private static boolean m9636f() {
        return !m9637g() && !m9638h();
    }

    /* renamed from: g */
    private static boolean m9637g() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m9638h() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList(new String[]{"LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM"}).contains(Build.MODEL);
    }

    /* renamed from: e */
    public boolean mo7973e(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f7911a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f7907h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (m9632a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else {
            int i3 = this.f7913c;
            if (i < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                }
                return false;
            } else if (i2 < i3) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                }
                return false;
            } else if (m9635d()) {
                return true;
            } else {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo7974i(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean e = mo7973e(i, i2, z, z2);
        if (e) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return e;
    }
}
