package p642vh;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: vh.a0 */
public abstract class C18334a0 {

    /* renamed from: vh.a0$a */
    public static final class C18335a extends C18334a0 {

        /* renamed from: a */
        private final int f51784a;

        public C18335a(int i) {
            super((DefaultConstructorMarker) null);
            this.f51784a = i;
        }

        /* renamed from: b */
        public final int mo46106b() {
            return this.f51784a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18335a) && this.f51784a == ((C18335a) obj).f51784a;
        }

        public int hashCode() {
            return this.f51784a;
        }

        public String toString() {
            int i = this.f51784a;
            return "Dimen(id=" + i + ")";
        }
    }

    /* renamed from: vh.a0$b */
    public static final class C18336b extends C18334a0 {

        /* renamed from: a */
        private final int f51785a;

        public C18336b(int i) {
            super((DefaultConstructorMarker) null);
            this.f51785a = i;
        }

        /* renamed from: b */
        public final int mo46110b() {
            return this.f51785a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18336b) && this.f51785a == ((C18336b) obj).f51785a;
        }

        public int hashCode() {
            return this.f51785a;
        }

        public String toString() {
            int i = this.f51785a;
            return "Raw(size=" + i + ")";
        }
    }

    private C18334a0() {
    }

    public /* synthetic */ C18334a0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final int mo46105a(Context context) {
        C41536l.m120489i(context, "context");
        if (this instanceof C18335a) {
            return context.getResources().getDimensionPixelSize(((C18335a) this).mo46106b());
        }
        if (this instanceof C18336b) {
            return ((C18336b) this).mo46110b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
