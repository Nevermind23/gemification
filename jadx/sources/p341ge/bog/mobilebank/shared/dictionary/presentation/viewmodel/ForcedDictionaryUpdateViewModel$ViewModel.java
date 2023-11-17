package p341ge.bog.mobilebank.shared.dictionary.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import e31.C31652a;
import e31.C31653b;
import e31.C31654c;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p851ou.C27084b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.shared.dictionary.presentation.viewmodel.ForcedDictionaryUpdateViewModel$ViewModel */
public final class ForcedDictionaryUpdateViewModel$ViewModel extends C21481a implements C31652a, C31653b {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C27084b f83724d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final PreferencesApiManager f83725e;

    /* renamed from: f */
    private final C31652a f83726f = this;

    /* renamed from: g */
    private final C31653b f83727g = this;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f83728h;

    /* renamed from: i */
    private final C1644x f83729i;

    /* renamed from: j */
    private final C40767b f83730j;

    /* renamed from: ge.bog.mobilebank.shared.dictionary.presentation.viewmodel.ForcedDictionaryUpdateViewModel$ViewModel$a */
    static final class C34637a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ForcedDictionaryUpdateViewModel$ViewModel f83731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34637a(ForcedDictionaryUpdateViewModel$ViewModel forcedDictionaryUpdateViewModel$ViewModel) {
            super(1);
            this.f83731d = forcedDictionaryUpdateViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m101719c(ForcedDictionaryUpdateViewModel$ViewModel forcedDictionaryUpdateViewModel$ViewModel) {
            C41536l.m120489i(forcedDictionaryUpdateViewModel$ViewModel, "this$0");
            forcedDictionaryUpdateViewModel$ViewModel.f83728h.mo4823o(Long.valueOf(forcedDictionaryUpdateViewModel$ViewModel.f83725e.getDictionaryHashCode()));
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C40734b o = this.f83731d.f83724d.mo66337c(true).mo94902o(new C34638a(this.f83731d));
            C41536l.m120488h(o, "updateCommonDictionary(t…de)\n                    }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForcedDictionaryUpdateViewModel$ViewModel(C27084b bVar, PreferencesApiManager preferencesApiManager) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "updateCommonDictionary");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f83724d = bVar;
        this.f83725e = preferencesApiManager;
        this.f83728h = new C1644x(Long.valueOf(preferencesApiManager.getDictionaryHashCode()));
        this.f83729i = new C1644x();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f83730j = h1;
        m101711jw();
    }

    /* renamed from: jw */
    private final void m101711jw() {
        C40749p L0 = this.f83730j.mo94989L0(new C31654c(new C34637a(this)));
        C41536l.m120488h(L0, "private fun subscribeToU…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f83729i));
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C40754t m101712kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Wi */
    public void mo72080Wi() {
        C32343x.m95472o(this.f83730j);
    }

    /* renamed from: Xd */
    public LiveData mo72081Xd() {
        return this.f83728h;
    }

    /* renamed from: hw */
    public final C31652a mo84369hw() {
        return this.f83726f;
    }

    /* renamed from: iw */
    public final C31653b mo84370iw() {
        return this.f83727g;
    }

    /* renamed from: xr */
    public LiveData mo72082xr() {
        return this.f83729i;
    }
}
