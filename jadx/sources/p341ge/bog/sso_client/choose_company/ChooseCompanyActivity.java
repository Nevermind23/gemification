package p341ge.bog.sso_client.choose_company;

import ah1.C40313a;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10214s;
import ba1.C10216u;
import ba1.C10218w;
import dc1.C31559e;
import gb1.C32363a;
import ha1.C15454a;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import java.util.List;
import ka1.C16325a;
import ka1.C16326b;
import ka1.C16327c;
import ka1.C16328d;
import ka1.C16329e;
import ka1.C16330f;
import ka1.C16331g;
import ka1.C16332h;
import ka1.C16338k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh1.C41769a;
import mh1.C41771b;
import nh1.C41806a;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.RelatedCompany;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog;
import sso.type.StrongAuthMethod;
import ua1.C28627b;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity */
public final class ChooseCompanyActivity extends C15454a implements C31559e {

    /* renamed from: v */
    public static final C15265a f43638v = new C15265a((DefaultConstructorMarker) null);

    /* renamed from: s */
    private final C41217g f43639s = C41219i.m119470b(new C15267c(this));

    /* renamed from: t */
    private final C41217g f43640t = C41219i.m119470b(new C15266b(this));

    /* renamed from: u */
    private final C41217g f43641u;

    /* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity$a */
    public static final class C15265a {
        private C15265a() {
        }

        public /* synthetic */ C15265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo42324a(Context context) {
            C41536l.m120489i(context, "context");
            return new Intent(context, ChooseCompanyActivity.class);
        }
    }

    /* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity$b */
    static final class C15266b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseCompanyActivity f43642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15266b(ChooseCompanyActivity chooseCompanyActivity) {
            super(0);
            this.f43642d = chooseCompanyActivity;
        }

