package p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel;

import a70.C19189a;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import ed1.C40734b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41217g;
import he1.C41238w;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccChangeParams;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccStateUiModel;
import pc0.C27494a;
import ue1.C43064a;
import ue1.C43075l;
import v60.C28998a;
import v60.C28999b;
import w60.C29237a;

/* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel */
public final class ManageMccViewModel extends C21481a {

    /* renamed from: d */
    private final C28999b f59539d;

    /* renamed from: e */
    private final C28998a f59540e;

    /* renamed from: f */
    private final C27494a f59541f;

    /* renamed from: g */
    private final C41217g f59542g = C41219i.m119470b(C22506a.f59547d);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final List f59543h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f59544i = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f59545j = new C1644x();

    /* renamed from: k */
    private final C1644x f59546k = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$a */
    static final class C22506a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C22506a f59547d = new C22506a();

        C22506a() {
            super(0);
        }

        /* renamed from: b */
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$b */
    /* synthetic */ class C22507b extends C41519a implements C43064a {
        C22507b(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo55637b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo55637b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$c */
    static final class C22508c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ManageMccViewModel f59548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22508c(ManageMccViewModel manageMccViewModel) {
            super(0);
            this.f59548d = manageMccViewModel;
        }

        public final void invoke() {
            C21484c.m69418j(this.f59548d.f59545j, C41238w.f97225a);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$d */
    /* synthetic */ class C22509d extends C41519a implements C43075l {
        C22509d(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo55638b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55638b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$e */
    /* synthetic */ class C22510e extends C41519a implements C43064a {
        C22510e(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo55639b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo55639b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$f */
    static final class C22511f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ManageMccViewModel f59549d;

        /* renamed from: e */
        final /* synthetic */ boolean f59550e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22511f(ManageMccViewModel manageMccViewModel, boolean z) {
            super(1);
            this.f59549d = manageMccViewModel;
            this.f59550e = z;
        }

        /* renamed from: a */
        public final void mo55640a(List list) {
            boolean z;
            List list2 = list;
            C41536l.m120489i(list2, "it");
            ArrayList<MccStateUiModel> arrayList = new ArrayList<>(C41343r.m119925u(list2, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29237a) it.next()).mo69082a());
            }
            boolean z2 = this.f59550e;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (MccStateUiModel mccStateUiModel : arrayList) {
                if (z2) {
                    if (mccStateUiModel.mo55613d()) {
                        z = true;
                    } else {
                        z = mccStateUiModel.mo55622j();
                    }
                    mccStateUiModel = MccStateUiModel.m72958b(mccStateUiModel, 0, (String) null, z, false, (String) null, (String) null, (String) null, (String) null, 251, (Object) null);
                }
                arrayList2.add(mccStateUiModel);
            }
            C32343x.m95475p(this.f59549d.f59543h, arrayList2);
            C21484c.m69418j(this.f59549d.f59544i, arrayList2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55640a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.viewmodel.ManageMccViewModel$g */
    /* synthetic */ class C22512g extends C41519a implements C43075l {
        C22512g(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo55641b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55641b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ManageMccViewModel(C28999b bVar, C28998a aVar, C27494a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getMccStatesUse");
        C41536l.m120489i(aVar, "changeMccStates");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        this.f59539d = bVar;
        this.f59540e = aVar;
        this.f59541f = aVar2;
    }

    /* renamed from: hw */
    private final Gson m72974hw() {
        return (Gson) this.f59542g.getValue();
    }

    /* renamed from: iw */
    private final MccChangeParams m72975iw(String str, String str2, String str3, boolean z) {
        Gson hw = m72974hw();
        List<MccStateUiModel> list = this.f59543h;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (MccStateUiModel k : list) {
            arrayList.add(k.mo55623k());
        }
        String w = hw.mo18181w(arrayList);
        if (z) {
            w = URLEncoder.encode(w, "utf-8");
        }
        String str4 = w;
        C41536l.m120488h(str4, "gson.toJson(currentState…rdMccOperations\n        }");
        return new MccChangeParams(str4, (String) null, str, str2, str3, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: jw */
    static /* synthetic */ MccChangeParams m72976jw(ManageMccViewModel manageMccViewModel, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return manageMccViewModel.m72975iw(str, str2, str3, z);
    }

    /* renamed from: ow */
    public static /* synthetic */ void m72977ow(ManageMccViewModel manageMccViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        manageMccViewModel.mo55633nw(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m72978pw(ManageMccViewModel manageMccViewModel) {
        C41536l.m120489i(manageMccViewModel, "this$0");
        MccStateUiModel mccStateUiModel = (MccStateUiModel) C41358y.m120009Y(manageMccViewModel.f59543h);
        if (mccStateUiModel != null) {
            m72979rw(manageMccViewModel, mccStateUiModel.mo55615e(), false, 2, (Object) null);
        }
    }

    /* renamed from: rw */
    public static /* synthetic */ void m72979rw(ManageMccViewModel manageMccViewModel, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        manageMccViewModel.mo55634qw(j, z);
    }

    /* renamed from: kw */
    public final LiveData mo55630kw() {
        return this.f59545j;
    }

    /* renamed from: lw */
    public final LiveData mo55631lw() {
        return this.f59544i;
    }

    /* renamed from: mw */
    public final LiveData mo55632mw() {
        return this.f59546k;
    }

    /* renamed from: nw */
    public final void mo55633nw(String str, String str2, String str3) {
        if (str3 == null) {
            this.f59546k.mo4823o(C32343x.m95466m(this.f59541f.mo66809a(m72976jw(this, (String) null, (String) null, (String) null, true, 7, (Object) null))));
            return;
        }
        C40734b o = this.f59540e.mo68836a(this.f59541f.mo66809a(m72976jw(this, str, str2, str3, false, 8, (Object) null))).mo94902o(new C19189a(this));
        C41536l.m120488h(o, "changeMccStates(\n       …this::requestMccStates) }");
        bindToLifecycle(C32343x.m95478q(o, new C22507b(this.f59545j), new C22508c(this), new C22509d(this.f59545j)));
    }

    /* renamed from: qw */
    public final void mo55634qw(long j, boolean z) {
        bindToLifecycle(C32343x.m95484s(this.f59539d.mo68837a(j), new C22510e(this.f59544i), new C22511f(this, z), new C22512g(this.f59544i)));
    }

    /* renamed from: sw */
    public final void mo55635sw(int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < this.f59543h.size()) {
            z2 = true;
        }
        if (z2) {
            this.f59543h.set(i, MccStateUiModel.m72958b((MccStateUiModel) this.f59543h.get(i), 0, (String) null, z, false, (String) null, (String) null, (String) null, (String) null, 251, (Object) null));
        }
    }
}
