package sso.queery;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p243s2.C8108g;

/* renamed from: sso.queery.ValidateOnboardingDataQuery$variables$1$marshaller$lambda-13$lambda-3$$inlined$invoke$1 */
public final class C42910x7438e8d9 implements C8108g.C8112c {
    final /* synthetic */ List $value$inlined;

    public C42910x7438e8d9(List list) {
        this.$value$inlined = list;
    }

    public void write(C8108g.C8111b bVar) {
        C41536l.m120490j(bVar, "listItemWriter");
        for (String a : this.$value$inlined) {
            bVar.mo23298a(a);
        }
    }
}
