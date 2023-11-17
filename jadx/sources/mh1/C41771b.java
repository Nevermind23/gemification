package mh1;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.error.DefinitionParameterException;

/* renamed from: mh1.b */
public abstract class C41771b {
    /* renamed from: a */
    public static final C41769a m121123a() {
        return new C41769a((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final C41769a m121124b(Object... objArr) {
        C41536l.m120489i(objArr, "parameters");
        if (objArr.length <= 5) {
            return new C41769a(C41333m.m119790Q(objArr));
        }
        throw new DefinitionParameterException("Can't build DefinitionParameters for more than 5 arguments");
    }
}
