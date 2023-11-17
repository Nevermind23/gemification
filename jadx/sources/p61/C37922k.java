package p61;

import android.animation.ValueAnimator;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import e61.C31678h;
import g61.C32104a;
import g91.C32333s0;
import hd1.C41204a;
import iu0.C36546y;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o61.C37660b;
import o61.C37661c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.stories.presentation.model.StoryContentLinkUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryDetailsUiModel;
import p341ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel;
import p380ck.C10463g;
import ue1.C43064a;

/* renamed from: p61.k */
public final class C37922k extends C21481a implements C37919h, C37920i {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C31678h f91002d;

    /* renamed from: e */
    private final StoryGroupUiModel f91003e;

    /* renamed from: f */
    private final boolean f91004f;

    /* renamed from: g */
    private final boolean f91005g;

    /* renamed from: h */
    private final C37919h f91006h = this;

    /* renamed from: i */
    private final C37920i f91007i = this;

    /* renamed from: j */
    private final C1644x f91008j = new C1644x();

    /* renamed from: k */
    private final C1644x f91009k = new C1644x();

    /* renamed from: l */
    private final C1644x f91010l = new C1644x();

    /* renamed from: m */
    private final C1644x f91011m = new C1644x();

    /* renamed from: n */
    private final C1644x f91012n = new C1644x();

    /* renamed from: o */
    private final C1644x f91013o = new C1644x();

    /* renamed from: p */
    private ValueAnimator f91014p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f91015q = -1;

    /* renamed from: r */
    private boolean f91016r;

    /* renamed from: s */
    private C43064a f91017s;

    /* renamed from: p61.k$a */
    static final class C37923a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C37922k f91018d;

        /* renamed from: e */
        final /* synthetic */ StoryDetailsUiModel f91019e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37923a(C37922k kVar, StoryDetailsUiModel storyDetailsUiModel) {
            super(0);
            this.f91018d = kVar;
            this.f91019e = storyDetailsUiModel;
        }

        public final void invoke() {
            this.f91018d.f91002d.mo72098a(this.f91019e.mo85088j());
            C37922k kVar = this.f91018d;
            String i = this.f91019e.mo85087i();
            if (i != null) {
                kVar.m111443mw(new C32104a.C32106b(i, this.f91019e.mo85088j(), Integer.valueOf(this.f91018d.f91015q)));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37922k(C31678h hVar, StoryGroupUiModel storyGroupUiModel, boolean z, boolean z2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "markStorySeen");
        C41536l.m120489i(storyGroupUiModel, "storyGroup");
        this.f91002d = hVar;
        this.f91003e = storyGroupUiModel;
        this.f91004f = z;
        this.f91005g = z2;
        if (!storyGroupUiModel.mo85098b().isEmpty()) {
            m111446pw(m111442lw());
        }
    }

    /* renamed from: hw */
    private final void m111440hw(long j) {
        ValueAnimator valueAnimator = this.f91014p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{1, 100});
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C37921j(this));
        ofInt.start();
        this.f91014p = ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m111441iw(C37922k kVar, ValueAnimator valueAnimator) {
        Integer num;
        int i;
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            num = (Integer) animatedValue;
        } else {
            num = null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        kVar.m111444nw(i);
        if (i == 100) {
            kVar.m111445ow();
        }
    }

    /* renamed from: lw */
    private final int m111442lw() {
        if (this.f91004f) {
            return 0;
        }
        Iterator it = this.f91003e.mo85098b().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (!((StoryDetailsUiModel) it.next()).mo85090l()) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public final void m111443mw(C32104a aVar) {
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32333s0.m95355a(aVar, F);
    }

    /* renamed from: nw */
    private final void m111444nw(int i) {
        int i2;
        List c = C41339p.m119898c();
        int size = this.f91003e.mo85098b().size();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = this.f91015q;
            if (i3 < i4) {
                i2 = 100;
            } else if (i3 == i4) {
                i2 = i;
            } else {
                i2 = 0;
            }
            c.add(new C37660b(i2));
        }
        this.f91008j.mo4823o(C41339p.m119896a(c));
    }

    /* renamed from: ow */
    private final void m111445ow() {
        if (this.f91015q == this.f91003e.mo85098b().size() - 1) {
            ValueAnimator valueAnimator = this.f91014p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C37224b.m109962a(this.f91009k);
            return;
        }
        m111446pw(this.f91015q + 1);
    }

    /* renamed from: pw */
    private final void m111446pw(int i) {
        long j;
        this.f91015q = i;
        if (this.f91005g) {
            Long f = ((StoryDetailsUiModel) this.f91003e.mo85098b().get(this.f91015q)).mo85083f();
            if (f != null) {
                j = f.longValue();
            } else {
                j = 3000;
            }
            m111440hw(j);
        } else {
            m111444nw(100);
        }
        this.f91010l.mo4823o(new C37661c(this.f91015q));
    }

