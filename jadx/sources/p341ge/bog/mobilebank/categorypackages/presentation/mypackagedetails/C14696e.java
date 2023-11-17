package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ba1.C10146d0;
import com.github.mikephil.charting.utils.Utils;
import com.google.gson.C5494h;
import com.google.gson.C5611k;
import com.google.gson.Gson;
import fd0.C20463a;
import g91.C32289b0;
import g91.C32343x;
import hd0.C24978b;
import he1.C41238w;
import ie1.C41332l0;
import j31.C36725a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37353c;
import p316xa.C8982a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14707g;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10328q;
import p408ej.C12476a;
import p422fj.C12920b;
import p455ho.C15551e;
import p455ho.C15555h;
import p455ho.C15557j;
import p469io.C15708a;
import p469io.C15709b;
import p492kj.C16434a;
import p492kj.C16435b;
import p492kj.C16436c;
import p492kj.C16440g;
import p492kj.C16444h;
import p519mi.C16686a;
import p526mp.C16883a;
import p526mp.C16885b;
import p526mp.C16886c;
import p568pp.C17472b;
import p568pp.C17475c;
import p610sp.C17913e;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43064a;
import ue1.C43075l;
import ze1.C43425h;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e */
public final class C14696e {

    /* renamed from: e */
    public static final C14697a f42666e = new C14697a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f42667a;

    /* renamed from: b */
    private final PreferencesApiManager f42668b;

    /* renamed from: c */
    private final C20292b f42669c;

    /* renamed from: d */
    private final Client f42670d;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$a */
    public static final class C14697a {
        private C14697a() {
        }

        public /* synthetic */ C14697a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$b */
    static final class C14698b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14698b f42671d = new C14698b();

        C14698b() {
            super(1);
        }

