package p943xr;

import android.content.Context;
import com.google.gson.C5611k;
import com.google.gson.Gson;
import de1.C40640a;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import g91.C32343x;
import he1.C41238w;
import iu0.C36546y;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.data.appsettings.entity.AppSettingApiEntity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10327p;
import p707as.C19273c;
import p758fu.C20557a;
import p772gu.C24779a;
import p954yr.C30111a;
import ue1.C43075l;

/* renamed from: xr.h */
public final class C29835h implements C24779a {

    /* renamed from: j */
    public static final C29838c f75527j = new C29838c((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f75528a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C30111a f75529b;

    /* renamed from: c */
    private final PreferencesApiManager f75530c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C29825a f75531d;

    /* renamed from: e */
    private final Context f75532e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C40765a f75533f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C40765a f75534g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f75535h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List f75536i;

    /* renamed from: xr.h$a */
    public static final class C29836a extends C8982a<List<? extends AppSettingApiEntity>> {
        C29836a() {
        }
    }

    /* renamed from: xr.h$b */
    public static final class C29837b extends C8982a<List<? extends AppSettingApiEntity>> {
        C29837b() {
        }
    }

    /* renamed from: xr.h$c */
    public static final class C29838c {
        private C29838c() {
        }

        public /* synthetic */ C29838c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xr.h$d */
    static final class C29839d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29835h f75537d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29839d(C29835h hVar) {
            super(1);
            this.f75537d = hVar;
        }

        /* renamed from: a */
        public final void mo70094a(List list) {
            C29835h hVar = this.f75537d;
            C41536l.m120488h(list, "it");
            hVar.m90610w(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70094a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xr.h$e */
    static final class C29840e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29835h f75538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29840e(C29835h hVar) {
            super(1);
            this.f75538d = hVar;
        }

        /* renamed from: a */
        public final void mo70095a(List list) {
            this.f75538d.f75535h = list;
            this.f75538d.f75533f.onNext(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70095a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xr.h$f */
    static final class C29841f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29835h f75539d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29841f(C29835h hVar) {
            super(1);
            this.f75539d = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f75539d.f75533f.onNext(Boolean.TRUE);
        }
    }

    /* renamed from: xr.h$g */
    static final class C29842g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29835h f75540d;

        /* renamed from: e */
        final /* synthetic */ long f75541e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29842g(C29835h hVar, long j) {
            super(1);
            this.f75540d = hVar;
            this.f75541e = j;
        }

        /* renamed from: a */
        public final void mo70097a(List list) {
            C29825a p = this.f75540d.f75531d;
            C41536l.m120488h(list, "it");
            p.mo70093e(list, this.f75541e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70097a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xr.h$h */
    static final class C29843h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29835h f75542d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29843h(C29835h hVar) {
            super(1);
            this.f75542d = hVar;
        }

        /* renamed from: a */
        public final void mo70098a(List list) {
            C29835h hVar = this.f75542d;
            C41536l.m120488h(list, "settings");
            hVar.f75536i = C41358y.m120004T(list);
            this.f75542d.f75534g.onNext(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70098a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xr.h$i */
    static final class C29844i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29835h f75543d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29844i(C29835h hVar) {
            super(1);
            this.f75543d = hVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f75543d.f75529b.mo70397b(list);
        }
    }

    public C29835h(IRetrofitService iRetrofitService, C30111a aVar, PreferencesApiManager preferencesApiManager, C29825a aVar2, Context context) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(aVar2, "settingsManager");
        C41536l.m120489i(context, "context");
        this.f75528a = iRetrofitService;
        this.f75529b = aVar;
        this.f75530c = preferencesApiManager;
        this.f75531d = aVar2;
        this.f75532e = context;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f75533f = h1;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<Boolean>()");
        this.f75534g = h12;
        List b = aVar2.mo70090b();
        this.f75535h = b;
        if (b == null) {
            InputStream openRawResource = context.getResources().openRawResource(C10327p.app_settings_external);
            C41536l.m120488h(openRawResource, "context.resources.openRa…aw.app_settings_external)");
            this.f75535h = (List) new Gson().mo18166h(C5611k.m22280b(new InputStreamReader(openRawResource, "UTF-8")), new C29836a().getType());
        }
        InputStream openRawResource2 = context.getResources().openRawResource(C10327p.app_settings_internal);
        C41536l.m120488h(openRawResource2, "context.resources.openRa…aw.app_settings_internal)");
        this.f75536i = (List) new Gson().mo18166h(C5611k.m22280b(new InputStreamReader(openRawResource2, "UTF-8")), new C29837b().getType());
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m90607t(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m90608u(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m90609v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m90610w(List list) {
        this.f75531d.mo70092d(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m90611x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m90612y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final List m90613z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40749p mo63197a() {
        C40749p c0 = this.f75533f.mo95017c0();
        C41536l.m120488h(c0, "externalSettingsLoaded.hide()");
        return c0;
    }

    /* renamed from: b */
    public C20557a mo63198b(String str) {
        AppSettingApiEntity appSettingApiEntity;
        Object obj;
        AppSettingApiEntity appSettingApiEntity2;
        Object obj2;
        C41536l.m120489i(str, "appSettingName");
        List list = this.f75535h;
        if (list != null) {
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C41536l.m120484d(((AppSettingApiEntity) obj2).getSettingsName(), str)) {
                        break;
                    }
                }
                appSettingApiEntity2 = (AppSettingApiEntity) obj2;
            } else {
                appSettingApiEntity2 = null;
            }
            if (appSettingApiEntity2 != null) {
                return this.f75529b.mo70396a(appSettingApiEntity2);
            }
            return null;
        }
        List b = this.f75531d.mo70090b();
        if (b != null) {
            Iterator it2 = b.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C41536l.m120484d(((AppSettingApiEntity) obj).getSettingsName(), str)) {
                    break;
                }
            }
            appSettingApiEntity = (AppSettingApiEntity) obj;
        } else {
            appSettingApiEntity = null;
        }
        if (appSettingApiEntity != null) {
            return this.f75529b.mo70396a(appSettingApiEntity);
        }
        return null;
    }

    /* renamed from: c */
    public C40749p mo63199c() {
        C40749p c0 = this.f75534g.mo95017c0();
        C41536l.m120488h(c0, "internalSettingsLoaded.hide()");
        return c0;
    }

    /* renamed from: d */
    public void mo63200d() {
        C40762x<BankApiResponse<List<AppSettingApiEntity>>> appSettingsExternal = this.f75528a.getAppSettingsExternal("COMMON_GET_SETTINGS", this.f75530c.getClientSegment());
        C41536l.m120488h(appSettingsExternal, "service.getAppSettingsEx…_SETTINGS, clientSegment)");
        C40762x m = C19273c.m64722h(appSettingsExternal).mo95072K(C40640a.m117458b()).mo95084m(new C29832e(new C29839d(this)));
        C41536l.m120488h(m, "override fun loadAppSett…rue)\n            })\n    }");
        C41536l.m120488h(C32343x.m95415S0(m).mo95070I(new C29833f(new C29840e(this)), new C29834g(new C29841f(this))), "override fun loadAppSett…rue)\n            })\n    }");
    }

    /* renamed from: e */
    public C20557a mo63201e(String str) {
        long j;
        AppSettingApiEntity appSettingApiEntity;
        Object obj;
        Client K;
        C37228a loginInfo;
        AppSettingApiEntity appSettingApiEntity2;
        Object obj2;
        C41536l.m120489i(str, "appSettingName");
        List list = this.f75536i;
        if (list != null) {
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C41536l.m120484d(((AppSettingApiEntity) obj2).getSettingsName(), str)) {
                        break;
                    }
                }
                appSettingApiEntity2 = (AppSettingApiEntity) obj2;
            } else {
                appSettingApiEntity2 = null;
            }
            if (appSettingApiEntity2 != null) {
                return this.f75529b.mo70396a(appSettingApiEntity2);
            }
            return null;
        }
        C29825a aVar = this.f75531d;
        C36546y N = C36546y.m108285N();
        if (N == null || (K = N.mo89313K()) == null || (loginInfo = K.getLoginInfo()) == null) {
            j = -1;
        } else {
            j = loginInfo.mo90306c();
        }
        List c = aVar.mo70091c(j);
        if (c != null) {
            Iterator it2 = c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C41536l.m120484d(((AppSettingApiEntity) obj).getSettingsName(), str)) {
                    break;
                }
            }
            appSettingApiEntity = (AppSettingApiEntity) obj;
        } else {
            appSettingApiEntity = null;
        }
        if (appSettingApiEntity != null) {
            return this.f75529b.mo70396a(appSettingApiEntity);
        }
        return null;
    }

    /* renamed from: f */
    public C40749p mo63202f(long j) {
        C40762x<BankApiResponse<List<AppSettingApiEntity>>> appSettingsInternal = this.f75528a.getAppSettingsInternal("COMMON_GET_SETTINGS");
        C41536l.m120488h(appSettingsInternal, "service.getAppSettingsIn…rnal(COMMON_GET_SETTINGS)");
        C40762x m = C19273c.m64722h(appSettingsInternal).mo95084m(new C29829b(new C29842g(this, j)));
        C41536l.m120488h(m, "override fun updateInter…    .toObservable()\n    }");
        C40749p O = C32343x.m95415S0(m).mo95084m(new C29830c(new C29843h(this))).mo95062A(new C29831d(new C29844i(this))).mo95075O();
        C41536l.m120488h(O, "override fun updateInter…    .toObservable()\n    }");
        return O;
    }
}
