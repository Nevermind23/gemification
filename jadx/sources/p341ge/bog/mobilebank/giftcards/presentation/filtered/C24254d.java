package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import java.util.List;
import java.util.Set;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d */
public abstract class C24254d {

    /* renamed from: b */
    public static final C24257c f62724b = new C24257c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Set f62725c = C41357x0.m119989i(2, 3, 1);

    /* renamed from: a */
    private boolean f62726a;

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$a */
    public static abstract class C24255a extends C24254d {

        /* renamed from: d */
        private final int f62727d;

        /* renamed from: e */
        private boolean f62728e;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C24255a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? false : z);
        }

        /* renamed from: b */
        public boolean mo61910b() {
            return this.f62728e;
        }

        /* renamed from: c */
        public void mo61911c(boolean z) {
            this.f62728e = z;
        }

        /* renamed from: d */
        public int mo61912d() {
            return this.f62727d;
        }

        public C24255a(int i, boolean z) {
            super(z, (DefaultConstructorMarker) null);
            this.f62727d = i;
            this.f62728e = z;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$b */
    public static final class C24256b extends C24255a {

        /* renamed from: f */
        private final List f62729f;

        /* renamed from: g */
        private boolean f62730g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24256b(List list, boolean z) {
            super(2, z);
            C41536l.m120489i(list, "tabs");
            this.f62729f = list;
            this.f62730g = z;
        }

        /* renamed from: b */
        public boolean mo61910b() {
            return this.f62730g;
        }

        /* renamed from: c */
        public void mo61911c(boolean z) {
            this.f62730g = z;
        }

        /* renamed from: e */
        public final List mo61913e() {
            return this.f62729f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24256b)) {
                return false;
            }
            C24256b bVar = (C24256b) obj;
            return C41536l.m120484d(this.f62729f, bVar.f62729f) && this.f62730g == bVar.f62730g;
        }

        public int hashCode() {
            int hashCode = this.f62729f.hashCode() * 31;
            boolean z = this.f62730g;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            List list = this.f62729f;
            boolean z = this.f62730g;
            return "CategoriesViewType(tabs=" + list + ", forceUpdate=" + z + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$c */
    public static final class C24257c {
        private C24257c() {
        }

        public /* synthetic */ C24257c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Set mo61917a() {
            return C24254d.f62725c;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$d */
    public static final class C24258d extends C24255a {

        /* renamed from: f */
        public static final C24258d f62731f = new C24258d();

        private C24258d() {
            super(5, false, 2, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$e */
    public static final class C24259e extends C24255a {

        /* renamed from: f */
        private final int f62732f;

        /* renamed from: g */
        private boolean f62733g;

        public C24259e(int i, boolean z) {
            super(1, false, 2, (DefaultConstructorMarker) null);
            this.f62732f = i;
            this.f62733g = z;
        }

        /* renamed from: b */
        public boolean mo61910b() {
            return this.f62733g;
        }

        /* renamed from: c */
        public void mo61911c(boolean z) {
            this.f62733g = z;
        }

        /* renamed from: e */
        public final int mo61918e() {
            return this.f62732f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24259e)) {
                return false;
            }
            C24259e eVar = (C24259e) obj;
            return this.f62732f == eVar.f62732f && this.f62733g == eVar.f62733g;
        }

        public int hashCode() {
            int i = this.f62732f * 31;
            boolean z = this.f62733g;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            int i = this.f62732f;
            boolean z = this.f62733g;
            return "FilterViewType(badgeCount=" + i + ", forceUpdate=" + z + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$f */
    public static final class C24260f extends C24255a {

        /* renamed from: f */
        private final C25740a f62734f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24260f(C25740a aVar) {
            super(4, false, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(aVar, "offer");
            this.f62734f = aVar;
        }

        /* renamed from: e */
        public final C25740a mo61922e() {
            return this.f62734f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C24260f) && C41536l.m120484d(this.f62734f, ((C24260f) obj).f62734f);
        }

        public int hashCode() {
            return this.f62734f.hashCode();
        }

        public String toString() {
            C25740a aVar = this.f62734f;
            return "GiftCardViewType(offer=" + aVar + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.d$g */
    public static final class C24261g extends C24255a {

        /* renamed from: f */
        private final String f62735f;

        /* renamed from: g */
        private boolean f62736g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24261g(String str, boolean z) {
            super(3, z);
            C41536l.m120489i(str, "query");
            this.f62735f = str;
            this.f62736g = z;
        }

        /* renamed from: b */
        public boolean mo61910b() {
            return this.f62736g;
        }

        /* renamed from: c */
        public void mo61911c(boolean z) {
            this.f62736g = z;
        }

        /* renamed from: e */
        public final String mo61926e() {
            return this.f62735f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24261g)) {
                return false;
            }
            C24261g gVar = (C24261g) obj;
            return C41536l.m120484d(this.f62735f, gVar.f62735f) && this.f62736g == gVar.f62736g;
        }

        public int hashCode() {
            int hashCode = this.f62735f.hashCode() * 31;
            boolean z = this.f62736g;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f62735f;
            boolean z = this.f62736g;
            return "SearchViewType(query=" + str + ", forceUpdate=" + z + ")";
        }
    }

    public /* synthetic */ C24254d(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: b */
    public abstract boolean mo61910b();

    /* renamed from: c */
    public abstract void mo61911c(boolean z);

    /* renamed from: d */
    public abstract int mo61912d();

    private C24254d(boolean z) {
        this.f62726a = z;
    }
}
