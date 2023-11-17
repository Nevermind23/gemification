package p430gd;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: gd.a */
public final class C12963a {

    /* renamed from: i */
    private static final String f38217i = "a";

    /* renamed from: j */
    private static final Collection f38218j;

    /* renamed from: a */
    private boolean f38219a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f38220b;

    /* renamed from: c */
    private final boolean f38221c;

    /* renamed from: d */
    private final Camera f38222d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f38223e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f38224f = 1;

    /* renamed from: g */
    private final Handler.Callback f38225g;

    /* renamed from: h */
    private final Camera.AutoFocusCallback f38226h;

    /* renamed from: gd.a$a */
    class C12964a implements Handler.Callback {
        C12964a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != C12963a.this.f38224f) {
                return false;
            }
            C12963a.this.m48905h();
            return true;
        }
    }

    /* renamed from: gd.a$b */
    class C12965b implements Camera.AutoFocusCallback {
        C12965b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m48909b() {
            boolean unused = C12963a.this.f38220b = false;
            C12963a.this.m48903f();
        }

        public void onAutoFocus(boolean z, Camera camera) {
            C12963a.this.f38223e.post(new C12966b(this));
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f38218j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C12963a(Camera camera, C12978i iVar) {
        boolean z = true;
        C12964a aVar = new C12964a();
        this.f38225g = aVar;
        this.f38226h = new C12965b();
        this.f38223e = new Handler(aVar);
        this.f38222d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z = (!iVar.mo33765c() || !f38218j.contains(focusMode)) ? false : z;
        this.f38221c = z;
        String str = f38217i;
        Log.i(str, "Current focus mode '" + focusMode + "'; use auto focus? " + z);
        mo33722i();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m48903f() {
        if (!this.f38219a && !this.f38223e.hasMessages(this.f38224f)) {
            Handler handler = this.f38223e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f38224f), 2000);
        }
    }

    /* renamed from: g */
    private void m48904g() {
        this.f38223e.removeMessages(this.f38224f);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m48905h() {
        if (this.f38221c && !this.f38219a && !this.f38220b) {
            try {
                this.f38222d.autoFocus(this.f38226h);
                this.f38220b = true;
            } catch (RuntimeException e) {
                Log.w(f38217i, "Unexpected exception while focusing", e);
                m48903f();
            }
        }
    }

    /* renamed from: i */
    public void mo33722i() {
        this.f38219a = false;
        m48905h();
    }

    /* renamed from: j */
    public void mo33723j() {
        this.f38219a = true;
        this.f38220b = false;
        m48904g();
        if (this.f38221c) {
            try {
                this.f38222d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w(f38217i, "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
