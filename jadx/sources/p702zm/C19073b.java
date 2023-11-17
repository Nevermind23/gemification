package p702zm;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p537nm.C17103t;
import p565pm.C17389d;

/* renamed from: zm.b */
public final class C19073b {

    /* renamed from: a */
    private final List f53229a;

    /* renamed from: b */
    private final C17389d f53230b;

    /* renamed from: c */
    private final C17103t f53231c;

    /* renamed from: d */
    private final DebitCardUiModel f53232d;

    /* renamed from: e */
    private final OrderDebitCardData f53233e;

    /* renamed from: f */
    private final String f53234f;

    /* renamed from: g */
    private final String f53235g;

    public C19073b(List list, C17389d dVar, C17103t tVar, DebitCardUiModel debitCardUiModel, OrderDebitCardData orderDebitCardData, String str, String str2) {
        C41536l.m120489i(list, "deliveryPoints");
        C41536l.m120489i(dVar, "deliveryCity");
        C41536l.m120489i(tVar, "fee");
        C41536l.m120489i(debitCardUiModel, "card");
        C41536l.m120489i(orderDebitCardData, "data");
        C41536l.m120489i(str, "localFirstName");
        C41536l.m120489i(str2, "localLastName");
        this.f53229a = list;
        this.f53230b = dVar;
        this.f53231c = tVar;
        this.f53232d = debitCardUiModel;
        this.f53233e = orderDebitCardData;
        this.f53234f = str;
        this.f53235g = str2;
    }

    /* renamed from: a */
    public final DebitCardUiModel mo47258a() {
        return this.f53232d;
    }

    /* renamed from: b */
    public final OrderDebitCardData mo47259b() {
        return this.f53233e;
    }

    /* renamed from: c */
    public final C17389d mo47260c() {
        return this.f53230b;
    }

    /* renamed from: d */
    public final List mo47261d() {
        return this.f53229a;
    }

    /* renamed from: e */
    public final C17103t mo47262e() {
        return this.f53231c;
    }

    /* renamed from: f */
    public final String mo47263f() {
        return this.f53234f;
    }

    /* renamed from: g */
    public final String mo47264g() {
        return this.f53235g;
    }
}