        public final CharSequence invoke(String str) {
            C41536l.m120489i(str, "it");
            if (!(str.length() > 0)) {
                return str;
            }
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$c */
    static final class C14699c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C14705f f42672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14699c(C14705f fVar) {
            super(0);
            this.f42672d = fVar;
        }

        public final void invoke() {
            this.f42672d.mo41105Z5();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$d */
    /* synthetic */ class C14700d extends C41535k implements C43064a {
        C14700d(Object obj) {
            super(0, obj, C14705f.class, "onStatisticsButtonClicked", "onStatisticsButtonClicked()V", 0);
        }

        /* renamed from: b */
        public final void mo41097b() {
            ((C14705f) this.receiver).mo41105Z5();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo41097b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$e */
    public static final class C14701e extends C8982a<ArrayList<KeyValue>> {
        C14701e() {
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$f */
    static final class C14702f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C14705f f42673d;

        /* renamed from: e */
        final /* synthetic */ C15709b f42674e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14702f(C14705f fVar, C15709b bVar) {
            super(0);
            this.f42673d = fVar;
            this.f42674e = bVar;
        }

        public final void invoke() {
            C14705f fVar = this.f42673d;
            String p = this.f42674e.mo43093p();
            if (p == null) {
                p = "";
            }
            fVar.mo41101Fn(p);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$g */
    static final class C14703g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C14705f f42675d;

        /* renamed from: e */
        final /* synthetic */ C15709b f42676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14703g(C14705f fVar, C15709b bVar) {
            super(0);
            this.f42675d = fVar;
            this.f42676e = bVar;
        }

        public final void invoke() {
            C14705f fVar = this.f42675d;
            String p = this.f42676e.mo43093p();
            if (p == null) {
                p = "";
            }
            fVar.mo41108jv(p);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.e$h */
    /* synthetic */ class C14704h extends C41535k implements C43064a {
        C14704h(Object obj) {
            super(0, obj, C14705f.class, "onStandardCommissionInfoClicked", "onStandardCommissionInfoClicked()V", 0);
        }

        /* renamed from: b */
        public final void mo41098b() {
            ((C14705f) this.receiver).mo41102Mi();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo41098b();
            return C41238w.f97225a;
        }
    }

    public C14696e(Context context, PreferencesApiManager preferencesApiManager, C20292b bVar, Client client) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(client, "client");
        this.f42667a = context;
        this.f42668b = preferencesApiManager;
        this.f42669c = bVar;
        this.f42670d = client;
    }

    /* renamed from: h */
    private final int m54079h(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1912831022:
                    if (str.equals("FREE_AMEX")) {
                        return C10320i.f28689ea;
                    }
                    break;
                case -781840567:
                    if (str.equals("SOLO_BANKER")) {
                        return C10320i.icons_16_general_user_retail_outline;
                    }
                    break;
                case -648653819:
                    if (str.equals("WIDTHR_DAY_LIMIT")) {
                        return C10320i.f28691ja;
                    }
                    break;
                case -482408294:
                    if (str.equals("SOLO_LOUNGE")) {
                        return C10320i.icons_48_contacts_pin_outline;
                    }
                    break;
                case 2176:
                    if (str.equals(TMXFlags.TMX_FLAG_DD_KEY)) {
                        return C10320i.f28684Ya;
                    }
                    break;
                case 82446:
                    if (str.equals("STO")) {
                        return C10320i.icons_48_payment_transfer_transfer_own_outline;
                    }
                    break;
                case 27955275:
                    if (str.equals("CARD_INSURANCE")) {
                        return C10320i.icons_48_card_reimbursment_outline;
                    }
                    break;
                case 152939631:
                    if (str.equals("VISA_CONS")) {
                        return C10320i.icons_16_visa_concierge_outline;
                    }
                    break;
                case 377247905:
                    if (str.equals("INVESTMENT_ACCOUNT")) {
                        return C10320i.f28677Ta;
                    }
                    break;
                case 440194305:
                    if (str.equals("LIFESTYLE_OFFERS")) {
                        return C10320i.icons_48_general_offer_outline;
                    }
                    break;
                case 1166834806:
                    if (str.equals("PREMIUM_DEPOSIT")) {
                        return C10320i.icons_16_deposit_premium;
                    }
                    break;
                case 1336993893:
                    if (str.equals("PLUS_RATE")) {
                        return C10320i.icons_48_general_loyalty_outline;
                    }
                    break;
                case 1485200882:
                    if (str.equals("PERSONAL_ASISTENT")) {
                        return C10320i.icons_48_payment_category_other_outline;
                    }
                    break;
            }
        }
        return C10320i.icons_48_payment_category_other_outline;
    }

    /* renamed from: i */
    private final Integer m54080i(String str) {
        int i;
        if (str == null) {
            return null;
        }
        if (C41536l.m120484d(str, "URL")) {
            i = C10320i.f28696oa;
        } else {
            i = C10320i.icons_16_system_chevron_right;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: j */
    private final String m54081j() {
        String name = this.f42670d.getUserInfo().getClient().getName(this.f42668b.getLanguage());
        if (name == null) {
            return "";
        }
        if (this.f42668b.getLanguage() != C37353c.EN) {
            return name;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C41358y.m120017g0(C40440x.m117181w0(lowerCase, new char[]{' '}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14698b.f42671d, 30, (Object) null);
    }

    /* renamed from: k */
    private final C16444h m54082k(C15557j jVar, List list, C14705f fVar, boolean z) {
        Float f;
        Float f2;
        C16440g.C16442b bVar;
        C12920b bVar2;
        List list2;
        List list3 = list;
        BigDecimal a = jVar.mo42767a();
        List list4 = null;
        if (a != null) {
            f = Float.valueOf(a.floatValue());
        } else {
            f = null;
        }
        BigDecimal c = jVar.mo42769c();
        if (c != null) {
            f2 = Float.valueOf(c.floatValue());
        } else {
            f2 = null;
        }
        if (f == null || f.floatValue() <= Utils.FLOAT_EPSILON || f2 == null) {
            return null;
        }
        float f3 = (float) 100;
        float floatValue = f3 - ((f2.floatValue() * f3) / f.floatValue());
        NotificationBadgeTextView.C13406a aVar = new NotificationBadgeTextView.C13406a(C10320i.f28702ya, new Color.Resource(C10318g.f28638Z0), (Integer) null, (Integer) null, new Color.Resource(C10318g.f28639a1), new Color.Resource(C10318g.f28624I0), 12, (DefaultConstructorMarker) null);
        C16440g.C16442b bVar3 = new C16440g.C16442b(C32343x.m95388F("my.package.page.fee.block2.statistics.icon", new Object[0]), C10320i.icons_24_general_pfm_outline, new C14699c(fVar));
        String F = C32343x.m95388F("my.package.page.fee.block2.header", new Object[0]);
        BigDecimal a2 = jVar.mo42767a();
        C41536l.m120486f(a2);
        String P = C32343x.m95408P(a2, "GEL");
        if (z) {
            bVar = bVar3;
        } else {
            bVar = null;
        }
        C16435b bVar4 = new C16435b(F, P, bVar, (Boolean) null, 8, (DefaultConstructorMarker) null);
        BigDecimal c2 = jVar.mo42769c();
        C41536l.m120486f(c2);
        String P2 = C32343x.m95408P(c2, "GEL");
        BigDecimal a3 = jVar.mo42767a();
        C41536l.m120486f(a3);
        BigDecimal c3 = jVar.mo42769c();
        C41536l.m120486f(c3);
        BigDecimal subtract = a3.subtract(c3);
        C41536l.m120488h(subtract, "this.subtract(other)");
        String P3 = C32343x.m95408P(subtract, "GEL");
        String F2 = C32343x.m95388F("my.package.page.fee.block2.limit.amount", new Object[0]);
        String F3 = C32343x.m95388F("my.package.page.fee.block2.unused.limit.amount", new Object[0]);
        if (floatValue >= 90.0f) {
            bVar2 = C12920b.NEGATIVE;
        } else {
            bVar2 = C12920b.PENDING;
        }
        TextProgressBarView.ProgressModel.TransactionProgress transactionProgress = new TextProgressBarView.ProgressModel.TransactionProgress(P3, P2, floatValue, F2, F3, bVar2, 0, 0, 0, 0, 960, (DefaultConstructorMarker) null);
        if (list3 != null) {
            list4 = new ArrayList(C41343r.m119925u(list3, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list4.add(new C16436c(C32343x.m95388F(((C20463a) it.next()).mo49001a(), new Object[0]), aVar));
            }
        }
        if (list4 == null) {
            list2 = C41341q.m119907j();
        } else {
            list2 = list4;
        }
        return new C16444h(bVar4, (List) null, transactionProgress, (C16434a) null, list2, 10, (DefaultConstructorMarker) null);
    }

    /* renamed from: l */
    private final C16444h m54083l(C15557j jVar, C14705f fVar) {
        C12476a aVar;
        Long b = jVar.mo42768b();
        Long d = jVar.mo42770d();
        if (b == null || d == null) {
            return null;
        }
        C43425h p = C43429k.m124597p(0, b.longValue());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(p, 10));
        Iterator it = p.iterator();
        while (it.hasNext()) {
            if (((C41332l0) it).nextLong() < b.longValue() - d.longValue()) {
                aVar = C12476a.PENDING;
            } else {
                aVar = C12476a.NEUTRAL;
            }
            arrayList.add(aVar);
        }
        return new C16444h(new C16435b(C32343x.m95388F("my.package.page.fee.block3.header", new Object[0]), C32343x.m95388F("my.package.page.fee.block3.explanatory", d), new C16440g.C16443c(C32343x.m95388F("my.package.page.fee.block2.statistics.icon", new Object[0]), new C14700d(fVar)), (Boolean) null, 8, (DefaultConstructorMarker) null), arrayList, (TextProgressBarView.ProgressModel) null, new C16434a(C16686a.POSITIVE, C32343x.m95388F("my.package.page.fee.block3.info.text", new Object[0])), (List) null, 20, (DefaultConstructorMarker) null);
    }

    /* renamed from: m */
    private final String m54084m(String str, long j) {
        String str2;
        String F = C32343x.m95388F(str, new Object[0]);
        C20557a b = this.f42669c.mo48775b("PACKAGES_DATE_DEFAULT_FORMAT");
        if (b != null) {
            str2 = b.mo49087d();
        } else {
            str2 = null;
        }
        return C17913e.m61727i(j, F, str2);
    }

    /* renamed from: n */
    private final C5494h m54085n(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return C5611k.m22282d(str).mo18216g().mo18450x("parameters");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o */
    private final ArrayList m54086o(C5494h hVar) {
        Object h = new Gson().mo18166h(hVar, new C14701e().getType());
        C41536l.m120488h(h, "Gson().fromJson(\n       …e?>?>() {}.type\n        )");
        return (ArrayList) h;
    }

    /* renamed from: p */
    private final C17472b.C17474b m54087p(C15709b bVar, C14705f fVar) {
        return C17475c.m60978h(bVar, C41536l.m120484d(bVar.mo43092o(), "SOLO"), new C14702f(fVar, bVar), new C14703g(fVar, bVar), Integer.valueOf(C10318g.f28619C0));
    }

    /* renamed from: q */
    private final C16444h m54088q(List list, C14705f fVar) {
        List list2;
        List list3 = list;
        NotificationBadgeTextView.C13406a aVar = new NotificationBadgeTextView.C13406a(C10320i.f28701xa, new Color.Resource(C10318g.f28636W0), (Integer) null, (Integer) null, new Color.Resource(C10318g.color_pending_solid_50), new Color.Resource(C10318g.f28624I0), 12, (DefaultConstructorMarker) null);
        new C16440g.C16441a(C10320i.f28659Ba, Integer.valueOf(C10318g.f28621F0), new C14704h(fVar));
        List list4 = null;
        C16435b bVar = new C16435b(C32343x.m95388F("my.package.page.fee.block1.header", new Object[0]), C32343x.m95388F("my.package.page.fee.block1.explanatory", new Object[0]), (C16440g) null, Boolean.TRUE);
        if (list3 != null) {
            list4 = new ArrayList(C41343r.m119925u(list3, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list4.add(new C16436c(C32343x.m95388F(((C20463a) it.next()).mo49001a(), new Object[0]), aVar));
            }
        }
        if (list4 == null) {
            list2 = C41341q.m119907j();
        } else {
            list2 = list4;
        }
        return new C16444h(bVar, (List) null, (TextProgressBarView.ProgressModel) null, (C16434a) null, list2, 14, (DefaultConstructorMarker) null);
    }

    /* renamed from: r */
    private final String m54089r(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return C5611k.m22282d(str).mo18216g().mo18450x("type").mo18211k();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: s */
    private final C16444h m54090s() {
        return new C16444h(new C16435b(C32343x.m95388F("my.package.page.fee.block3.header", new Object[0]), C32343x.m95388F("my.package.page.fee.block3.explanatory.unlimited", new Object[0]), (C16440g) null, (Boolean) null, 12, (DefaultConstructorMarker) null), (List) null, (TextProgressBarView.ProgressModel) null, new C16434a(C16686a.POSITIVE, C32343x.m95388F("my.package.page.fee.block3.info.text.unlimited", new Object[0])), (List) null, 22, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final C14707g.C14708a mo41089a(C15709b bVar, C15709b bVar2) {
        Long l;
        String str;
        String str2;
        String str3;
        C15708a r;
        Long s;
        C15708a c;
        Long n;
        C15708a c2;
        String str4 = null;
        if (bVar == null && bVar2 == null) {
            return null;
        }
        if (bVar == null || (c2 = bVar.mo43078c()) == null) {
            l = null;
        } else {
            l = c2.mo43060f();
        }
        if (l != null) {
            str = m54084m("text.my.package.end.date", l.longValue());
        } else if (bVar == null || (c = bVar.mo43078c()) == null || (n = c.mo43069n()) == null) {
            str = null;
        } else {
            str = m54084m("text.my.package.next.fee.gen.date", n.longValue());
        }
        if (bVar2 == null || (r = bVar2.mo43095r()) == null || (s = r.mo43074s()) == null) {
            str2 = null;
        } else {
            str2 = m54084m("text.my.package.pending.start.date", s.longValue());
        }
        if (bVar != null) {
            str3 = bVar.mo43083g();
        } else {
            str3 = null;
        }
        if (bVar2 != null) {
            str4 = bVar2.mo43083g();
        }
        return new C14707g.C14708a(str3, str, str4, str2);
    }

    /* renamed from: b */
    public final C14707g.C14709b mo41090b(List list) {
        String str;
        C5494h hVar;
        ArrayList arrayList;
        C41536l.m120489i(list, "list");
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15555h hVar2 = (C15555h) it.next();
            String e = hVar2.mo42754e();
            if (e != null) {
                str = m54089r(e);
            } else {
                str = null;
            }
            String e2 = hVar2.mo42754e();
            if (e2 != null) {
                hVar = m54085n(e2);
            } else {
                hVar = null;
            }
            String b = hVar2.mo42751b();
            String i = hVar2.mo42760i();
            if (hVar != null) {
                arrayList = m54086o(hVar);
            } else {
                arrayList = null;
            }
            arrayList2.add(new C16886c(b, str, arrayList, C16883a.f47190d.mo44020a(hVar2.mo42757g()), i, Integer.valueOf(m54079h(hVar2.mo42752c())), m54080i(str), hVar2.mo42758h()));
        }
        return new C14707g.C14709b(arrayList2);
    }

    /* renamed from: c */
    public final C14707g.C14710c mo41091c(List list) {
        String str;
        List list2 = list;
        C41536l.m120489i(list2, "list");
        if (!(!list.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15551e eVar = (C15551e) it.next();
            String a = eVar.mo42731a();
            String e = eVar.mo42735e();
            C36725a c = eVar.mo42733c();
            if (c == null || (str = c.mo89541d()) == null) {
                str = "";
            }
            String c2 = C32289b0.m95091c(str);
            C41536l.m120488h(c2, "generateImageUrl(\n      …                        )");
            arrayList.add(new C16885b(a, e, new Image.Url(c2, new Image.Resource(C10320i.f28686ac, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null), eVar.mo42734d(), eVar.mo42732b()));
        }
        return new C14707g.C14710c(arrayList);
    }

    /* renamed from: d */
    public final C14707g.C14712e mo41092d(PackageType packageType, boolean z) {
        C41536l.m120489i(packageType, "packageType");
        if (packageType == PackageType.NO_ACTIVE_PACKAGE) {
            return new C14707g.C14712e(z);
        }
        return null;
    }

    /* renamed from: e */
    public final C14707g.C14713f mo41093e(C15709b bVar, C15557j jVar, List list, PackageType packageType, C14705f fVar) {
        C24978b bVar2;
        C16444h hVar;
        BigDecimal bigDecimal;
        Long l;
        C24978b bVar3;
        C15708a c;
        C15708a c2;
        C41536l.m120489i(packageType, "packageType");
        C41536l.m120489i(fVar, "viewModelInput");
        if (bVar == null || (c2 = bVar.mo43078c()) == null) {
            bVar2 = null;
        } else {
            bVar2 = c2.mo43057d();
        }
        C24978b bVar4 = C24978b.YES;
        if (bVar2 == bVar4) {
            hVar = m54088q(list, fVar);
        } else {
            if (jVar != null) {
                bigDecimal = jVar.mo42767a();
            } else {
                bigDecimal = null;
            }
            boolean z = true;
            if (bigDecimal == null || C41536l.m120484d(jVar.mo42767a(), BigDecimal.ZERO)) {
                PackageType packageType2 = PackageType.SOLO;
                PackageType packageType3 = PackageType.WM;
                if (C41341q.m119910m(packageType2, packageType3).contains(packageType)) {
                    if (jVar != null) {
                        l = jVar.mo42768b();
                    } else {
                        l = null;
                    }
                    if (l != null) {
                        hVar = m54083l(jVar, fVar);
                    }
                }
                if (C41341q.m119910m(packageType2, packageType3).contains(packageType)) {
                    hVar = m54090s();
                } else {
                    hVar = null;
                }
            } else {
                if (bVar == null || (c = bVar.mo43078c()) == null) {
                    bVar3 = null;
                } else {
                    bVar3 = c.mo43058e();
                }
                if (bVar3 != bVar4) {
                    z = false;
                }
                hVar = m54082k(jVar, list, fVar, z);
            }
        }
        if (bVar == null || hVar == null) {
            return null;
        }
        return new C14707g.C14713f(hVar);
    }

    /* renamed from: f */
    public final C14707g.C14714g mo41094f(PackageType packageType, List list, List list2, C14705f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C41536l.m120489i(packageType, "packageType");
        C41536l.m120489i(fVar, "viewModelInput");
        boolean z4 = false;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = null;
        if (z) {
            if (list2 == null || list2.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return null;
            }
        }
        if (list != null) {
            arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m54087p((C15709b) it.next(), fVar));
            }
        }
        if (list2 == null) {
            list2 = C41341q.m119907j();
        }
        C17472b.C17473a aVar = new C17472b.C17473a(list2);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null || arrayList.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            arrayList2.addAll(arrayList);
        }
        if (!aVar.mo44981a().isEmpty()) {
            arrayList2.add(aVar);
        }
        if (packageType != PackageType.NO_ACTIVE_PACKAGE) {
            z4 = true;
        }
        return new C14707g.C14714g(z4, arrayList2);
    }

    /* renamed from: g */
    public final C14707g.C14715h mo41095g(boolean z) {
        String avatarUrl = C10146d0.C10159c.m37143b().getAvatarUrl();
        String string = this.f42667a.getString(C10328q.f28949X1);
        C41536l.m120488h(string, "context.getString(R.string.common_text_hello)");
        return new C14707g.C14715h(avatarUrl, string, m54081j(), !z);
    }
}
