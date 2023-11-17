package f10;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import ba1.C10199i;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import iu0.C36546y;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37350a;
import n41.C37351b;
import n41.C37353c;
import p341ge.bog.sso_client.models.C35952m;

/* renamed from: f10.a */
public final class C20329a implements C10199i {

    /* renamed from: b */
    public static final C20330a f55281b = new C20330a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C20329a f55282c;

    /* renamed from: a */
    private final C37350a f55283a;

    /* renamed from: f10.a$a */
    public static final class C20330a {
        private C20330a() {
        }

        public /* synthetic */ C20330a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20329a mo48813a() {
            C20329a d = C20329a.f55282c;
            if (d != null) {
                return d;
            }
            C41536l.m120506z("instance");
            return null;
        }

        /* renamed from: b */
        public final C20329a mo48814b(Context context) {
            C41536l.m120489i(context, "context");
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            C41536l.m120488h(defaultSharedPreferences, "prefs");
            C20329a.f55282c = new C20329a(new C37351b(defaultSharedPreferences), (DefaultConstructorMarker) null);
            C20329a d = C20329a.f55282c;
            if (d != null) {
                return d;
            }
            C41536l.m120506z("instance");
            return null;
        }
    }

    /* renamed from: f10.a$b */
    public /* synthetic */ class C20331b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55284a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f55285b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                n41.c[] r0 = n41.C37353c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                n41.c r2 = n41.C37353c.EN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n41.c r2 = n41.C37353c.KA     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f55284a = r0
                ge.bog.sso_client.models.m[] r0 = p341ge.bog.sso_client.models.C35952m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.sso_client.models.m r2 = p341ge.bog.sso_client.models.C35952m.EN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                f55285b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f10.C20329a.C20331b.<clinit>():void");
        }
    }

    public /* synthetic */ C20329a(C37350a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* renamed from: g */
    private final Locale m66400g(Configuration configuration) {
        Locale locale;
        String str;
        if (m66402j(24)) {
            locale = configuration.getLocales().get(0);
            str = "locales.get(0)";
        } else {
            locale = configuration.locale;
            str = C11772k.C11773a.f34182n;
        }
        C41536l.m120488h(locale, str);
        return locale;
    }

    /* renamed from: i */
    public static final C20329a m66401i(Context context) {
        return f55281b.mo48814b(context);
    }

    /* renamed from: j */
    private final boolean m66402j(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: l */
    private final Context m66403l(Context context, C37353c cVar, boolean z) {
        Context context2;
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        C41536l.m120488h(configuration, "res.configuration");
        Locale g = m66400g(configuration);
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (!C40439w.m117115s(g.getLanguage(), cVar.mo90434c(), true)) {
            Locale locale = new Locale(cVar.mo90434c());
            Locale.setDefault(locale);
            if (m66402j(24)) {
                configuration2.setLocale(locale);
            } else {
                configuration2.locale = locale;
            }
        }
        if (z || !m66402j(24)) {
            resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
            context2 = context;
        } else {
            context2 = context.createConfigurationContext(configuration2);
            C41536l.m120488h(context2, "context.createConfigurationContext(config)");
        }
        context.sendBroadcast(new Intent("ge.bog.mobilebank.ACTION_LOCALE_CHANGED"));
        return context2;
    }

    /* renamed from: m */
    static /* synthetic */ Context m66404m(C20329a aVar, Context context, C37353c cVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return aVar.m66403l(context, cVar, z);
    }

    /* renamed from: a */
    public C35952m mo26767a() {
        int i = C20331b.f55284a[this.f55283a.getLanguage().ordinal()];
        if (i == 1) {
            return C35952m.EN;
        }
        if (i != 2) {
            return C35952m.KA;
        }
        return C35952m.KA;
    }

    /* renamed from: b */
    public Context mo26768b(Context context) {
        C41536l.m120489i(context, "context");
        return mo48810f(context);
    }

    /* renamed from: c */
    public void mo26769c(C35952m mVar) {
        C37353c cVar;
        C41536l.m120489i(mVar, "newLocale");
        C10199i.C10200a.m37276a(this, mVar);
        C37350a aVar = this.f55283a;
        if (C20331b.f55285b[mVar.ordinal()] == 1) {
            cVar = C37353c.EN;
        } else {
            cVar = C37353c.KA;
        }
        aVar.setLanguage(cVar);
    }

    /* renamed from: f */
    public final Context mo48810f(Context context) {
        C41536l.m120489i(context, "context");
        return m66404m(this, context, this.f55283a.getLanguage(), false, 4, (Object) null);
    }

    /* renamed from: h */
    public final C37353c mo48811h() {
        return this.f55283a.getLanguage();
    }

    /* renamed from: k */
    public final void mo48812k(Context context, C37353c cVar) {
        C35952m mVar;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(cVar, C11772k.C11773a.f34182n);
        this.f55283a.setLanguage(cVar);
        C36546y.m108282F().mo27144O(cVar.mo90434c());
        m66403l(context, cVar, false);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            m66403l(applicationContext, cVar, true);
        }
        int i = C20331b.f55284a[this.f55283a.getLanguage().ordinal()];
        if (i == 1) {
            mVar = C35952m.EN;
        } else if (i == 2) {
            mVar = C35952m.KA;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        mo26769c(mVar);
    }

    private C20329a(C37350a aVar) {
        this.f55283a = aVar;
    }
}
