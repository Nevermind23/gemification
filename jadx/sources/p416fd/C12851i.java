package p416fd;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.zxing.C5758h;
import com.google.zxing.C5764m;
import p174mb.C7165k;
import p430gd.C12971g;
import p430gd.C12986p;

/* renamed from: fd.i */
public class C12851i {

    /* renamed from: k */
    private static final String f37976k = "i";

    /* renamed from: a */
    private C12971g f37977a;

    /* renamed from: b */
    private HandlerThread f37978b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f37979c;

    /* renamed from: d */
    private C12848f f37980d;

    /* renamed from: e */
    private Handler f37981e;

    /* renamed from: f */
    private Rect f37982f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f37983g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Object f37984h = new Object();

    /* renamed from: i */
    private final Handler.Callback f37985i = new C12852a();

    /* renamed from: j */
    private final C12986p f37986j = new C12853b();

    /* renamed from: fd.i$a */
    class C12852a implements Handler.Callback {
        C12852a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == C7165k.zxing_decode) {
                C12851i.this.m48640g((C12862q) message.obj);
                return true;
            } else if (i != C7165k.zxing_preview_failed) {
                return true;
            } else {
                C12851i.this.m48641h();
                return true;
            }
        }
    }

    /* renamed from: fd.i$b */
    class C12853b implements C12986p {
        C12853b() {
        }

        /* renamed from: a */
        public void mo33519a(Exception exc) {
            synchronized (C12851i.this.f37984h) {
                if (C12851i.this.f37983g) {
                    C12851i.this.f37979c.obtainMessage(C7165k.zxing_preview_failed).sendToTarget();
                }
            }
        }

        /* renamed from: b */
        public void mo33520b(C12862q qVar) {
            synchronized (C12851i.this.f37984h) {
                if (C12851i.this.f37983g) {
                    C12851i.this.f37979c.obtainMessage(C7165k.zxing_decode, qVar).sendToTarget();
                }
            }
        }
    }

    public C12851i(C12971g gVar, C12848f fVar, Handler handler) {
        C12863r.m48677a();
        this.f37977a = gVar;
        this.f37980d = fVar;
        this.f37981e = handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m48640g(C12862q qVar) {
        C5764m mVar;
        long currentTimeMillis = System.currentTimeMillis();
        qVar.mo33540d(this.f37982f);
        C5758h f = mo33513f(qVar);
        if (f != null) {
            mVar = this.f37980d.mo33508c(f);
        } else {
            mVar = null;
        }
        if (mVar != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = f37976k;
            Log.d(str, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f37981e != null) {
                Message obtain = Message.obtain(this.f37981e, C7165k.zxing_decode_succeeded, new C12844b(mVar, qVar));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f37981e;
            if (handler != null) {
                Message.obtain(handler, C7165k.zxing_decode_failed).sendToTarget();
            }
        }
        if (this.f37981e != null) {
            Message.obtain(this.f37981e, C7165k.zxing_possible_result_points, C12844b.m48621f(this.f37980d.mo33509d(), qVar)).sendToTarget();
        }
        m48641h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m48641h() {
        this.f37977a.mo33737v(this.f37986j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C5758h mo33513f(C12862q qVar) {
        if (this.f37982f == null) {
            return null;
        }
        return qVar.mo33537a();
    }

    /* renamed from: i */
    public void mo33514i(Rect rect) {
        this.f37982f = rect;
    }

    /* renamed from: j */
    public void mo33515j(C12848f fVar) {
        this.f37980d = fVar;
    }

    /* renamed from: k */
    public void mo33516k() {
        C12863r.m48677a();
        HandlerThread handlerThread = new HandlerThread(f37976k);
        this.f37978b = handlerThread;
        handlerThread.start();
        this.f37979c = new Handler(this.f37978b.getLooper(), this.f37985i);
        this.f37983g = true;
        m48641h();
    }

    /* renamed from: l */
    public void mo33517l() {
        C12863r.m48677a();
        synchronized (this.f37984h) {
            this.f37983g = false;
            this.f37979c.removeCallbacksAndMessages((Object) null);
            this.f37978b.quit();
        }
    }
}
