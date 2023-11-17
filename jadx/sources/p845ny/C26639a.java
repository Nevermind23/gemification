package p845ny;

import fd0.C20463a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;

/* renamed from: ny.a */
public abstract class C26639a {
    /* renamed from: a */
    public static final C20463a m83111a(LookupEntity lookupEntity) {
        C41536l.m120489i(lookupEntity, "<this>");
        return new C20463a(lookupEntity.getLookupName(), lookupEntity.getLookupValue(), lookupEntity.getDictionaryKey(), lookupEntity.getOrderNumber());
    }
}
