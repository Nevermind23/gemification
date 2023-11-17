package com.airbnb.lottie;

import android.content.Context;
import androidx.core.p016os.C0934x;
import com.github.mikephil.charting.utils.Utils;
import java.io.File;
import p003a2.C0018b;
import p003a2.C0021e;
import p003a2.C0022f;
import p003a2.C0023g;
import p003a2.C0024h;

/* renamed from: com.airbnb.lottie.c */
public abstract class C2311c {

    /* renamed from: a */
    public static boolean f7186a = false;

    /* renamed from: b */
    private static boolean f7187b = false;

    /* renamed from: c */
    private static boolean f7188c = true;

    /* renamed from: d */
    private static boolean f7189d = true;

    /* renamed from: e */
    private static String[] f7190e;

    /* renamed from: f */
    private static long[] f7191f;

    /* renamed from: g */
    private static int f7192g;

    /* renamed from: h */
    private static int f7193h;

    /* renamed from: i */
    private static C0022f f7194i;

    /* renamed from: j */
    private static C0021e f7195j;

    /* renamed from: k */
    private static volatile C0024h f7196k;

    /* renamed from: l */
    private static volatile C0023g f7197l;

    /* renamed from: com.airbnb.lottie.c$a */
    class C2312a implements C0021e {

        /* renamed from: a */
        final /* synthetic */ Context f7198a;

        C2312a(Context context) {
            this.f7198a = context;
        }

        /* renamed from: a */
        public File mo78a() {
            return new File(this.f7198a.getCacheDir(), "lottie_network_cache");
        }
    }

    /* renamed from: a */
    public static void m8884a(String str) {
        if (f7187b) {
            int i = f7192g;
            if (i == 20) {
                f7193h++;
                return;
            }
            f7190e[i] = str;
            f7191f[i] = System.nanoTime();
            C0934x.m3381a(str);
            f7192g++;
        }
    }

    /* renamed from: b */
    public static float m8885b(String str) {
        int i = f7193h;
        if (i > 0) {
            f7193h = i - 1;
            return Utils.FLOAT_EPSILON;
        } else if (!f7187b) {
            return Utils.FLOAT_EPSILON;
        } else {
            int i2 = f7192g - 1;
            f7192g = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f7190e[i2])) {
                C0934x.m3382b();
                return ((float) (System.nanoTime() - f7191f[f7192g])) / 1000000.0f;
            } else {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f7190e[f7192g] + ".");
            }
        }
    }

    /* renamed from: c */
    public static boolean m8886c() {
        return f7189d;
    }

    /* renamed from: d */
    public static C0023g m8887d(Context context) {
        if (!f7188c) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        C0023g gVar = f7197l;
        if (gVar == null) {
            synchronized (C0023g.class) {
                gVar = f7197l;
                if (gVar == null) {
                    C0021e eVar = f7195j;
                    if (eVar == null) {
                        eVar = new C2312a(applicationContext);
                    }
                    gVar = new C0023g(eVar);
                    f7197l = gVar;
                }
            }
        }
        return gVar;
    }

    /* renamed from: e */
    public static C0024h m8888e(Context context) {
        C0024h hVar = f7196k;
        if (hVar == null) {
            synchronized (C0024h.class) {
                hVar = f7196k;
                if (hVar == null) {
                    C0023g d = m8887d(context);
                    C0022f fVar = f7194i;
                    if (fVar == null) {
                        fVar = new C0018b();
                    }
                    hVar = new C0024h(d, fVar);
                    f7196k = hVar;
                }
            }
        }
        return hVar;
    }
}
