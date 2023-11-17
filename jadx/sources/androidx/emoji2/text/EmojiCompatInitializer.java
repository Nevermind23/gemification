package androidx.emoji2.text;

import android.content.Context;
import androidx.core.p016os.C0934x;
import androidx.emoji2.text.C1378e;
import androidx.lifecycle.C1577e;
import androidx.lifecycle.C1579f;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1851a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p019b1.C2109a;

public class EmojiCompatInitializer implements C2109a {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    static class C1365a extends C1378e.C1382c {
        protected C1365a(Context context) {
            super(new C1366b(context));
            mo4006b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    static class C1366b implements C1378e.C1386g {

        /* renamed from: a */
        private final Context f3926a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b$a */
        class C1367a extends C1378e.C1387h {

            /* renamed from: a */
            final /* synthetic */ C1378e.C1387h f3927a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f3928b;

            C1367a(C1378e.C1387h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3927a = hVar;
                this.f3928b = threadPoolExecutor;
            }

            /* renamed from: a */
            public void mo3978a(Throwable th) {
                try {
                    this.f3927a.mo3978a(th);
                } finally {
                    this.f3928b.shutdown();
                }
            }

            /* renamed from: b */
            public void mo3979b(C1403m mVar) {
                try {
                    this.f3927a.mo3979b(mVar);
                } finally {
                    this.f3928b.shutdown();
                }
            }
        }

        C1366b(Context context) {
            this.f3926a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo3976a(C1378e.C1387h hVar) {
            ThreadPoolExecutor b = C1370b.m4708b("EmojiCompatInitializer");
            b.execute(new C1389f(this, hVar, b));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void m4702d(C1378e.C1387h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C1395j a = C1372c.m4712a(this.f3926a);
                if (a != null) {
                    a.mo4029c(threadPoolExecutor);
                    a.mo4005a().mo3976a(new C1367a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.mo3978a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    static class C1368c implements Runnable {
        C1368c() {
        }

        public void run() {
            try {
                C0934x.m3381a("EmojiCompat.EmojiCompatInitializer.run");
                if (C1378e.m4734h()) {
                    C1378e.m4730b().mo3991k();
                }
            } finally {
                C0934x.m3382b();
            }
        }
    }

    /* renamed from: a */
    public List mo3965a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean mo3966b(Context context) {
        C1378e.m4733g(new C1365a(context));
        mo3968d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3968d(Context context) {
        final C1593j lifecycle = ((C1619q) C1851a.m7225e(context).mo6133f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo4906a(new C1579f() {
            /* renamed from: a */
            public /* synthetic */ void mo3970a(C1619q qVar) {
                C1577e.m5595a(this, qVar);
            }

            /* renamed from: d */
            public void mo3971d(C1619q qVar) {
                EmojiCompatInitializer.this.mo3969e();
                lifecycle.mo4909d(this);
            }

            /* renamed from: e */
            public /* synthetic */ void mo3972e(C1619q qVar) {
                C1577e.m5597c(this, qVar);
            }

            public /* synthetic */ void onDestroy(C1619q qVar) {
                C1577e.m5596b(this, qVar);
            }

            public /* synthetic */ void onStart(C1619q qVar) {
                C1577e.m5599e(this, qVar);
            }

            public /* synthetic */ void onStop(C1619q qVar) {
                C1577e.m5600f(this, qVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3969e() {
        C1370b.m4710d().postDelayed(new C1368c(), 500);
    }
}
