package b41;

import b41.C31128a;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: b41.b */
public abstract class C31132b {
    /* renamed from: a */
    public static final boolean m92639a(C31128a aVar) {
        C41536l.m120489i(aVar, "<this>");
        if (!(aVar instanceof C31128a.C31131c) || aVar.mo71340a() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final Object m92640b(C31128a aVar) {
        C41536l.m120489i(aVar, "<this>");
        return ((C31128a.C31131c) aVar).mo71340a();
    }

    /* renamed from: c */
    public static final void m92641c(C31128a aVar, int[] iArr, C43075l lVar) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(iArr, "requestCodes");
        C41536l.m120489i(lVar, "callback");
        if (C41333m.m119793r(iArr, aVar.mo71341b()) && (aVar instanceof C31128a.C31129a)) {
            lVar.invoke(((C31128a.C31129a) aVar).mo71342c());
        }
    }

    /* renamed from: d */
    public static final void m92642d(C31128a aVar, int[] iArr, C43079p pVar) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(iArr, "requestCodes");
        C41536l.m120489i(pVar, "callback");
        if (C41333m.m119793r(iArr, aVar.mo71341b()) && (aVar instanceof C31128a.C31129a)) {
            pVar.invoke(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71340a());
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m92643e(C31128a aVar, int[] iArr, C43075l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = new int[]{aVar.mo71341b()};
        }
        m92641c(aVar, iArr, lVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m92644f(C31128a aVar, int[] iArr, C43079p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = new int[]{aVar.mo71341b()};
        }
        m92642d(aVar, iArr, pVar);
    }

    /* renamed from: g */
    public static final void m92645g(C31128a aVar, int[] iArr, C43075l lVar) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(iArr, "requestCodes");
        C41536l.m120489i(lVar, "callback");
        if (C41333m.m119793r(iArr, aVar.mo71341b()) && (aVar instanceof C31128a.C31130b)) {
            lVar.invoke(aVar.mo71340a());
        }
    }

    /* renamed from: h */
    public static /* synthetic */ void m92646h(C31128a aVar, int[] iArr, C43075l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = new int[]{aVar.mo71341b()};
        }
        m92645g(aVar, iArr, lVar);
    }

    /* renamed from: i */
    public static final void m92647i(C31128a aVar, int[] iArr, C43075l lVar) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(iArr, "requestCodes");
        C41536l.m120489i(lVar, "callback");
        if (C41333m.m119793r(iArr, aVar.mo71341b()) && (aVar instanceof C31128a.C31131c)) {
            lVar.invoke(((C31128a.C31131c) aVar).mo71340a());
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m92648j(C31128a aVar, int[] iArr, C43075l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iArr = new int[]{aVar.mo71341b()};
        }
        m92647i(aVar, iArr, lVar);
    }

    /* renamed from: k */
    public static final Object m92649k(C31128a aVar, Object obj) {
        C31128a.C31131c cVar;
        Object a;
        C41536l.m120489i(aVar, "<this>");
        if (aVar instanceof C31128a.C31131c) {
            cVar = (C31128a.C31131c) aVar;
        } else {
            cVar = null;
        }
        if (cVar == null || (a = cVar.mo71340a()) == null) {
            return obj;
        }
        return a;
    }

    /* renamed from: l */
    public static final void m92650l(C31128a aVar, int[] iArr, C43064a aVar2) {
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(iArr, "requestCodes");
        C41536l.m120489i(aVar2, "callback");
        if (C41333m.m119793r(iArr, aVar.mo71341b())) {
            aVar2.invoke();
        }
    }
}
