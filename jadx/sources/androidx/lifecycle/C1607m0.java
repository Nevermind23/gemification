package androidx.lifecycle;

import he1.C41212c;
import he1.C41238w;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41547w;
import p123j.C6631a;
import ue1.C43075l;

/* renamed from: androidx.lifecycle.m0 */
public abstract class C1607m0 {

    /* renamed from: androidx.lifecycle.m0$a */
    static final class C1608a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f4623d;

        /* renamed from: e */
        final /* synthetic */ C41547w f4624e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1608a(C1639v vVar, C41547w wVar) {
            super(1);
            this.f4623d = vVar;
            this.f4624e = wVar;
        }

        /* renamed from: a */
        public final void mo4922a(Object obj) {
            Object f = this.f4623d.mo4814f();
            if (this.f4624e.f97714d || ((f == null && obj != null) || (f != null && !C41536l.m120484d(f, obj)))) {
                this.f4624e.f97714d = false;
                this.f4623d.mo4826r(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo4922a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: androidx.lifecycle.m0$b */
    static final class C1609b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f4625d;

        /* renamed from: e */
        final /* synthetic */ C43075l f4626e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1609b(C1639v vVar, C43075l lVar) {
            super(1);
            this.f4625d = vVar;
            this.f4626e = lVar;
        }

        /* renamed from: a */
        public final void mo4923a(Object obj) {
            this.f4625d.mo4826r(this.f4626e.invoke(obj));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo4923a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: androidx.lifecycle.m0$c */
    static final class C1610c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f4627d;

        /* renamed from: e */
        final /* synthetic */ C6631a f4628e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1610c(C1639v vVar, C6631a aVar) {
            super(1);
            this.f4627d = vVar;
            this.f4628e = aVar;
        }

        /* renamed from: a */
        public final void mo4924a(Object obj) {
            this.f4627d.mo4826r(this.f4628e.apply(obj));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo4924a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: androidx.lifecycle.m0$d */
    static final class C1611d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f4629a;

        C1611d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f4629a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f4629a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f4629a.invoke(obj);
        }
    }

    /* renamed from: a */
    public static final LiveData m5653a(LiveData liveData) {
        C41536l.m120489i(liveData, "<this>");
        C1639v vVar = new C1639v();
        C41547w wVar = new C41547w();
        wVar.f97714d = true;
        if (liveData.mo4818j()) {
            vVar.mo4826r(liveData.mo4814f());
            wVar.f97714d = false;
        }
        vVar.mo4956s(liveData, new C1611d(new C1608a(vVar, wVar)));
        return vVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ LiveData m5654b(LiveData liveData, C6631a aVar) {
        C41536l.m120489i(liveData, "<this>");
        C41536l.m120489i(aVar, "mapFunction");
        C1639v vVar = new C1639v();
        vVar.mo4956s(liveData, new C1611d(new C1610c(vVar, aVar)));
        return vVar;
    }

    /* renamed from: c */
    public static final LiveData m5655c(LiveData liveData, C43075l lVar) {
        C41536l.m120489i(liveData, "<this>");
        C41536l.m120489i(lVar, "transform");
        C1639v vVar = new C1639v();
        vVar.mo4956s(liveData, new C1611d(new C1609b(vVar, lVar)));
        return vVar;
    }
}
