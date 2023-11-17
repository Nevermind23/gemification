package vb1;

import ah1.C40314b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0218d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import fh1.C40951a;
import gh1.C41125a;
import he1.C41217g;
import he1.C41222k;
import ib1.C36382c1;
import ib1.C36427d1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mb1.C37249a;
import mb1.C37250b;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.sso_client.models.C35947l;
import p656wi.C18596a;
import tb1.C38743f;
import ua1.C28687v;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: vb1.i */
public final class C39430i extends Fragment {

    /* renamed from: g */
    public static final C39431a f93632g = new C39431a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f93633d = C41219i.m119469a(C41222k.NONE, new C39434d(this, (C41806a) null, (C43064a) null, new C39433c(this), (C43064a) null));

    /* renamed from: e */
    private C28687v f93634e;

    /* renamed from: f */
    private final C10146d0.C10172e f93635f = ((C10146d0.C10172e) new C39435e().mo93053b());

    /* renamed from: vb1.i$a */
    public static final class C39431a {
        private C39431a() {
        }

        public /* synthetic */ C39431a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39430i mo93050a() {
            return new C39430i();
        }
    }

    /* renamed from: vb1.i$b */
    public /* synthetic */ class C39432b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f93636a;

        static {
            int[] iArr = new int[C37249a.values().length];
            iArr[C37249a.RETRY.ordinal()] = 1;
            iArr[C37249a.FINISH.ordinal()] = 2;
            f93636a = iArr;
        }
    }

    /* renamed from: vb1.i$c */
    public static final class C39433c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f93637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39433c(Fragment fragment) {
            super(0);
            this.f93637d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f93637d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f93637d.requireActivity());
        }
    }

    /* renamed from: vb1.i$d */
    public static final class C39434d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f93638d;

        /* renamed from: e */
        final /* synthetic */ C41806a f93639e;

        /* renamed from: f */
        final /* synthetic */ C43064a f93640f;

        /* renamed from: g */
        final /* synthetic */ C43064a f93641g;

        /* renamed from: h */
        final /* synthetic */ C43064a f93642h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39434d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f93638d = fragment;
            this.f93639e = aVar;
            this.f93640f = aVar2;
            this.f93641g = aVar3;
            this.f93642h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f93638d, this.f93639e, this.f93640f, this.f93641g, C41520a0.m120436b(C36382c1.class), this.f93642h);
        }
    }

    /* renamed from: vb1.i$e */
    public static final class C39435e implements C41125a {

        /* renamed from: a */
        private final Object f93643a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo93053b() {
            return this.f93643a;
        }
    }

    /* renamed from: A1 */
    private final void m114577A1() {
        C28687v vVar = this.f93634e;
        if (vVar == null) {
            C41536l.m120506z("binding");
            vVar = null;
        }
        vVar.f73011g.setText(C10145d.m37089c("do.summary.page.title", this.f93635f));
    }

    private final void observeData() {
        C36427d1 Ax = m114586p1().mo89123Ax();
        Ax.mo89153Yf().mo4819k(getViewLifecycleOwner(), new C39423b(this));
        Ax.mo89183qj().mo4819k(getViewLifecycleOwner(), new C39424c(this));
        Ax.mo89197vj().mo4819k(getViewLifecycleOwner(), new C39425d(this));
        Ax.mo89201wr().mo4819k(getViewLifecycleOwner(), new C39426e(this));
        Ax.mo89165ha().mo4819k(getViewLifecycleOwner(), new C39427f(this));
        Ax.mo89189sm().mo4819k(getViewLifecycleOwner(), new C39428g(this));
        Ax.mo89133Hr().mo4819k(getViewLifecycleOwner(), new C39429h(this));
    }

    /* renamed from: p1 */
    private final C36382c1 m114586p1() {
        return (C36382c1) this.f93633d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m114587q1(C39430i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        C28687v vVar = null;
        if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            C28687v vVar2 = iVar.f93634e;
            if (vVar2 == null) {
                C41536l.m120506z("binding");
                vVar2 = null;
            }
            vVar2.f73010f.setLoading(true);
            C28687v vVar3 = iVar.f93634e;
            if (vVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                vVar = vVar3;
            }
            vVar.f73012h.setType(C18596a.WAITING);
            return;
        }
        C28687v vVar4 = iVar.f93634e;
        if (vVar4 == null) {
            C41536l.m120506z("binding");
            vVar4 = null;
        }
        vVar4.f73010f.setLoading(false);
        C28687v vVar5 = iVar.f93634e;
        if (vVar5 == null) {
            C41536l.m120506z("binding");
        } else {
            vVar = vVar5;
        }
        vVar.f73010f.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m114588r1(C39430i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        C28687v vVar = null;
        if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            C28687v vVar2 = iVar.f93634e;
            if (vVar2 == null) {
                C41536l.m120506z("binding");
            } else {
                vVar = vVar2;
            }
            vVar.f73010f.setLoading(true);
            return;
        }
        C28687v vVar3 = iVar.f93634e;
        if (vVar3 == null) {
            C41536l.m120506z("binding");
            vVar3 = null;
        }
        vVar3.f73010f.setLoading(false);
        C28687v vVar4 = iVar.f93634e;
        if (vVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            vVar = vVar4;
        }
        vVar.f73010f.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m114589s1(C39430i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        C28687v vVar = iVar.f93634e;
        C28687v vVar2 = null;
        if (vVar == null) {
            C41536l.m120506z("binding");
            vVar = null;
        }
        boolean z = lVar instanceof C35947l.C35950c;
        vVar.f73010f.setLoading(z);
        C28687v vVar3 = iVar.f93634e;
        if (vVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            vVar2 = vVar3;
        }
        vVar2.f73010f.setEnabled(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m114590t1(C39430i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        C28687v vVar = null;
        if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            C28687v vVar2 = iVar.f93634e;
            if (vVar2 == null) {
                C41536l.m120506z("binding");
            } else {
                vVar = vVar2;
            }
            vVar.f73010f.setLoading(true);
            return;
        }
        C28687v vVar3 = iVar.f93634e;
        if (vVar3 == null) {
            C41536l.m120506z("binding");
            vVar3 = null;
        }
        vVar3.f73010f.setLoading(false);
        C28687v vVar4 = iVar.f93634e;
        if (vVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            vVar = vVar4;
        }
        vVar.f73010f.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m114591u1(C39430i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        C28687v vVar = iVar.f93634e;
        if (vVar == null) {
            C41536l.m120506z("binding");
            vVar = null;
        }
        vVar.f73010f.setLoading(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m114592v1(C39430i iVar, Boolean bool) {
        C41536l.m120489i(iVar, "this$0");
        if (C41536l.m120484d(bool, Boolean.TRUE)) {
            C38743f a = C38743f.f92655E.mo92374a();
            C1505h activity = iVar.getActivity();
            if (activity != null) {
                a.mo4576A1(((C0218d) activity).getSupportFragmentManager(), (String) null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m114593x1(C39430i iVar, C37250b bVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(iVar, "this$0");
        C28687v vVar = iVar.f93634e;
        C28687v vVar2 = null;
        if (vVar == null) {
            C41536l.m120506z("binding");
            vVar = null;
        }
        vVar.f73012h.setType(bVar.mo90327f());
        C28687v vVar3 = iVar.f93634e;
        if (vVar3 == null) {
            C41536l.m120506z("binding");
            vVar3 = null;
        }
        vVar3.f73013i.setType(bVar.mo90324d());
        C28687v vVar4 = iVar.f93634e;
        if (vVar4 == null) {
            C41536l.m120506z("binding");
            vVar4 = null;
        }
        vVar4.f73014j.setType(bVar.mo90323c());
        C28687v vVar5 = iVar.f93634e;
        if (vVar5 == null) {
            C41536l.m120506z("binding");
            vVar5 = null;
        }
        Button button = vVar5.f73010f;
        int i = 0;
        boolean z3 = true;
        List m = C41341q.m119910m(bVar.mo90327f(), bVar.mo90324d(), bVar.mo90323c());
        if (!(m instanceof Collection) || !m.isEmpty()) {
            Iterator it = m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C18596a) it.next()) == C18596a.WAITING) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        button.setEnabled(!z);
        C28687v vVar6 = iVar.f93634e;
        if (vVar6 == null) {
            C41536l.m120506z("binding");
            vVar6 = null;
        }
        PageState pageState = vVar6.f73009e;
        String e = bVar.mo90325e();
        if (e != null && !C40439w.m117118v(e)) {
            z3 = false;
        }
        if (!z3) {
            C28687v vVar7 = iVar.f93634e;
            if (vVar7 == null) {
                C41536l.m120506z("binding");
            } else {
                vVar2 = vVar7;
            }
            vVar2.f73009e.setTitleText(bVar.mo90325e());
        } else {
            i = 8;
        }
        pageState.setVisibility(i);
        iVar.m114595z1(bVar.mo90328g());
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m114594y1(C39430i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        iVar.m114586p1().mo89205yx().mo89151Xv();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m114595z1(mb1.C37249a r7) {
        /*
            r6 = this;
            ua1.v r0 = r6.f93634e
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = 0
        L_0x000a:
            ge.bog.designsystem.components.buttons.Button r0 = r0.f73010f
            ba1.d0$e r1 = r6.f93635f
            ba1.g0 r1 = r1.mo26716g()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0034
            int[] r4 = vb1.C39430i.C39432b.f93636a
            int r5 = r7.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L_0x0028
            if (r4 == r2) goto L_0x0025
            java.lang.String r4 = "onboarding.summary.page.button.next"
            goto L_0x002a
        L_0x0025:
            java.lang.String r4 = "onboarding.summary.page.button.finish"
            goto L_0x002a
        L_0x0028:
            java.lang.String r4 = "do.summary.page.button.try.again"
        L_0x002a:
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r1.mo26763a(r4, r5)
            if (r1 == 0) goto L_0x0034
            goto L_0x004c
        L_0x0034:
            int[] r1 = vb1.C39430i.C39432b.f93636a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r3) goto L_0x0046
            if (r7 == r2) goto L_0x0043
            int r7 = ba1.C10220y.next
            goto L_0x0048
        L_0x0043:
            int r7 = ba1.C10220y.edit_customer_devices_finish_button_text
            goto L_0x0048
        L_0x0046:
            int r7 = ba1.C10220y.button_text_retry
        L_0x0048:
            java.lang.String r1 = r6.getString(r7)
        L_0x004c:
            r0.setButtonText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vb1.C39430i.m114595z1(mb1.a):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28687v d = C28687v.m87865d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f93634e = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C28687v vVar = this.f93634e;
        if (vVar == null) {
            C41536l.m120506z("binding");
            vVar = null;
        }
        vVar.f73010f.setOnClickListener(new C39422a(this));
        observeData();
        m114577A1();
    }
}
