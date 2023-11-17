package p61;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import e61.C31671d;
import e61.C31679i;
import ed1.C40749p;
import ed1.C40754t;
import hd1.C41204a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md0.C26186e;
import n61.C37359a;
import o61.C37659a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel;
import ue1.C43075l;

/* renamed from: p61.f */
public final class C37915f extends C21481a implements C37911b, C37912c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C31671d f90990d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37359a f90991e;

    /* renamed from: f */
    private final C31679i f90992f;

    /* renamed from: g */
    private final Long f90993g;

    /* renamed from: h */
    private final boolean f90994h;

    /* renamed from: i */
    private final C37911b f90995i = this;

    /* renamed from: j */
    private final C37912c f90996j = this;

    /* renamed from: k */
    private final C1644x f90997k;

    /* renamed from: l */
    private final C1644x f90998l;

    /* renamed from: p61.f$a */
    static final class C37916a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37915f f90999d;

        /* renamed from: p61.f$a$a */
        static final class C37917a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37915f f91000d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37917a(C37915f fVar) {
                super(1);
                this.f91000d = fVar;
            }

            /* renamed from: a */
            public final C37659a invoke(List list) {
                boolean z;
                boolean z2;
                C41536l.m120489i(list, "list");
                int i = 0;
                Integer num = null;
                List e = C37359a.m110108e(this.f91000d.f90991e, list, false, 2, (Object) null);
                C37915f fVar = this.f91000d;
                Iterator it = e.iterator();
                int i2 = 0;
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    long a = ((StoryGroupUiModel) it.next()).mo85097a();
                    Long kw = fVar.mo91257kw();
                    if (kw != null && a == kw.longValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i2++;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (valueOf.intValue() == -1) {
                    z = false;
                }
                if (z) {
                    num = valueOf;
                }
                boolean jw = this.f91000d.mo91256jw();
                if (num != null) {
                    i = num.intValue();
                }
                return new C37659a(e, jw, i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37916a(C37915f fVar) {
            super(1);
            this.f90999d = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C37659a m111416c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C37659a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p k0 = C26186e.m81987e(C31671d.m93811e(this.f90999d.f90990d, false, 1, (Object) null)).mo95026k0(new C37914e(new C37917a(this.f90999d)));
            C41536l.m120488h(k0, "class ViewModel @Assiste…es(false)\n        }\n    }");
            return C31270e.m92879h(k0, num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37915f(C31671d dVar, C37359a aVar, C31679i iVar, Long l, boolean z) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "getStoriesAndContents");
        C41536l.m120489i(aVar, "storyDetailsMapper");
        C41536l.m120489i(iVar, "refreshStories");
        this.f90990d = dVar;
        this.f90991e = aVar;
        this.f90992f = iVar;
        this.f90993g = l;
        this.f90994h = z;
        C1644x xVar = new C1644x();
        this.f90997k = xVar;
        this.f90998l = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C37913d(new C37916a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        C31270e.m92876e(L0, xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m111405ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Gp */
    public LiveData mo91252Gp() {
        return this.f90997k;
    }

    /* renamed from: hw */
    public final C37911b mo91254hw() {
        return this.f90995i;
    }

    /* renamed from: iw */
    public final C37912c mo91255iw() {
        return this.f90996j;
    }

    /* renamed from: jw */
    public final boolean mo91256jw() {
        return this.f90994h;
    }

    /* renamed from: kw */
    public final Long mo91257kw() {
        return this.f90993g;
    }

    /* renamed from: ll */
    public void mo91251ll() {
        this.f90992f.mo72099a(false);
    }

    /* renamed from: sj */
    public LiveData mo91253sj() {
        return this.f90998l;
    }
}
