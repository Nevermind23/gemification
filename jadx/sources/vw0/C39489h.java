package vw0;

import android.content.Context;
import com.google.gson.Gson;
import cx0.C31455b;
import ed1.C40734b;
import ed1.C40744k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ww0.C39706c;

/* renamed from: vw0.h */
public final class C39489h implements C39486e {

    /* renamed from: d */
    public static final C39490a f93931d = new C39490a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f93932a;

    /* renamed from: b */
    private final C39706c f93933b;

    /* renamed from: c */
    private final Gson f93934c;

    /* renamed from: vw0.h$a */
    public static final class C39490a {
        private C39490a() {
        }

        public /* synthetic */ C39490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C39489h(Context context, C39706c cVar, Gson gson) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, "mapper");
        C41536l.m120489i(gson, "gson");
        this.f93932a = context;
        this.f93933b = cVar;
        this.f93934c = gson;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        se1.C42550b.m123187a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        throw r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m114781e(vw0.C39489h r3, ed1.C40745l r4) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "emitter"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            android.content.Context r0 = r3.f93932a     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = "payment_config.json"
            java.io.FileInputStream r0 = r0.openFileInput(r1)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = "context.openFileInput(CONFIG_FILE_NAME)"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)     // Catch:{ Exception -> 0x0055 }
            java.nio.charset.Charset r1 = cf1.C40407d.f95989b     // Catch:{ Exception -> 0x0055 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0055 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0055 }
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch:{ Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0025
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ Exception -> 0x0055 }
            goto L_0x002d
        L_0x0025:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0055 }
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x0055 }
            r2 = r0
        L_0x002d:
            java.lang.String r0 = se1.C42557i.m123200c(r2)     // Catch:{ all -> 0x004e }
            r1 = 0
            se1.C42550b.m123187a(r2, r1)     // Catch:{ Exception -> 0x0055 }
            com.google.gson.Gson r1 = r3.f93934c     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<xw0.a> r2 = xw0.C39918a.class
            java.lang.Object r0 = r1.mo18170l(r0, r2)     // Catch:{ Exception -> 0x0055 }
            xw0.a r0 = (xw0.C39918a) r0     // Catch:{ Exception -> 0x0055 }
            ww0.c r3 = r3.f93933b     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = "it"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)     // Catch:{ Exception -> 0x0055 }
            cx0.b r3 = r3.mo93432d(r0)     // Catch:{ Exception -> 0x0055 }
            r4.mo94965a(r3)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0058
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            se1.C42550b.m123187a(r2, r3)     // Catch:{ Exception -> 0x0055 }
            throw r0     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r4.onComplete()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.C39489h.m114781e(vw0.h, ed1.l):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        se1.C42550b.m123187a(r0, r3);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final he1.C41238w m114782f(vw0.C39489h r3, cx0.C31455b r4) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "$config"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            android.content.Context r0 = r3.f93932a
            java.lang.String r1 = "payment_config.json"
            r2 = 0
            java.io.FileOutputStream r0 = r0.openFileOutput(r1, r2)
            com.google.gson.Gson r1 = r3.f93934c     // Catch:{ all -> 0x0044 }
            ww0.c r3 = r3.f93933b     // Catch:{ all -> 0x0044 }
            xw0.a r3 = r3.mo93433e(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.mo18181w(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "gson.toJson(mapper.convert(config))"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.C41536l.m120488h(r4, r1)     // Catch:{ all -> 0x0044 }
            byte[] r3 = r3.getBytes(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)     // Catch:{ all -> 0x0044 }
            r0.write(r3)     // Catch:{ all -> 0x0044 }
            he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x0044 }
            r3 = 0
            se1.C42550b.m123187a(r0, r3)
            he1.w r3 = he1.C41238w.f97225a
            return r3
        L_0x0044:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r4 = move-exception
            se1.C42550b.m123187a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vw0.C39489h.m114782f(vw0.h, cx0.b):he1.w");
    }

    /* renamed from: a */
    public C40744k mo93111a() {
        C40744k g = C40744k.m117997g(new C39488g(this));
        C41536l.m120488h(g, "create { emitter ->\n    …)\n            }\n        }");
        return g;
    }

    /* renamed from: b */
    public C40734b mo93112b(C31455b bVar) {
        C41536l.m120489i(bVar, "config");
        C40734b u = C40734b.m117925u(new C39487f(this, bVar));
        C41536l.m120488h(u, "fromCallable {\n         …)\n            }\n        }");
        return u;
    }
}
