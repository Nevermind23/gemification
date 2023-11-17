package jh1;

import fh1.C40951a;
import ih1.C41368a;
import java.util.ArrayList;
import kh1.C41517b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh1.C41769a;
import org.koin.core.error.InstanceCreationException;
import ue1.C43075l;

/* renamed from: jh1.c */
public abstract class C41460c {

    /* renamed from: c */
    public static final C41461a f97594c = new C41461a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C40951a f97595a;

    /* renamed from: b */
    private final C41368a f97596b;

    /* renamed from: jh1.c$a */
    public static final class C41461a {
        private C41461a() {
        }

        public /* synthetic */ C41461a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41460c(C40951a aVar, C41368a aVar2) {
        C41536l.m120489i(aVar, "_koin");
        C41536l.m120489i(aVar2, "beanDefinition");
        this.f97595a = aVar;
        this.f97596b = aVar2;
    }

    /* renamed from: a */
    public Object mo96215a(C41459b bVar) {
        C41536l.m120489i(bVar, "context");
        if (this.f97595a.mo95344b().mo96287f(C41517b.DEBUG)) {
            this.f97595a.mo95344b().mo96284b("| create instance for " + this.f97596b);
        }
        try {
            C41769a a = bVar.mo96213a();
            bVar.mo96214b().mo97670b(a);
            Object invoke = this.f97596b.mo95997a().invoke(bVar.mo96214b(), a);
            bVar.mo96214b().mo97671c();
            return invoke;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            C41536l.m120488h(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                C41536l.m120488h(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                C41536l.m120488h(className, "it.className");
                if (!(!C40440x.m117139M(className, "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(C41358y.m120017g0(arrayList, "\n\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null));
            this.f97595a.mo95344b().mo96285d("Instance creation error : could not create instance for " + this.f97596b + ": " + sb.toString());
            throw new InstanceCreationException("Could not create instance for " + this.f97596b, e);
        }
    }

    /* renamed from: b */
    public abstract Object mo96212b(C41459b bVar);

    /* renamed from: c */
    public final C41368a mo96216c() {
        return this.f97596b;
    }
}
