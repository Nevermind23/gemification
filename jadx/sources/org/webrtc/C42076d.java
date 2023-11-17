package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;

/* renamed from: org.webrtc.d */
public interface C42076d {

    /* renamed from: a */
    public static final Object f98959a = new Object();

    /* renamed from: b */
    public static final int[] f98960b = C42075c.m122226a().mo97589a();

    /* renamed from: c */
    public static final int[] f98961c = C42075c.m122226a().mo97590b(true).mo97589a();

    /* renamed from: d */
    public static final int[] f98962d = C42075c.m122226a().mo97592d(true).mo97589a();

    /* renamed from: e */
    public static final int[] f98963e = C42075c.m122226a().mo97590b(true).mo97592d(true).mo97589a();

    /* renamed from: f */
    public static final int[] f98964f = C42075c.m122226a().mo97591c(true).mo97589a();

    /* renamed from: org.webrtc.d$a */
    public static class C42077a {

        /* renamed from: a */
        private int f98965a = 2;

        /* renamed from: b */
        private boolean f98966b;

        /* renamed from: c */
        private boolean f98967c;

        /* renamed from: d */
        private boolean f98968d;

        /* renamed from: a */
        public int[] mo97589a() {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.f98966b) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i2 = this.f98965a;
            if (i2 == 2 || i2 == 3) {
                arrayList.add(12352);
                if (this.f98965a == 3) {
                    i = 64;
                } else {
                    i = 4;
                }
                arrayList.add(Integer.valueOf(i));
            }
            if (this.f98967c) {
                arrayList.add(12339);
                arrayList.add(1);
            }
            if (this.f98968d) {
                arrayList.add(12610);
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            return iArr;
        }

        /* renamed from: b */
        public C42077a mo97590b(boolean z) {
            this.f98966b = z;
            return this;
        }

        /* renamed from: c */
        public C42077a mo97591c(boolean z) {
            this.f98968d = z;
            return this;
        }

        /* renamed from: d */
        public C42077a mo97592d(boolean z) {
            this.f98967c = z;
            return this;
        }
    }

    /* renamed from: org.webrtc.d$b */
    public interface C42078b {
    }

    /* renamed from: a */
    void mo97536a();

    /* renamed from: b */
    void mo97537b(Surface surface);

    /* renamed from: c */
    C42078b mo97538c();

    /* renamed from: d */
    void mo97539d();

    /* renamed from: e */
    boolean mo97540e();

    /* renamed from: f */
    void mo97541f(SurfaceTexture surfaceTexture);

    /* renamed from: g */
    void mo97542g();

    /* renamed from: h */
    void mo97543h();
}
