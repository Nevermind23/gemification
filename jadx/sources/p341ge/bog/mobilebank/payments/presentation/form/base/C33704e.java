package p341ge.bog.mobilebank.payments.presentation.form.base;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.base.e */
public final class C33704e extends ArrayList implements C33702d {

    /* renamed from: d */
    private final C33702d.C33703a f82123d = C33702d.C33703a.GROUP;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33704e(Collection collection) {
        super(collection);
        C41536l.m120489i(collection, "e");
    }

    /* renamed from: b */
    public C33702d.C33703a mo80314b() {
        return this.f82123d;
    }

    /* renamed from: c */
    public /* bridge */ boolean mo80330c(C33702d dVar) {
        return super.contains(dVar);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C33702d)) {
            return false;
        }
        return mo80330c((C33702d) obj);
    }

    /* renamed from: g */
    public /* bridge */ int mo80332g() {
        return super.size();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C33702d)) {
            return -1;
        }
        return mo80334k((C33702d) obj);
    }

    /* renamed from: k */
    public /* bridge */ int mo80334k(C33702d dVar) {
        return super.indexOf(dVar);
    }

    /* renamed from: l */
    public /* bridge */ int mo80335l(C33702d dVar) {
        return super.lastIndexOf(dVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C33702d)) {
            return -1;
        }
        return mo80335l((C33702d) obj);
    }

    /* renamed from: n */
    public /* bridge */ boolean mo80337n(C33702d dVar) {
        return super.remove(dVar);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C33702d)) {
            return false;
        }
        return mo80337n((C33702d) obj);
    }

    public final /* bridge */ int size() {
        return mo80332g();
    }
}
