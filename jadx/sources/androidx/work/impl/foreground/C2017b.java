package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1963h;
import androidx.work.C2073m;
import androidx.work.impl.C2006e;
import androidx.work.impl.C2007e0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p151l1.C6863c;
import p151l1.C6864d;
import p151l1.C6865e;
import p190o1.C7386m;
import p190o1.C7399v;
import p190o1.C7417y;
import p216q1.C7819c;

/* renamed from: androidx.work.impl.foreground.b */
public class C2017b implements C6863c, C2006e {

    /* renamed from: n */
    static final String f6060n = C2073m.m8073i("SystemFgDispatcher");

    /* renamed from: d */
    private Context f6061d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2007e0 f6062e;

    /* renamed from: f */
    private final C7819c f6063f;

    /* renamed from: g */
    final Object f6064g = new Object();

    /* renamed from: h */
    C7386m f6065h;

    /* renamed from: i */
    final Map f6066i;

    /* renamed from: j */
    final Map f6067j;

    /* renamed from: k */
    final Set f6068k;

    /* renamed from: l */
    final C6864d f6069l;

    /* renamed from: m */
    private C2019b f6070m;

    /* renamed from: androidx.work.impl.foreground.b$a */
    class C2018a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ String f6071d;

        C2018a(String str) {
            this.f6071d = str;
        }

        public void run() {
            C7399v h = C2017b.this.f6062e.mo6825p().mo6870h(this.f6071d);
            if (h != null && h.mo21790h()) {
                synchronized (C2017b.this.f6064g) {
                    C2017b.this.f6067j.put(C7417y.m28225a(h), h);
                    C2017b.this.f6068k.add(h);
                    C2017b bVar = C2017b.this;
                    bVar.f6069l.mo20942b(bVar.f6068k);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b */
    interface C2019b {
        /* renamed from: a */
        void mo6835a(int i, Notification notification);

        /* renamed from: c */
        void mo6836c(int i, int i2, Notification notification);

        /* renamed from: d */
        void mo6837d(int i);

        void stop();
    }

    C2017b(Context context) {
        this.f6061d = context;
        C2007e0 n = C2007e0.m7860n(context);
        this.f6062e = n;
        this.f6063f = n.mo6829t();
        this.f6065h = null;
        this.f6066i = new LinkedHashMap();
        this.f6068k = new HashSet();
        this.f6067j = new HashMap();
        this.f6069l = new C6865e(this.f6062e.mo6827r(), (C6863c) this);
        this.f6062e.mo6825p().mo6869g(this);
    }

    /* renamed from: c */
    public static Intent m7898c(Context context, C7386m mVar, C1963h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.mo6741c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.mo6739a());
        intent.putExtra("KEY_NOTIFICATION", hVar.mo6740b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.mo21770b());
        intent.putExtra("KEY_GENERATION", mVar.mo21769a());
        return intent;
    }

    /* renamed from: e */
    public static Intent m7899e(Context context, C7386m mVar, C1963h hVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.mo21770b());
        intent.putExtra("KEY_GENERATION", mVar.mo21769a());
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.mo6741c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.mo6739a());
        intent.putExtra("KEY_NOTIFICATION", hVar.mo6740b());
        return intent;
    }

    /* renamed from: g */
    public static Intent m7900g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: h */
    private void m7901h(Intent intent) {
        C2073m e = C2073m.m8071e();
        String str = f6060n;
        e.mo6963f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f6062e.mo6817c(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: i */
    private void m7902i(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C7386m mVar = new C7386m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C2073m e = C2073m.m8071e();
        String str = f6060n;
        e.mo6959a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f6070m != null) {
            this.f6066i.put(mVar, new C1963h(intExtra, notification, intExtra2));
            if (this.f6065h == null) {
                this.f6065h = mVar;
                this.f6070m.mo6836c(intExtra, intExtra2, notification);
                return;
            }
            this.f6070m.mo6835a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f6066i.entrySet()) {
                    i |= ((C1963h) value.getValue()).mo6739a();
                }
                C1963h hVar = (C1963h) this.f6066i.get(this.f6065h);
                if (hVar != null) {
                    this.f6070m.mo6836c(hVar.mo6741c(), i, hVar.mo6740b());
                }
            }
        }
    }

    /* renamed from: j */
    private void m7903j(Intent intent) {
        C2073m e = C2073m.m8071e();
        String str = f6060n;
        e.mo6963f(str, "Started foreground service " + intent);
        this.f6063f.mo22739c(new C2018a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* renamed from: b */
    public void mo6783b(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7399v vVar = (C7399v) it.next();
                String str = vVar.f21630a;
                C2073m e = C2073m.m8071e();
                String str2 = f6060n;
                e.mo6959a(str2, "Constraints unmet for WorkSpec " + str);
                this.f6062e.mo6813A(C7417y.m28225a(vVar));
            }
        }
    }

    /* renamed from: d */
    public void mo6776d(C7386m mVar, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.f6064g) {
            C7399v vVar = (C7399v) this.f6067j.remove(mVar);
            if (vVar != null) {
                z2 = this.f6068k.remove(vVar);
            } else {
                z2 = false;
            }
            if (z2) {
                this.f6069l.mo20942b(this.f6068k);
            }
        }
        C1963h hVar = (C1963h) this.f6066i.remove(mVar);
        if (mVar.equals(this.f6065h) && this.f6066i.size() > 0) {
            Iterator it = this.f6066i.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f6065h = (C7386m) entry.getKey();
            if (this.f6070m != null) {
                C1963h hVar2 = (C1963h) entry.getValue();
                this.f6070m.mo6836c(hVar2.mo6741c(), hVar2.mo6739a(), hVar2.mo6740b());
                this.f6070m.mo6837d(hVar2.mo6741c());
            }
        }
        C2019b bVar = this.f6070m;
        if (hVar != null && bVar != null) {
            C2073m e = C2073m.m8071e();
            String str = f6060n;
            e.mo6959a(str, "Removing Notification (id: " + hVar.mo6741c() + ", workSpecId: " + mVar + ", notificationType: " + hVar.mo6739a());
            bVar.mo6837d(hVar.mo6741c());
        }
    }

    /* renamed from: f */
    public void mo6784f(List list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6845k(Intent intent) {
        C2073m.m8071e().mo6963f(f6060n, "Stopping foreground service");
        C2019b bVar = this.f6070m;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6846l() {
        this.f6070m = null;
        synchronized (this.f6064g) {
            this.f6069l.mo20941a();
        }
        this.f6062e.mo6825p().mo6873n(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6847m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m7903j(intent);
            m7902i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m7902i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m7901h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            mo6845k(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo6848n(C2019b bVar) {
        if (this.f6070m != null) {
            C2073m.m8071e().mo6961c(f6060n, "A callback already exists.");
        } else {
            this.f6070m = bVar;
        }
    }
}
