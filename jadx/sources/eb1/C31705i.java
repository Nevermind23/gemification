package eb1;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import cd1.C40393c;
import com.salesforce.marketingcloud.C11398b;
import db1.C31552b;
import db1.C31553c;
import db1.C31554d;
import dd1.C40578p1;
import ed1.C40734b;
import gb1.C32381m;
import gb1.C32383o;
import gb1.C32392v;
import gb1.C32393w;
import ha1.C15458b;
import he1.C41232r;
import he1.C41238w;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sso.queery.GetClientInfoQuery;
import sso.type.ContactType;
import ue1.C43064a;
import ue1.C43075l;
import xa1.C39832a;
import za1.C40218a;
import za1.C40220c;
import za1.C40221d;
import za1.C40222e;
import za1.C40223f;
import za1.C40224g;
import za1.C40225h;
import za1.C40226i;
import za1.C40227j;
import za1.C40228k;

/* renamed from: eb1.i */
public final class C31705i extends C15458b {

    /* renamed from: G */
    public static final C31706a f78285G = new C31706a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C1644x f78286A = new C1644x();

    /* renamed from: B */
    private final C1644x f78287B = new C1644x();

    /* renamed from: C */
    private final C32383o f78288C = new C32383o();

    /* renamed from: D */
    private final C32383o f78289D = new C32383o();

    /* renamed from: E */
    private final C1644x f78290E = new C1644x();

    /* renamed from: F */
    private String f78291F = "";

    /* renamed from: h */
    private final C40221d f78292h;

    /* renamed from: i */
    private final C40220c f78293i;

    /* renamed from: j */
    private final C40218a f78294j;

    /* renamed from: k */
    private final C40227j f78295k;

    /* renamed from: l */
    private final C40224g f78296l;

    /* renamed from: m */
    private final C40226i f78297m;

    /* renamed from: n */
    private final C40225h f78298n;

    /* renamed from: o */
    private final C40228k f78299o;

    /* renamed from: p */
    private final C31552b f78300p;

    /* renamed from: q */
    private final C40222e f78301q;

    /* renamed from: r */
    private final C40223f f78302r;

    /* renamed from: s */
    private final C40393c f78303s;

    /* renamed from: t */
    private C31553c f78304t;

    /* renamed from: u */
    private final C1644x f78305u = new C1644x();

    /* renamed from: v */
    private final C1644x f78306v = new C1644x();

    /* renamed from: w */
    private final C1644x f78307w = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C32383o f78308x = new C32383o();

    /* renamed from: y */
    private final C32383o f78309y = new C32383o();

    /* renamed from: z */
    private final C1644x f78310z = new C1644x();

    /* renamed from: eb1.i$a */
    public static final class C31706a {
        private C31706a() {
        }

        public /* synthetic */ C31706a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: eb1.i$a0 */
    /* synthetic */ class C31707a0 extends C41535k implements C43064a {
        C31707a0(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72141b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72141b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$b */
    public static final class C31708b {

        /* renamed from: a */
        private final List f78311a;

        /* renamed from: b */
        private final String f78312b;

        public C31708b(List list, String str) {
            C41536l.m120489i(list, "rules");
            C41536l.m120489i(str, "username");
            this.f78311a = list;
            this.f78312b = str;
        }

        /* renamed from: a */
        public final List mo72142a() {
            return this.f78311a;
        }

        /* renamed from: b */
        public final String mo72143b() {
            return this.f78312b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31708b)) {
                return false;
            }
            C31708b bVar = (C31708b) obj;
            return C41536l.m120484d(this.f78311a, bVar.f78311a) && C41536l.m120484d(this.f78312b, bVar.f78312b);
        }

        public int hashCode() {
            return (this.f78311a.hashCode() * 31) + this.f78312b.hashCode();
        }

        public String toString() {
            return "UsernameActionSheetData(rules=" + this.f78311a + ", username=" + this.f78312b + ')';
        }
    }

