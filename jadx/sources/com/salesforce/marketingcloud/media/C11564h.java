package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.media.C11587s;
import com.salesforce.marketingcloud.media.C11591u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.h */
public class C11564h {

    /* renamed from: h */
    static final int f33560h = 1;

    /* renamed from: i */
    static final int f33561i = 2;

    /* renamed from: j */
    static final int f33562j = 3;

    /* renamed from: k */
    static final int f33563k = 4;

    /* renamed from: l */
    static final int f33564l = 5;

    /* renamed from: m */
    static final int f33565m = 6;

    /* renamed from: n */
    private static final String f33566n = C11461g.m41875a("Dispatcher");

    /* renamed from: a */
    final Map<String, C11576n> f33567a = new LinkedHashMap();

    /* renamed from: b */
    final C11566b f33568b;

    /* renamed from: c */
    final Context f33569c;

    /* renamed from: d */
    final ExecutorService f33570d;

    /* renamed from: e */
    final Handler f33571e;

    /* renamed from: f */
    final Handler f33572f;

    /* renamed from: g */
    final C11557c f33573g;

    /* renamed from: com.salesforce.marketingcloud.media.h$a */
    private static class C11565a extends Handler {

        /* renamed from: a */
        private final C11564h f33574a;

        C11565a(Looper looper, C11564h hVar) {
            super(looper);
            this.f33574a = hVar;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f33574a.mo30199d((C11553a) message.obj);
                    return;
                case 2:
                    this.f33574a.mo30200d((C11576n) message.obj);
                    return;
                case 3:
                    this.f33574a.mo30201e((C11576n) message.obj);
                    return;
                case 4:
                    this.f33574a.mo30194b((C11560d) message.obj);
                    return;
                case 5:
                    this.f33574a.mo30195b((C11561e) message.obj);
                    return;
                case 6:
                    this.f33574a.mo30197c((C11553a) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.h$b */
    static class C11566b extends HandlerThread {
        public C11566b() {
            super("mcsdk_image_thread", 10);
        }
    }

    C11564h(Context context, ExecutorService executorService, Handler handler, C11557c cVar) {
        C11566b bVar = new C11566b();
        this.f33568b = bVar;
        bVar.start();
        this.f33569c = context;
        this.f33570d = executorService;
        this.f33571e = new C11565a(bVar.getLooper(), this);
        this.f33572f = handler;
        this.f33573g = cVar;
    }

    /* renamed from: a */
    public void mo30190a(C11553a aVar) {
        Handler handler = this.f33571e;
        handler.sendMessage(handler.obtainMessage(6, aVar));
    }

    /* renamed from: b */
    public void mo30193b(C11553a aVar) {
        Handler handler = this.f33571e;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo30197c(C11553a aVar) {
        String c = aVar.mo30165c();
        C11576n nVar = this.f33567a.get(c);
        if (nVar != null) {
            nVar.mo30215b(aVar);
            if (nVar.mo30213a()) {
                this.f33567a.remove(c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30199d(C11553a aVar) {
        C11576n nVar = this.f33567a.get(aVar.mo30165c());
        if (nVar != null) {
            nVar.mo30212a(aVar);
        } else if (this.f33570d.isShutdown()) {
            C11461g.m41880a(f33566n, "ExecutorService is shutdown.  Ignoring request.", new Object[0]);
        } else {
            C11576n a = C11576n.m42246a(aVar.mo30164b(), this, this.f33573g, aVar);
            a.f33596j = this.f33570d.submit(a);
            this.f33567a.put(aVar.mo30165c(), a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo30201e(C11576n nVar) {
        this.f33567a.remove(nVar.mo30221h());
        m42224a(nVar);
    }

    /* renamed from: a */
    public void mo30191a(C11560d dVar) {
        Handler handler = this.f33571e;
        handler.sendMessage(handler.obtainMessage(4, dVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30194b(C11560d dVar) {
        if (this.f33570d.isShutdown()) {
            C11461g.m41880a(f33566n, "ExecutorService is shutdown.  Ignoring request.", new Object[0]);
            return;
        }
        this.f33570d.submit(new C11561e(this, dVar));
    }

    /* renamed from: c */
    public void mo30198c(C11576n nVar) {
        Handler handler = this.f33571e;
        handler.sendMessage(handler.obtainMessage(3, nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30200d(C11576n nVar) {
        if (C11587s.C11589b.m42305b(nVar.f33592f.f33631d)) {
            C11591u.C11593b bVar = nVar.f33595i;
            if (bVar.mo30272d()) {
                this.f33573g.mo30177a(nVar.mo30221h(), bVar.mo30269a());
            }
        }
        this.f33567a.remove(nVar.mo30221h());
        m42224a(nVar);
    }

    /* renamed from: a */
    public void mo30192a(C11561e eVar) {
        Handler handler = this.f33571e;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30195b(C11561e eVar) {
        Handler handler = this.f33572f;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    /* renamed from: a */
    private void m42224a(C11576n nVar) {
        if (!nVar.mo30223j()) {
            C11591u.C11593b i = nVar.mo30222i();
            if (i != null && i.mo30272d()) {
                i.mo30269a().prepareToDraw();
            }
            Handler handler = this.f33572f;
            handler.sendMessage(handler.obtainMessage(2, nVar));
        }
    }

    /* renamed from: b */
    public void mo30196b(C11576n nVar) {
        Handler handler = this.f33571e;
        handler.sendMessage(handler.obtainMessage(2, nVar));
    }
}
