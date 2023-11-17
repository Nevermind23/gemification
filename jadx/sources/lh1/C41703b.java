package lh1;

import ih1.C41368a;
import java.util.HashSet;
import kotlin.jvm.internal.C41536l;
import org.koin.core.error.DefinitionOverrideException;

/* renamed from: lh1.b */
public abstract class C41703b {
    /* renamed from: a */
    public static final void m120958a(HashSet hashSet, C41368a aVar) {
        C41536l.m120489i(hashSet, "$this$addDefinition");
        C41536l.m120489i(aVar, "bean");
        boolean add = hashSet.add(aVar);
        if (!add && !aVar.mo95999c().mo96013a()) {
            throw new DefinitionOverrideException("Definition '" + aVar + "' try to override existing definition. Please use override option to fix it");
        } else if (!add && aVar.mo95999c().mo96013a()) {
            hashSet.remove(aVar);
            hashSet.add(aVar);
        }
    }
}
