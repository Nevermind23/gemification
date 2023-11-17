package gf1;

import gf1.C41092c;
import java.util.ArrayList;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41622v;
import kotlinx.coroutines.internal.UndeliveredElementException;
import ue1.C43075l;

/* renamed from: gf1.n */
public class C41110n extends C41085a {
    public C41110n(C43075l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo95496E() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo95497F() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo95500I(Object obj, C41108l lVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                C41118v vVar = (C41118v) obj;
                if (vVar instanceof C41092c.C41093a) {
                    C43075l lVar2 = this.f97007d;
                    if (lVar2 != null) {
                        undeliveredElementException = C41622v.m120769c(lVar2, ((C41092c.C41093a) vVar).f97009g, (UndeliveredElementException) null);
                    }
                } else {
                    vVar.mo95531z(lVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    C41118v vVar2 = (C41118v) arrayList.get(size);
                    if (vVar2 instanceof C41092c.C41093a) {
                        C43075l lVar3 = this.f97007d;
                        if (lVar3 != null) {
                            undeliveredElementException2 = C41622v.m120769c(lVar3, ((C41092c.C41093a) vVar2).f97009g, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        vVar2.mo95531z(lVar);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo95520o() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo95521p() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo95522r(Object obj) {
        C41116t t;
        do {
            Object r = super.mo95522r(obj);
            C41584a0 a0Var = C41091b.f97001b;
            if (r == a0Var) {
                return a0Var;
            }
            if (r == C41091b.f97002c) {
                t = mo95524t(obj);
                if (t == null) {
                    return a0Var;
                }
            } else if (r instanceof C41108l) {
                return r;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + r).toString());
            }
        } while (!(t instanceof C41108l));
        return t;
    }
}
