package tz0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import hy0.C36268b;
import hy0.C36270d;
import hy0.C36274h;
import iy0.C36626q;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.StatusListItem;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: tz0.k */
public final class C38960k extends C38959j0 {

    /* renamed from: i */
    public static final C38961a f93075i = new C38961a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C36626q f93076g;

    /* renamed from: h */
    private final C41217g f93077h;

    /* renamed from: tz0.k$a */
    public static final class C38961a {
        private C38961a() {
        }

        public /* synthetic */ C38961a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38960k mo92664a() {
            return new C38960k();
        }
    }

    /* renamed from: tz0.k$b */
    static final class C38962b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38960k f93078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38962b(C38960k kVar) {
            super(1);
            this.f93078d = kVar;
        }

        /* renamed from: a */
        public final void mo92665a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f93078d.m113854D1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92665a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.k$c */
    static final class C38963c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38960k f93079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38963c(C38960k kVar) {
            super(1);
            this.f93079d = kVar;
        }

        /* renamed from: a */
        public final void mo92666a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f93079d.m113858H1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92666a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.k$d */
    static final class C38964d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38960k f93080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38964d(C38960k kVar) {
            super(1);
            this.f93080d = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C38960k kVar = this.f93080d;
            C41536l.m120488h(bool, "isDefault");
            kVar.m113872v1(bool.booleanValue());
        }
    }

    /* renamed from: tz0.k$e */
    static final class C38965e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f93081a;

        C38965e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f93081a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f93081a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f93081a.invoke(obj);
        }
    }

    /* renamed from: tz0.k$f */
    static final class C38966f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38960k f93082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38966f(C38960k kVar) {
            super(1);
            this.f93082d = kVar;
        }

        /* renamed from: a */
        public final void mo92670a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f93082d.m113871u1().mo92622Tw().mo92618Qo(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92670a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.k$g */
    static final class C38967g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38960k f93083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38967g(C38960k kVar) {
            super(1);
            this.f93083d = kVar;
        }

        /* renamed from: a */
        public final void mo92671a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f93083d.m113871u1().mo92622Tw().mo92618Qo(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92671a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.k$h */
    public static final class C38968h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f93084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38968h(C43064a aVar) {
            super(0);
            this.f93084d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f93084d.invoke();
        }
    }

    /* renamed from: tz0.k$i */
    public static final class C38969i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f93085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38969i(C41217g gVar) {
            super(0);
            this.f93085d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f93085d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: tz0.k$j */
    public static final class C38970j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f93086d;

        /* renamed from: e */
        final /* synthetic */ C41217g f93087e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38970j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f93086d = aVar;
            this.f93087e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f93086d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f93087e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: tz0.k$k */
    public static final class C38971k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f93088d;

        /* renamed from: e */
        final /* synthetic */ C41217g f93089e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38971k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f93088d = fragment;
            this.f93089e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f93089e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f93088d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: tz0.k$l */
    static final class C38972l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38960k f93090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38972l(C38960k kVar) {
            super(0);
            this.f93090d = kVar;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f93090d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C38960k() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38968h(new C38972l(this)));
        this.f93077h = C1514j0.m5374c(this, C41520a0.m120436b(C38923d0.class), new C38969i(a), new C38970j((C43064a) null, a), new C38971k(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m113851A1(C38960k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m113871u1().mo92622Tw().mo92615Ps();
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m113852B1(C38960k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m113871u1().mo92622Tw().mo92616Pt();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m113853C1(C38960k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m113871u1().mo92622Tw().mo92616Pt();
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m113854D1() {
        String str;
        int i = C36270d.f87468G;
        int i2 = C36268b.f87458j;
        String string = getString(C36274h.more_label_choose_favorite);
        C41536l.m120488h(string, "getString(R.string.more_label_choose_favorite)");
        if (m113871u1().mo92629Yw()) {
            str = "rb.card.favorite.add.desc";
        } else {
            str = "rb.acct.favorite.add.desc";
        }
        m113855E1(i, i2, string, C32343x.m95388F(str, new Object[0]), new C38966f(this));
    }

    /* renamed from: E1 */
    private final void m113855E1(int i, int i2, String str, String str2, C43075l lVar) {
        FragmentManager supportFragmentManager;
        C13310d dVar = new C13310d();
        String string = getString(C36274h.yes);
        C41536l.m120488h(string, "getString(R.string.yes)");
        String string2 = getString(C36274h.no);
        C41536l.m120488h(string2, "getString(R.string.no)");
        dVar.mo35648c2(str);
        dVar.mo35639Q1(str2);
        dVar.mo35637O1(Integer.valueOf(i));
        dVar.mo35638P1(Integer.valueOf(i2));
        dVar.mo35646Z1(string);
        dVar.mo35642U1(string2);
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        dVar.mo35641T1(new C38956i(dVar));
        dVar.mo35645Y1(new C38958j(lVar, dVar));
        C1505h activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            dVar.mo4576A1(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m113856F1(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m113857G1(C43075l lVar, C13310d dVar, Button button) {
        C41536l.m120489i(lVar, "$onConfirmationListener");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        lVar.invoke(C41238w.f97225a);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public final void m113858H1() {
        int i;
        String str;
        int i2 = C36270d.f87467F;
        int i3 = C36268b.f87454f;
        if (m113871u1().mo92629Yw()) {
            i = C36274h.card_favorite_remove_title;
        } else {
            i = C36274h.more_label_remove_favorite;
        }
        String string = getString(i);
        C41536l.m120488h(string, "getString(\n             …ve_favorite\n            )");
        if (m113871u1().mo92629Yw()) {
            str = "rb.card.favorite.delete.desc";
        } else {
            str = "rb.acct.favorite.delete.desc";
        }
        m113855E1(i2, i3, string, C32343x.m95388F(str, new Object[0]), new C38967g(this));
    }

    private final void observeData() {
        m113871u1().mo92623Uw().mo92613M8().mo4819k(getViewLifecycleOwner(), new C38965e(new C38962b(this)));
        m113871u1().mo92623Uw().mo92624V9().mo4819k(getViewLifecycleOwner(), new C38965e(new C38963c(this)));
        m113871u1().mo92623Uw().mo92612Hu().mo4819k(getViewLifecycleOwner(), new C38965e(new C38964d(this)));
    }

    /* renamed from: t1 */
    private final C36626q m113870t1() {
        C36626q qVar = this.f93076g;
        C41536l.m120486f(qVar);
        return qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final C38923d0 m113871u1() {
        return (C38923d0) this.f93077h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m113872v1(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        m113870t1().f88385k.setTag(Boolean.valueOf(z));
        Button button = m113870t1().f88379e;
        Context context = m113870t1().f88379e.getContext();
        if (z) {
            i = C36268b.f87454f;
        } else {
            i = C36268b.f87458j;
        }
        button.setButtonIconTint(ColorStateList.valueOf(C0767a.m2893c(context, i)));
        TextView textView = m113870t1().f88380f;
        if (!z) {
            i2 = C36274h.more_label_choose_favorite;
        } else if (m113871u1().mo92629Yw()) {
            i2 = C36274h.card_favorite_remove_title;
        } else {
            i2 = C36274h.more_label_remove_favorite;
        }
        textView.setText(getString(i2));
        TextView textView2 = m113870t1().f88380f;
        Context context2 = m113870t1().f88380f.getContext();
        if (z) {
            i3 = C36268b.f87454f;
        } else {
            i3 = C36268b.f87458j;
        }
        textView2.setTextColor(C0767a.m2893c(context2, i3));
        StatusListItem statusListItem = m113870t1().f88383i;
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        statusListItem.setVisibility(i4);
        StatusListItem statusListItem2 = m113870t1().f88383i;
        if (m113871u1().mo92629Yw()) {
            str = getString(C36274h.card_favorite_subtitle);
        } else {
            str = C32343x.m95388F("rb.acct.favorite.desc", new Object[0]);
        }
        statusListItem2.setText(str);
    }

    /* renamed from: x1 */
    private final void m113873x1() {
        m113870t1().f88387m.setOnClickListener(new C38922d(this));
        m113870t1().f88386l.setOnClickListener(new C38948e(this));
        m113870t1().f88384j.setOnClickListener(new C38950f(this));
        m113870t1().f88385k.setOnClickListener(new C38952g(this));
        m113870t1().f88383i.setOnClickListener(new C38954h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m113874y1(C38960k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m113871u1().mo92622Tw().mo92631jq();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m113875z1(C38960k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        kVar.m113871u1().mo92622Tw().mo92615Ps();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f93076g = C36626q.m108640d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m113870t1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f93076g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m113870t1().f88384j.setText(C32343x.m95388F("rb.acct.hidden.desc", new Object[0]));
        if (m113871u1().mo92629Yw()) {
            View view2 = m113870t1().f88382h;
            C41536l.m120488h(view2, "binding.divider2");
            C32343x.m95483r1(view2, false, false, 2, (Object) null);
            ListItem listItem = m113870t1().f88386l;
            C41536l.m120488h(listItem, "binding.itemHide");
            C32343x.m95483r1(listItem, false, false, 2, (Object) null);
            StatusListItem statusListItem = m113870t1().f88384j;
            C41536l.m120488h(statusListItem, "binding.hideStatus");
            C32343x.m95483r1(statusListItem, false, false, 2, (Object) null);
            m113870t1().f88383i.setText(getString(C36274h.card_favorite_subtitle));
        }
        m113873x1();
        observeData();
    }
}
