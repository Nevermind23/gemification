package p341ge.bog.mobilebank.cleanarch.presentation.common;

import a21.C30479a;
import androidx.lifecycle.C1613n0;
import d41.C31537a;
import ed1.C40749p;
import ee1.C40767b;
import hd1.C41204a;
import hd1.C41205b;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.a */
public class C21481a extends C1613n0 {
    public static final C21482a Companion = new C21482a((DefaultConstructorMarker) null);
    public static final int RC_INIT = 1;
    public static final int RC_LOAD_MORE = 3;
    public static final int RC_LOAD_WITH_FILTERS = 4;
    public static final int RC_RELOAD = 6;
    public static final int RC_SEARCH = 5;
    public static final int RC_SWIPE_REFRESH = 2;
    private final C41204a compositeDisposable;
    private final C40767b onRefreshSubject;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.a$a */
    public static final class C21482a {
        private C21482a() {
        }

        public /* synthetic */ C21482a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C21481a() {
        this((C41204a) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void onRefresh$default(C21481a aVar, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 2;
            }
            aVar.onRefresh(i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRefresh");
    }

    public final boolean addDisposable(C41205b bVar) {
        C41536l.m120489i(bVar, "disposable");
        return this.compositeDisposable.mo95660b(bVar);
    }

    public final boolean addDisposables(C41205b... bVarArr) {
        C41536l.m120489i(bVarArr, "disposable");
        return this.compositeDisposable.mo95662d((C41205b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public final void bindToLifecycle(C41205b bVar) {
        C41536l.m120489i(bVar, "<this>");
        this.compositeDisposable.mo95660b(C31537a.f78102a.mo71938a(bVar));
    }

    /* access modifiers changed from: protected */
    public final C30479a init(C30479a aVar) {
        C30479a.C30480a aVar2;
        C41536l.m120489i(aVar, "<this>");
        if (aVar instanceof C30479a.C30480a) {
            aVar2 = (C30479a.C30480a) aVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            aVar2.mo70814b(onInit(), onRefresh());
            return aVar;
        }
        throw new IllegalStateException("init should be called only on components that implement DisposableDelegate.Impl".toString());
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.compositeDisposable.dispose();
        super.onCleared();
    }

    /* access modifiers changed from: protected */
    public final C40749p<Integer> onInit() {
        C40749p<Integer> h0 = C40749p.m118043h0(1);
        C41536l.m120488h(h0, "just(RC_INIT)");
        return h0;
    }

    public final void onRefresh(int i) {
        this.onRefreshSubject.onNext(Integer.valueOf(i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21481a(C41204a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C41204a() : aVar);
    }

    /* access modifiers changed from: protected */
    public final void bindToLifecycle(C30479a aVar) {
        C41536l.m120489i(aVar, "<this>");
        C41204a aVar2 = this.compositeDisposable;
        C31537a aVar3 = C31537a.f78102a;
        C30479a.C30480a aVar4 = aVar instanceof C30479a.C30480a ? (C30479a.C30480a) aVar : null;
        if (aVar4 != null) {
            aVar2.mo95660b(aVar3.mo71939b(aVar4));
            return;
        }
        throw new IllegalStateException("bindToLifecycle should be called only on components that implement DisposableDelegate.Impl".toString());
    }

    /* access modifiers changed from: protected */
    public final C40749p<Integer> onRefresh() {
        return this.onRefreshSubject;
    }

    public C21481a(C41204a aVar) {
        C41536l.m120489i(aVar, "compositeDisposable");
        this.compositeDisposable = aVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.onRefreshSubject = h1;
    }
}
