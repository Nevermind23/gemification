package p297w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import p334z4.C9207a;

/* renamed from: w4.t */
public abstract class C8841t implements ServiceConnection {

    /* renamed from: a */
    private final Context f24807a;

    /* renamed from: b */
    private final Handler f24808b;

    /* renamed from: c */
    private C8843b f24809c;

    /* renamed from: d */
    private boolean f24810d;

    /* renamed from: e */
    private Messenger f24811e;

    /* renamed from: f */
    private int f24812f;

    /* renamed from: g */
    private int f24813g;

    /* renamed from: h */
    private final String f24814h;

    /* renamed from: i */
    private final int f24815i;

    /* renamed from: w4.t$a */
    class C8842a extends Handler {
        C8842a() {
        }

        public void handleMessage(Message message) {
            if (!C9207a.m34024c(this)) {
                try {
                    C8841t.this.mo24269c(message);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: w4.t$b */
    public interface C8843b {
        /* renamed from: a */
        void mo8350a(Bundle bundle);
    }

    public C8841t(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f24807a = applicationContext != null ? applicationContext : context;
        this.f24812f = i;
        this.f24813g = i2;
        this.f24814h = str;
        this.f24815i = i3;
        this.f24808b = new C8842a();
    }

    /* renamed from: a */
    private void m32921a(Bundle bundle) {
        if (this.f24810d) {
            this.f24810d = false;
            C8843b bVar = this.f24809c;
            if (bVar != null) {
                bVar.mo8350a(bundle);
            }
        }
    }

    /* renamed from: e */
    private void m32922e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f24814h);
        mo8437d(bundle);
        Message obtain = Message.obtain((Handler) null, this.f24812f);
        obtain.arg1 = this.f24815i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f24808b);
        try {
            this.f24811e.send(obtain);
        } catch (RemoteException unused) {
            m32921a((Bundle) null);
        }
    }

    /* renamed from: b */
    public void mo24268b() {
        this.f24810d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo24269c(Message message) {
        if (message.what == this.f24813g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m32921a((Bundle) null);
            } else {
                m32921a(data);
            }
            try {
                this.f24807a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo8437d(Bundle bundle);

    /* renamed from: f */
    public void mo24270f(C8843b bVar) {
        this.f24809c = bVar;
    }

    /* renamed from: g */
    public boolean mo24271g() {
        Intent l;
        if (this.f24810d || C8832s.m32895s(this.f24815i) == -1 || (l = C8832s.m32888l(this.f24807a)) == null) {
            return false;
        }
        this.f24810d = true;
        this.f24807a.bindService(l, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f24811e = new Messenger(iBinder);
        m32922e();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f24811e = null;
        try {
            this.f24807a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m32921a((Bundle) null);
    }
}