    /* renamed from: eb1.i$b0 */
    /* synthetic */ class C31709b0 extends C41535k implements C43064a {
        C31709b0(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72147b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72147b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$c */
    /* synthetic */ class C31710c extends C41535k implements C43064a {
        C31710c(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72148b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72148b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$c0 */
    /* synthetic */ class C31711c0 extends C41535k implements C43075l {
        C31711c0(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72149b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72149b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$d */
    /* synthetic */ class C31712d extends C41535k implements C43064a {
        C31712d(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72150b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72150b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$d0 */
    /* synthetic */ class C31713d0 extends C41535k implements C43064a {
        C31713d0(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72151b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72151b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$e */
    /* synthetic */ class C31714e extends C41535k implements C43075l {
        C31714e(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72152b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72152b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$e0 */
    /* synthetic */ class C31715e0 extends C41535k implements C43075l {
        C31715e0(Object obj) {
            super(1, obj, C31705i.class, "onUserInfoSuccess", "onUserInfoSuccess(Lsso/queery/GetClientInfoQuery$GetClientInfo;)V", 0);
        }

        /* renamed from: b */
        public final void mo72153b(GetClientInfoQuery.GetClientInfo getClientInfo) {
            C41536l.m120489i(getClientInfo, "p0");
            ((C31705i) this.receiver).m93841Kw(getClientInfo);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72153b((GetClientInfoQuery.GetClientInfo) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$f */
    /* synthetic */ class C31716f extends C41535k implements C43064a {
        C31716f(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72154b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72154b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$f0 */
    /* synthetic */ class C31717f0 extends C41535k implements C43075l {
        C31717f0(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72155b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72155b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$g */
    /* synthetic */ class C31718g extends C41535k implements C43075l {
        C31718g(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72156b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72156b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$h */
    static final class C31719h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31705i f78313d;

        /* renamed from: e */
        final /* synthetic */ boolean f78314e;

        /* renamed from: f */
        final /* synthetic */ String f78315f;

        /* renamed from: g */
        final /* synthetic */ String f78316g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31719h(C31705i iVar, boolean z, String str, String str2) {
            super(0);
            this.f78313d = iVar;
            this.f78314e = z;
            this.f78315f = str;
            this.f78316g = str2;
        }

        public final void invoke() {
            C32392v.m95659k(this.f78313d.f78308x, new C41232r(Boolean.valueOf(this.f78314e), this.f78315f, this.f78316g));
        }
    }

    /* renamed from: eb1.i$i */
    /* synthetic */ class C31720i extends C41535k implements C43064a {
        C31720i(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72157b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72157b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$j */
    /* synthetic */ class C31721j extends C41535k implements C43064a {
        C31721j(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72158b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72158b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$k */
    /* synthetic */ class C31722k extends C41535k implements C43075l {
        C31722k(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72159b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72159b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$l */
    /* synthetic */ class C31723l extends C41535k implements C43064a {
        C31723l(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72160b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72160b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$m */
    /* synthetic */ class C31724m extends C41535k implements C43075l {
        C31724m(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72161b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72161b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$n */
    /* synthetic */ class C31725n extends C41535k implements C43075l {
        C31725n(Object obj) {
            super(1, obj, C31705i.class, "onEditProfileDataSuccess", "onEditProfileDataSuccess(Lge/bog/sso_client/editprofile/domain/model/EditProfileData;)V", 0);
        }

        /* renamed from: b */
        public final void mo72162b(C39832a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C31705i) this.receiver).m93840Jw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72162b((C39832a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$o */
    /* synthetic */ class C31726o extends C41535k implements C43064a {
        C31726o(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72163b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72163b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$p */
    /* synthetic */ class C31727p extends C41535k implements C43064a {
        C31727p(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72164b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72164b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$q */
    /* synthetic */ class C31728q extends C41535k implements C43075l {
        C31728q(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72165b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72165b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$r */
    /* synthetic */ class C31729r extends C41535k implements C43064a {
        C31729r(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72166b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72166b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$s */
    /* synthetic */ class C31730s extends C41535k implements C43064a {
        C31730s(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72167b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72167b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$t */
    /* synthetic */ class C31731t extends C41535k implements C43075l {
        C31731t(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72168b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72168b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$u */
    /* synthetic */ class C31732u extends C41535k implements C43064a {
        C31732u(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72169b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72169b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$v */
    /* synthetic */ class C31733v extends C41535k implements C43064a {
        C31733v(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72170b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72170b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$w */
    /* synthetic */ class C31734w extends C41535k implements C43075l {
        C31734w(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72171b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72171b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$x */
    /* synthetic */ class C31735x extends C41535k implements C43064a {
        C31735x(Object obj) {
            super(0, obj, C32392v.class, "setSuccess", "setSuccess(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72172b() {
            C32392v.m95658j((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72172b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$y */
    /* synthetic */ class C31736y extends C41535k implements C43064a {
        C31736y(Object obj) {
            super(0, obj, C32392v.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;)V", 1);
        }

        /* renamed from: b */
        public final void mo72173b() {
            C32392v.m95657i((C1644x) this.receiver);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo72173b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: eb1.i$z */
    /* synthetic */ class C31737z extends C41535k implements C43075l {
        C31737z(Object obj) {
            super(1, obj, C32392v.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;)V", 1);
        }

        /* renamed from: b */
        public final void mo72174b(Throwable th) {
            C32392v.m95656h((C1644x) this.receiver, th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo72174b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31705i(C40221d dVar, C40220c cVar, C40218a aVar, C40227j jVar, C40224g gVar, C40226i iVar, C40225h hVar, C40228k kVar, C31552b bVar, C40222e eVar, C40223f fVar, C40393c cVar2) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "getUserInfo");
        C41536l.m120489i(cVar, "getEditProfileData");
        C41536l.m120489i(aVar, "addContact");
        C41536l.m120489i(jVar, "updateUsername");
        C41536l.m120489i(gVar, "removeContact");
        C41536l.m120489i(iVar, "updateProfilePictureStatus");
        C41536l.m120489i(hVar, "removeProfilePicture");
        C41536l.m120489i(kVar, "uploadProfilePicture");
        C41536l.m120489i(bVar, "editProfileDataMapper");
        C41536l.m120489i(eVar, "makeContactFavoriteUseCase");
        C41536l.m120489i(fVar, "makePhoneFavoriteUseCase");
        C41536l.m120489i(cVar2, "startTMXProfilingUseCase");
        this.f78292h = dVar;
        this.f78293i = cVar;
        this.f78294j = aVar;
        this.f78295k = jVar;
        this.f78296l = gVar;
        this.f78297m = iVar;
        this.f78298n = hVar;
        this.f78299o = kVar;
        this.f78300p = bVar;
        this.f78301q = eVar;
        this.f78302r = fVar;
        this.f78303s = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m93839Iw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public final void m93840Jw(C39832a aVar) {
        C31553c b = this.f78300p.mo71966b(aVar);
        this.f78304t = b;
        C1644x xVar = this.f78305u;
        if (b == null) {
            C41536l.m120506z("data");
            b = null;
        }
        C32392v.m95659k(xVar, b.mo71970c());
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final void m93841Kw(GetClientInfoQuery.GetClientInfo getClientInfo) {
        if (this.f78304t != null) {
            C31554d c = this.f78300p.mo71967c(getClientInfo);
            C31553c cVar = this.f78304t;
            C31553c cVar2 = null;
            if (cVar == null) {
                C41536l.m120506z("data");
                cVar = null;
            }
            List b = cVar.mo71969b();
            C31553c cVar3 = this.f78304t;
            if (cVar3 == null) {
                C41536l.m120506z("data");
            } else {
                cVar2 = cVar3;
            }
            this.f78304t = new C31553c(c, b, cVar2.mo71968a());
            C32392v.m95659k(this.f78305u, c);
            return;
        }
        mo72127Nw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m93842Mw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final void m93843Qw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final void m93844Sw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m93845Uw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final void m93846Ww(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public static final void m93847Yw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* renamed from: Zw */
    private final void m93848Zw() {
        mo42540ew(C32381m.m95619h(this.f78292h.mo94174a(), new C31713d0(this.f78305u), new C31715e0(this), new C31717f0(this.f78305u)));
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m93860uw(C31705i iVar) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m93848Zw();
    }

    /* renamed from: vw */
    private final byte[] m93861vw(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[C11398b.f33141t];
        int i = 0;
        while (i != -1) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C41536l.m120488h(byteArray, "outputStream.toByteArray()");
        return byteArray;
    }

    /* renamed from: Aw */
    public final LiveData mo72118Aw() {
        return this.f78287B;
    }

    /* renamed from: Bw */
    public final LiveData mo72119Bw() {
        return this.f78286A;
    }

    /* renamed from: Cw */
    public final LiveData mo72120Cw() {
        return this.f78310z;
    }

    /* renamed from: Dw */
    public final LiveData mo72121Dw() {
        return this.f78305u;
    }

    /* renamed from: Ew */
    public final LiveData mo72122Ew() {
        return this.f78308x;
    }

    /* renamed from: Fw */
    public final LiveData mo72123Fw() {
        return this.f78289D;
    }

    /* renamed from: Gw */
    public final LiveData mo72124Gw() {
        return this.f78290E;
    }

    /* renamed from: Hw */
    public final void mo72125Hw(String str, boolean z, String str2, String str3) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str2, "tmxFlagKey");
        C41536l.m120489i(str3, "contactType");
        mo72135bx(str2);
        String a = C10146d0.C10177h.m37232a();
        this.f78291F = a;
        C40734b o = this.f78301q.mo94175a(str, str3, a).mo94902o(new C31700d(this));
        C31716f fVar = new C31716f(this.f78308x);
        C31718g gVar = new C31718g(this.f78308x);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, fVar, new C31719h(this, z, str2, str3), gVar));
    }

    /* renamed from: Lw */
    public final void mo72126Lw(String str, ContactType contactType, String str2, String str3, String str4) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(contactType, "contactType");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "operationId");
        C41536l.m120489i(str4, "scaAuthCode");
        C40734b o = this.f78294j.mo94172a(str, contactType, str2, str4, str3).mo94902o(new C31701e(this));
        C31720i iVar = new C31720i(this.f78306v);
        C31721j jVar = new C31721j(this.f78306v);
        C31722k kVar = new C31722k(this.f78306v);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, jVar, iVar, kVar));
    }

    /* renamed from: Nw */
    public final void mo72127Nw() {
        mo42540ew(C32381m.m95619h(this.f78293i.mo94173b(), new C31723l(this.f78305u), new C31725n(this), new C31724m(this.f78305u)));
    }

    /* renamed from: Ow */
    public final void mo72128Ow() {
        C32383o oVar = this.f78288C;
        C31553c cVar = this.f78304t;
        if (cVar == null) {
            C41536l.m120506z("data");
            cVar = null;
        }
        oVar.mo4823o(cVar.mo71968a());
    }

    /* renamed from: Pw */
    public final void mo72129Pw(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str2, "operationId");
        C41536l.m120489i(str3, "operationReference");
        C41536l.m120489i(str4, "scaAuthCode");
        C40734b o = this.f78296l.mo94177a(str, str4, str3, str2).mo94902o(new C31699c(this));
        C31726o oVar = new C31726o(this.f78307w);
        C31727p pVar = new C31727p(this.f78307w);
        C31728q qVar = new C31728q(this.f78307w);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, pVar, oVar, qVar));
    }

    /* renamed from: Rw */
    public final void mo72130Rw() {
        C40734b o = this.f78298n.mo94178a().mo94902o(new C31703g(this));
        C31729r rVar = new C31729r(this.f78287B);
        C31730s sVar = new C31730s(this.f78287B);
        C31731t tVar = new C31731t(this.f78287B);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, sVar, rVar, tVar));
    }

    /* renamed from: Tw */
    public final void mo72131Tw(boolean z) {
        C40734b o = this.f78297m.mo94179a(z).mo94902o(new C31704h(this));
        C31732u uVar = new C31732u(this.f78286A);
        C31733v vVar = new C31733v(this.f78286A);
        C31734w wVar = new C31734w(this.f78286A);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, vVar, uVar, wVar));
    }

    /* renamed from: Vw */
    public final void mo72132Vw(String str) {
        C41536l.m120489i(str, "username");
        C40734b o = this.f78295k.mo94180a(str).mo94902o(new C31698b(this));
        C31735x xVar = new C31735x(this.f78310z);
        C31736y yVar = new C31736y(this.f78310z);
        C31737z zVar = new C31737z(this.f78310z);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, yVar, xVar, zVar));
    }

    /* renamed from: Xw */
    public final void mo72133Xw(Uri uri, ContentResolver contentResolver) {
        C41536l.m120489i(uri, "uri");
        C41536l.m120489i(contentResolver, "contentResolver");
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream != null) {
            C40734b o = this.f78299o.mo94181a(C32393w.m95663d(m93861vw(openInputStream), 0, 1, (Object) null)).mo94902o(new C31702f(this));
            C41536l.m120488h(o, "uploadProfilePicture(get…ete { requestUserInfo() }");
            mo42540ew(C32381m.m95618g(o, new C31707a0(this.f78290E), new C31709b0(this.f78290E), new C31711c0(this.f78290E)));
        }
    }

    /* renamed from: ax */
    public final void mo72134ax() {
        C31553c cVar = this.f78304t;
        if (cVar != null) {
            C32383o oVar = this.f78289D;
            C31553c cVar2 = null;
            if (cVar == null) {
                C41536l.m120506z("data");
                cVar = null;
            }
            List b = cVar.mo71969b();
            C31553c cVar3 = this.f78304t;
            if (cVar3 == null) {
                C41536l.m120506z("data");
            } else {
                cVar2 = cVar3;
            }
            oVar.mo4823o(new C31708b(b, cVar2.mo71970c().mo71981g()));
        }
    }

    /* renamed from: bx */
    public final void mo72135bx(String str) {
        C41536l.m120489i(str, "tmxFlagKey");
        mo42540ew(this.f78303s.mo94454b(str));
    }

    /* renamed from: tw */
    public final void mo72136tw(String str, String str2) {
        C41536l.m120489i(str, "contactId");
        C41536l.m120489i(str2, "otp");
        C40734b o = this.f78302r.mo94176a(str, str2, this.f78291F).mo94902o(new C31697a(this));
        C31710c cVar = new C31710c(this.f78309y);
        C31712d dVar = new C31712d(this.f78309y);
        C31714e eVar = new C31714e(this.f78309y);
        C41536l.m120488h(o, "doOnComplete { requestUserInfo() }");
        mo42540ew(C32381m.m95618g(o, dVar, cVar, eVar));
    }

    /* renamed from: ww */
    public final LiveData mo72137ww() {
        return this.f78309y;
    }

    /* renamed from: xw */
    public final LiveData mo72138xw() {
        return this.f78307w;
    }

    /* renamed from: yw */
    public final LiveData mo72139yw() {
        return this.f78306v;
    }

    /* renamed from: zw */
    public final LiveData mo72140zw() {
        return this.f78288C;
    }
}
