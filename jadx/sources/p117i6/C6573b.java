package p117i6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.cloudmessaging.C3845m;
import com.google.android.gms.cloudmessaging.zzd;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079f7.C6164a;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: i6.b */
public class C6573b {

    /* renamed from: h */
    private static int f20068h;

    /* renamed from: i */
    private static PendingIntent f20069i;

    /* renamed from: j */
    private static final Executor f20070j = C6585n.f20096d;

    /* renamed from: k */
    private static final Pattern f20071k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a */
    private final SimpleArrayMap f20072a = new SimpleArrayMap();

    /* renamed from: b */
    private final Context f20073b;

    /* renamed from: c */
    private final C6579h f20074c;

    /* renamed from: d */
    private final ScheduledExecutorService f20075d;

    /* renamed from: e */
    private Messenger f20076e;

    /* renamed from: f */
    private Messenger f20077f;

    /* renamed from: g */
    private zzd f20078g;

    public C6573b(Context context) {
        this.f20073b = context;
        this.f20074c = new C6579h(context);
        this.f20076e = new Messenger(new C6575d(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20075d = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    static /* synthetic */ Task m25923b(Bundle bundle) {
        if (m25929j(bundle)) {
            return C9231i.m34113g((Object) null);
        }
        return C9231i.m34113g(bundle);
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ void m25924d(C6573b bVar, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C6576e());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        bVar.f20078g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f20077f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            if (stringExtra2.length() != 0) {
                                str3 = "Received InstanceID error ".concat(stringExtra2);
                            } else {
                                str3 = new String("Received InstanceID error ");
                            }
                            Log.d("Rpc", str3);
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                if (stringExtra2.length() != 0) {
                                    str2 = "Unexpected structured response ".concat(stringExtra2);
                                } else {
                                    str2 = new String("Unexpected structured response ");
                                }
                                Log.w("Rpc", str2);
                                return;
                            }
                            String str5 = split[2];
                            String str6 = split[3];
                            if (str6.startsWith(":")) {
                                str6 = str6.substring(1);
                            }
                            bVar.m25928i(str5, intent2.putExtra("error", str6).getExtras());
                            return;
                        }
                        synchronized (bVar.f20072a) {
                            for (int i = 0; i < bVar.f20072a.size(); i++) {
                                bVar.m25928i((String) bVar.f20072a.keyAt(i), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f20071k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            bVar.m25928i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        if (stringExtra.length() != 0) {
                            str = "Unexpected response string: ".concat(stringExtra);
                        } else {
                            str = new String("Unexpected response string: ");
                        }
                        Log.d("Rpc", str);
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    if (valueOf2.length() != 0) {
                        str4 = "Unexpected response action: ".concat(valueOf2);
                    } else {
                        str4 = new String("Unexpected response action: ");
                    }
                    Log.d("Rpc", str4);
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: f */
    private final Task m25925f(Bundle bundle) {
        String g = m25926g();
        C9227g gVar = new C9227g();
        synchronized (this.f20072a) {
            this.f20072a.put(g, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f20074c.mo20577b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m25927h(this.f20073b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f20076e);
        if (!(this.f20077f == null && this.f20078g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f20077f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f20078g.mo11848b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            gVar.mo24883a().mo24857b(f20070j, new C6582k(this, g, this.f20075d.schedule(new C6584m(gVar), 30, TimeUnit.SECONDS)));
            return gVar.mo24883a();
        }
        if (this.f20074c.mo20577b() == 2) {
            this.f20073b.sendBroadcast(intent);
        } else {
            this.f20073b.startService(intent);
        }
        gVar.mo24883a().mo24857b(f20070j, new C6582k(this, g, this.f20075d.schedule(new C6584m(gVar), 30, TimeUnit.SECONDS)));
        return gVar.mo24883a();
    }

    /* renamed from: g */
    private static synchronized String m25926g() {
        String num;
        synchronized (C6573b.class) {
            int i = f20068h;
            f20068h = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: h */
    private static synchronized void m25927h(Context context, Intent intent) {
        synchronized (C6573b.class) {
            if (f20069i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f20069i = C6164a.m24578a(context, 0, intent2, C6164a.f19142a);
            }
            intent.putExtra("app", f20069i);
        }
    }

    /* renamed from: i */
    private final void m25928i(String str, Bundle bundle) {
        String str2;
        synchronized (this.f20072a) {
            C9227g gVar = (C9227g) this.f20072a.remove(str);
            if (gVar == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            gVar.mo24885c(bundle);
        }
    }

    /* renamed from: j */
    private static boolean m25929j(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public Task mo20568a(Bundle bundle) {
        if (this.f20074c.mo20576a() >= 12000000) {
            return C3845m.m14452b(this.f20073b).mo11846d(1, bundle).mo24865j(f20070j, C6581j.f20090a);
        }
        if (this.f20074c.mo20577b() != 0) {
            return m25925f(bundle).mo24867l(f20070j, new C6580i(this, bundle));
        }
        return C9231i.m34112f(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    /* renamed from: c */
    public final /* synthetic */ Task mo20569c(Bundle bundle, Task task) {
        if (task.mo24873r() && m25929j((Bundle) task.mo24869n())) {
            return m25925f(bundle).mo24874s(f20070j, C6583l.f20094a);
        }
        return task;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo20570e(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f20072a) {
            this.f20072a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
