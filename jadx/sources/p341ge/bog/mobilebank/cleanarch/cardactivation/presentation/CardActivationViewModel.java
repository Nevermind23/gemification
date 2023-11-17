package p341ge.bog.mobilebank.cleanarch.cardactivation.presentation;

import android.text.Editable;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import cf1.C40419j;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.cardactivation.domain.model.CardActivationParams;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p843nw.C26633o;
import p898tq.C28484a;
import p898tq.C28485b;
import pc0.C27494a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel */
public final class CardActivationViewModel extends C21481a {

    /* renamed from: d */
    private final C28484a f56145d;

    /* renamed from: e */
    private final C28485b f56146e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C26633o f56147f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27494a f56148g;

    /* renamed from: h */
    private String f56149h;

    /* renamed from: i */
    private String f56150i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f56151j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f56152k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f56153l = new C1644x();

    /* renamed from: m */
    private final C1644x f56154m = new C1644x(C32343x.m95466m(Boolean.FALSE));

    /* renamed from: n */
    private final C1644x f56155n = new C1644x();

    /* renamed from: o */
    private final C1644x f56156o = new C1644x();

    /* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel$a */
    /* synthetic */ class C20865a extends C41519a implements C43064a {
        C20865a(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49676b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo49676b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel$b */
    static final class C20866b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardActivationViewModel f56157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20866b(CardActivationViewModel cardActivationViewModel) {
            super(0);
            this.f56157d = cardActivationViewModel;
        }

        public final void invoke() {
            CardActivationViewModel cardActivationViewModel = this.f56157d;
            C41205b E0 = cardActivationViewModel.f56147f.mo65886c(true).mo94979E0();
            C41536l.m120488h(E0, "getCardsAndDetails.get(true).subscribe()");
            cardActivationViewModel.bindToLifecycle(E0);
            C21484c.m69418j(this.f56157d.f56153l, C41238w.f97225a);
            this.f56157d.f56151j = true;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel$c */
    /* synthetic */ class C20867c extends C41519a implements C43075l {
        C20867c(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49677b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49677b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel$d */
    /* synthetic */ class C20868d extends C41519a implements C43064a {
        C20868d(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49678b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo49678b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel$e */
    static final class C20869e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardActivationViewModel f56158d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20869e(CardActivationViewModel cardActivationViewModel) {
            super(0);
            this.f56158d = cardActivationViewModel;
        }

        public final void invoke() {
            C21484c.m69418j(this.f56158d.f56152k, this.f56158d.f56148g.mo66809a(CardActivationViewModel.m67508nw(this.f56158d, (String) null, (String) null, (String) null, 7, (Object) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.CardActivationViewModel$f */
    /* synthetic */ class C20870f extends C41519a implements C43075l {
        C20870f(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo49679b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49679b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardActivationViewModel(C28484a aVar, C28485b bVar, C26633o oVar, C27494a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "activateCardUseCase");
        C41536l.m120489i(bVar, "validateCardLastDigitsUseCase");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(aVar2, "otpBuilder");
        this.f56145d = aVar;
        this.f56146e = bVar;
        this.f56147f = oVar;
        this.f56148g = aVar2;
    }

    /* renamed from: nw */
    public static /* synthetic */ CardActivationParams m67508nw(CardActivationViewModel cardActivationViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return cardActivationViewModel.mo49669mw(str, str2, str3);
    }

    /* renamed from: iw */
    public final void mo49664iw(String str, String str2, String str3) {
        bindToLifecycle(C32343x.m95478q(this.f56145d.mo68102a(this.f56148g.mo66809a(mo49669mw(str, str2, str3))), new C20865a(this.f56153l), new C20866b(this), new C20867c(this.f56153l)));
    }

    /* renamed from: jw */
    public final LiveData mo49665jw() {
        return this.f56153l;
    }

    /* renamed from: kw */
    public final LiveData mo49666kw() {
        return this.f56156o;
    }

    /* renamed from: lw */
    public final LiveData mo49667lw() {
        return this.f56155n;
    }

    /* renamed from: m */
    public final LiveData mo49668m() {
        return this.f56154m;
    }

    /* renamed from: mw */
    public final CardActivationParams mo49669mw(String str, String str2, String str3) {
        String str4 = this.f56149h;
        if (str4 == null) {
            C41536l.m120506z("cardPan");
            str4 = null;
        }
        return new CardActivationParams(str4, (String) null, str, str2, str3, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: ow */
    public final LiveData mo49670ow() {
        return this.f56152k;
    }

    /* renamed from: pw */
    public final boolean mo49671pw(CharSequence charSequence) {
        if (charSequence != null) {
            return new C40419j("(^[0-9]+$|^$)").mo94489f(charSequence);
        }
        return false;
    }

    /* renamed from: qw */
    public final void mo49672qw(Editable editable) {
        if (mo49671pw(editable)) {
            mo49674sw(String.valueOf(editable));
            C1644x xVar = this.f56154m;
            boolean z = false;
            if (editable != null && editable.length() == 4) {
                z = true;
            }
            xVar.mo4826r(C32343x.m95466m(Boolean.valueOf(z)));
            this.f56155n.mo4826r(C32343x.m95466m(Boolean.TRUE));
            return;
        }
        this.f56155n.mo4826r(C32343x.m95466m(Boolean.FALSE));
    }

    /* renamed from: rw */
    public final void mo49673rw(String str) {
        C41536l.m120489i(str, "pan");
        this.f56149h = str;
    }

    /* renamed from: sw */
    public final void mo49674sw(String str) {
        C41536l.m120489i(str, "digits");
        this.f56150i = str;
    }

    /* renamed from: tw */
    public final void mo49675tw() {
        if (this.f56151j) {
            C37224b.m109962a(this.f56156o);
            return;
        }
        C28485b bVar = this.f56146e;
        String str = this.f56149h;
        String str2 = null;
        if (str == null) {
            C41536l.m120506z("cardPan");
            str = null;
        }
        String str3 = this.f56150i;
        if (str3 == null) {
            C41536l.m120506z("lastFour");
        } else {
            str2 = str3;
        }
        bindToLifecycle(C32343x.m95478q(bVar.mo68103a(str, str2), new C20868d(this.f56152k), new C20869e(this), new C20870f(this.f56152k)));
    }
}