        /* renamed from: b */
        public final CompaniesArguments invoke() {
            CompaniesArguments a = CompaniesArguments.f43651e.mo42337a(this.f43642d.getIntent());
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Arguments not found".toString());
        }
    }

    /* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity$c */
    static final class C15267c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseCompanyActivity f43643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15267c(ChooseCompanyActivity chooseCompanyActivity) {
            super(0);
            this.f43643d = chooseCompanyActivity;
        }

        /* renamed from: b */
        public final C28627b invoke() {
            C28627b d = C28627b.m87604d(this.f43643d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity$d */
    public static final class C15268d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15268d(ComponentActivity componentActivity) {
            super(0);
            this.f43644d = componentActivity;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            ComponentActivity componentActivity = this.f43644d;
            return aVar.mo102076a(componentActivity, componentActivity);
        }
    }

    /* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity$e */
    public static final class C15269e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43645d;

        /* renamed from: e */
        final /* synthetic */ C41806a f43646e;

        /* renamed from: f */
        final /* synthetic */ C43064a f43647f;

        /* renamed from: g */
        final /* synthetic */ C43064a f43648g;

        /* renamed from: h */
        final /* synthetic */ C43064a f43649h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15269e(ComponentActivity componentActivity, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f43645d = componentActivity;
            this.f43646e = aVar;
            this.f43647f = aVar2;
            this.f43648g = aVar3;
            this.f43649h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40313a.m116748a(this.f43645d, this.f43646e, this.f43647f, this.f43648g, C41520a0.m120436b(C16332h.class), this.f43649h);
        }
    }

    /* renamed from: ge.bog.sso_client.choose_company.ChooseCompanyActivity$f */
    static final class C15270f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChooseCompanyActivity f43650d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15270f(ChooseCompanyActivity chooseCompanyActivity) {
            super(0);
            this.f43650d = chooseCompanyActivity;
        }

        /* renamed from: b */
        public final C41769a invoke() {
            return C41771b.m121124b(this.f43650d.m55622c1().mo42330a());
        }
    }

    public ChooseCompanyActivity() {
        super(0, 1, (DefaultConstructorMarker) null);
        C15270f fVar = new C15270f(this);
        this.f43641u = C41219i.m119469a(C41222k.NONE, new C15269e(this, (C41806a) null, (C43064a) null, new C15268d(this), fVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public final CompaniesArguments m55622c1() {
        return (CompaniesArguments) this.f43640t.getValue();
    }

    /* renamed from: d1 */
    private final C28627b m55623d1() {
        return (C28627b) this.f43639s.getValue();
    }

    /* renamed from: e1 */
    private final C16332h m55624e1() {
        return (C16332h) this.f43641u.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public static final boolean m55625f1(ChooseCompanyActivity chooseCompanyActivity, MenuItem menuItem) {
        C41536l.m120489i(chooseCompanyActivity, "this$0");
        if (menuItem.getItemId() != C10216u.f28308V) {
            return true;
        }
        chooseCompanyActivity.onBackPressed();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public static final void m55626g1(C16338k kVar, ChooseCompanyActivity chooseCompanyActivity, View view) {
        C41536l.m120489i(kVar, "$adapter");
        C41536l.m120489i(chooseCompanyActivity, "this$0");
        RelatedCompany n = kVar.mo43308n();
        if (n != null) {
            chooseCompanyActivity.m55623d1().f72657g.f73007f.setLoading(true);
            chooseCompanyActivity.m55624e1().mo43303nw(n, chooseCompanyActivity.m55623d1().f72657g.f73006e.isChecked());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public static final void m55627h1(ChooseCompanyActivity chooseCompanyActivity, String str) {
        C41536l.m120489i(chooseCompanyActivity, "this$0");
        C16332h e1 = chooseCompanyActivity.m55624e1();
        C41536l.m120488h(str, "clientKey");
        e1.mo43299jw(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m55628i1(C16338k kVar, C35947l lVar) {
        C41536l.m120489i(kVar, "$adapter");
        if (lVar instanceof C35947l.C35951d) {
            kVar.mo6029i((List) ((C35947l.C35951d) lVar).mo88520a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m55629j1(ChooseCompanyActivity chooseCompanyActivity, C35947l lVar) {
        C41536l.m120489i(chooseCompanyActivity, "this$0");
        chooseCompanyActivity.m55623d1().f72657g.f73007f.setLoading(false);
        if (lVar instanceof C35947l.C35951d) {
            chooseCompanyActivity.setResult(101, (Intent) null);
            chooseCompanyActivity.finish();
        } else if (lVar instanceof C35947l.C35949b) {
            chooseCompanyActivity.setResult(102, (Intent) null);
            chooseCompanyActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m55630k1(ChooseCompanyActivity chooseCompanyActivity, C41224m mVar) {
        C41536l.m120489i(chooseCompanyActivity, "this$0");
        chooseCompanyActivity.m55623d1().f72657g.f73007f.setLoading(false);
        chooseCompanyActivity.m55624e1().mo42543hw((String) mVar.mo95678e(), (StrongAuthMethod) mVar.mo95680f());
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m55631l1(ChooseCompanyActivity chooseCompanyActivity, C35947l lVar) {
        C41536l.m120489i(chooseCompanyActivity, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            C41224m mVar = (C41224m) ((C35947l.C35951d) lVar).mo88520a();
            C41224m mVar2 = (C41224m) mVar.mo95675a();
            OneTimePasswordFragmentDialog.f87123F.mo88740a(chooseCompanyActivity, (UserContact) mVar2.mo95678e(), (UserContact) mVar2.mo95680f(), (String) mVar.mo95676b()).mo4576A1(chooseCompanyActivity.getSupportFragmentManager(), "FragmentOneTimePassword");
        }
    }

    /* renamed from: b0 */
    public void mo42323b0(String str) {
        C41536l.m120489i(str, "clientKey");
        m55623d1().f72657g.f73007f.setLoading(true);
        m55624e1().mo43299jw(str);
    }

    public void onBackPressed() {
        setResult(102);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) m55623d1().mo3946b());
        ToolbarView toolbarView = m55623d1().f72658h;
        toolbarView.mo1887x(C10218w.close_action_menu);
        toolbarView.setOnMenuItemClickListener(new C16325a(this));
        C16338k kVar = new C16338k(C32363a.f79810a);
        RecyclerView recyclerView = m55623d1().f72656f;
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        Drawable e = C0767a.m2895e(recyclerView.getContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView.mo5351j(new C13364a(e, true, true));
            recyclerView.setAdapter(kVar);
            m55623d1().f72657g.f73007f.setOnClickListener(new C16326b(kVar, this));
            m55624e1().mo43300kw().mo32131c().mo32143b().mo4819k(this, new C16327c(this));
            m55624e1().mo43302mw().mo4819k(this, new C16328d(kVar));
            m55624e1().mo43301lw().mo4819k(this, new C16329e(this));
            m55624e1().mo43300kw().mo32131c().mo32154m().mo4819k(this, new C16330f(this));
            m55624e1().mo42541fw().mo4819k(this, new C16331g(this));
            mo42539S0(m55624e1().mo42544x0(), m55624e1().mo42541fw(), m55624e1().mo43301lw());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
