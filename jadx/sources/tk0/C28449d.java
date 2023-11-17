package tk0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import pk0.C27551a;

/* renamed from: tk0.d */
public final class C28449d {

    /* renamed from: a */
    private final C28460m f72252a;

    /* renamed from: b */
    private final C28458k f72253b;

    public C28449d(C28460m mVar, C28458k kVar) {
        C41536l.m120489i(mVar, "showBankingSets");
        C41536l.m120489i(kVar, "isSolo");
        this.f72252a = mVar;
        this.f72253b = kVar;
    }

    /* renamed from: a */
    private final C27551a.C27552a.C27562j m87282a() {
        if (!this.f72253b.mo68084a()) {
            return new C27551a.C27552a.C27562j((StringSource) null, 1, (DefaultConstructorMarker) null);
        }
        return new C27551a.C27552a.C27562j(C34646b.m101748b("text.hub.item.solo", new Object[0]));
    }

    /* renamed from: b */
    public final List mo68077b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C41341q.m119910m(C27551a.C27552a.C27555c.f70465h, C27551a.C27552a.C27556d.f70466h, C27551a.C27552a.C27561i.f70471h, C27551a.C27552a.C27558f.f70468h, C27551a.C27552a.C27554b.f70464h));
        if (this.f72252a.mo68086a()) {
            arrayList.add(C27551a.C27552a.C27553a.f70463h);
        }
        arrayList.add(m87282a());
        arrayList.add(C27551a.C27552a.C27559g.f70469h);
        arrayList.add(C27551a.C27552a.C27560h.f70470h);
        arrayList.add(C27551a.C27552a.C27557e.f70467h);
        return arrayList;
    }
}
