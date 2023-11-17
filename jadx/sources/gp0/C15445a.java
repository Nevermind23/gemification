package gp0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7540f;

/* renamed from: gp0.a */
public final class C15445a implements C7540f {

    /* renamed from: b */
    public static final C15446a f43852b = new C15446a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final int f43853a;

    /* renamed from: gp0.a$a */
    public static final class C15446a {
        private C15446a() {
        }

        public /* synthetic */ C15446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15445a mo42533a(Bundle bundle) {
            int i;
            C41536l.m120489i(bundle, "bundle");
            bundle.setClassLoader(C15445a.class.getClassLoader());
            if (bundle.containsKey("selectedAccountPosition")) {
                i = bundle.getInt("selectedAccountPosition");
            } else {
                i = -1;
            }
            return new C15445a(i);
        }
    }

    public C15445a(int i) {
        this.f43853a = i;
    }

    public static final C15445a fromBundle(Bundle bundle) {
        return f43852b.mo42533a(bundle);
    }

    /* renamed from: a */
    public final int mo42529a() {
        return this.f43853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15445a) && this.f43853a == ((C15445a) obj).f43853a;
    }

    public int hashCode() {
        return this.f43853a;
    }

    public String toString() {
        int i = this.f43853a;
        return "ChooseAccountDialogFragmentArgs(selectedAccountPosition=" + i + ")";
    }
}
