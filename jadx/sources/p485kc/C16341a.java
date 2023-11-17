package p485kc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.identomat.activities.NavigationActivity;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p345ad.C9786e;
import p345ad.C9793g;
import p678yc.C18877a;
import ue1.C43064a;

/* renamed from: kc.a */
public final class C16341a {

    /* renamed from: a */
    public static final C16341a f46171a = new C16341a();

    /* renamed from: b */
    private static C43064a f46172b = C16342a.f46178d;

    /* renamed from: c */
    private static C43064a f46173c = C16343b.f46179d;

    /* renamed from: d */
    private static C18877a f46174d = new C18877a();

    /* renamed from: e */
    private static C9786e f46175e = new C9786e();

    /* renamed from: f */
    private static C9793g f46176f = new C9793g();

    /* renamed from: g */
    private static Activity f46177g;

    /* renamed from: kc.a$a */
    static final class C16342a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C16342a f46178d = new C16342a();

        C16342a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: kc.a$b */
    static final class C16343b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C16343b f46179d = new C16343b();

        C16343b() {
            super(0);
        }

        /* renamed from: b */
        public final Void invoke() {
            return null;
        }
    }

    private C16341a() {
    }

    /* renamed from: a */
    public final void mo43313a(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        f46172b.invoke();
    }

    /* renamed from: b */
    public final C9786e mo43314b() {
        return f46175e;
    }

    /* renamed from: c */
    public final C9793g mo43315c() {
        return f46176f;
    }

    /* renamed from: d */
    public final C18877a mo43316d() {
        return f46174d;
    }

    /* renamed from: e */
    public final Intent mo43317e(Context context) {
        C41536l.m120489i(context, "context");
        Intent intent = new Intent(context, NavigationActivity.class);
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: f */
    public final C43064a mo43318f() {
        return f46173c;
    }

    /* renamed from: g */
    public final void mo43319g(Activity activity) {
        f46177g = activity;
    }

    /* renamed from: h */
    public final void mo43320h(String str) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C9786e.f26584a.mo26263b(str);
    }

    /* renamed from: i */
    public final void mo43321i(C43064a aVar) {
        C41536l.m120489i(aVar, "callback");
        f46172b = aVar;
    }

    /* renamed from: j */
    public final void mo43322j(Map map) {
        C41536l.m120489i(map, "colors");
        f46174d.mo46861a().mo47107p(map);
    }

    /* renamed from: k */
    public final void mo43323k(String str) {
        C41536l.m120489i(str, "token");
        C9786e.f26584a.mo26264c(str);
    }

    /* renamed from: l */
    public final void mo43324l(Map map) {
        C41536l.m120489i(map, "variables");
        f46174d.mo46867g().mo47155t(map);
    }

    /* renamed from: m */
    public final void mo43325m(Map map) {
        C41536l.m120489i(map, "strings");
        f46174d.mo46864d().mo47123c(map);
    }
}
