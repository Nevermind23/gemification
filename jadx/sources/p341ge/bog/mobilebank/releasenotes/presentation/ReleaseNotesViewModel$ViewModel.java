package p341ge.bog.mobilebank.releasenotes.presentation;

import a11.C30469c;
import a11.C30472f;
import a11.C30473g;
import a11.C30474h;
import a11.C30475i;
import a11.C30476j;
import androidx.lifecycle.C1644x;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.releasenotes.presentation.model.ReleaseNotes;
import ue1.C43075l;
import z01.C40137b;
import zc0.C30288a;

/* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesViewModel$ViewModel */
public final class ReleaseNotesViewModel$ViewModel extends C21481a implements C30472f, C30473g {

    /* renamed from: d */
    private final C40137b f83474d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C30469c f83475e;

    /* renamed from: f */
    private final C30288a f83476f;

    /* renamed from: g */
    private final C1644x f83477g = new C1644x();

    /* renamed from: h */
    private final C1644x f83478h = new C1644x();

    /* renamed from: i */
    private final C1644x f83479i = new C1644x();

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesViewModel$ViewModel$a */
    static final class C34450a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34450a f83480d = new C34450a();

        C34450a() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesViewModel$ViewModel$b */
    static final class C34451b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34451b f83481d = new C34451b();

        C34451b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesViewModel$ViewModel$c */
    static final class C34452c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesViewModel$ViewModel f83482d;

        /* renamed from: e */
        final /* synthetic */ List f83483e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34452c(ReleaseNotesViewModel$ViewModel releaseNotesViewModel$ViewModel, List list) {
            super(1);
            this.f83482d = releaseNotesViewModel$ViewModel;
            this.f83483e = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f83482d.mo70811Ku().mo4823o(this.f83482d.f83475e.mo70806a(this.f83483e));
            this.f83482d.mo70810Cm().mo4826r(new C41224m(C32343x.m95388F("text.p2p.link.release.note.pg.title", new Object[0]), C32343x.m95388F("text.p2p.link.release.note.skip.btn", new Object[0])));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReleaseNotesViewModel$ViewModel(C40137b bVar, C30469c cVar, C30288a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "setReleaseNotesShownUseCase");
        C41536l.m120489i(cVar, "mapper");
        C41536l.m120489i(aVar, "getDictionaryPopulatedObservable");
        this.f83474d = bVar;
        this.f83475e = cVar;
        this.f83476f = aVar;
    }

    /* renamed from: ow */
    private final void m101313ow(List list) {
        C40749p M = this.f83476f.mo70625a().mo94997P0(new C30474h(C34450a.f83480d)).mo94990M(new C30475i(C34451b.f83481d));
        C41536l.m120488h(M, "getDictionaryPopulatedOb…ntil { it }.filter { it }");
        C41205b F0 = C32343x.m95413R0(M).mo94981F0(new C30476j(new C34452c(this, list)));
        C41536l.m120488h(F0, "private fun updateAfterD…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final boolean m101314pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final boolean m101315qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m101316rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Q */
    public void mo70809Q(int i) {
        List list = (List) mo70811Ku().mo4814f();
        if (list != null && i >= 0 && i < list.size()) {
            mo70812Z9().mo4826r(list.get(i));
        }
    }

    /* renamed from: hw */
    public C1644x mo70811Ku() {
        return this.f83479i;
    }

    /* renamed from: iw */
    public final C30472f mo83050iw() {
        return this;
    }

    /* renamed from: jw */
    public final C30473g mo83051jw() {
        return this;
    }

    /* renamed from: kw */
    public void mo83052kw(ReleaseNotes releaseNotes) {
        C41536l.m120489i(releaseNotes, "releaseNotes");
        m101313ow(releaseNotes.getFeatures());
    }

    /* renamed from: lw */
    public C1644x mo70810Cm() {
        return this.f83477g;
    }

    /* renamed from: mw */
    public C1644x mo70812Z9() {
        return this.f83478h;
    }

    /* renamed from: nw */
    public void mo83055nw() {
        this.f83474d.invoke();
    }
}
