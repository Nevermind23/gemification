package p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel;

import androidx.lifecycle.C1644x;
import e40.C20141a;
import e40.C20142b;
import e40.C20143c;
import e40.C20144d;
import h50.C24882b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p784hw.C25074c;
import p793iw.C25264c;
import p891su.C28261a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel */
public final class AnalysisTransactionViewModel extends C21481a {

    /* renamed from: d */
    private final C25074c f58655d;

    /* renamed from: e */
    private long f58656e;

    /* renamed from: f */
    private long f58657f;

    /* renamed from: g */
    private long f58658g;

    /* renamed from: h */
    private ArrayList f58659h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f58660i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f58661j = 30;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f58662k;

    /* renamed from: l */
    private final C1644x f58663l = new C1644x();

    /* renamed from: m */
    private C41205b f58664m;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel$a */
    static final class C22043a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22043a f58665d = new C22043a();

        C22043a() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C25264c cVar) {
            C41536l.m120489i(cVar, "it");
            return C24882b.m79537e(cVar.mo63846d());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel$b */
    static final class C22044b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisTransactionViewModel f58666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22044b(AnalysisTransactionViewModel analysisTransactionViewModel) {
            super(1);
            this.f58666d = analysisTransactionViewModel;
        }

        /* renamed from: a */
        public final void mo54798a(C41205b bVar) {
            C21484c.m69417i(this.f58666d.mo54792qw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54798a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel$c */
    static final class C22045c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisTransactionViewModel f58667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22045c(AnalysisTransactionViewModel analysisTransactionViewModel) {
            super(1);
            this.f58667d = analysisTransactionViewModel;
        }

        /* renamed from: a */
        public final void mo54799a(List list) {
            if (list.size() < this.f58667d.f58661j || list.isEmpty()) {
                this.f58667d.f58662k = true;
            }
            AnalysisTransactionViewModel analysisTransactionViewModel = this.f58667d;
            analysisTransactionViewModel.f58660i = analysisTransactionViewModel.f58660i + this.f58667d.f58661j;
            C1644x qw = this.f58667d.mo54792qw();
            C41536l.m120488h(list, "it");
            C21484c.m69418j(qw, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54799a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.viewmodel.AnalysisTransactionViewModel$d */
    static final class C22046d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AnalysisTransactionViewModel f58668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22046d(AnalysisTransactionViewModel analysisTransactionViewModel) {
            super(1);
            this.f58668d = analysisTransactionViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58668d.mo54792qw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalysisTransactionViewModel(C25074c cVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "getTransactions");
        this.f58655d = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final List m71418mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m71419nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m71420ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m71421pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: lw */
    public final void mo54791lw() {
        C41205b bVar = this.f58664m;
        if (bVar != null) {
            bVar.dispose();
        }
        C41205b I = C25074c.m80040d(this.f58655d, Long.valueOf(this.f58657f), Long.valueOf(this.f58658g), (Integer) null, (Integer) null, Integer.valueOf(this.f58661j), this.f58659h, (List) null, C41339p.m119900e(Long.valueOf(this.f58656e)), (String) null, (List) null, (List) null, false, (C28261a) null, false, 16204, (Object) null).mo95062A(new C20141a(C22043a.f58665d)).mo95083l(new C20142b(new C22044b(this))).mo95070I(new C20143c(new C22045c(this)), new C20144d(new C22046d(this)));
        this.f58664m = I;
        if (I != null) {
            addDisposable(I);
        }
    }

    /* renamed from: qw */
    public final C1644x mo54792qw() {
        return this.f58663l;
    }

    /* renamed from: rw */
    public final boolean mo54793rw() {
        return this.f58662k;
    }

    /* renamed from: sw */
    public final void mo54794sw() {
        this.f58660i = 0;
        this.f58662k = false;
    }

    /* renamed from: tw */
    public final void mo54795tw(long j) {
        this.f58656e = j;
        mo54794sw();
    }

    /* renamed from: uw */
    public final void mo54796uw(long j, long j2, long j3, ArrayList arrayList) {
        C41536l.m120489i(arrayList, "accounts");
        this.f58656e = j;
        this.f58657f = j2;
        this.f58658g = j3;
        this.f58659h = arrayList;
    }
}
