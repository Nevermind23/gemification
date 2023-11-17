package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0750x;
import androidx.fragment.app.C1505h;
import com.google.android.gms.common.api.GoogleApiActivity;
import p066e7.C6042f;
import p104h6.C6440a;
import p104h6.C6441b;
import p130j6.C6726b;
import p130j6.C6731g;
import p130j6.C6732h;
import p130j6.C6734j;
import p156l6.C6942g;
import p156l6.C6971w;
import p156l6.C6972x;
import p182n6.C7264i;
import p182n6.C7285s;
import p182n6.C7290v;
import p260t6.C8408j;
import p260t6.C8413o;
import p286v6.C8705b;

/* renamed from: com.google.android.gms.common.a */
public class C3846a extends C3941b {

    /* renamed from: d */
    public static final int f12242d = C3941b.f12554a;

    /* renamed from: e */
    private static final Object f12243e = new Object();

    /* renamed from: f */
    private static final C3846a f12244f = new C3846a();

    /* renamed from: c */
    private String f12245c;

    /* renamed from: q */
    public static C3846a m14468q() {
        return f12244f;
    }

    /* renamed from: A */
    public final boolean mo11868A(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent p;
        if (C8705b.m32452a(context) || (p = mo11876p(context, connectionResult)) == null) {
            return false;
        }
        mo11883x(context, connectionResult.mo11858v(), (String) null, C6042f.m24169a(context, 0, GoogleApiActivity.m14489a(context, p, i, true), C6042f.f18825a | 134217728));
        return true;
    }

    /* renamed from: d */
    public Intent mo11869d(Context context, int i, String str) {
        return super.mo11869d(context, i, str);
    }

    /* renamed from: e */
    public PendingIntent mo11870e(Context context, int i, int i2) {
        return super.mo11870e(context, i, i2);
    }

    /* renamed from: g */
    public final String mo11871g(int i) {
        return super.mo11871g(i);
    }

    /* renamed from: i */
    public int mo11872i(Context context) {
        return super.mo11872i(context);
    }

    /* renamed from: j */
    public int mo11873j(Context context, int i) {
        return super.mo11873j(context, i);
    }

    /* renamed from: m */
    public final boolean mo11874m(int i) {
        return super.mo11874m(i);
    }

    /* renamed from: o */
    public Dialog mo11875o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo11879t(activity, i, C7290v.m27943b(activity, mo11869d(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: p */
    public PendingIntent mo11876p(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo11853R()) {
            return connectionResult.mo11861x();
        }
        return mo11870e(context, connectionResult.mo11858v(), 0);
    }

    /* renamed from: r */
    public boolean mo11877r(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = mo11875o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        mo11882w(activity, o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: s */
    public void mo11878s(Context context, int i) {
        mo11883x(context, i, (String) null, mo12155f(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Dialog mo11879t(Context context, int i, C7290v vVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C7285s.m27931d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C7285s.m27930c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, vVar);
        }
        String g = C7285s.m27934g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: u */
    public final Dialog mo11880u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C7285s.m27931d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo11882w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: v */
    public final C6972x mo11881v(Context context, C6971w wVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C6972x xVar = new C6972x(wVar);
        context.registerReceiver(xVar, intentFilter);
        xVar.mo21105a(context);
        if (mo12157l(context, "com.google.android.gms")) {
            return xVar;
        }
        wVar.mo12062a();
        xVar.mo21106b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo11882w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C1505h) {
                C6734j.m26252B1(dialog, onCancelListener).mo4576A1(((C1505h) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C6726b.m26245a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo11883x(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo11884y(context);
        } else if (pendingIntent != null) {
            String f = C7285s.m27933f(context, i);
            String e = C7285s.m27932e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C7264i.m27902k(context.getSystemService("notification"));
            C0750x.C0759e x = new C0750x.C0759e(context).mo3224q(true).mo3214f(true).mo3219k(f).mo3231x(new C0750x.C0756c().mo3207h(e));
            if (C8408j.m31550c(context)) {
                C7264i.m27905n(C8413o.m31567e());
                x.mo3229v(context.getApplicationInfo().icon).mo3227t(2);
                if (C8408j.m31551d(context)) {
                    x.mo3211a(C6440a.f19710a, resources.getString(C6441b.f19725o), pendingIntent);
                } else {
                    x.mo3217i(pendingIntent);
                }
            } else {
                x.mo3229v(17301642).mo3232y(resources.getString(C6441b.f19718h)).mo3210B(System.currentTimeMillis()).mo3217i(pendingIntent).mo3218j(e);
            }
            if (C8413o.m31570h()) {
                C7264i.m27905n(C8413o.m31570h());
                synchronized (f12243e) {
                    str2 = this.f12245c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel a = notificationManager.getNotificationChannel(str2);
                    String b = C7285s.m27929b(context);
                    if (a == null) {
                        C6732h.m26251a();
                        notificationManager.createNotificationChannel(C6731g.m26250a(str2, b, 4));
                    } else if (!b.contentEquals(a.getName())) {
                        a.setName(b);
                        notificationManager.createNotificationChannel(a);
                    }
                }
                x.mo3215g(str2);
            }
            Notification b2 = x.mo3212b();
            if (i == 1 || i == 2 || i == 3) {
                C3943d.f12558b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo11884y(Context context) {
        new C3949f(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: z */
    public final boolean mo11885z(Activity activity, C6942g gVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog t = mo11879t(activity, i, C7290v.m27944c(gVar, mo11869d(activity, i, "d"), 2), onCancelListener);
        if (t == null) {
            return false;
        }
        mo11882w(activity, t, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