    /* renamed from: Dd */
    public void mo91260Dd(StoryDetailsUiModel storyDetailsUiModel) {
        C41536l.m120489i(storyDetailsUiModel, "item");
        String g = storyDetailsUiModel.mo85084g();
        if (g != null) {
            C32104a.C32106b bVar = new C32104a.C32106b(g, storyDetailsUiModel.mo85088j(), Integer.valueOf(this.f91015q));
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32333s0.m95355a(bVar, F);
        }
        StoryContentLinkUiModel d = storyDetailsUiModel.mo85079d();
        if (d != null) {
            C37224b.m109965d(this.f91011m, d);
        }
    }

    /* renamed from: Gf */
    public LiveData mo91270Gf() {
        return this.f91013o;
    }

    /* renamed from: L8 */
    public LiveData mo91271L8() {
        return this.f91010l;
    }

    /* renamed from: Li */
    public void mo91261Li(StoryDetailsUiModel storyDetailsUiModel) {
        C41536l.m120489i(storyDetailsUiModel, "item");
        ValueAnimator valueAnimator = this.f91014p;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    /* renamed from: Ls */
    public LiveData mo91272Ls() {
        return this.f91008j;
    }

    /* renamed from: N */
    public void mo91262N() {
        ValueAnimator valueAnimator = this.f91014p;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    /* renamed from: Ru */
    public void mo91263Ru() {
        String h;
        StoryDetailsUiModel storyDetailsUiModel = (StoryDetailsUiModel) C41358y.m120010Z(this.f91003e.mo85098b(), this.f91015q);
        if (!(storyDetailsUiModel == null || (h = storyDetailsUiModel.mo85085h()) == null)) {
            C32104a.C32106b bVar = new C32104a.C32106b(h, storyDetailsUiModel.mo85088j(), Integer.valueOf(this.f91015q));
            C10463g F = C36546y.m108282F();
            C41536l.m120488h(F, "getAnalytics()");
            C32333s0.m95355a(bVar, F);
        }
        C37224b.m109962a(this.f91012n);
    }

    /* renamed from: cr */
    public void mo91264cr(StoryDetailsUiModel storyDetailsUiModel) {
        C41536l.m120489i(storyDetailsUiModel, "item");
        m111445ow();
    }

    /* renamed from: di */
    public LiveData mo91273di() {
        return this.f91012n;
    }

    /* renamed from: ea */
    public LiveData mo91274ea() {
        return this.f91011m;
    }

    /* renamed from: jw */
    public final C37919h mo91277jw() {
        return this.f91006h;
    }

    /* renamed from: kw */
    public final C37920i mo91278kw() {
        return this.f91007i;
    }

    /* renamed from: n */
    public void mo91265n() {
        ValueAnimator valueAnimator = this.f91014p;
        boolean z = false;
        if (valueAnimator != null && valueAnimator.isPaused()) {
            z = true;
        }
        if (z) {
            ValueAnimator valueAnimator2 = this.f91014p;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
                return;
            }
            return;
        }
        int i = this.f91015q;
        if (i != -1) {
            m111446pw(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        ValueAnimator valueAnimator = this.f91014p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f91014p = null;
    }

    /* renamed from: rh */
    public void mo91266rh(boolean z) {
        this.f91016r = z;
        if (z) {
            C43064a aVar = this.f91017s;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f91017s = null;
        }
    }

    /* renamed from: tu */
    public void mo91267tu(StoryDetailsUiModel storyDetailsUiModel) {
        C41536l.m120489i(storyDetailsUiModel, "item");
        ValueAnimator valueAnimator = this.f91014p;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    /* renamed from: un */
    public void mo91268un(StoryDetailsUiModel storyDetailsUiModel) {
        C41536l.m120489i(storyDetailsUiModel, "story");
        C37923a aVar = new C37923a(this, storyDetailsUiModel);
        if (this.f91016r) {
            aVar.invoke();
        } else {
            this.f91017s = aVar;
        }
    }

    /* renamed from: yl */
    public void mo91269yl(StoryDetailsUiModel storyDetailsUiModel) {
        C41536l.m120489i(storyDetailsUiModel, "item");
        int i = this.f91015q;
        if (i == 0) {
            ValueAnimator valueAnimator = this.f91014p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C37224b.m109962a(this.f91013o);
            return;
        }
        m111446pw(i - 1);
    }

    /* renamed from: zg */
    public LiveData mo91275zg() {
        return this.f91009k;
    }
}
