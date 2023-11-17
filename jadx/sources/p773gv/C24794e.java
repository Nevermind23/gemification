package p773gv;

import he1.C41217g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p783hv.C25067a;
import p793iw.C25263b;
import ue1.C43064a;

/* renamed from: gv.e */
public final class C24794e {

    /* renamed from: b */
    public static final C24795a f63703b = new C24795a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C41217g f63704a = C41219i.m119470b(C24796b.f63705d);

    /* renamed from: gv.e$a */
    public static final class C24795a {
        private C24795a() {
        }

        public /* synthetic */ C24795a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: gv.e$b */
    static final class C24796b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C24796b f63705d = new C24796b();

        C24796b() {
            super(0);
        }

        /* renamed from: b */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("dd MMM, yyyy");
        }
    }

    /* renamed from: a */
    private final SimpleDateFormat m79421a() {
        return (SimpleDateFormat) this.f63704a.getValue();
    }

    /* renamed from: b */
    private final String m79422b(C25263b bVar) {
        String format = m79421a().format(Long.valueOf(bVar.mo63839v()));
        C41536l.m120488h(format, "dateFormat.format(transaction.operationDate)");
        return format;
    }

    /* renamed from: c */
    public final List mo63212c(List list) {
        C41536l.m120489i(list, "operations");
        List c = C41339p.m119898c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            String b = m79422b(((C25067a.C25069b) next).mo63508a());
            Object obj = linkedHashMap.get(b);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b, obj);
            }
            ((List) obj).add(next);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            c.add(new C25067a.C25068a((String) entry.getKey()));
            c.addAll((List) entry.getValue());
        }
        return C41339p.m119896a(c);
    }
}
