package jg1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* renamed from: jg1.e */
public class C41443e extends Handler implements C41451k {

    /* renamed from: d */
    private final C41450j f97553d = new C41450j();

    /* renamed from: e */
    private final int f97554e;

    /* renamed from: f */
    private final C41438c f97555f;

    /* renamed from: g */
    private boolean f97556g;

    public C41443e(C41438c cVar, Looper looper, int i) {
        super(looper);
        this.f97555f = cVar;
        this.f97554e = i;
    }

    /* renamed from: a */
    public void mo96175a(C41457p pVar, Object obj) {
        C41449i a = C41449i.m120266a(pVar, obj);
        synchronized (this) {
            this.f97553d.mo96197a(a);
            if (!this.f97556g) {
                this.f97556g = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C41449i b = this.f97553d.mo96198b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f97553d.mo96198b();
                        if (b == null) {
                            this.f97556g = false;
                            return;
                        }
                    }
                }
                this.f97555f.mo96181h(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f97554e));
            if (sendMessage(obtainMessage())) {
                this.f97556g = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f97556g = false;
            throw th;
        }
    }
}
