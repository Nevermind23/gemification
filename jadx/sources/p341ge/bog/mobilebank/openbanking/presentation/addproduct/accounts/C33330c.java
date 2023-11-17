package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.c */
public abstract class C33330c {

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.c$a */
    public static final class C33331a extends C33330c {

        /* renamed from: a */
        public static final C33331a f81456a = new C33331a();

        private C33331a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.c$b */
    public static final class C33332b extends C33330c {

        /* renamed from: a */
        private final List f81457a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33332b(List list) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(list, "items");
            this.f81457a = list;
        }

        /* renamed from: a */
        public final List mo79145a() {
            return this.f81457a;
        }
    }

    private C33330c() {
    }

    public /* synthetic */ C33330c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
