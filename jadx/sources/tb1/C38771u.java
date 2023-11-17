package tb1;

import ah1.C40314b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import he1.C41217g;
import he1.C41222k;
import ib1.C36382c1;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import sso.type.UserContactType;
import ua1.C28675r;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: tb1.u */
public final class C38771u extends Fragment {

    /* renamed from: g */
    public static final C38772a f92712g = new C38772a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f92713d = C41219i.m119469a(C41222k.NONE, new C38774c(this, (C41806a) null, (C43064a) null, new C38773b(this), (C43064a) null));

    /* renamed from: e */
    private C28675r f92714e;

    /* renamed from: f */
    private C38738a f92715f;

    /* renamed from: tb1.u$a */
    public static final class C38772a {
        private C38772a() {
        }

        public /* synthetic */ C38772a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38771u mo92396a() {
            return new C38771u();
        }
    }

    /* renamed from: tb1.u$b */
    public static final class C38773b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38773b(Fragment fragment) {
            super(0);
            this.f92716d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f92716d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f92716d.requireActivity());
        }
    }

    /* renamed from: tb1.u$c */
    public static final class C38774c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92717d;

        /* renamed from: e */
        final /* synthetic */ C41806a f92718e;

        /* renamed from: f */
        final /* synthetic */ C43064a f92719f;

        /* renamed from: g */
        final /* synthetic */ C43064a f92720g;

        /* renamed from: h */
        final /* synthetic */ C43064a f92721h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38774c(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f92717d = fragment;
            this.f92718e = aVar;
            this.f92719f = aVar2;
            this.f92720g = aVar3;
            this.f92721h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f92717d, this.f92718e, this.f92719f, this.f92720g, C41520a0.m120436b(C36382c1.class), this.f92721h);
        }
    }

    /* renamed from: j1 */
    private final C36382c1 m113497j1() {
        return (C36382c1) this.f92713d.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m113498k1(C38771u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        uVar.m113497j1().mo89173lx(UserContactType.PHONE);
        C38738a aVar = uVar.f92715f;
        if (aVar != null) {
            aVar.mo92372V0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m113499l1(C38771u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        uVar.m113497j1().mo89173lx(UserContactType.MAIL);
        C38738a aVar = uVar.f92715f;
        if (aVar != null) {
            aVar.mo92372V0();
        }
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.f92715f = (C38743f) parentFragment;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.onboarding.steps.confirmphonesheet.ConfirmPhoneActionSheet");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28675r d = C28675r.m87815d(layoutInflater, viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, container, false)");
        this.f92714e = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        LinearLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDetach() {
        super.onDetach();
        this.f92715f = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C28675r rVar = this.f92714e;
        C28675r rVar2 = null;
        if (rVar == null) {
            C41536l.m120506z("binding");
            rVar = null;
        }
        rVar.f72903g.setOnClickListener(new C38769s(this));
        C28675r rVar3 = this.f92714e;
        if (rVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            rVar2 = rVar3;
        }
        rVar2.f72902f.setOnClickListener(new C38770t(this));
    }
}
