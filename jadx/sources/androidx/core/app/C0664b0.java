package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.session.C0125b;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.app.C0750x;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.salesforce.marketingcloud.C11398b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.b0 */
class C0664b0 implements C0748w {

    /* renamed from: a */
    private final Context f3250a;

    /* renamed from: b */
    private final Notification.Builder f3251b;

    /* renamed from: c */
    private final C0750x.C0759e f3252c;

    /* renamed from: d */
    private RemoteViews f3253d;

    /* renamed from: e */
    private RemoteViews f3254e;

    /* renamed from: f */
    private final List f3255f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3256g = new Bundle();

    /* renamed from: h */
    private int f3257h;

    /* renamed from: i */
    private RemoteViews f3258i;

    /* renamed from: androidx.core.app.b0$a */
    static class C0665a {
        /* renamed from: a */
        static Notification m2633a(Notification.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        static Notification.Builder m2634b(Notification.Builder builder, int i) {
            return builder.setPriority(i);
        }

        /* renamed from: c */
        static Notification.Builder m2635c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        /* renamed from: d */
        static Notification.Builder m2636d(Notification.Builder builder, boolean z) {
            return builder.setUsesChronometer(z);
        }
    }

    /* renamed from: androidx.core.app.b0$b */
    static class C0666b {
        /* renamed from: a */
        static Notification.Builder m2637a(Notification.Builder builder, boolean z) {
            return builder.setShowWhen(z);
        }
    }

