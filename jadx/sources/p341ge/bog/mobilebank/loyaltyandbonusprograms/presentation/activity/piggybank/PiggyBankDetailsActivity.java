package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import b41.C31132b;
import ba1.C10220y;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import ft0.C32005a;
import ft0.C32006b;
import g91.C32343x;
import gt0.C36075c;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import mt0.C37257a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33084i;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.PiggyBankDetailsFragment;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p642vh.C18338b0;
import pt0.C37983f;
import pt0.C37986h;
import pt0.C37996r;
import q31.C38122f;
import q31.C38125h;
import qt0.C38246b;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39445d;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity */
public final class PiggyBankDetailsActivity extends C32989a {

    /* renamed from: K */
    public static final C32950b f80822K = new C32950b((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C37983f f80823G;

    /* renamed from: H */
    private final C41217g f80824H = C41219i.m119470b(new C32955g(this));

    /* renamed from: I */
    private final C41217g f80825I = new C1617p0(C41520a0.m120436b(C37996r.class), new C32971w(this), new C32973y(this), new C32972x((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f80826J = C41219i.m119470b(C32975z.f80846d);

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$a */
    private static final class C32949a extends FragmentStateAdapter {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32949a(C1505h hVar) {
            super(hVar);
            C41536l.m120489i(hVar, "parent");
        }

        public int getItemCount() {
            return 2;
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            if (i == 0) {
                return new PiggyBankDetailsFragment();
            }
            if (i == 1) {
                return new C33084i();
            }
            throw new IllegalStateException("Invalid fragment position".toString());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$b */
    public static final class C32950b {
        private C32950b() {
        }

        public /* synthetic */ C32950b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74837a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, PiggyBankDetailsActivity.class);
            intent.putExtra("EXTRA_PIGGY_BANK_ID", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$c */
    /* synthetic */ class C32951c extends C41535k implements C43075l {
        C32951c(Object obj) {
            super(1, obj, PiggyBankDetailsActivity.class, "onPiggyBankDetailsResult", "onPiggyBankDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74838b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PiggyBankDetailsActivity) this.receiver).m97242Z2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74838b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$d */
    /* synthetic */ class C32952d extends C41535k implements C43075l {
        C32952d(Object obj) {
            super(1, obj, PiggyBankDetailsActivity.class, "onPiggyBankDetailsUpdate", "onPiggyBankDetailsUpdate(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74839b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PiggyBankDetailsActivity) this.receiver).m97243a3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74839b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$e */
    /* synthetic */ class C32953e extends C41535k implements C43075l {
        C32953e(Object obj) {
            super(1, obj, PiggyBankDetailsActivity.class, "onPiggyBankDetailsListResult", "onPiggyBankDetailsListResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74840b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PiggyBankDetailsActivity) this.receiver).m97241Y2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74840b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$f */
    /* synthetic */ class C32954f extends C41535k implements C43075l {
        C32954f(Object obj) {
            super(1, obj, PiggyBankDetailsActivity.class, "goToAccountDetails", "goToAccountDetails(Lge/bog/mobilebank/shared2/livedata/Event;)V", 0);
        }

        /* renamed from: b */
        public final void mo74841b(C37223a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PiggyBankDetailsActivity) this.receiver).m97239W2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74841b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$g */
    static final class C32955g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80827d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32955g(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(0);
            this.f80827d = piggyBankDetailsActivity;
        }

        /* renamed from: b */
        public final C39445d invoke() {
            return C39445d.m114632d(this.f80827d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$h */
    static final class C32956h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80828d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32956h(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80828d = piggyBankDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74843a(List list) {
            this.f80828d.m97247e3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74843a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$i */
    static final class C32957i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32957i(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80829d = piggyBankDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80829d.m97247e3(false);
            this.f80829d.m97251i3(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$j */
    static final class C32958j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32958j(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80830d = piggyBankDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74845a(List list) {
            this.f80830d.m97246d3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74845a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$k */
    static final class C32959k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32959k(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80831d = piggyBankDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80831d.m97246d3(false);
            this.f80831d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$l */
    /* synthetic */ class C32960l extends C41535k implements C43075l {
        C32960l(Object obj) {
            super(1, obj, PiggyBankDetailsActivity.class, "onPiggyBankList", "onPiggyBankList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo74847b(List list) {
            C41536l.m120489i(list, "p0");
            ((PiggyBankDetailsActivity) this.receiver).m97244b3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74847b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$m */
    static final class C32961m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32961m(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80832d = piggyBankDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74848a(C37257a aVar) {
            this.f80832d.m97247e3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74848a((C37257a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$n */
    static final class C32962n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32962n(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80833d = piggyBankDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80833d.m97247e3(false);
            this.f80833d.m97251i3(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$o */
    static final class C32963o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80834d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32963o(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80834d = piggyBankDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74850a(C37257a aVar) {
            this.f80834d.m97246d3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74850a((C37257a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$p */
    static final class C32964p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80835d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32964p(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80835d = piggyBankDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80835d.m97246d3(false);
            this.f80835d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$q */
    /* synthetic */ class C32965q extends C41535k implements C43075l {
        C32965q(Object obj) {
            super(1, obj, PiggyBankDetailsActivity.class, "onPiggyBankDetails", "onPiggyBankDetails(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/CasPagerDetailsUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo74852b(C37257a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PiggyBankDetailsActivity) this.receiver).m97240X2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74852b((C37257a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$r */
    static final class C32966r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80836d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32966r(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80836d = piggyBankDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74853a(C41238w wVar) {
            this.f80836d.m97246d3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74853a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$s */
    static final class C32967s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80837d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32967s(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80837d = piggyBankDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80837d.m97246d3(false);
            this.f80837d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$t */
    static final class C32968t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32968t(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(1);
            this.f80838d = piggyBankDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74855a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f80838d.m97246d3(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74855a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$u */
    public static final class C32969u extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ PiggyBankDetailsActivity f80839a;

        C32969u(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            this.f80839a = piggyBankDetailsActivity;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f80839a.m97237U2().mo91368Hw().mo91352yo(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$v */
    static final class C32970v implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80840a;

        C32970v(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80840a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80840a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80840a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$w */
    public static final class C32971w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32971w(ComponentActivity componentActivity) {
            super(0);
            this.f80841d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80841d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$x */
    public static final class C32972x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80842d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80843e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32972x(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80842d = aVar;
            this.f80843e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80842d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80843e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$y */
    static final class C32973y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PiggyBankDetailsActivity f80844d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$y$a */
        static final class C32974a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PiggyBankDetailsActivity f80845d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32974a(PiggyBankDetailsActivity piggyBankDetailsActivity) {
                super(0);
                this.f80845d = piggyBankDetailsActivity;
            }

            /* renamed from: b */
            public final C37996r invoke() {
                return this.f80845d.mo74836S2().mo32533a(this.f80845d.getIntent().getLongExtra("EXTRA_PIGGY_BANK_ID", -1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32973y(PiggyBankDetailsActivity piggyBankDetailsActivity) {
            super(0);
            this.f80844d = piggyBankDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C38246b.f91733a.mo91781a(new C32974a(this.f80844d));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity$z */
    static final class C32975z extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C32975z f80846d = new C32975z();

        C32975z() {
            super(0);
        }

        /* renamed from: b */
        public final C36075c invoke() {
            return new C36075c();
        }
    }

    /* renamed from: Q2 */
    private final void m97234Q2() {
        m97236T2().f93722k.setOnClickListener(new C32006b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m97235R2(PiggyBankDetailsActivity piggyBankDetailsActivity, View view) {
        C41536l.m120489i(piggyBankDetailsActivity, "this$0");
        piggyBankDetailsActivity.m97237U2().onRefresh(153);
    }

    /* renamed from: T2 */
    private final C39445d m97236T2() {
        return (C39445d) this.f80824H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final C37996r m97237U2() {
        return (C37996r) this.f80825I.getValue();
    }

    /* renamed from: V2 */
    private final C36075c m97238V2() {
        return (C36075c) this.f80826J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m97239W2(C37223a aVar) {
        Long l = (Long) aVar.mo90296a();
        if (l != null) {
            C38122f.C38123a.m112207c(C38125h.m112238c(this), this, l.longValue(), false, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m97240X2(C37257a aVar) {
        m97247e3(false);
        m97246d3(false);
        m97236T2().f93719h.mo6606l(aVar.mo90345b(), false);
        m97245c3();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m97241Y2(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1}, new C32956h(this));
        C31132b.m92641c(aVar, new int[]{1}, new C32957i(this));
        C31132b.m92645g(aVar, new int[]{6}, new C32958j(this));
        C31132b.m92641c(aVar, new int[]{6}, new C32959k(this));
        C31132b.m92648j(aVar, (int[]) null, new C32960l(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m97242Z2(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1}, new C32961m(this));
        C31132b.m92641c(aVar, new int[]{1}, new C32962n(this));
        C31132b.m92645g(aVar, new int[]{6}, new C32963o(this));
        C31132b.m92641c(aVar, new int[]{6}, new C32964p(this));
        C31132b.m92647i(aVar, new int[]{1, 6}, new C32965q(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m97243a3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32966r(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32967s(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32968t(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m97244b3(List list) {
        m97247e3(false);
        m97246d3(false);
        m97238V2().mo6029i(list);
        C18338b0.C18341c cVar = new C18338b0.C18341c(0, false, 3, (DefaultConstructorMarker) null);
        ViewPager2 viewPager2 = m97236T2().f93719h;
        C41536l.m120488h(viewPager2, "binding.headerPager");
        FrameLayout frameLayout = m97236T2().f93723l;
        C41536l.m120488h(frameLayout, "binding.scrollingIndicator");
        cVar.mo46116a(viewPager2, frameLayout);
    }

    /* renamed from: c3 */
    private final void m97245c3() {
        m97236T2().f93719h.mo6603h(new C32969u(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m97246d3(boolean z) {
        FrameLayout frameLayout = m97236T2().f93721j;
        C41536l.m120488h(frameLayout, "binding.regularLoaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m97247e3(boolean z) {
        FrameLayout frameLayout = m97236T2().f93724m;
        C41536l.m120488h(frameLayout, "binding.statusContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        Button button = m97236T2().f93722k;
        C41536l.m120488h(button, "binding.retryButton");
        C32343x.m95483r1(button, !z, false, 2, (Object) null);
        PageState pageState = m97236T2().f93725n;
        C41536l.m120488h(pageState, "binding.statusLabel");
        C32343x.m95483r1(pageState, !z, false, 2, (Object) null);
        ProgressBar progressBar = m97236T2().f93720i;
        C41536l.m120488h(progressBar, "binding.progressBar");
        C32343x.m95483r1(progressBar, z, false, 2, (Object) null);
    }

    /* renamed from: f3 */
    private final void m97248f3() {
        m97236T2().f93717f.setAdapter(new C32949a(this));
        new C5161d(m97236T2().f93716e, m97236T2().f93717f, new C32005a(this)).mo16990a();
        m97236T2().f93717f.setCurrentItem(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m97249g3(PiggyBankDetailsActivity piggyBankDetailsActivity, TabLayout.C5153g gVar, int i) {
        C41536l.m120489i(piggyBankDetailsActivity, "this$0");
        C41536l.m120489i(gVar, "<anonymous parameter 0>");
        piggyBankDetailsActivity.m97236T2().f93717f.setCurrentItem(i);
    }

    /* renamed from: h3 */
    private final void m97250h3() {
        m97236T2().f93719h.setAdapter(m97238V2());
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m97251i3(Throwable th) {
        String str;
        FrameLayout frameLayout = m97236T2().f93724m;
        C41536l.m120488h(frameLayout, "binding.statusContainer");
        C32343x.m95483r1(frameLayout, true, false, 2, (Object) null);
        PageState pageState = m97236T2().f93725n;
        C41536l.m120488h(pageState, "binding.statusLabel");
        C32343x.m95483r1(pageState, true, false, 2, (Object) null);
        Button button = m97236T2().f93722k;
        C41536l.m120488h(button, "binding.retryButton");
        C32343x.m95483r1(button, true, false, 2, (Object) null);
        PageState pageState2 = m97236T2().f93725n;
        if (th instanceof ApiError) {
            str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C10220y.f28366O0, new Object[0]), new Object[0]);
        } else {
            str = th.getMessage();
            if (str == null) {
                str = C32343x.m95452h0(C10220y.f28366O0, new Object[0]);
            }
        }
        pageState2.setTitleText(str);
    }

    /* renamed from: l1 */
    private final void m97252l1() {
        C37986h Iw = m97237U2().mo91369Iw();
        Iw.mo91359Ur().mo4819k(this, new C32970v(new C32951c(this)));
        Iw.mo91355Ki().mo4819k(this, new C32970v(new C32952d(this)));
        Iw.mo91354H4().mo4819k(this, new C32970v(new C32953e(this)));
        Iw.mo91360nv().mo4819k(this, new C32970v(new C32954f(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m97236T2().mo3946b());
        super.mo37451O1(bundle);
        m97250h3();
        m97248f3();
        m97252l1();
        m97234Q2();
    }

    /* renamed from: S2 */
    public final C37983f mo74836S2() {
        C37983f fVar = this.f80823G;
        if (fVar != null) {
            return fVar;
        }
        C41536l.m120506z("assistedFactory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("cas.details.title", new Object[0]);
    }
}
