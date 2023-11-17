package wg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import ie0.C25190j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.galtandtaggart.domain.model.WatchList;
import p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.create.GTCreateWatchListViewModel$ViewModel;
import p434gh.C15278a;
import ue0.C28728h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: wg0.b */
public final class C29372b extends C29390j {

    /* renamed from: J */
    public static final C29373a f74456J = new C29373a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28728h f74457G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C29374b f74458H;

    /* renamed from: I */
    private final C41217g f74459I;

    /* renamed from: wg0.b$a */
    public static final class C29373a {
        private C29373a() {
        }

        public /* synthetic */ C29373a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29372b mo69226a(C29374b bVar) {
            C41536l.m120489i(bVar, "createWatchListListener");
            C29372b bVar2 = new C29372b();
            bVar2.f74458H = bVar;
            return bVar2;
        }
    }

    /* renamed from: wg0.b$b */
    public interface C29374b {
        /* renamed from: E0 */
        void mo60704E0(WatchList watchList, String str, C15278a aVar);
    }

    /* renamed from: wg0.b$c */
    static final class C29375c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29372b f74460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29375c(C29372b bVar) {
            super(1);
            this.f74460d = bVar;
        }

        /* renamed from: a */
        public final void mo69227a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C29374b e2 = this.f74460d.f74458H;
                if (e2 != null) {
                    String string = this.f74460d.getString(C25190j.gt_create_watchlist_success_message);
                    C41536l.m120488h(string, "getString(R.string.gt_cr…atchlist_success_message)");
                    e2.mo60704E0((WatchList) ((C31128a.C31131c) aVar).mo71340a(), string, C15278a.POSITIVE);
                }
                this.f74460d.mo4577k1();
            } else if (aVar instanceof C31128a.C31129a) {
                C29374b e22 = this.f74460d.f74458H;
                if (e22 != null) {
                    String string2 = this.f74460d.getString(C25190j.gt_create_watchlist_error_message);
                    C41536l.m120488h(string2, "getString(R.string.gt_cr…_watchlist_error_message)");
                    e22.mo60704E0((WatchList) null, string2, C15278a.NEGATIVE);
                }
                this.f74460d.mo4577k1();
            } else {
                boolean z = aVar instanceof C31128a.C31130b;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69227a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wg0.b$d */
    static final class C29376d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74461a;

        C29376d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74461a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74461a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74461a.invoke(obj);
        }
    }

    /* renamed from: wg0.b$e */
    static final class C29377e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28728h f74462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29377e(C28728h hVar) {
            super(1);
            this.f74462d = hVar;
        }

        /* renamed from: a */
        public final void mo69230a(String str) {
            boolean z;
            C41536l.m120489i(str, "text");
            Button button = this.f74462d.f73267e;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            button.setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69230a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wg0.b$f */
    public static final class C29378f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29378f(Fragment fragment) {
            super(0);
            this.f74463d = fragment;
        }

        public final Fragment invoke() {
            return this.f74463d;
        }
    }

    /* renamed from: wg0.b$g */
    public static final class C29379g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29379g(C43064a aVar) {
            super(0);
            this.f74464d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f74464d.invoke();
        }
    }

    /* renamed from: wg0.b$h */
    public static final class C29380h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f74465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29380h(C41217g gVar) {
            super(0);
            this.f74465d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f74465d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: wg0.b$i */
    public static final class C29381i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74466d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74467e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29381i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f74466d = aVar;
            this.f74467e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74466d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f74467e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: wg0.b$j */
    public static final class C29382j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74468d;

        /* renamed from: e */
        final /* synthetic */ C41217g f74469e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29382j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f74468d = fragment;
            this.f74469e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f74469e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f74468d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C29372b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C29379g(new C29378f(this)));
        this.f74459I = C1514j0.m5374c(this, C41520a0.m120436b(GTCreateWatchListViewModel$ViewModel.class), new C29380h(a), new C29381i((C43064a) null, a), new C29382j(this, a));
    }

    /* renamed from: g2 */
    private final C28728h m89462g2() {
        C28728h hVar = this.f74457G;
        C41536l.m120486f(hVar);
        return hVar;
    }

    /* renamed from: h2 */
    private final GTCreateWatchListViewModel$ViewModel m89463h2() {
        return (GTCreateWatchListViewModel$ViewModel) this.f74459I.getValue();
    }

    /* renamed from: i2 */
    private final void m89464i2() {
        C28728h g2 = m89462g2();
        g2.f73267e.setEnabled(false);
        g2.f73267e.setOnClickListener(new C29371a(this, g2));
        C32343x.m95457j(g2.f73268f.getTextInput(), new C29377e(g2));
        g2.f73268f.getTextInput().requestFocus();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m89465j2(C29372b bVar, C28728h hVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(hVar, "$this_with");
        bVar.m89463h2().mo60966jw().mo60964I(hVar.f73268f.getRawText());
    }

    private final void observeData() {
        m89463h2().mo60967kw().mo60968r4().mo4819k(getViewLifecycleOwner(), new C29376d(new C29375c(this)));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f74457G = C28728h.m88034d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C25190j.gt_create_watchlist_action_sheet_header));
        m89464i2();
        observeData();
    }
}