    /* renamed from: androidx.core.app.b0$c */
    static class C0667c {
        /* renamed from: a */
        static Notification.Builder m2638a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.app.b0$d */
    static class C0668d {
        /* renamed from: a */
        static Notification.Builder m2639a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        static Notification.Action.Builder m2640b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        static Notification.Action.Builder m2641c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        static Notification.Action m2642d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        static Notification.Action.Builder m2643e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        /* renamed from: f */
        static String m2644f(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: g */
        static Notification.Builder m2645g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: h */
        static Notification.Builder m2646h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        /* renamed from: i */
        static Notification.Builder m2647i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        /* renamed from: j */
        static Notification.Builder m2648j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: androidx.core.app.b0$e */
    static class C0669e {
        /* renamed from: a */
        static Notification.Builder m2649a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        static Notification.Builder m2650b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        static Notification.Builder m2651c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        /* renamed from: d */
        static Notification.Builder m2652d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        static Notification.Builder m2653e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        static Notification.Builder m2654f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* renamed from: androidx.core.app.b0$f */
    static class C0670f {
        /* renamed from: a */
        static Notification.Action.Builder m2655a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        static Notification.Builder m2656b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: androidx.core.app.b0$g */
    static class C0671g {
        /* renamed from: a */
        static Notification.Action.Builder m2657a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        /* renamed from: b */
        static Notification.Builder m2658b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        /* renamed from: c */
        static Notification.Builder m2659c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        /* renamed from: d */
        static Notification.Builder m2660d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        /* renamed from: e */
        static Notification.Builder m2661e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: androidx.core.app.b0$h */
    static class C0672h {
        /* renamed from: a */
        static Notification.Builder m2662a(Context context, String str) {
            C0732o0.m2782a();
            return C0730n0.m2780a(context, str);
        }

        /* renamed from: b */
        static Notification.Builder m2663b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        /* renamed from: c */
        static Notification.Builder m2664c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        /* renamed from: d */
        static Notification.Builder m2665d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        /* renamed from: e */
        static Notification.Builder m2666e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        /* renamed from: f */
        static Notification.Builder m2667f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        /* renamed from: g */
        static Notification.Builder m2668g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* renamed from: androidx.core.app.b0$i */
    static class C0673i {
        /* renamed from: a */
        static Notification.Builder m2669a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        /* renamed from: b */
        static Notification.Action.Builder m2670b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* renamed from: androidx.core.app.b0$j */
    static class C0674j {
        /* renamed from: a */
        static Notification.Builder m2671a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        /* renamed from: b */
        static Notification.Builder m2672b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        /* renamed from: c */
        static Notification.Action.Builder m2673c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        /* renamed from: d */
        static Notification.Builder m2674d(Notification.Builder builder, Object obj) {
            return builder.setLocusId(C0744u0.m2794a(obj));
        }
    }

    /* renamed from: androidx.core.app.b0$k */
    static class C0675k {
        /* renamed from: a */
        static Notification.Action.Builder m2675a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        /* renamed from: b */
        static Notification.Builder m2676b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    C0664b0(C0750x.C0759e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        this.f3252c = eVar;
        Context context = eVar.f3364a;
        this.f3250a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3251b = C0672h.m2662a(context, eVar.f3352K);
        } else {
            this.f3251b = new Notification.Builder(eVar.f3364a);
        }
        Notification notification = eVar.f3360S;
        Notification.Builder lights = this.f3251b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f3372i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(eVar.f3368e).setContentText(eVar.f3369f).setContentInfo(eVar.f3374k).setContentIntent(eVar.f3370g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f3371h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(eVar.f3373j).setNumber(eVar.f3375l).setProgress(eVar.f3383t, eVar.f3384u, eVar.f3385v);
        C0665a.m2634b(C0665a.m2636d(C0665a.m2635c(this.f3251b, eVar.f3380q), eVar.f3378o), eVar.f3376m);
        Iterator it = eVar.f3365b.iterator();
        while (it.hasNext()) {
            m2625b((C0750x.C0751a) it.next());
        }
        Bundle bundle = eVar.f3345D;
        if (bundle != null) {
            this.f3256g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f3253d = eVar.f3349H;
        this.f3254e = eVar.f3350I;
        C0666b.m2637a(this.f3251b, eVar.f3377n);
        C0668d.m2647i(this.f3251b, eVar.f3389z);
        C0668d.m2645g(this.f3251b, eVar.f3386w);
        C0668d.m2648j(this.f3251b, eVar.f3388y);
        C0668d.m2646h(this.f3251b, eVar.f3387x);
        this.f3257h = eVar.f3357P;
        C0669e.m2650b(this.f3251b, eVar.f3344C);
        C0669e.m2651c(this.f3251b, eVar.f3346E);
        C0669e.m2654f(this.f3251b, eVar.f3347F);
        C0669e.m2652d(this.f3251b, eVar.f3348G);
        C0669e.m2653e(this.f3251b, notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m2626e(m2627g(eVar.f3366c), eVar.f3363V);
        } else {
            list = eVar.f3363V;
        }
        if (list != null && !list.isEmpty()) {
            for (String a : list) {
                C0669e.m2649a(this.f3251b, a);
            }
        }
        this.f3258i = eVar.f3351J;
        if (eVar.f3367d.size() > 0) {
            Bundle bundle2 = eVar.mo3213c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < eVar.f3367d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C0764y0.m2884a((C0750x.C0751a) eVar.f3367d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.mo3213c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3256g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = eVar.f3362U;
        if (obj != null) {
            C0670f.m2656b(this.f3251b, obj);
        }
        if (i4 >= 24) {
            C0667c.m2638a(this.f3251b, eVar.f3345D);
            C0671g.m2661e(this.f3251b, eVar.f3382s);
            RemoteViews remoteViews = eVar.f3349H;
            if (remoteViews != null) {
                C0671g.m2659c(this.f3251b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f3350I;
            if (remoteViews2 != null) {
                C0671g.m2658b(this.f3251b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f3351J;
            if (remoteViews3 != null) {
                C0671g.m2660d(this.f3251b, remoteViews3);
            }
        }
        if (i4 >= 26) {
            C0672h.m2663b(this.f3251b, eVar.f3353L);
            C0672h.m2666e(this.f3251b, eVar.f3381r);
            C0672h.m2667f(this.f3251b, eVar.f3354M);
            C0672h.m2668g(this.f3251b, eVar.f3356O);
            C0672h.m2665d(this.f3251b, eVar.f3357P);
            if (eVar.f3343B) {
                C0672h.m2664c(this.f3251b, eVar.f3342A);
            }
            if (!TextUtils.isEmpty(eVar.f3352K)) {
                this.f3251b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i4 >= 28) {
            Iterator it2 = eVar.f3366c.iterator();
            if (it2.hasNext()) {
                C0125b.m366a(it2.next());
                throw null;
            }
        }
        if (i4 >= 29) {
            C0674j.m2671a(this.f3251b, eVar.f3359R);
            C0674j.m2672b(this.f3251b, C0750x.C0758d.m2841a((C0750x.C0758d) null));
            LocusIdCompat locusIdCompat = eVar.f3355N;
            if (locusIdCompat != null) {
                C0674j.m2674d(this.f3251b, locusIdCompat.mo3238b());
            }
        }
        if (i4 >= 31 && (i = eVar.f3358Q) != 0) {
            C0675k.m2676b(this.f3251b, i);
        }
        if (eVar.f3361T) {
            if (this.f3252c.f3387x) {
                this.f3257h = 2;
            } else {
                this.f3257h = 1;
            }
            this.f3251b.setVibrate((long[]) null);
            this.f3251b.setSound((Uri) null);
            int i5 = notification.defaults & -2 & -3;
            notification.defaults = i5;
            this.f3251b.setDefaults(i5);
            if (i4 >= 26) {
                if (TextUtils.isEmpty(this.f3252c.f3386w)) {
                    C0668d.m2645g(this.f3251b, "silent");
                }
                C0672h.m2665d(this.f3251b, this.f3257h);
            }
        }
    }

    /* renamed from: b */
    private void m2625b(C0750x.C0751a aVar) {
        Icon icon;
        Bundle bundle;
        IconCompat d = aVar.mo3194d();
        if (d != null) {
            icon = d.mo3308l();
        } else {
            icon = null;
        }
        Notification.Action.Builder a = C0670f.m2655a(icon, aVar.mo3198h(), aVar.mo3191a());
        if (aVar.mo3195e() != null) {
            for (RemoteInput c : C0695f1.m2708b(aVar.mo3195e())) {
                C0668d.m2641c(a, c);
            }
        }
        if (aVar.mo3193c() != null) {
            bundle = new Bundle(aVar.mo3193c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo3192b());
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            C0671g.m2657a(a, aVar.mo3192b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.mo3196f());
        if (i >= 28) {
            C0673i.m2670b(a, aVar.mo3196f());
        }
        if (i >= 29) {
            C0674j.m2673c(a, aVar.mo3200j());
        }
        if (i >= 31) {
            C0675k.m2675a(a, aVar.mo3199i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo3197g());
        C0668d.m2640b(a, bundle);
        C0668d.m2639a(this.f3251b, C0668d.m2642d(a));
    }

    /* renamed from: e */
    private static List m2626e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    /* renamed from: g */
    private static List m2627g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        C0125b.m366a(it.next());
        throw null;
    }

    /* renamed from: h */
    private void m2628h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }

    /* renamed from: a */
    public Notification.Builder mo3115a() {
        return this.f3251b;
    }

    /* renamed from: c */
    public Notification mo3116c() {
        RemoteViews remoteViews;
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        C0750x.C0761f fVar = this.f3252c.f3379p;
        if (fVar != null) {
            fVar.mo3201b(this);
        }
        if (fVar != null) {
            remoteViews = fVar.mo3235e(this);
        } else {
            remoteViews = null;
        }
        Notification d2 = mo3117d();
        if (remoteViews != null) {
            d2.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f3252c.f3349H;
            if (remoteViews2 != null) {
                d2.contentView = remoteViews2;
            }
        }
        if (!(fVar == null || (d = fVar.mo3234d(this)) == null)) {
            d2.bigContentView = d;
        }
        if (!(fVar == null || (f = this.f3252c.f3379p.mo3236f(this)) == null)) {
            d2.headsUpContentView = f;
        }
        if (!(fVar == null || (a = C0750x.m2807a(d2)) == null)) {
            fVar.mo3206a(a);
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Notification mo3117d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return C0665a.m2633a(this.f3251b);
        }
        if (i >= 24) {
            Notification a = C0665a.m2633a(this.f3251b);
            if (this.f3257h != 0) {
                if (!(C0668d.m2644f(a) == null || (a.flags & C11398b.f33140s) == 0 || this.f3257h != 2)) {
                    m2628h(a);
                }
                if (C0668d.m2644f(a) != null && (a.flags & C11398b.f33140s) == 0 && this.f3257h == 1) {
                    m2628h(a);
                }
            }
            return a;
        }
        C0667c.m2638a(this.f3251b, this.f3256g);
        Notification a2 = C0665a.m2633a(this.f3251b);
        RemoteViews remoteViews = this.f3253d;
        if (remoteViews != null) {
            a2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f3254e;
        if (remoteViews2 != null) {
            a2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f3258i;
        if (remoteViews3 != null) {
            a2.headsUpContentView = remoteViews3;
        }
        if (this.f3257h != 0) {
            if (!(C0668d.m2644f(a2) == null || (a2.flags & C11398b.f33140s) == 0 || this.f3257h != 2)) {
                m2628h(a2);
            }
            if (C0668d.m2644f(a2) != null && (a2.flags & C11398b.f33140s) == 0 && this.f3257h == 1) {
                m2628h(a2);
            }
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Context mo3118f() {
        return this.f3250a;
    }
}
