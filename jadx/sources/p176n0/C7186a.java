package p176n0;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.p016os.OperationCanceledException;
import androidx.core.util.C1009i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: n0.a */
public abstract class C7186a extends C7188b {

    /* renamed from: i */
    private final Executor f21323i;

    /* renamed from: j */
    volatile C7187a f21324j;

    /* renamed from: k */
    volatile C7187a f21325k;

    /* renamed from: l */
    long f21326l;

    /* renamed from: m */
    long f21327m;

    /* renamed from: n */
    Handler f21328n;

    /* renamed from: n0.a$a */
    final class C7187a extends C7190c implements Runnable {

        /* renamed from: n */
        private final CountDownLatch f21329n = new CountDownLatch(1);

        /* renamed from: o */
        boolean f21330o;

        C7187a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo21527g(Object obj) {
            try {
                C7186a.this.mo21523x(this, obj);
            } finally {
                this.f21329n.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo21528h(Object obj) {
            try {
                C7186a.this.mo21524y(this, obj);
            } finally {
                this.f21329n.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public Object mo21526b(Void... voidArr) {
            try {
                return C7186a.this.mo21518C();
            } catch (OperationCanceledException e) {
                if (mo21553f()) {
                    return null;
                }
                throw e;
            }
        }

        public void run() {
            this.f21330o = false;
            C7186a.this.mo21525z();
        }
    }

    public C7186a(Context context) {
        this(context, C7190c.f21342k);
    }

    /* renamed from: A */
    public abstract Object mo19849A();

    /* renamed from: B */
    public void mo21517B(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public Object mo21518C() {
        return mo19849A();
    }

    /* renamed from: g */
    public void mo21519g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo21519g(str, fileDescriptor, printWriter, strArr);
        if (this.f21324j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f21324j);
            printWriter.print(" waiting=");
            printWriter.println(this.f21324j.f21330o);
        }
        if (this.f21325k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f21325k);
            printWriter.print(" waiting=");
            printWriter.println(this.f21325k.f21330o);
        }
        if (this.f21326l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C1009i.m3535c(this.f21326l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C1009i.m3534b(this.f21327m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo21520k() {
        if (this.f21324j == null) {
            return false;
        }
        if (!this.f21335d) {
            this.f21338g = true;
        }
        if (this.f21325k != null) {
            if (this.f21324j.f21330o) {
                this.f21324j.f21330o = false;
                this.f21328n.removeCallbacks(this.f21324j);
            }
            this.f21324j = null;
            return false;
        } else if (this.f21324j.f21330o) {
            this.f21324j.f21330o = false;
            this.f21328n.removeCallbacks(this.f21324j);
            this.f21324j = null;
            return false;
        } else {
            boolean a = this.f21324j.mo21550a(false);
            if (a) {
                this.f21325k = this.f21324j;
                mo21522w();
            }
            this.f21324j = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo21521m() {
        super.mo21521m();
        mo21532b();
        this.f21324j = new C7187a();
        mo21525z();
    }

    /* renamed from: w */
    public void mo21522w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo21523x(C7187a aVar, Object obj) {
        mo21517B(obj);
        if (this.f21325k == aVar) {
            mo21545s();
            this.f21327m = SystemClock.uptimeMillis();
            this.f21325k = null;
            mo21535e();
            mo21525z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo21524y(C7187a aVar, Object obj) {
        if (this.f21324j != aVar) {
            mo21523x(aVar, obj);
        } else if (mo21538i()) {
            mo21517B(obj);
        } else {
            mo21533c();
            this.f21327m = SystemClock.uptimeMillis();
            this.f21324j = null;
            mo21536f(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo21525z() {
        if (this.f21325k == null && this.f21324j != null) {
            if (this.f21324j.f21330o) {
                this.f21324j.f21330o = false;
                this.f21328n.removeCallbacks(this.f21324j);
            }
            if (this.f21326l <= 0 || SystemClock.uptimeMillis() >= this.f21327m + this.f21326l) {
                this.f21324j.mo21551c(this.f21323i, (Object[]) null);
                return;
            }
            this.f21324j.f21330o = true;
            this.f21328n.postAtTime(this.f21324j, this.f21327m + this.f21326l);
        }
    }

    private C7186a(Context context, Executor executor) {
        super(context);
        this.f21327m = -10000;
        this.f21323i = executor;
    }
}
