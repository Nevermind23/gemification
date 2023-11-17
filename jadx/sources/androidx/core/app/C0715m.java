package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.salesforce.marketingcloud.C11398b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.m */
public class C0715m {

    /* renamed from: a */
    private final C0718b f3295a;

    /* renamed from: androidx.core.app.m$a */
    private static class C0716a extends C0718b {

        /* renamed from: e */
        private static HandlerThread f3296e;

        /* renamed from: f */
        private static Handler f3297f;

        /* renamed from: a */
        int f3298a;

        /* renamed from: b */
        SparseIntArray[] f3299b = new SparseIntArray[9];

        /* renamed from: c */
        private final ArrayList f3300c = new ArrayList();

        /* renamed from: d */
        Window.OnFrameMetricsAvailableListener f3301d = new C0717a();

        /* renamed from: androidx.core.app.m$a$a */
        class C0717a implements Window.OnFrameMetricsAvailableListener {
            C0717a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C0716a aVar = C0716a.this;
                if ((aVar.f3298a & 1) != 0) {
                    aVar.mo3159e(aVar.f3299b[0], frameMetrics.getMetric(8));
                }
                C0716a aVar2 = C0716a.this;
                if ((aVar2.f3298a & 2) != 0) {
                    aVar2.mo3159e(aVar2.f3299b[1], frameMetrics.getMetric(1));
                }
                C0716a aVar3 = C0716a.this;
                if ((aVar3.f3298a & 4) != 0) {
                    aVar3.mo3159e(aVar3.f3299b[2], frameMetrics.getMetric(3));
                }
                C0716a aVar4 = C0716a.this;
                if ((aVar4.f3298a & 8) != 0) {
                    aVar4.mo3159e(aVar4.f3299b[3], frameMetrics.getMetric(4));
                }
                C0716a aVar5 = C0716a.this;
                if ((aVar5.f3298a & 16) != 0) {
                    aVar5.mo3159e(aVar5.f3299b[4], frameMetrics.getMetric(5));
                }
                C0716a aVar6 = C0716a.this;
                if ((aVar6.f3298a & 64) != 0) {
                    aVar6.mo3159e(aVar6.f3299b[6], frameMetrics.getMetric(7));
                }
                C0716a aVar7 = C0716a.this;
                if ((aVar7.f3298a & 32) != 0) {
                    aVar7.mo3159e(aVar7.f3299b[5], frameMetrics.getMetric(6));
                }
                C0716a aVar8 = C0716a.this;
                if ((aVar8.f3298a & 128) != 0) {
                    aVar8.mo3159e(aVar8.f3299b[7], frameMetrics.getMetric(0));
                }
                C0716a aVar9 = C0716a.this;
                if ((aVar9.f3298a & C11398b.f33139r) != 0) {
                    aVar9.mo3159e(aVar9.f3299b[8], frameMetrics.getMetric(2));
                }
            }
        }

        C0716a(int i) {
            this.f3298a = i;
        }

        /* renamed from: a */
        public void mo3155a(Activity activity) {
            if (f3296e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f3296e = handlerThread;
                handlerThread.start();
                f3297f = new Handler(f3296e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f3299b;
                if (sparseIntArrayArr[i] == null && (this.f3298a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3301d, f3297f);
            this.f3300c.add(new WeakReference(activity));
        }

        /* renamed from: b */
        public SparseIntArray[] mo3156b() {
            return this.f3299b;
        }

        /* renamed from: c */
        public SparseIntArray[] mo3157c(Activity activity) {
            Iterator it = this.f3300c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f3300c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3301d);
            return this.f3299b;
        }

        /* renamed from: d */
        public SparseIntArray[] mo3158d() {
            SparseIntArray[] sparseIntArrayArr = this.f3299b;
            this.f3299b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3159e(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.m$b */
    private static class C0718b {
        C0718b() {
        }

        /* renamed from: a */
        public void mo3155a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo3156b() {
            return null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo3157c(Activity activity) {
            return null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo3158d() {
            return null;
        }
    }

    public C0715m() {
        this(1);
    }

    /* renamed from: a */
    public void mo3151a(Activity activity) {
        this.f3295a.mo3155a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] mo3152b() {
        return this.f3295a.mo3156b();
    }

    /* renamed from: c */
    public SparseIntArray[] mo3153c(Activity activity) {
        return this.f3295a.mo3157c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] mo3154d() {
        return this.f3295a.mo3158d();
    }

    public C0715m(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3295a = new C0716a(i);
        } else {
            this.f3295a = new C0718b();
        }
    }
}
